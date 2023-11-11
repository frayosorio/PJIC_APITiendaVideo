package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Titulo;
import apitiendavideo.apitiendavideo.repositorios.TituloRepositorio;
import apitiendavideo.apitiendavideo.servicios.interfaces.ITituloServicio;

@Service
public class TituloServicio implements ITituloServicio {

    private TituloRepositorio repositorio;

    public TituloServicio(TituloRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Titulo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Titulo obtener(Long id) {
        var titulo = repositorio.findById(id);
        return titulo.isEmpty() ? null : titulo.get();
    }

    @Override
    public List<Titulo> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Titulo guardar(Titulo titulo) {
        return repositorio.save(titulo);
    }

    @Override
    public boolean eliminar(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}

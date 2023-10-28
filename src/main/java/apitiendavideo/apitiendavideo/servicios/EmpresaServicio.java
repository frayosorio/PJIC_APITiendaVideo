package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Empresa;
import apitiendavideo.apitiendavideo.repositorios.EmpresaRepositorio;
import apitiendavideo.apitiendavideo.servicios.interfaces.IEmpresaServicio;

@Service
public class EmpresaServicio implements IEmpresaServicio {

    private EmpresaRepositorio repositorio;

    public EmpresaServicio(EmpresaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Empresa> listar() {
        return repositorio.findAll();
    }

    @Override
    public Empresa obtener(Long id) {
        var empresa = repositorio.findById(id);
        return empresa.isEmpty() ? null : empresa.get();
    }

    @Override
    public List<Empresa> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Empresa guardar(Empresa empresa) {
        return repositorio.save(empresa);
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

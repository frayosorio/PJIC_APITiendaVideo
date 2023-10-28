package apitiendavideo.apitiendavideo.servicios.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Empresa;

public interface IEmpresaServicio {
    
    public List<Empresa> listar();

    public Empresa obtener(Long id);

    public List<Empresa> buscar(String nombre);

    public Empresa guardar(Empresa Empresa);

    public boolean eliminar(Long id);

}

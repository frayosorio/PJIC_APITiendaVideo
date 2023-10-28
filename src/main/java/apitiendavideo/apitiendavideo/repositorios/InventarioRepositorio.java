package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apitiendavideo.apitiendavideo.modelos.Inventario;

public interface InventarioRepositorio extends JpaRepository<Inventario, Long> {

}

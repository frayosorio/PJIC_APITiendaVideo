package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Alquiler;

@Repository
public interface AlquilerRepositorio extends JpaRepository<Alquiler, Long> {

}

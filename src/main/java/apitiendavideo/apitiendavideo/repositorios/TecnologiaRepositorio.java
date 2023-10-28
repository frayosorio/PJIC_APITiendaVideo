package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Tecnologia;

@Repository
public interface TecnologiaRepositorio extends JpaRepository<Tecnologia, Long> {
    
}

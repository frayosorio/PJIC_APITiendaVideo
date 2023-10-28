package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Tercero;

@Repository
public interface TerceroRepositorio extends JpaRepository<Tercero, Long> {
    
}

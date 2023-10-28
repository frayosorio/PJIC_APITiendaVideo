package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Titulo;

@Repository
public interface TituloRepositorio extends JpaRepository<Titulo, Long> {
    
}

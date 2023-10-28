package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.TipoDocumento;

@Repository
public interface TipoDocumentoRepositorio extends JpaRepository<TipoDocumento, Long> {

}

package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Region;

@Repository
public interface RegionRepositorio extends JpaRepository<Region, Long> {
    


}

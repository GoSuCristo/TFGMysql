package tfg.mysql.demo.services;

import tfg.mysql.demo.entities.Socio;

import java.util.List;
import java.util.Optional;

public interface SocioService {

    List<Socio> obtenerSocios ();
    Optional<Socio> findbyId (Long id);
    Socio createSocio (Socio socio);
    void deleteSocio (Long id);
}

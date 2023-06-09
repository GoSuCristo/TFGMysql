package tfg.mysql.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tfg.mysql.demo.entities.Socio;

public interface ISocioRepository extends CrudRepository<Socio, Long> {
}

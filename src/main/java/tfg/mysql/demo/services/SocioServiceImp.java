package tfg.mysql.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tfg.mysql.demo.entities.Socio;
import tfg.mysql.demo.repository.ISocioRepository;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class SocioServiceImp implements SocioService{
    @Autowired
    private ISocioRepository socioRepository;

    @Override
    public List<Socio> obtenerSocios() {
        return (List<Socio>) socioRepository.findAll();
    }

    @Override
    public Optional<Socio> findbyId(Long id) {
        return socioRepository.findById(id);
    }

    @Override
    public Socio createSocio(Socio socio) {
        return socioRepository.save(socio);
    }

    @Override
    public void deleteSocio(Long id) {
        socioRepository.deleteById(id);
    }

}

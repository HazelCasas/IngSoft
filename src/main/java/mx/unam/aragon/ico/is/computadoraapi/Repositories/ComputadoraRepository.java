package mx.unam.aragon.ico.is.computadoraapi.Repositories;

import mx.unam.aragon.ico.is.computadoraapi.Entities.Computadora;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long>
{
    public Computadora findComputadoraByClave(Long clave);
    public Computadora deleteByClave(Long clave);

    Optional<Computadora> findByClave(Long clave);
}

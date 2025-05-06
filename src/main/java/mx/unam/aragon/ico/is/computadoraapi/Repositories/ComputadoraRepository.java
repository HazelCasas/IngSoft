package mx.unam.aragon.ico.is.computadoraapi.Repositories;

import mx.unam.aragon.ico.is.computadoraapi.Entities.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long>
{
    public Computadora findComputadoraByClave(Long clave);
}

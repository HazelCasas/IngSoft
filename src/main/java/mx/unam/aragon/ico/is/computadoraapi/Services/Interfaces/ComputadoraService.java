package mx.unam.aragon.ico.is.computadoraapi.Services.Interfaces;

import mx.unam.aragon.ico.is.computadoraapi.Entities.Computadora;

import java.util.Optional;

public interface ComputadoraService
{
    public abstract Computadora crear(Computadora computadora);
    public abstract Iterable<Computadora> listarTodas();
    public abstract Optional<Computadora> buscarPorId(Long id);
    public abstract Computadora actualizar(Long clave, Computadora computadora);
    public abstract Computadora eliminar(Long clave);
}

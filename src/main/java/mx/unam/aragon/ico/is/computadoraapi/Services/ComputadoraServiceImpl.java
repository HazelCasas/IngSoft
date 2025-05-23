package mx.unam.aragon.ico.is.computadoraapi.Services;

import mx.unam.aragon.ico.is.computadoraapi.Entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.Repositories.ComputadoraRepository;
import mx.unam.aragon.ico.is.computadoraapi.Services.Interfaces.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputadoraServiceImpl implements ComputadoraService
{
    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Override
    public Computadora crear(Computadora computadora) {
        return computadoraRepository.save(computadora);
    }

    @Override
    public Iterable<Computadora> listarTodas() {
        return computadoraRepository.findAll();
    }

    @Override
    public Optional<Computadora> buscarPorId(Long clave) {
        return computadoraRepository.findById(clave);
    }

    @Override
    public Computadora actualizar(Long clave, Computadora computadora)
    {
        Optional<Computadora> computadoraActual = computadoraRepository.findById(clave);
        if (computadoraActual.isPresent())
        {
            Computadora tmp = computadoraActual.get();
            tmp.setModelo(computadora.getModelo());
            tmp.setClave(computadora.getClave());
            tmp.setFoto(computadora.getFoto());
            tmp.setMarca(computadora.getMarca());
            tmp.setPrecio(computadora.getPrecio());
            return computadoraRepository.save(tmp);
        }
        else
        {
            return null;
        }
    }

    @Override
    public Computadora eliminar(Long clave) {
        return computadoraRepository.deleteByClave(clave);
    }
}

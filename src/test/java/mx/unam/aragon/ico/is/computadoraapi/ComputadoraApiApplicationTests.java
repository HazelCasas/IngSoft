package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.Entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.Repositories.ComputadoraRepository;
import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraApiApplicationTests
{
    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insertarComp()
    {
        Computadora computadora = new Computadora(0, "HP","Pavilion 2000",null,13000.0f);

        computadoraRepository.save(computadora);
    }

    @Test
    void leerComp_Clave()
    {
        Long claveTmp = 2l;
        Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
        System.out.println(tmp);
    }

    @Test
    public void eliminarComputadora()
    {
        Long claveTmp = 2l;
        computadoraRepository.deleteById(claveTmp);
    }

    @Test
    public void actualizarCpmp()
    {
        Long claveTmp = 4l;
        Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
        tmp.setModelo("patito3000");
        computadoraRepository.save(tmp);
    }
}

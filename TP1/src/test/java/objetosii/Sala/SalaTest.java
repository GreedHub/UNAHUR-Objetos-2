package objetosii.Sala;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaTest {

    @Test
    void testLaSalaEstaVaciaAlCrear(){
        Sala sala = new Sala(10,10);
        Assertions.assertTrue(sala.EstaVacia());
    }

    @Test
    void testLaSalaNoEstaVaciaAlOcuparUnaButaca(){
        Sala sala = new Sala(10,10);

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        Assertions.assertFalse(sala.EstaVacia());
    }

    @Test
    void testLaButacaNoEstaOcupadaAlCrearseLaSala(){
        Sala sala = new Sala(10,10);
        Assertions.assertFalse(sala.ButacaOcupada(1,1));
    }

    @Test
    void testUnaButacaEstaOcupadaDespuesDeOcuparse(){
        Sala sala = new Sala(10,10);
        Assertions.assertFalse(sala.ButacaOcupada(1,1));

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        Assertions.assertTrue(sala.ButacaOcupada(1,1));
    }

    @Test
    void testUnaButacaOcupadaNoPuedeOcuparse(){
        Sala sala = new Sala(10,10);

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        Exception thrown = Assertions.assertThrows(Exception.class,()->
            sala.OcuparButaca(1, 1)
        );
        Assertions.assertEquals("La butaca 1 1 se encuentra ya se encuentra ocupada",thrown.getMessage());
    }

    @Test
    void testCantidadDeButacasOcupadas(){
        Sala sala = new Sala(10,10);

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        Assertions.assertEquals(sala.ButacasOcupadas(),1);
    }

    @Test
    void testHayEspacioSiHayButacasContiguas(){
        Sala sala = new Sala(10,10);

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        Assertions.assertTrue(sala.HayEspacioPara(3));
    }

    @Test
    void testNoHayEspacioSiNoHayTantasButacasContiguas(){
        Sala sala = new Sala(10,10);

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        Assertions.assertFalse(sala.HayEspacioPara(20));
    }
}

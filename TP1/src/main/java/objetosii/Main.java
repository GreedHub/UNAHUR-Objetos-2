package objetosii;
import objetosii.Sala.Sala;
public class Main {
    public static void main(String[] args) {
        Sala sala = new Sala(20,20);

        if(sala.EstaVacia()) System.out.println("La sala esta vacía");

        if(!sala.ButacaOcupada(1,1))
            System.out.println("La butaca 1,1 está vacía");

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        if(sala.ButacaOcupada(1,1))
            System.out.println("La butaca 1,1 está ocupada");

        try {
            sala.OcuparButaca(1, 1);
        }catch (Exception e){
            System.out.println("La butaca 1,1 estaba ocupada");
        }

        System.out.println(String.format("Hay %d butacas ocupadas",sala.ButacasOcupadas()));

        if(sala.HayEspacioPara(3))
            System.out.println("Hay espacio para 3 personas");

        if(!sala.HayEspacioPara(21))
            System.out.println("No hay espacio en ninguna fila para 21 personas");
    }
}
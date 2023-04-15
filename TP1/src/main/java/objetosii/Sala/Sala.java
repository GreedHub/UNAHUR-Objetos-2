package objetosii.Sala;

public class Sala {

    private boolean Butacas[][];

    public Sala(int Filas, int Butacas){
        this.Butacas = new boolean[Filas][Butacas];
    }

    public boolean EstaVacia(){
        return this.ButacasOcupadas() == 0;
    }

    public boolean ButacaOcupada(int Fila, int Butaca){
        return this.Butacas[Fila][Butaca];
    }

    public void OcuparButaca(int Fila, int Butaca) throws Exception{

        if(this.Butacas[Fila][Butaca]) {
            throw new Exception(String.format("La butaca %d %d se encuentra ya se encuentra ocupada",Fila,Butaca));
        }

        this.Butacas[Fila][Butaca] = Boolean.TRUE;
    }

    public int ButacasOcupadas(){
        int butacasOcupadas = 0;
        for (boolean Filas[]:this.Butacas
        ) {
            for (boolean butaca:Filas
            ) {
                if(butaca) butacasOcupadas++;
            }
        }
        return butacasOcupadas;
    }


    public boolean HayEspacioPara(int Personas){
        for (boolean Filas[]:this.Butacas
        ) {
            int butacasContiguas = 0;
            for (boolean butaca:Filas
            ) {
                if(!butaca) butacasContiguas++;
                else butacasContiguas = 0;
                if( butacasContiguas == Personas)
                    return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}

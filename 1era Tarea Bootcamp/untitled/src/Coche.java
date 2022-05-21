// Parte 2

public class Coche {

    private static int puertas = 4, totalPuertas;

    public static void main(String[] args){

        Coche miCoche = new Coche();
        miCoche.morePuertas(puertas);
        System.out.println("Número de puertas" + miCoche.getPuertas());}
    public int morePuertas(int puertas){

        return totalPuertas = puertas + 1;
    }

    public int getPuertas(){

        return totalPuertas;

    }
}









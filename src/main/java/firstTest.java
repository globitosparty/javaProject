public class firstTest {

    public static void suma3Num (double a, double b, double c){

        System.out.println("a + b es: "+(a+b));
        System.out.println("b + c es: "+(b+c));
        System.out.println("c + a es: "+(c+a)+"\n");
    }
    public static void main(String[] args) {
        //ejercicio 1
        suma3Num(14.2,22.2,33.3);

        //ejercicio 2
        coche MiCoche = new coche();
        MiCoche.sumarPuerta();
        MiCoche.sumarPuerta();
        MiCoche.sumarPuerta();
        MiCoche.sumarPuerta();
        System.out.println("las puertas de mi coche son "+(MiCoche.Npuerta));
    }


    static class coche {
        public int Npuerta =0;

        public void restarPuerta (){
            this.Npuerta--;
        }
        public void sumarPuerta(){
            this.Npuerta++;
        }
    }
}

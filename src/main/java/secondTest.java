public class secondTest {
    public static int numeroG = 0;

    public static int validacionIf(int numero) {
        if (numero >= 0) System.out.println("el numero es positivo");
        else System.out.println("el numero es negativo");


        return numeroG = numero;
    }

    public static String estacion(String estaciones) {


        return estaciones;
    }

    public static void main(String[] args) {

        System.out.println("ejercicio 1" + "\n" + "-------------------");
        validacionIf(-1);

        System.out.println("ejercicio 2" + "\n" + "-------------------");
        while (numeroG < 3) {
            System.out.println(numeroG + "\n");
            numeroG++;
        }

        System.out.println("ejercicio 3" + "\n" + "-------------------");
        validacionIf(-1);
        do {
            numeroG++;
            if (numeroG == 3) System.out.println(numeroG);
        } while (numeroG < 3);


        System.out.println("ejercicio 4" + "\n" + "-------------------");
        validacionIf(0);

        for (int i = 0; i <= 3; i++) {
            System.out.println(numeroG);
            numeroG++;
        }

        System.out.println("ejercicio 5" + "\n" + "-------------------");

        String valorEstacion = estacion("");
        switch (valorEstacion.toLowerCase()) {
            case "verano":
                System.out.println("estamos en: "+valorEstacion);
                break;
            case "otoño":
                System.out.println(" estamos en: "+valorEstacion);
                break;
            case "invierno":
                System.out.println(" estamos en: "+valorEstacion+"\n");
                break;
            case "primavera":
                System.out.print(" estamos en: "+valorEstacion);
                break;
            default:
                System.out.println("no es una estacion del planeta tierra");
        }
    }
}

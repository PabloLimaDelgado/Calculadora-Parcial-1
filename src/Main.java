import java.util.Scanner; //Importamos la libreria Scanner
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos el objeto de la clase Scanner

        //Declaramos las variables
        int opcion, contadorDeUsos = 0;
        float num1, num2, numAux=0;

        do {
            System.out.println(
                    "Bienvenido a la calculadora \n" +
                            "Opcion 1: Suma  \n" +
                            "Opcion 2: Resta  \n" +
                            "Opcion 3: Division  \n" +
                            "Opcion 4: Multiplicacion  \n" +
                            "Opcion 5: Salir  \n");

            System.out.print("Ingrese una opción: "); //Pido el número de la opcion deseada
            opcion = sc.nextInt();


            switch (opcion){
                case 1:

                    //Analizo si es la primera vez que se usa la calculadora para pedir el primer número
                    if(contadorDeUsos == 0){
                        System.out.print("Ingrese el primer número: ");
                        num1 = sc.nextFloat();
                    }
                    else{
                        num1 = numAux;
                    }

                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextFloat();

                    numAux = num1 + num2;
                    System.out.println("El resultado de la suma es: " + (numAux));
                    break;

                case 2:

                    //Analizo si es la primera vez que se usa la calculadora para pedir el primer número
                    if(contadorDeUsos == 0){
                        System.out.print("Ingrese el primer número: ");
                        num1 = sc.nextFloat();
                    }
                    else{
                        num1 = numAux;
                    }

                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextFloat();

                    numAux = num1 - num2;
                    System.out.println("El resultado de la resta es: " + (numAux));
                    break;

                case 3:

                    //Analizo si es la primera vez que se usa la calculadora para pedir el primer número
                    if(contadorDeUsos == 0){
                        System.out.print("Ingrese el primer número: ");
                        num1 = sc.nextFloat();
                    }
                    else{
                        num1 = numAux;
                    }

                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextFloat();

                    while (num2 == 0){
                        System.out.print("El número 2 no puede ser 0 ingrese un número correcto: ");
                        num2 = sc.nextFloat();
                    }

                    numAux = num1 / num2;
                    System.out.println("El resultado de la division es: " + (numAux));
                    break;

                case 4:

                    //Analizo si es la primera vez que se usa la calculadora para pedir el primer número
                    if(contadorDeUsos == 0){
                        System.out.print("Ingrese el primer número: ");
                        num1 = sc.nextFloat();
                    }
                    else{
                        num1 = numAux;
                    }

                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextFloat();

                    numAux = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + (numAux));
                    break;

                case 5:
                    System.out.println("Usted ha decidido salir, que tenga lindo dia y suerte en el parcial");
                    break;

                default:
                    System.out.println("Ingreso un número incorrecto");
                    break;
            }
            contadorDeUsos += 1;
        }while (opcion != 5);
    }
}
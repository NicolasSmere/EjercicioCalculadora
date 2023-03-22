import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int menu;

        double resultado = 0;
        double unNumero;
        double otroNumero;
        boolean primeraOperacion = true;

        // Calculadora que me permite encadenar operaciones manteniendo el total resuelto en una operacion anterior

        do {
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-CERRAR");
            menu = sc.nextInt();

            if (primeraOperacion){

                switch (menu){
                    case 1:{
                        System.out.println("Ingrese un numero");
                        unNumero = sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        resultado = sumar(unNumero,otroNumero);
                        System.out.println("El total es: "+resultado);
                        primeraOperacion = false;
                        break;
                    }
                    case 2:{
                        System.out.println("Ingrese un numero");
                        unNumero = sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        resultado = restar(unNumero,otroNumero);
                        System.out.println("El total es: "+resultado);
                        primeraOperacion = false;
                        break;
                    }
                    case 3:{
                        System.out.println("Ingrese un numero");
                        unNumero = sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        resultado = multiplicar(unNumero,otroNumero);
                        System.out.println("El total es: "+resultado);
                        primeraOperacion = false;
                        break;
                    }
                    case 4:{
                        System.out.println("Ingrese un numero");
                        unNumero = sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        if (otroNumero!=0){
                            resultado = dividir(unNumero,otroNumero);
                            System.out.println("El total es: "+resultado);
                            primeraOperacion = false;
                            break;
                        }
                        else {
                            System.out.println("No puede dividirse por 0");
                            break;
                        }
                    }
                    case 5:{
                        break;
                    }
                }

            }
            else {
                switch (menu){
                    case 1:{
                        System.out.println("valor memoria: "+resultado);
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        resultado = sumar(resultado,otroNumero);
                        System.out.println("El total es: "+resultado);
                        break;
                    }
                    case 2:{
                        System.out.println("valor memoria: "+resultado);
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        resultado = restar(resultado,otroNumero);
                        System.out.println("El total es: "+resultado);
                        break;
                    }
                    case 3:{
                        System.out.println("valor memoria: "+resultado);
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        resultado = multiplicar(resultado,otroNumero);
                        System.out.println("El total es: "+resultado);
                        break;
                    }
                    case 4:{
                        System.out.println("valor memoria: "+resultado);
                        System.out.println("Ingrese otro numero");
                        otroNumero = sc.nextDouble();
                        if (otroNumero!=0){
                            resultado = dividir(resultado,otroNumero);
                            System.out.println("El total es: "+resultado);
                            break;
                        }
                        else {
                            System.out.println("No puede dividirse por 0");
                            break;
                        }
                    }
                    case 5:{
                        break;
                    }
                }
            }
        }
        while (menu != 5);

    }

    public static double sumar(double unNumero, double otroNumero){
        return unNumero + otroNumero;
    }

    public static double restar(double unNumero, double otroNumero){
        return unNumero - otroNumero;
    }

    public static double multiplicar(double unNumero, double otroNumero){
        return unNumero * otroNumero;
    }

    public static double dividir(double unNumero, double otroNumero){
        return unNumero / otroNumero;
    }

}
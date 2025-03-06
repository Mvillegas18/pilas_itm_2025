
import java.util.Scanner;
import java.util.Stack;

public class Utils {
    Scanner sc = new Scanner(System.in);
    public Stack<Integer> llenarPila(){
        Stack<Integer> pila = new Stack();
        
        boolean bandera = true;
        int opt = 0;
        while(bandera){
            System.out.print("Ingrese el registro: ");
            pila.push(sc.nextInt());
            System.out.println("Desea ingresar mas registros? 1. SI, 2. NO");
            while(sc.hasNextInt()){
                System.out.println("El dato ingresado no es numerico.");
                sc.nextLine();
            }
            opt = sc.nextInt();
            while(opt < 1 || opt > 2){
                System.out.println("Debe ingresar una opcion de 1 a 2");
                break;
            }
            if(opt == 2){
                bandera = false;
            }
        }
        

        return pila;
    }

    public void mostrarPila (Stack<Integer> pila){
        System.out.println(pila);
    }

    public Stack<Integer> eliminarElemento (Stack<Integer> pila){
        Stack<Integer> auxPila = new Stack();
        System.out.println("Ingrese el registro a eliminar: ");
        int num = sc.nextInt();
        while(!pila.isEmpty()){
            if(pila.peek() == num){
                pila.pop();
            }else{
                auxPila.push(pila.pop());
            }
        }

        System.out.println(pila);
        System.out.println(auxPila.reversed() );

        return pila;

    }
}


import java.util.Scanner;
import java.util.Stack;

public class Utils {
    
    public Stack<Integer> llenarPila(){
        Stack<Integer> pila = new Stack();
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        while(bandera){
            System.out.print("Ingrese el registro: ");
            pila.push(sc.nextInt());
            System.out.println("Desea ingresar mas registros? 1. SI, 2. NO");
            opt = sc.nextInt();
            if(opt == 2){
                bandera = false;
            }
        }

        return pila;
    }
}

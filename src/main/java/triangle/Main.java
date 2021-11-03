package triangle;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanA = new Scanner(System.in);
        Scanner scanB = new Scanner(System.in);
        Scanner scanC = new Scanner(System.in);

        int a = scanA.nextInt();
        int b = scanB.nextInt();
        int c = scanC.nextInt();

        if(a==b && b==c){
            System.out.println("Das Dreieck ist gleichseitig");
        }else if(a==c || b==c ||a==b){
            System.out.println("Das Dreieck ist gleichschenklig");
        }else if(a != b && b != c && a != c){
            System.out.println("Das Dreieck ist ungleichseitig");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[]Args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=0){
            if (n%2==0){
                System.out.println("DERECHA");
            }
            else{
                System.out.println("IZQUIERDA");
            }
            n = in.nextInt();
        }
    }
}

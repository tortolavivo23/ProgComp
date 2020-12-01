import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;


public class Main {
    public static void imprimir(int n, HashSet<Integer>conjunto, int t){
        StringBuilder sb = new StringBuilder(n+" ");
        sb.append(t);
        ArrayList<Integer>l= new ArrayList<>(conjunto);
        Collections.sort(l);
        for(Integer i: l){
            sb.append(" ");
            sb.append(i);
        }
        System.out.println(sb);
    }

    public static void main(String[]Args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int c=1; c<=t; c++){
            HashSet<Integer>amigo1=new HashSet<>();
            HashSet<Integer>amigo2=new HashSet<>();
            HashSet<Integer>amigo3=new HashSet<>();
            HashSet<Integer>aux=new HashSet<>();
            int l = in.nextInt();
            for(int i=0; i<l; i++){
                int n = in.nextInt();
                amigo1.add(n);
                aux.add(n);
            }
            l = in.nextInt();
            for(int i=0; i<l; i++){
                int n = in.nextInt();
                if (amigo1.contains(n)){
                    amigo1.remove(n);
                }
                else if (aux.add(n)){
                    amigo2.add(n);
                }
            }
            l = in.nextInt();
            for(int i=0; i<l; i++){
                int n = in.nextInt();
                if (amigo1.contains(n)){
                    amigo1.remove(n);
                }
                else if (amigo2.contains(n)){
                    amigo2.remove(n);
                }
                else if(aux.add(n)){
                    amigo3.add(n);
                }
            }
            System.out.println("Case #"+c+":");
            int t1 = amigo1.size();
            int t2 = amigo2.size();
            int t3 = amigo3.size();
            if(t1>=t2&&t1>=t3){
                imprimir(1, amigo1, t1);
                if(t2==t1){
                    imprimir(2, amigo2, t2);
                }
                if(t3==t1){
                    imprimir(3, amigo3, t3);
                }
            }
            else if(t2>=t3){
                imprimir(2, amigo2, t2);
                if(t3==t2){
                    imprimir(3, amigo3, t3);
                }
            }
            else{
                imprimir(3, amigo3, t3);
            }
        }
    }
}

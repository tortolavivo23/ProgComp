import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[]Args){
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> valores = new HashMap<>();
        valores.put('B',1);
        valores.put('F',1);
        valores.put('P',1);
        valores.put('V',1);
        valores.put('C',2);
        valores.put('G',2);
        valores.put('J',2);
        valores.put('K',2);
        valores.put('Q',2);
        valores.put('S',2);
        valores.put('X',2);
        valores.put('Z',2);
        valores.put('D',3);
        valores.put('T',3);
        valores.put('L',4);
        valores.put('M',5);
        valores.put('N',5);
        valores.put('R',6);
        while (in.hasNext()) {
            String s = in.next();
            int i = 0;
            StringBuilder sb = new StringBuilder();
            for (Character c : s.toCharArray()) {
                if (valores.containsKey(c)) {
                    if (valores.get(c) != i){
                        sb.append(valores.get(c));
                    }
                    i = valores.get(c);
                } else {
                    i = 0;
                }
            }
            System.out.println(sb);
        }
    }
}

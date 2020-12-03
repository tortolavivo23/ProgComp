import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]Args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        while(n!=0){
            ArrayList<Integer>[]grafo = new ArrayList[n];
            for(int i =0; i<n; i++){
                grafo[i] = new ArrayList<>();
            }
            StringTokenizer tokenizer = new StringTokenizer(rd.readLine());
            int i = Integer.parseInt(tokenizer.nextToken());
            while (i!=0){
                i--;
                int j = Integer.parseInt(tokenizer.nextToken());
                while(j!=0){
                    j--;
                    grafo[i].add(j);
                    j = Integer.parseInt(tokenizer.nextToken());
                }
                tokenizer = new StringTokenizer(rd.readLine());
                i = Integer.parseInt(tokenizer.nextToken());
            }
            tokenizer = new StringTokenizer(rd.readLine());
            int p = Integer.parseInt(tokenizer.nextToken());
            for(int t = 0; t<p; t++) {
                int k = Integer.parseInt(tokenizer.nextToken());
                k--;
                HashSet<Integer> Visitados = new HashSet<>();
                Queue<Integer> cola = new LinkedList<>();
                cola.add(k);
                while (!cola.isEmpty()) {
                    int m = cola.remove();
                    for (Integer s : grafo[m]) {
                        if (!Visitados.contains(s)) {
                            Visitados.add(s);
                            cola.add(s);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(n-Visitados.size());
                for(int u = 1; u<=n; u++){
                    if(!Visitados.contains(u-1)){
                        sb.append(" ");
                        sb.append(u);
                    }
                }
                System.out.println(sb);
            }
            n = Integer.parseInt(rd.readLine());
        }
    }
}

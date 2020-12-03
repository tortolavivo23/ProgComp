import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]Args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int e = Integer.parseInt(rd.readLine());
        ArrayList<Integer>[] grafo = new ArrayList[e];
        for(int i=0; i<e; i++){
            grafo[i]=new ArrayList<>();
            StringTokenizer tokenizer = new StringTokenizer(rd.readLine());
            int lim = Integer.parseInt(tokenizer.nextToken());
            for(int j=0; j<lim; j++){
                grafo[i].add(Integer.parseInt(tokenizer.nextToken()));
            }
        }
        int t = Integer.parseInt(rd.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(rd.readLine());
            int maxm = 0;
            int m = 0;
            int maxd = 0;
            int d = 1;
            boolean[] visitados = new boolean[e];
            visitados[n]=true;
            Queue<Integer>cola = new LinkedList<>();
            cola.add(n);
            cola.add(null);
            while(cola.size()>1){
                Integer k = cola.remove();
                if(k==null){
                    if(m>maxm){
                        maxm=m;
                        maxd=d;
                    }
                    d++;
                    m=0;
                    cola.add(null);
                }
                else{
                    for(Integer s : grafo[k]) {
                        if (!visitados[s]) {
                            m++;
                            visitados[s] = true;
                            cola.add(s);
                        }
                    }
                }
            }
            if (maxm==0){
                System.out.println(0);
            }
            else{
                System.out.println(maxm+" "+maxd);
            }
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[]Args){
        Scanner in = new Scanner(System.in);
        int[]cajas = new int[7];
        boolean bucle = false;
        for(int i=1; i<7; i++){
            cajas[i]=in.nextInt();
            if (cajas[i]!=0){
                bucle=true;
            }
        }
        while(bucle){
            int cont = cajas[6];
            cont+=cajas[5];
            cajas[1]-=11*cajas[5];
            if (cajas[4]>0){
                cont+=cajas[4];
                if(cajas[2]>=cajas[4]*5){
                    cajas[2]-=cajas[4]*5;
                }
                else{
                    int slots = 20*cajas[4];
                    slots -= cajas[2]*4;
                    cajas[2]=0;
                    cajas[1]-= slots;
                }
            }
            if(cajas[3]>0){
                cont+=cajas[3]/4;
                cajas[3]%=4;
                if (cajas[3]!=0){
                    cont++;
                }
                if(cajas[3]==1){
                    if (cajas[2]>=5){
                        cajas[2]-=5;
                        cajas[1]-=7;
                    }
                    else{
                        int slots=27;
                        slots -= cajas[2]*4;
                        cajas[2]=0;
                        cajas[1]-=slots;
                    }
                }
                else if(cajas[3]==2){
                    if(cajas[2]>=3){
                        cajas[2]-=3;
                        cajas[1]-=6;
                    }
                    else{
                        int slots = 18;
                        slots -= cajas[2]*4;
                        cajas[2]=0;
                        cajas[1]-=slots;
                    }
                }
                else if(cajas[3]==3){
                    if (cajas[2]>=1){
                        cajas[2]--;
                        cajas[1]-=5;
                    }
                    else{
                        cajas[1]-=9;
                    }
                }
            }
            if(cajas[2]>0){
                cont+=cajas[2]/9;
                cajas[2]%=9;
                if(cajas[2]>0){
                    cont++;
                    cajas[1]-=(36-cajas[2]*4);
                }
            }
            if(cajas[1]>0){
                cont+=cajas[1]/36;
                if(cajas[1]%36>0){
                    cont++;
                }
            }
            System.out.println(cont);
            bucle = false;
            for(int i=1; i<7; i++){
                cajas[i]=in.nextInt();
                if (cajas[i]!=0){
                    bucle=true;
                }
            }
        }
    }
}

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]Args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.000", simbolos);
        for(int i = 0; i<t; i++){
            double suma=0;
            String s = in.next();
            int l = s.length();
            for(int j=0; j<l; j++){
                double val=0;
                if(s.charAt(j)=='C'){
                    val = 12.01;
                }
                else if (s.charAt(j)=='H'){
                    val = 1.008;
                }
                else if (s.charAt(j)=='O'){
                    val = 16;
                }
                else if (s.charAt(j)=='N'){
                    val = 14.01;
                }
                int mul = 1;
                if(j+1<l&&(s.charAt(j+1)!='C'&&s.charAt(j+1)!='H'&&s.charAt(j+1)!='O'&&s.charAt(j+1)!='N')){
                    mul*=Integer.parseInt(String.valueOf(s.charAt(j+1)));
                    j++;
                    if(j+1<l&&(s.charAt(j+1)!='C'&&s.charAt(j+1)!='H'&&s.charAt(j+1)!='O'&&s.charAt(j+1)!='N')){
                        mul*=10;
                        mul+=Integer.parseInt(String.valueOf(s.charAt(j+1)));
                        j++;
                    }
                }
                suma+=(val*mul);
            }
            System.out.println(df.format(suma));
        }
    }
}

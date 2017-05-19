package topik3;
import java.util.Scanner;
import java.util.Stack;
public class JavaApp {
     
    public static void main(String[] args) {
         JavaApp2 jv2 = new JavaApp2();
        JavaApp4 jv4 = new JavaApp4();
        int[]cslul = {353,285};                
//285
//353
        Stack<String>s1 = new Stack<String>();
        int x;
        do{
        System.out.println("-----------------------------------");
        System.out.println("1.Info Clan");
        System.out.println("2.Melihat Info Clan Dari Yang Terupdate");
        System.out.println("3.Info Clan Dengan Trophy Terbanyak");
        System.out.println("Pilih Menu ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        if(x == 1){
            jv2.clan1();
            jv2.clan2();
            jv2.clan3();
        }else if(x == 2){
            s1.push("Dangerous");
            s1.push("Imba");
            s1.push("Rescue");
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
        }else if(x == 3){
            System.out.println("Clan dengan trophy terbesar");
            for(int i = 0;i <cslul.length;i++){
                int index = i;
                for(int j = i+1;j<cslul.length;j++)
                    if(cslul[j]<cslul[index])
                        index = j;
                int smll = cslul[index];
                cslul[index] = cslul[i];
                cslul[i] = smll;
            }
            for(int i:cslul){
                System.out.println(i);
            }
        }
        }while(true);
    }
         
}

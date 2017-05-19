package topik3;
import java.util.ArrayList;
    public class JavaApp3 {
        public int trophy1;
        public int trophy2;
        public int trophy3;
        public String cln1;
        public String cln2;
        public String cln3;
        
        public void cln1(){
        int a = 4000;
        int b = 3000;
        int c = 3300;
        int d = 3100;
        trophy1 = a+b+c+d;
        JavaApp4 jv4 = new JavaApp4();
        ArrayList<JavaApp5> j5 = new ArrayList<JavaApp5>();
        j5.add(new JavaApp5("___________________________________\n"));
        j5.add(new JavaApp5("DragonSlayer           ="+a));
        j5.add(new JavaApp5("xXxPssySl4y3rxXx       ="+c));
        j5.add(new JavaApp5("Heslignign             ="+d));
        j5.add(new JavaApp5("CykaBlade              ="+b));
        j5.add(new JavaApp5("Jumlah Trophy          ="+trophy1));
        for(JavaApp5 i: j5){
            System.out.println(i.getId());
        }    
    }
        public void cln2(){
        int a = 3200;
        int b = 3300;
        int c = 3250;
        int d = 3400;
        trophy2 = a+b+c+d;
        JavaApp4 jv42 = new JavaApp4();
        ArrayList<JavaApp5> j6 = new ArrayList<JavaApp5>();
        j6.add(new JavaApp5("___________________________________\n"));
        j6.add(new JavaApp5("Chum               ="+a));
        j6.add(new JavaApp5("Sponge             ="+c));
        j6.add(new JavaApp5("Star               ="+d));
        j6.add(new JavaApp5("Squirrel           ="+b));
        j6.add(new JavaApp5("Jumlah Trophy      ="+trophy2));
        for(JavaApp5 i: j6){
            System.out.println(i.getId());
        }
    }
        public void cln3(){
        int a = 3250;
        int b = 4300;
        int c = 3500;
        int d = 3850;
        trophy3 = a+b+c+d;
        JavaApp4 jv42 = new JavaApp4();
        ArrayList<JavaApp5> j6 = new ArrayList<JavaApp5>();
        j6.add(new JavaApp5("___________________________________\n"));
        j6.add(new JavaApp5("Lonians            ="+a));
        j6.add(new JavaApp5("Ken                ="+c));
        j6.add(new JavaApp5("Zomen              ="+d));
        j6.add(new JavaApp5("Deuskhan           ="+b));
        j6.add(new JavaApp5("Jumlah Trophy      ="+trophy3));
        for(JavaApp5 i: j6){
            System.out.println(i.getId());
        }
      }
    }

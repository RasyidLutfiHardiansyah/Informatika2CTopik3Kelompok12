package topik3;

    public class JavaApp2 {
        public String clan1;
        public String clan2;
        public String clan3;
        
        public void clan1(){
        JavaApp3 c1 = new JavaApp3();
        JavaApp4 cc1 = new JavaApp4();
        System.out.println("Clan Dangerous");
        System.out.println("Player\t\t\t"+"Trophy");
        c1.cln1();
        System.out.println("-----------------------------------");
        System.out.println("Pasukan yang dimiliki Clan Dangerous");
        cc1.clan1();
    }
    public void clan2(){
        JavaApp3 c2 = new JavaApp3();
        JavaApp4 cc2 = new JavaApp4();
        System.out.println("-----------------------------------\n");
        System.out.println("Clan Imba");
        System.out.println("Player\t\t\t"+"Trophy");
        c2.cln2();
        System.out.println("-----------------------------------");
        System.out.println("Pasukan yang dimiliki Clan Imba");
        cc2.clan2();
    }
    public void clan3(){
        JavaApp3 c3 = new JavaApp3();
        JavaApp4 cc3 = new JavaApp4();
        System.out.println("-----------------------------------\n");
        System.out.println("Clan Rescue");
        System.out.println("Player\t\t\t"+"Trophy");
        c3.cln3();
        System.out.println("-----------------------------------");
        System.out.println("Pasukan yang dimiliki Clan Rescue");
        cc3.clan3();
    }
 }

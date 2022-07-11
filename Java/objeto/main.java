public class main {
    public static void main(String[] args) {
        SmartDevice tv = new SmartDevice("Samsung","TV",2016);
        SmartPhone tel = new SmartPhone("Xiaomi","POCO",2021,true);
        SmartWatch reloj = new SmartWatch("Xiaomi","band",2018,false);

        System.out.println(tv);
        System.out.println(tel);
        System.out.println(reloj);
    }
}

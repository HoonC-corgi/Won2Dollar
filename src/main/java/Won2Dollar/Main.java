package Won2Dollar;

public class Main {
    public static void main(String[] args) {
       // Won2Dollar toDollar = new Won2Dollar(1200);
        //toDollar.run();
        //Km2Mile toMile = new Km2Mile(1.6);
        //toMile.run();

        Converter c = new Won2Dollar(1200);
        c.run();
        c = new Km2Mile(1.6);
        c.run();
    }
}

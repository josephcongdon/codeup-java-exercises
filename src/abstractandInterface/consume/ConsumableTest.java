package abstractandInterface.consume;

public class ConsumableTest {

    public static void main(String[] args) {
        Carrot c = new Carrot("Carrot top");
        Pill p = new Pill("Vikadinninin");

        c.consume();
        p.consume();
    }


}

package abstractandInterface;

public class MediaTest {
    public static void main(String[] args) {
        Media magazine = new Magazine();
        System.out.println(magazine.checkoutMedia());
        System.out.println(magazine.absorbMedia());
        System.out.println("");

        Media cd = new CD();
        System.out.println(cd.checkoutMedia());
        System.out.println(cd.absorbMedia());

    }


}

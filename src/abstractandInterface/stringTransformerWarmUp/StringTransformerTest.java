package abstractandInterface.stringTransformerWarmUp;

public class StringTransformerTest {
    public static void main(String[] args) {
        StringTransformer uppercase = new UpperCaseStringTransformer("this is major Tom");
        StringTransformer reverse = new ReverseStringTransformer("yo yo yo yo yo");

        System.out.println(uppercase.transform());
        System.out.println(reverse.transform());
    }
}

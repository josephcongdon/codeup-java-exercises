package abstractandInterface;

public class Magazine extends Media{

    @Override
    public String checkoutMedia() {
        return "I have checked out Magazine";
    }

    @Override
    public String absorbMedia() {
        return "I will read this magazine";
    }
}

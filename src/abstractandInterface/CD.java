package abstractandInterface;

public class CD extends Media{


    @Override
    public String checkoutMedia() {
        return "I have checked out the CD";
    }

    @Override
    public String absorbMedia() {
        return "I am going to listen to the CD";
    }
}

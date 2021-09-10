public class Quote {

    public static String randomQuotes(){
        switch((int) ((Math.random() * 4) + 1)){
            case (1):
                return ("Hello");
            case (2):
                return ("Sup");
            case (3):
                return ("Thrrevee");
            case (4):
                return ("Moo");

            default: return "Calm down";
        }
    }

}

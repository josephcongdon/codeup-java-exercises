public class ServerNameGenerator {


    public static void main(String[] args) {
        Noun[] nouns = {
                new Noun("Apple"),
                new Noun("Banana"),
                new Noun("Carrot"),
                new Noun("Dragon-fruit"),
                new Noun("Egg"),
                new Noun("Fish"),
                new Noun("Grapes"),
                new Noun("Honey"),
                new Noun("Ice"),
                new Noun("Juice")
        };
        for (Noun n : nouns){
            System.out.println(n.getNounWord());
        }
        Adjective[] adjectives = {
                new Adjective("Red"),
                new Adjective("Yellow"),
                new Adjective("Orange"),
                new Adjective("Pink"),
                new Adjective("White"),
                new Adjective("Silver"),
                new Adjective("Green"),
                new Adjective("Gold"),
                new Adjective("Black"),
                new Adjective("Purple")

        };
        for (Adjective a : adjectives){
            System.out.println(a.getAdjectiveWord());
        }
    }

}

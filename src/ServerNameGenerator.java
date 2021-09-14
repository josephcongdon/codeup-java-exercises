import java.util.Random;



public class ServerNameGenerator {

    public static String getRandom(String[] array) {
            return array[(int) (Math.random() * array.length)];
        }

    public static void main(String[] args) {
        String[] nouns = {
                ("Apple"),
                ("Banana"),
                ("Carrot"),
                ("Dragon-fruit"),
                ("Egg"),
                ("Fish"),
                ("Grapes"),
                ("Honey"),
                ("Ice"),
                ("Juice")
        };



        String[] adjectives = {
                ("Red"),
                ("Yellow"),
                ("Orange"),
                ("Pink"),
                ("White"),
                ("Silver"),
                ("Green"),
                ("Gold"),
                ("Black"),
                ("Purple")

        };
        System.out.println(getRandom(adjectives) + " " + getRandom(nouns));
    }

}

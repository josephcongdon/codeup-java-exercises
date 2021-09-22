import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString();
        System.out.println(userInput);
        boolean yesNoResult = input.yesNo(userInput);
        System.out.println(yesNoResult ? "User said yes" : "User said no");
//        Input newInput = new Input();
        System.out.println(input.getInt());

    }
}

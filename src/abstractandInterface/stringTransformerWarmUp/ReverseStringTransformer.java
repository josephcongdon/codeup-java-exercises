package abstractandInterface.stringTransformerWarmUp;

public class ReverseStringTransformer extends StringTransformer{

    public ReverseStringTransformer(String str){
        this.str = str;

    }



    @Override
    String transform() {
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        return String.valueOf(str1);
    }
}

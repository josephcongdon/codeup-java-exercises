package abstractandInterface.stringTransformerWarmUp;

import java.util.Locale;

public class UpperCaseStringTransformer extends StringTransformer{

    public UpperCaseStringTransformer(String str){
        this.str=str;
    }

    @Override
    String transform() {
        return str.toUpperCase(Locale.ROOT);
    }
}

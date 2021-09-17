package abstractandInterface.stringTransformerWarmUp;

abstract class StringTransformer {
    protected String str;

    public StringTransformer(){

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    abstract String transform();
}

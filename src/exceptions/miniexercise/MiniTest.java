package exceptions.miniexercise;

public class MiniTest {
    public static void main(String[] args) {

        try{
            Mini con = new Mini();
            System.out.println(Integer.parseInt(con.notAnInteger));
        }catch (NumberFormatException nfx){
            System.out.println(nfx.getMessage());
        }


    }


}

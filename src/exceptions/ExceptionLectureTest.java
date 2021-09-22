package exceptions;

public class ExceptionLectureTest {
    public static void main(String[] args) {




//        try{
//        ExceptionLecture el = new ExceptionLecture();
//        el.askForInteger();
//        System.out.println(Integer.parseInt(el.certainlyNotAnInteger));
//    } catch( NumberFormatException nfx) {
//        System.out.println(" Got an exception " + nfx);
//            System.out.println(nfx.getMessage());
////            nfx.printStackTrace();

        try{
            ExceptionLecture la = new ExceptionLecture();
            la.subListMaker("You have written this sentence");
        } catch(IndexOutOfBoundsException iobx){
            iobx.getMessage();
        } catch(NumberFormatException nfx) {
            nfx.getMessage();
        }


        }



    }


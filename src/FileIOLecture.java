import java.io.IOException;
import  java.nio.file.*;
import java.util.Arrays;
import java.util.List;


public class FileIOLecture {

    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path.toAbsolutePath());

//        Path pathToThisLectureFile = Paths.get("src", "FileIOLecture.java");
//        System.out.println(pathToThisLectureFile);

//        Path pathToOurDataDir = Paths.get("src/data");
//        try{
//            if (Files.notExists(pathToOurDataDir)) {
//                Files.createDirectories(pathToOurDataDir);
//            } else {
//                System.out.println("The " + pathToOurDataDir + " directory already exists");
//            }
//        Files.createDirectories(pathToOurDataDir);
//        }catch(IOException ioe){
//            System.out.println("There was an issue.");
//            ioe.printStackTrace();
//        }

        Path pathToOurFile = Paths.get("src/data", "list.txt");
        try{
            if (Files.notExists(pathToOurFile)) {
                Files.createFile(pathToOurFile);
            } else {
                System.out.println("The " + pathToOurFile + " directory already exists");
            }
            Files.createDirectories(pathToOurFile);
        }catch(IOException ioe){
            System.out.println("There was an issue.");
            ioe.printStackTrace();
        }

        List<String> Beetles = Arrays.asList(
                "Paul",
                "John",
                "George",
                "Ringo"
        );
        try{
            Files.write(pathToOurFile, Beetles);
        } catch (FileAlreadyExistsException fae){
            System.out.println("The " + fae + " already exists");
        } catch (IOException ioe){
            System.out.println("there was an issue with Beetles.");
            ioe.printStackTrace();
        }

//        Path pathToTestDir = Paths.get("src/test");
//        try{
//            System.out.println(pathToTestDir);
//            Files.createDirectories(pathToTestDir);
//        }catch(IOException ioe){
//            ioe.printStackTrace();
//        }

    }
}

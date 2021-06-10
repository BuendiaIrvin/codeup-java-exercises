import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class FileIOLec {

    public void readFileAndOutput (Path pathToFile){
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (String line : currentList){
            System.out.println(line);
        }
    }


    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path path = Paths.get("src", "FileIOLec.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path pathToSrc = Paths.get("src");
//        System.out.println(pathToSrc);
//        Path thisWontWork = Paths.get(pathToSrc, "FileIOLec.java");
//        Path thiswillWork = Paths.get(String.valueOf(pathToSrc), "FileIOLec.java");
//        System.out.println(thiswillWork);


        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");


        try {
            if (Files.notExists(toOurDataPlace)){
                Files.createDirectories(toOurDataPlace);
        } else{
            System.out.println("The " + toOurDataPlace + " directory already exists");
        }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }


        //create a file
        try {
            if (Files.notExists(toOurDataFile)) {
                Files.createFile(toOurDataFile);
            } else {
                System.out.println("the " + toOurDataFile + " already exists");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        //write to a file

        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Domna");
        try {
            Files.write(toOurDataFile, romanEmpresses);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        //read from a file
        //create a place to put info we read from the file
//        List<String> currentList = new ArrayList<>();


        // read the information from the title
//        try {
//            currentList = Files.readAllLines(toOurDataFile);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }

        // loop through ArrayList and output each item
//        for (String line : currentList){
//            System.out.println(line);
//        }

        FileIOLec io = new FileIOLec();
//        io.readFileAndOutput(toOurDataFile);

        // Append a single item to our List
        try {
            Files.writeString(toOurDataFile, "Julia Maesa\n", StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
//        io.readFileAndOutput(toOurDataFile);


        List<String> lateRomanEmpresses = new ArrayList<>();
        lateRomanEmpresses.add("Galla PLacidia");
        lateRomanEmpresses.add("Theodora");
        lateRomanEmpresses.add("Licinia Eudoxia");


        try {
            Files.write(toOurDataFile, lateRomanEmpresses, StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
//        io.readFileAndOutput(toOurDataFile);

        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(toOurDataFile);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        Iterator<String> listIterator = currentList.iterator();
        while(listIterator.hasNext()){
            String empress = listIterator.next();
            if (empress.equals("Messaline")){
                listIterator.remove();
            }
        }
        try {
            Files.write(toOurDataFile, currentList);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        io.readFileAndOutput(toOurDataFile);
    }
}

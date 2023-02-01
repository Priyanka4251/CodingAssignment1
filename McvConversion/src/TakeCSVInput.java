import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.nio.Buffer;

public class TakeCSVInput {
    public static void main(String[] args) {
        ObjectInputStream obj2=new ObjectInputStream(new FileInputStream("studentdata.txt"));
    }
    public static void readDataLineByLine(String file) {
        try {
            FileReader filereader = new FileReader(file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

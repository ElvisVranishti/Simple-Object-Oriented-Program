//Elvis Vranishti
import java.io.*;
public class FileCreator {
    //instance variable
    private File m_file;

    //constructor
    public FileCreator() {
        String filename = "output.txt";
        m_file = new File(filename);
    }
    public void writeFile(String city) {
        try {
            PrintWriter pw = new PrintWriter(m_file);
            pw.write("Toyota Corolla," + "\t" + "Color: Blue," + "\t" + "Starting Mileage: 30" + "\n");
            pw.write("Toyota RAV4," + "\t" + "Color: Black," + "\t" + "Starting Mileage: 1500" + "\n");
            pw.write("Toyota Tundra," + "\t" + "Color: Silver," + "\t" + "Starting Mileage: 20" + "\n");
            pw.write("Honda Accord," + "\t" + "Color: Black," + "\t" + "Starting Mileage: 2000" + "\n");
            pw.write("Honda CRV," + "\t" + "Color: White," + "\t" + "Starting Mileage: 10" + "\n");
            pw.write("Honda Ridgeline," + "\t" + "Color: Red," + "\t" + "Starting Mileage: 1500" + "\n");
            pw.close();
        }
        catch(Exception ex) {
                System.out.println("Error with writeFile");
        }
    }

}

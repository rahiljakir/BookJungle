import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.table.DefaultTableModel;

public class fileconnect {
    public static void saveData(DefaultTableModel data) {
        try {
            FileOutputStream f = new FileOutputStream("../data/books.dat");
            ObjectOutputStream fo = new ObjectOutputStream(f);
            fo.writeObject(data);
            System.out.println("done saving to file");
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

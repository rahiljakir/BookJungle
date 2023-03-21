import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.table.DefaultTableModel;

public class fileconnect {
    public static DefaultTableModel retrieve() {
        try {
            FileInputStream f = new FileInputStream("./books.dat");
            ObjectInputStream fo = new ObjectInputStream(f);
            DefaultTableModel model = (DefaultTableModel) fo.readObject();
            fo.close();
            return model;

        } catch (Exception e) {
            System.out.println(e);
            return new DefaultTableModel(new String[] {
                    "bookid", "bookname", "authorname", "publications",
                    "dateofpublications", "priceofbook",
                    "totalquantitytoorder", "totalcost"
            }, 0);
        }
    }

    public static void saveData(DefaultTableModel data) {
        try {
            FileOutputStream f = new FileOutputStream("./books.dat");
            ObjectOutputStream fo = new ObjectOutputStream(f);
            fo.writeObject(data);
            System.out.println("done saving to file");
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.sql.*;

public class dbconnect {
    public static void deletion(int bookid, Connection conn) {
        try {

            System.out.println("Connection part done");
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM bookinfo WHERE bookid =?");
            pstm.setInt(1, bookid);
            pstm.execute();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void updatetable(String UserEntry, String columnname, int bookid, Connection conn) {

        try {

            System.out.println("Connection part done");
            CallableStatement call1 = conn.prepareCall("{call updatetable1(?,?,?)}");
            CallableStatement call2 = conn.prepareCall("{call updatetable2(?,?,?)}");

            if (columnname == "bookid" || columnname == "authorname" || columnname == "publications"
                    || columnname == "dateofpublications") {
                System.out.println("String update");
                call1.setString(2, columnname);
                call1.setString(1, UserEntry);
                call1.setInt(3, bookid);
                call1.execute();

            } else {
                call2.setString(2, columnname);
                call2.setInt(1, Integer.parseInt(UserEntry));
                call2.setInt(3, bookid);
                call2.execute();
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public static ResultSet refeshtable(Connection conn) {
        try {

            System.out.println("Connection part done");

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("Select * from bookinfo");
            return rs;
        } catch (Exception e) {
            System.out.println(e);
            return null;

        }
    }

    public static void SendingEntry(int a1, String a2, String a3, String a4, String a5, int a6, int a7,
            Connection conn) {
        try {

            System.out.println("Connection part done");
            PreparedStatement UserEntry = conn.prepareStatement("insert into bookinfo values(?,?,?,?,?,?,?,?)");

            UserEntry.setInt(1, a1);
            UserEntry.setString(2, a2);
            UserEntry.setString(3, a3);
            UserEntry.setString(4, a4);
            UserEntry.setString(5, a5);
            UserEntry.setInt(6, a6);
            UserEntry.setInt(7, a7);
            UserEntry.setInt(8, a6 * a7);
            UserEntry.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

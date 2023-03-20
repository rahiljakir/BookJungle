import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.event.MouseInputListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class gui extends javax.swing.JFrame {

        public gui() {
                initComponents();
        }

        // @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                // buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                // jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jTextField5 = new javax.swing.JTextField();
                jTextField6 = new javax.swing.JTextField();
                jTextField7 = new javax.swing.JTextField();
                // jTextField8 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                mycolor = jButton1.getBackground();
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Book Details Library");
                jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

                jPanel1.setBackground(new java.awt.Color(51, 255, 204));

                jLabel2.setText("BookId:");

                jLabel3.setText("BookName:");

                jLabel4.setText("authorName:");

                jLabel5.setText("publications:");

                jLabel6.setText("DateOfPublication:");

                jLabel7.setText("priceOfbook:");

                jLabel8.setText("totalQuantityToOrder:");

                // jLabel9.setText("totalCost:");

                jButton1.setText("Save");

                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Reset");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel10.setText("Add New Book");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                // .addComponent(jLabel9)
                                                                                                                                                )
                                                                                                                                                .addGap(44, 44, 44)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(jTextField7,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                // .addComponent(jTextField8,
                                                                                                                                                // javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                // 125,
                                                                                                                                                // javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                ))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                                .addComponent(jLabel7))
                                                                                                                                                .addGap(61, 61, 61)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(jTextField5,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jTextField6,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jTextField4,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jTextField3,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jTextField2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(59, 59, 59)
                                                                                                .addComponent(jButton1)
                                                                                                .addGap(72, 72, 72)
                                                                                                .addComponent(jButton2))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(163, 163, 163)
                                                                                                .addComponent(jLabel10)))
                                                                .addGap(0, 184, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel10)
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(22, 22, 22)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jTextField2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jTextField3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jTextField4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jTextField5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jTextField6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jTextField7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                // .addComponent(jLabel9)
                                                                // .addComponent(jTextField8,
                                                                // javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                // javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                // javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                )
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1)
                                                                                .addComponent(jButton2))
                                                                .addGap(46, 46, 46)));

                jPanel2.setBackground(new java.awt.Color(0, 204, 153));

                jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel12.setText("Available Book Table");

                jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                /* responsible for table data */
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null, null, null, null, null },
                                                { null, null, null, null, null, null, null, null },
                                                { null, null, null, null, null, null, null, null },
                                                { null, null, null, null, null, null, null, null }
                                },
                                new String[] {
                                                "bookid", "bookname", "authorname", "publications",
                                                "dateofpublications", "priceofbook",
                                                "totalquantitytoorder", "totalcost"
                                })

                {
                        boolean[] canEdit = new boolean[] {
                                        false, false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });

                jScrollPane1.setViewportView(jTable1);

                jButton3.setText("Update");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setText("Refresh");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setText("Delete");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel12,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1))
                                                                .addContainerGap())
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(60, 60, 60)
                                                                .addComponent(jButton3)
                                                                .addGap(112, 112, 112)
                                                                .addComponent(jButton4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton5)
                                                                .addGap(91, 91, 91)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                24,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                345,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(43, 43, 43)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton3)
                                                                                .addComponent(jButton4)
                                                                                .addComponent(jButton5))
                                                                .addContainerGap(42, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1189,
                                                                Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))));

                pack();
        }// </editor-fold>

        MouseInputListener l = new MouseInputListener() {

                @Override
                public void mouseClicked(MouseEvent e) {

                        int bookid = Integer.parseInt(
                                        jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
                        dbconnect.deletion(bookid, cc);
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }

                @Override
                public void mouseDragged(MouseEvent e) {

                }

                @Override
                public void mouseMoved(MouseEvent e) {

                }

        };

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                int a1 = Integer.parseInt(jTextField1.getText());
                String a2 = jTextField2.getText();
                String a3 = jTextField3.getText();
                String a4 = jTextField4.getText();
                String a5 = jTextField5.getText(); // yyyy-mm-dd
                int a6 = Integer.parseInt(jTextField6.getText());
                int a7 = Integer.parseInt(jTextField7.getText());
                dbconnect.SendingEntry(a1, a2, a3, a4, a5, a6, a7, cc);
                System.out.println("Added to database");
                jButton2ActionPerformed(null);

        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");

        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("update pressed");
                jButton3.setBackground(new Color(26, 115, 232));
                jTable1.getModel().addTableModelListener(new TableModelListener() {

                        @Override
                        public void tableChanged(TableModelEvent e) {
                                DefaultTableModel d = (DefaultTableModel) e.getSource();
                                int bookid = Integer.parseInt(d.getValueAt(e.getFirstRow(), 0).toString());
                                String UserEntry = d.getValueAt(e.getFirstRow(), e.getColumn()).toString();
                                String columnname = d.getColumnName(e.getColumn());
                                dbconnect.updatetable(UserEntry, columnname, bookid, cc);

                        }

                });
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                jTable1.removeMouseListener(l);
                jButton3.setBackground(mycolor);
                jButton5.setBackground(mycolor);
                ResultSet rs = dbconnect.refeshtable(cc);
                DefaultTableModel model = new DefaultTableModel(new String[] {
                                "bookid", "bookname", "authorname", "publications",
                                "dateofpublications", "priceofbook",
                                "totalquantitytoorder", "totalcost"
                }, 0);

                try {
                        while (rs.next()) {

                                Object[] obj = { rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                                                rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8) };
                                model.addRow(obj);
                        }

                        jTable1.setModel(model);
                } catch (Exception e) {
                        System.out.println(e);
                }
        }

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
                jTable1.addMouseListener(l);
                jButton5.setBackground(new Color(26, 115, 232));

        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new gui().setVisible(true);
                        }
                });
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        gui.cc = DriverManager.getConnection(
                                        "jdbc:mysql://bookjungle.c9qyta5z7uyu.ap-southeast-2.rds.amazonaws.com:3306/BookJungle",
                                        "admin", "bookjungle");
                } catch (Exception e) {
                        System.out.println(e);
                }

        }

        // Variables declaration - do not modify
        // private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        // private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private Color mycolor;
        private static Connection cc;
        // private javax.swing.JTextField jTextField8;
        // End of variables declaration
}

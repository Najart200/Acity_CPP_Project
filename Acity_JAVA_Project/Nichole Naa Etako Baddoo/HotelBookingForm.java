import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
//newones
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mseta
 */
public class HotelBookingForm extends javax.swing.JFrame {

    /**
     * Creates new form HotelBookingForm
     */
    public HotelBookingForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        checkinfield = new javax.swing.JTextField();
        checkoutfield = new javax.swing.JTextField();
        paymentfield = new javax.swing.JTextField();
        roomtype = new javax.swing.JComboBox<>();
        paymentmethodfield = new javax.swing.JComboBox<>();
        bookbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputfield = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter your name:");

        jLabel2.setText("Select Room Type:");

        jLabel3.setText("Check-in Date:");

        jLabel4.setText("Check-out Date:");

        jLabel5.setText("Payment Date:");

        jLabel6.setText("Select Payment Method:");

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Deluxe", "Executive", " " }));

        paymentmethodfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "Online", " " }));

        bookbutton.setText("Book Now");
        bookbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbuttonActionPerformed(evt);
            }
        });

        outputfield.setEditable(false);
        outputfield.setColumns(20);
        outputfield.setRows(5);
        jScrollPane1.setViewportView(outputfield);

        jButton1.setText("Update Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.setActionCommand("Delete Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkoutfield)
                                .addComponent(roomtype, 0, 141, Short.MAX_VALUE)
                                .addComponent(checkinfield)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(paymentfield))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(paymentmethodfield, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkinfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoutfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentmethodfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(bookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbuttonActionPerformed
        
String customerName = namefield.getText();
String roomType = (String) roomtype.getSelectedItem();
String checkInDate = checkinfield.getText();
String checkOutDate = checkoutfield.getText();
String paymentDate = paymentfield.getText();
String paymentMethod = (String) paymentmethodfield.getSelectedItem();
//new ones
LocalDate checkIn = LocalDate.parse(checkInDate);
LocalDate checkOut = LocalDate.parse(checkOutDate);
long stayDays = ChronoUnit.DAYS.between(checkIn, checkOut);
if (stayDays < 1) {
    JOptionPane.showMessageDialog(this, "check-out date must be after check-in date");
    return;
}

long ratePerNight;
switch (roomType){
    case "Deluxe":
        ratePerNight = 150;
        break;
    case "Executive":
        ratePerNight = 200;
        break;
    case "Standard":
    default:
        ratePerNight = 100;
        break;
}

long totalCost = stayDays * ratePerNight;


        
String output = "Booking Confirmed!\n"
    + "Name: " + customerName + "\n"
    + "Room Type: " + roomType + "\n"
    + "Check-in: " + checkInDate + "\n"
    + "Check-out: " + checkOutDate + "\n"
    + "Stay Duration: " + stayDays + " nights(s)\n"
    + "Total Cost: GHC " + totalCost + "\n"
    + "Payment Date: " + paymentDate + "\n"
    + "Payment Method: " + paymentMethod;

    outputfield.setText(output);

    try {
        FileWriter outToFile = new FileWriter("booking.txt", true); // append mode
        outToFile.write(output + "\n\n");
        outToFile.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Could not write to file.");
    }

    }//GEN-LAST:event_bookbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //new
         try {
        String nameToUpdate = JOptionPane.showInputDialog("Enter name to update:");
        if (nameToUpdate == null || nameToUpdate.isEmpty()) return;

        // Read all bookings
        BufferedReader reader = new BufferedReader(new FileReader("booking.txt"));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();

        String[] bookings = content.toString().split("\n\n");
        int index = -1;

        // Find the booking by name
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i].contains("Name: " + nameToUpdate)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Booking not found.");
            return;
        }

        // Room Type Selection with JComboBox
        String[] roomTypes = {"Standard", "Deluxe", "Executive"};
        String newRoom = (String) JOptionPane.showInputDialog(null, "Select new room type:", "Room Type", 
                JOptionPane.QUESTION_MESSAGE, null, roomTypes, roomTypes[0]);

        if (newRoom != null && !newRoom.isEmpty()) {
            bookings[index] = bookings[index].replaceAll("Room Type: .*", "Room Type: " + newRoom);

            // Ask the user to type the new stay duration (in days)
            String newStayDurationStr = JOptionPane.showInputDialog("Enter new stay duration in days:");
            if (newStayDurationStr == null || newStayDurationStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid stay duration. Please enter a valid number.");
                return; // Prevent further execution
            }

            // Try parsing the stay duration
            long stayDays = 0;
            try {
                stayDays = Long.parseLong(newStayDurationStr); // Parse the typed number
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid stay duration. Please ensure it is a valid number.");
                return; // Prevent further execution
            }

            // Calculate new total cost based on the selected room
            long ratePerNight;
            switch (newRoom) {
                case "Deluxe":
                    ratePerNight = 150;
                    break;
                case "Executive":
                    ratePerNight = 200;
                    break;
                case "Standard":
                default:
                    ratePerNight = 100;
                    break;
            }

            // Calculate new total cost
            long totalCost = stayDays * ratePerNight;

            // Update the booking with the new stay duration and cost
            bookings[index] = bookings[index].replaceAll("Stay Duration: .*", "Stay Duration: " + stayDays + " days");
            bookings[index] = bookings[index].replaceAll("Total Cost: .*", "Total Cost: GHC " + totalCost);
        }

        // Rewrite the file with the updated bookings
        FileWriter writer = new FileWriter("booking.txt", false);
        for (String booking : bookings) {
            writer.write(booking.trim() + "\n\n");
        }
        writer.close();

        JOptionPane.showMessageDialog(null, "Booking updated successfully!");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try {
        String nameToDelete = JOptionPane.showInputDialog("Enter name to delete:");
        if (nameToDelete == null || nameToDelete.isEmpty()) return;

        // Read all bookings
        BufferedReader reader = new BufferedReader(new FileReader("booking.txt"));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();

        // Split the content into an array of bookings
        String[] bookings = content.toString().split("\n\n");
        int index = -1;

        // Find the booking by name
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i].contains("Name: " + nameToDelete)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Booking not found.");
            return;
        }

        // Remove the booking from the list by creating a new ArrayList
        List<String> bookingList = new ArrayList<>(Arrays.asList(bookings));
        bookingList.remove(index);

        // Convert the list back to an array
        bookings = bookingList.toArray(new String[0]);

        // Rewrite the file with the updated bookings
        FileWriter writer = new FileWriter("booking.txt", false);
        for (String booking : bookings) {
            writer.write(booking.trim() + "\n\n");
        }
        writer.close();

        JOptionPane.showMessageDialog(null, "Booking deleted successfully!");

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelBookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookbutton;
    private javax.swing.JTextField checkinfield;
    private javax.swing.JTextField checkoutfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextArea outputfield;
    private javax.swing.JTextField paymentfield;
    private javax.swing.JComboBox<String> paymentmethodfield;
    private javax.swing.JComboBox<String> roomtype;
    // End of variables declaration//GEN-END:variables
}

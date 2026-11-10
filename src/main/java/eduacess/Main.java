/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eduacess;

/**
 *
 * @author joyro
 */
    /**
     * @param args the command line arguments
     */
   
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        SupportManager manager = new SupportManager();

        RequestEditor editor = new RequestEditor(manager);

        SupportReviewForm review =
                new SupportReviewForm(manager);

        String choice;

        do {
            choice = JOptionPane.showInputDialog(
                    "EDUACCESS - EDUCATIONAL SUPPORT\n\n"
                    + "1. Submit Support Request\n"
                    + "2. Review Support Requests\n"
                    + "0. Exit\n\n"
                    + "Enter your choice:");

            if (choice == null) {
                break;
            }

            switch (choice) {

                case "1":
                    editor.submitRequest();
                    break;

                case "2":
                    review.showMenu();
                    break;

                case "0":
                    JOptionPane.showMessageDialog(null,
                            "Thank you for using EduAccess.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Invalid choice.");
            }

        } while (!choice.equals("0"));
    }
}

    


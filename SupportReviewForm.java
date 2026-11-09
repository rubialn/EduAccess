/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduacess;

/**
 *
 * @author joyro
 */
import javax.swing.JOptionPane;

public class SupportReviewForm {

    private SupportManager manager;

    public SupportReviewForm(SupportManager manager) {
        this.manager = manager;
    }

    public void showMenu() {

        String choice;

        do {
            choice = JOptionPane.showInputDialog(
                    "REVIEW SUPPORT REQUESTS\n\n"
                    + "1. View All Requests\n"
                    + "2. Search Request\n"
                    + "3. Respond to Request\n"
                    + "4. Resolve Request\n"
                    + "5. Delete Request\n"
                    + "0. Back\n\n"
                    + "Enter your choice:");

            if (choice == null) {
                return;
            }

            switch (choice) {

                case "1":
                    viewRequests();
                    break;

                case "2":
                    searchRequest();
                    break;

                case "3":
                    respondToRequest();
                    break;

                case "4":
                    resolveRequest();
                    break;

                case "5":
                    deleteRequest();
                    break;

                case "0":
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Invalid choice.");
            }

        } while (!choice.equals("0"));
    }

    public void viewRequests() {

        String details = "";

        for (SupportRequest request : manager.getAllRequests()) {
            details += request.getDetails() + "\n\n";
        }

        if (details.equals("")) {
            details = "No requests available.";
        }

        JOptionPane.showMessageDialog(null, details);
    }

    public void searchRequest() {

        String input = JOptionPane.showInputDialog(
                "Enter Request ID:");

        if (input == null) {
            return;
        }

        try {
            int id = Integer.parseInt(input);

            SupportRequest request = manager.searchRequest(id);

            if (request != null) {
                JOptionPane.showMessageDialog(null,
                        request.getDetails());
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not found.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid number.");
        }
    }

    public void respondToRequest() {

        String input = JOptionPane.showInputDialog(
                "Enter Request ID:");

        if (input == null) {
            return;
        }

        try {
            int id = Integer.parseInt(input);
            SupportRequest request = manager.searchRequest(id);

            if (request != null) {

                String response = JOptionPane.showInputDialog(
                        "Enter response:");

                if (response == null) {
                    return;
                }

                request.recordResponse(response);

                JOptionPane.showMessageDialog(null,
                        "Response saved.");

            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not found.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid number.");
        }
    }

    public void resolveRequest() {

        String input = JOptionPane.showInputDialog(
                "Enter Request ID:");

        if (input == null) {
            return;
        }

        try {
            int id = Integer.parseInt(input);
            SupportRequest request = manager.searchRequest(id);

            if (request != null) {
                request.markResolved();

                JOptionPane.showMessageDialog(null,
                        "Request marked as resolved.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not found.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid number.");
        }
    }

    public void deleteRequest() {

        String input = JOptionPane.showInputDialog(
                "Enter Request ID:");

        if (input == null) {
            return;
        }

        try {
            int id = Integer.parseInt(input);
            SupportRequest request = manager.searchRequest(id);

            if (request != null) {
                manager.deleteRequest(id);

                JOptionPane.showMessageDialog(null,
                        "Request deleted.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not found.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid number.");
        }
    }
}


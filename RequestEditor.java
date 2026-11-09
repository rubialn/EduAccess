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

public class RequestEditor {

    private SupportManager manager;

    public RequestEditor(SupportManager manager) {
        this.manager = manager;
    }

    public void submitRequest() {

        String choice = JOptionPane.showInputDialog(
                "SUBMIT SUPPORT REQUEST\n\n"
                + "1. Subject Question\n"
                + "2. Study Guidance\n"
                + "0. Back\n\n"
                + "Enter your choice:");

        if (choice == null || choice.equals("0")) {
            return;
        }

        if (choice.equals("1")) {

            String subject = JOptionPane.showInputDialog(
                    "Enter the subject:");

            if (subject == null) {
                return;
            }

            String message = JOptionPane.showInputDialog(
                    "Enter your question:");

            if (message == null) {
                return;
            }

            QuestionSubject request = new QuestionSubject(
                    manager.getNextId(), message, subject);

            manager.addRequest(request);

            JOptionPane.showMessageDialog(null,
                    "Your subject question has been submitted.");

        } else if (choice.equals("2")) {

            String topic = JOptionPane.showInputDialog(
                    "Enter the study topic:");

            if (topic == null) {
                return;
            }

            String message = JOptionPane.showInputDialog(
                    "Enter what guidance you need:");

            if (message == null) {
                return;
            }

            StudyGuidanceRequest request =
                    new StudyGuidanceRequest(
                            manager.getNextId(), message, topic);

            manager.addRequest(request);

            JOptionPane.showMessageDialog(null,
                    "Your study guidance request has been submitted.");

        } else {
            JOptionPane.showMessageDialog(null,
                    "Invalid choice.");
        }
    }
}



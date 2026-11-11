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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Educational_Support_App menu for the Educational Support section
public class Educational_Support_App extends JFrame {

    JPanel p;

    JLabel titleLbl, subtitleLbl;

    JButton submitBtn, reviewBtn, exitBtn;

    public Educational_Support_App() {

        setTitle("EduAccess - Educational Support");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        add(p);

        // Create labels
        titleLbl = new JLabel("EDUACCESS");
        subtitleLbl = new JLabel("Educational Support");

        // Create buttons
        submitBtn = new JButton("Submit Support Request");
        reviewBtn = new JButton("Review Support Requests");
        exitBtn = new JButton("Exit");

        // Set positions
        titleLbl.setBounds(170, 20, 200, 30);
        subtitleLbl.setBounds(155, 60, 200, 30);

        submitBtn.setBounds(100, 110, 250, 40);
        reviewBtn.setBounds(100, 170, 250, 40);
        exitBtn.setBounds(150, 230, 150, 40);

        // Add components to panel
        p.add(titleLbl);
        p.add(subtitleLbl);
        p.add(submitBtn);
        p.add(reviewBtn);
        p.add(exitBtn);

        // Event handling
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        reviewBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reviewBtnActionPerformed(evt);
            }
        });

        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
    }

    // Open the Submit Request form
    private void submitBtnActionPerformed(ActionEvent evt) {

        RequestEditor editor = new RequestEditor();
        editor.setVisible(true);
    }

    // Open the Review Requests form
    private void reviewBtnActionPerformed(ActionEvent evt) {

        SupportReviewForm review = new SupportReviewForm();
        review.setVisible(true);
    }

    // Close the application
    private void exitBtnActionPerformed(ActionEvent evt) {

        dispose();
    }

    public static void main(String[] args) {

        Educational_Support_App app = new Educational_Support_App();
        app.setVisible(true);
    }
}

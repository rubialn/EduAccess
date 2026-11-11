/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduacess;
/**
 *
 * @author joyro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// GUI for reviewing educational support requests
public class SupportReviewForm extends JFrame {

    JPanel p;

    JLabel titleLbl, idLbl;

    JTextField idTf;
    JTextArea requestTa;

    JButton viewBtn, searchBtn, respondBtn;
    JButton resolveBtn, deleteBtn, backBtn;

    public SupportReviewForm() {

        setTitle("Review Support Requests");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create panel
        p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        add(p);

        // Create labels
        titleLbl = new JLabel("Review Support Requests");
        idLbl = new JLabel("Request ID:");

        // Create text fields
        idTf = new JTextField();
        requestTa = new JTextArea();
        requestTa.setEditable(false);

        // Create buttons
        viewBtn = new JButton("View All");
        searchBtn = new JButton("Search");
        respondBtn = new JButton("Respond");
        resolveBtn = new JButton("Resolve");
        deleteBtn = new JButton("Delete");
        backBtn = new JButton("Back");

        // Set positions
        titleLbl.setBounds(200, 20, 250, 30);

        idLbl.setBounds(50, 70, 100, 30);
        idTf.setBounds(150, 70, 150, 30);
        searchBtn.setBounds(320, 70, 100, 30);

        requestTa.setBounds(50, 120, 480, 180);

        viewBtn.setBounds(50, 330, 100, 30);
        respondBtn.setBounds(160, 330, 100, 30);
        resolveBtn.setBounds(270, 330, 100, 30);
        deleteBtn.setBounds(380, 330, 100, 30);
        backBtn.setBounds(220, 390, 120, 30);

        // Add components to panel
        p.add(titleLbl);
        p.add(idLbl);
        p.add(idTf);
        p.add(searchBtn);
        p.add(requestTa);

        p.add(viewBtn);
        p.add(respondBtn);
        p.add(resolveBtn);
        p.add(deleteBtn);
        p.add(backBtn);

        // Event handling for buttons
        viewBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        respondBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                respondBtnActionPerformed(evt);
            }
        });

        resolveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resolveBtnActionPerformed(evt);
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
    }

    // View button event
    private void viewBtnActionPerformed(ActionEvent evt) {

        requestTa.setText("No requests to display yet.");
    }

    // Search button event
    private void searchBtnActionPerformed(ActionEvent evt) {

        requestTa.setText("Search functionality coming soon.");
    }

    // Respond button event
    private void respondBtnActionPerformed(ActionEvent evt) {

        JOptionPane.showInputDialog(
                "Enter your response:");
    }

    // Resolve button event
    private void resolveBtnActionPerformed(ActionEvent evt) {

        JOptionPane.showMessageDialog(null,
                "Resolve functionality coming soon.");
    }

    // Delete button event
    private void deleteBtnActionPerformed(ActionEvent evt) {

        JOptionPane.showMessageDialog(null,
                "Delete functionality coming soon.");
    }

    // Back button event
    private void backBtnActionPerformed(ActionEvent evt) {

        dispose();
    }
}

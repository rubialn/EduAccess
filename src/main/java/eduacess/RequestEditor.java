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

// GUI for submitting support requests
public class RequestEditor extends JFrame {

    JPanel p;

    JLabel titleLbl, typeLbl, subjectLbl, messageLbl;

    JComboBox<String> typeBox;
    JTextField subjectTf;
    JTextArea messageTa;

    JButton submitBtn, clearBtn, backBtn;

    public RequestEditor() {

        setTitle("Submit Support Request");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create panel
        p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        add(p);

        // Create labels
        titleLbl = new JLabel("Submit Support Request");
        typeLbl = new JLabel("Request Type:");
        subjectLbl = new JLabel("Subject / Topic:");
        messageLbl = new JLabel("Message:");

        // Create input fields
        String[] types = {"Subject Question", "Study Guidance"};
        typeBox = new JComboBox<>(types);

        subjectTf = new JTextField();
        messageTa = new JTextArea();

        // Create buttons
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        backBtn = new JButton("Back");

        // Set positions (x, y, width, height)
        titleLbl.setBounds(150, 20, 250, 30);

        typeLbl.setBounds(30, 70, 120, 30);
        typeBox.setBounds(160, 70, 260, 30);

        subjectLbl.setBounds(30, 120, 120, 30);
        subjectTf.setBounds(160, 120, 260, 30);

        messageLbl.setBounds(30, 170, 120, 30);
        messageTa.setBounds(160, 170, 260, 100);

        submitBtn.setBounds(60, 310, 100, 30);
        clearBtn.setBounds(190, 310, 100, 30);
        backBtn.setBounds(320, 310, 100, 30);

        // Add components to panel
        p.add(titleLbl);
        p.add(typeLbl);
        p.add(typeBox);
        p.add(subjectLbl);
        p.add(subjectTf);
        p.add(messageLbl);
        p.add(messageTa);

        p.add(submitBtn);
        p.add(clearBtn);
        p.add(backBtn);

        // Button event handling
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
    }

    // Submit button event
    private void submitBtnActionPerformed(ActionEvent evt) {

        JOptionPane.showMessageDialog(null,
                "Request submitted successfully!");
    }

    // Clear button event
    private void clearBtnActionPerformed(ActionEvent evt) {

        subjectTf.setText("");
        messageTa.setText("");
        typeBox.setSelectedIndex(0);
    }

    // Back button event
    private void backBtnActionPerformed(ActionEvent evt) {

        dispose();
    }
}

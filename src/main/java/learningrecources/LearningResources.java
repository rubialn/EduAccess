/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learningrecourses;

import javax.swing.SwingUtilities;
/**
 * @author Binderiya Ganorig
 */
public class LearningResources {

   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            ResourceBrowser browser = new ResourceBrowser();
            browser.setVisible(true);

        });
    }
}

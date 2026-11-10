/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduacess;

/**
 *
 * @author joyro
 */
public class QuestionSubject extends SupportRequest {

    private String subject;

    public QuestionSubject(int requestId, String message,
                           String subject) {
        super(requestId, message);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDetails() {
        return "Request ID: " + getRequestId()
                + "\nType: Subject Question"
                + "\nSubject: " + subject
                + "\nMessage: " + getMessage()
                + "\nResponse: " + getResponse()
                + "\nResolved: " + isResolved();
    }
}




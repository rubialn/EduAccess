/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduacess;

/**
 *
 * @author joyro
 */
// Parent class for educational support requests
public abstract class SupportRequest {

    private int requestId;
    private String message;
    private String response;
    private boolean resolved;

    public SupportRequest(int requestId, String message) {
        this.requestId = requestId;
        this.message = message;
        response = "";
        resolved = false;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getMessage() {
        return message;
    }

    public String getResponse() {
        return response;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void recordResponse(String response) {
        this.response = response;
    }

    public void markResolved() {
        resolved = true;
    }

    public abstract String getDetails();
}

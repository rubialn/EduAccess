/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduacess;

/**
 *
 * @author joyro
 */

// Child class for study guidance requests
public class StudyGuidanceRequest extends SupportRequest {

    private String topic;

    public StudyGuidanceRequest(int requestId, String message,
                                String topic) {
        super(requestId, message);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String getDetails() {
        return "Topic: " + topic
                + "\nMessage: " + getMessage();
    }
}



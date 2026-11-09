/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduacess;
import java.util.ArrayList;
/**
 *
 * @author joyro
 */
public class SupportManager {

    private ArrayList<SupportRequest> requests;

    public SupportManager() {
        requests = new ArrayList<>();
    }

    public void addRequest(SupportRequest request) {
        requests.add(request);
    }

    public ArrayList<SupportRequest> getAllRequests() {
        return requests;
    }

    public SupportRequest searchRequest(int id) {
        for (SupportRequest request : requests) {
            if (request.getRequestId() == id) {
                return request;
            }
        }
        return null;
    }

    public void deleteRequest(int id) {
        SupportRequest request = searchRequest(id);

        if (request != null) {
            requests.remove(request);
        }
    }

    public int getNextId() {
        return requests.size() + 1;
    }
}


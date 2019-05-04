package lab5;

import java.util.Date;

public class RequestDTO {
    private int id;
    private String description;
    private String status;
    private int userID;

    public RequestDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Request: " +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", userID=" + userID;
    }
}

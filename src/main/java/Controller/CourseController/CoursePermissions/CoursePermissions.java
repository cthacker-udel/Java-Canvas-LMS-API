package Controller.CourseController.CoursePermissions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoursePermissions {

    @SerializedName("manage_grades")
    @Expose
    private String manageGrades;
    @SerializedName("send_messages")
    @Expose
    private String sendMessages;

    public String getManageGrades() {
        return manageGrades;
    }

    public void setManageGrades(String manageGrades) {
        this.manageGrades = manageGrades;
    }

    public String getSendMessages() {
        return sendMessages;
    }

    public void setSendMessages(String sendMessages) {
        this.sendMessages = sendMessages;
    }

}

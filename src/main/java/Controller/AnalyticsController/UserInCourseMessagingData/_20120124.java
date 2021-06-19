package Controller.AnalyticsController.UserInCourseMessagingData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _20120124 {

    @SerializedName("instructorMessages")
    @Expose
    private Integer instructorMessages;
    @SerializedName("studentMessages")
    @Expose
    private Integer studentMessages;

    public Integer getInstructorMessages() {
        return instructorMessages;
    }

    public void setInstructorMessages(Integer instructorMessages) {
        this.instructorMessages = instructorMessages;
    }

    public Integer getStudentMessages() {
        return studentMessages;
    }

    public void setStudentMessages(Integer studentMessages) {
        this.studentMessages = studentMessages;
    }

}

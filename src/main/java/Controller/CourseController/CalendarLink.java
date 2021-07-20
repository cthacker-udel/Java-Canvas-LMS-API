package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CalendarLink {

    @SerializedName("ics")
    @Expose
    private String ics;

    public String getIcs() {
        return ics;
    }

    public void setIcs(String ics) {
        this.ics = ics;
    }

}

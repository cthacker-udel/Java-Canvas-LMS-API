package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlueprintRestrictions {

    @SerializedName("content")
    @Expose
    private Boolean content;
    @SerializedName("points")
    @Expose
    private Boolean points;
    @SerializedName("due_dates")
    @Expose
    private Boolean dueDates;
    @SerializedName("availability_dates")
    @Expose
    private Boolean availabilityDates;

    public Boolean getContent() {
        return content;
    }

    public void setContent(Boolean content) {
        this.content = content;
    }

    public Boolean getPoints() {
        return points;
    }

    public void setPoints(Boolean points) {
        this.points = points;
    }

    public Boolean getDueDates() {
        return dueDates;
    }

    public void setDueDates(Boolean dueDates) {
        this.dueDates = dueDates;
    }

    public Boolean getAvailabilityDates() {
        return availabilityDates;
    }

    public void setAvailabilityDates(Boolean availabilityDates) {
        this.availabilityDates = availabilityDates;
    }


}

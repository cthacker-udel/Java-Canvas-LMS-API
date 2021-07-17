package Controller.ConversationController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AudienceContexts {

    @SerializedName("courses")
    @Expose
    private Courses courses;
    @SerializedName("groups")
    @Expose
    private Groups groups;

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }


}

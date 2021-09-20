package Controller.gradebookController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Day {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("graders")
    @Expose
    private List<Object> graders = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Object> getGraders() {
        return graders;
    }

    public void setGraders(List<Object> graders) {
        this.graders = graders;
    }

}

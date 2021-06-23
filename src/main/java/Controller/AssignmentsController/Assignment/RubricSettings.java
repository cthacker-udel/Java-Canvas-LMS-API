package Controller.AssignmentsController.Assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RubricSettings {

    @SerializedName("points_possible")
    @Expose
    private Integer pointsPossible;

    public Integer getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(Integer pointsPossible) {
        this.pointsPossible = pointsPossible;
    }


}

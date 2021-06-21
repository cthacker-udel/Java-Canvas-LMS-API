package Controller.AssignmentGroupsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GradingRules {

    @SerializedName("drop_lowest")
    @Expose
    private Integer dropLowest;
    @SerializedName("drop_highest")
    @Expose
    private Integer dropHighest;
    @SerializedName("never_drop")
    @Expose
    private List<Integer> neverDrop = null;

    public Integer getDropLowest() {
        return dropLowest;
    }

    public void setDropLowest(Integer dropLowest) {
        this.dropLowest = dropLowest;
    }

    public Integer getDropHighest() {
        return dropHighest;
    }

    public void setDropHighest(Integer dropHighest) {
        this.dropHighest = dropHighest;
    }

    public List<Integer> getNeverDrop() {
        return neverDrop;
    }

    public void setNeverDrop(List<Integer> neverDrop) {
        this.neverDrop = neverDrop;
    }

}

package Controller.DiscussionTopicController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryRatings {

    @SerializedName("3")
    @Expose
    private Integer _3;

    public Integer get3() {
        return _3;
    }

    public void set3(Integer _3) {
        this._3 = _3;
    }

}

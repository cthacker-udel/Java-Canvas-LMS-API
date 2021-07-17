package Controller.ConversationController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Courses {

    @SerializedName("1")
    @Expose
    private List<Object> _1 = null;

    public List<Object> get1() {
        return _1;
    }

    public void set1(List<Object> _1) {
        this._1 = _1;
    }

}

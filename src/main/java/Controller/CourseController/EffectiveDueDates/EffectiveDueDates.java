package Controller.CourseController.EffectiveDueDates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EffectiveDueDates {

    @SerializedName("1")
    @Expose
    private Controller.CourseController.EffectiveDueDates._1 _1;
    @SerializedName("2")
    @Expose
    private _2 _2;

    public Controller.CourseController.EffectiveDueDates._1 get1() {
        return _1;
    }

    public void set1(Controller.CourseController.EffectiveDueDates._1 _1) {
        this._1 = _1;
    }

    public Controller.CourseController.EffectiveDueDates._2 get2() {
        return _2;
    }

    public void set2(Controller.CourseController.EffectiveDueDates._2 _2) {
        this._2 = _2;
    }


}

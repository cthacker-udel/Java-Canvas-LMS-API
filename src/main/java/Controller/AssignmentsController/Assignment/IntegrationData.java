package Controller.AssignmentsController.Assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IntegrationData {

    @SerializedName("5678")
    @Expose
    private String _5678;

    public String get5678() {
        return _5678;
    }

    public void set5678(String _5678) {
        this._5678 = _5678;
    }


}

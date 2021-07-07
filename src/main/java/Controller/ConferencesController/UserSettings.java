package Controller.ConferencesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserSettings {

    @SerializedName("record")
    @Expose
    private Boolean record;

    public Boolean getRecord() {
        return record;
    }

    public void setRecord(Boolean record) {
        this.record = record;
    }


}

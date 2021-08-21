package Controller.ExternalToolsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomFields {

    @SerializedName("key")
    @Expose
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}

package Controller.DiscussionTopicController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permissions {

    @SerializedName("attach")
    @Expose
    private Boolean attach;

    public Boolean getAttach() {
        return attach;
    }

    public void setAttach(Boolean attach) {
        this.attach = attach;
    }

}

package Controller.CustomGradebookColumsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColumnDatum {

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("user_id")
    @Expose
    private Integer userId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}

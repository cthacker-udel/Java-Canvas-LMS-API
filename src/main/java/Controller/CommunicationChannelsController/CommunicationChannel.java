package Controller.CommunicationChannelsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommunicationChannel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }


}

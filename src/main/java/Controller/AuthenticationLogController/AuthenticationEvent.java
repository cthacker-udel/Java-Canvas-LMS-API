package Controller.AuthenticationLogController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthenticationEvent {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("event_type")
    @Expose
    private String eventType;
    @SerializedName("pseudonym_id")
    @Expose
    private Integer pseudonymId;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getPseudonymId() {
        return pseudonymId;
    }

    public void setPseudonymId(Integer pseudonymId) {
        this.pseudonymId = pseudonymId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}

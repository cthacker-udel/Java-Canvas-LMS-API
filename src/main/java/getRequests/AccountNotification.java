package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountNotification extends CanvasClient {

    private Integer accountId;
    private Integer notificationId;
    private String subject;
    private String message;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private String icon;
    private String roles;

    public AccountNotification() {
        this.accountId = 0;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.subject != null){
            queries.put("account_notification[subject]",this.subject);
        }
        if(this.message != null){
            queries.put("account_notification[message]",this.message);
        }
        if(this.startAt != null){
            queries.put("account_notification[start_at]",this.startAt);
        }
        if(this.endAt != null){
            queries.put("account_notification[end_at]",this.endAt);
        }
        if(this.icon != null){
            queries.put("account_notification[icon]",this.icon);
        }
        if(this.roles != null){
            queries.put("account_notification_roles[]",this.roles);
        }
        return queries;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(ZonedDateTime startAt) {
        this.startAt = startAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(ZonedDateTime endAt) {
        this.endAt = endAt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}

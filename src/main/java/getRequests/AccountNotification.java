package getRequests;

import Client.CanvasClient;

public class AccountNotification extends CanvasClient {

    private Integer accountId;
    private Integer notificationId;

    public AccountNotification() {
        this.accountId = 0;
    }

    public Integer getAccountId() {
        return accountId;
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

package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssignmentDate {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("base")
    @Expose
    private Boolean base;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("due_at")
    @Expose
    private String dueAt;
    @SerializedName("unlock_at")
    @Expose
    private String unlockAt;
    @SerializedName("lock_at")
    @Expose
    private String lockAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBase() {
        return base;
    }

    public void setBase(Boolean base) {
        this.base = base;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    public String getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    public String getLockAt() {
        return lockAt;
    }

    public void setLockAt(String lockAt) {
        this.lockAt = lockAt;
    }


}

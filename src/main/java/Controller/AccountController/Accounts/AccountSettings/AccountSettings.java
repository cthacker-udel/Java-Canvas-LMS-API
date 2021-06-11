package Controller.AccountController.Accounts.AccountSettings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountSettings {

    @SerializedName("usage_rights_required")
    @Expose
    private Boolean usageRightsRequired;
    @SerializedName("lock_all_announcements")
    @Expose
    private Boolean lockAllAnnouncements;
    @SerializedName("restrict_student_past_view")
    @Expose
    private Boolean restrictStudentPastView;

    public Boolean getUsageRightsRequired() {
        return usageRightsRequired;
    }

    public void setUsageRightsRequired(Boolean usageRightsRequired) {
        this.usageRightsRequired = usageRightsRequired;
    }

    public Boolean getLockAllAnnouncements() {
        return lockAllAnnouncements;
    }

    public void setLockAllAnnouncements(Boolean lockAllAnnouncements) {
        this.lockAllAnnouncements = lockAllAnnouncements;
    }

    public Boolean getRestrictStudentPastView() {
        return restrictStudentPastView;
    }

    public void setRestrictStudentPastView(Boolean restrictStudentPastView) {
        this.restrictStudentPastView = restrictStudentPastView;
    }


}

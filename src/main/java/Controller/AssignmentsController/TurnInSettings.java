package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TurnInSettings {

    @SerializedName("originality_report_visibility")
    @Expose
    private String originalityReportVisibility;
    @SerializedName("s_paper_check")
    @Expose
    private Boolean sPaperCheck;
    @SerializedName("internet_check")
    @Expose
    private Boolean internetCheck;
    @SerializedName("journal_check")
    @Expose
    private Boolean journalCheck;
    @SerializedName("exclude_biblio")
    @Expose
    private Boolean excludeBiblio;
    @SerializedName("exclude_quoted")
    @Expose
    private Boolean excludeQuoted;
    @SerializedName("exclude_small_matches_type")
    @Expose
    private String excludeSmallMatchesType;
    @SerializedName("exclude_small_matches_value")
    @Expose
    private Integer excludeSmallMatchesValue;

    public String getOriginalityReportVisibility() {
        return originalityReportVisibility;
    }

    public void setOriginalityReportVisibility(String originalityReportVisibility) {
        this.originalityReportVisibility = originalityReportVisibility;
    }

    public Boolean getsPaperCheck() {
        return sPaperCheck;
    }

    public void setsPaperCheck(Boolean sPaperCheck) {
        this.sPaperCheck = sPaperCheck;
    }

    public Boolean getInternetCheck() {
        return internetCheck;
    }

    public void setInternetCheck(Boolean internetCheck) {
        this.internetCheck = internetCheck;
    }

    public Boolean getJournalCheck() {
        return journalCheck;
    }

    public void setJournalCheck(Boolean journalCheck) {
        this.journalCheck = journalCheck;
    }

    public Boolean getExcludeBiblio() {
        return excludeBiblio;
    }

    public void setExcludeBiblio(Boolean excludeBiblio) {
        this.excludeBiblio = excludeBiblio;
    }

    public Boolean getExcludeQuoted() {
        return excludeQuoted;
    }

    public void setExcludeQuoted(Boolean excludeQuoted) {
        this.excludeQuoted = excludeQuoted;
    }

    public String getExcludeSmallMatchesType() {
        return excludeSmallMatchesType;
    }

    public void setExcludeSmallMatchesType(String excludeSmallMatchesType) {
        this.excludeSmallMatchesType = excludeSmallMatchesType;
    }

    public Integer getExcludeSmallMatchesValue() {
        return excludeSmallMatchesValue;
    }

    public void setExcludeSmallMatchesValue(Integer excludeSmallMatchesValue) {
        this.excludeSmallMatchesValue = excludeSmallMatchesValue;
    }


}

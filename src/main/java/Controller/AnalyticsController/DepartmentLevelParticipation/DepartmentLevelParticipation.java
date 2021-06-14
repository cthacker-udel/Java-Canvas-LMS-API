public class DepartmentLevelParticipation{

    @SerializedName("by_date")
    @Expose
    private ByDate byDate;

    @SerializedName("by_category")
    @Expose
    private ByCategory byCategory;

    public ByDate getByDate() {
    return byDate;
    }

    public void setByDate(ByDate byDate) {
    this.byDate = byDate;
    }

    public ByCategory getByCategory() {
    return byCategory;
    }

    public void setByCategory(ByCategory byCategory) {
    this.byCategory = byCategory;
    }

}
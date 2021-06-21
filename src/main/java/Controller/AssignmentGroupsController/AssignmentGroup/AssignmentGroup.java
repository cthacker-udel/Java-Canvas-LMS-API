package Controller.AssignmentGroupsController.AssignmentGroup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssignmentGroup {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("group_weight")
    @Expose
    private Integer groupWeight;
    @SerializedName("sis_source_id")
    @Expose
    private String sisSourceId;
    @SerializedName("integration_data")
    @Expose
    private IntegrationData integrationData;
    @SerializedName("assignments")
    @Expose
    private List<Object> assignments = null;
    @SerializedName("rules")
    @Expose
    private Object rules;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getGroupWeight() {
        return groupWeight;
    }

    public void setGroupWeight(Integer groupWeight) {
        this.groupWeight = groupWeight;
    }

    public String getSisSourceId() {
        return sisSourceId;
    }

    public void setSisSourceId(String sisSourceId) {
        this.sisSourceId = sisSourceId;
    }

    public IntegrationData getIntegrationData() {
        return integrationData;
    }

    public void setIntegrationData(IntegrationData integrationData) {
        this.integrationData = integrationData;
    }

    public List<Object> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Object> assignments) {
        this.assignments = assignments;
    }

    public Object getRules() {
        return rules;
    }

    public void setRules(Object rules) {
        this.rules = rules;
    }

}

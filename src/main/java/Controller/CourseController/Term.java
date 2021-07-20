package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Term {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private Object endAt;

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

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public Object getEndAt() {
        return endAt;
    }

    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

}

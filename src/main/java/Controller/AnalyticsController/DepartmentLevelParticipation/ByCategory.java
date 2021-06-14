public class ByCategory{

    @SerializedName("announcements")
@Expose
private Integer announcements;
@SerializedName("assignments")
@Expose
private Integer assignments;
@SerializedName("collaborations")
@Expose
private Integer collaborations;
@SerializedName("conferences")
@Expose
private Integer conferences;
@SerializedName("discussions")
@Expose
private Integer discussions;
@SerializedName("files")
@Expose
private Integer files;
@SerializedName("general")
@Expose
private Integer general;
@SerializedName("grades")
@Expose
private Integer grades;
@SerializedName("groups")
@Expose
private Integer groups;
@SerializedName("modules")
@Expose
private Integer modules;
@SerializedName("other")
@Expose
private Integer other;
@SerializedName("pages")
@Expose
private Integer pages;
@SerializedName("quizzes")
@Expose
private Integer quizzes;

public Integer getAnnouncements() {
return announcements;
}

public void setAnnouncements(Integer announcements) {
this.announcements = announcements;
}

public Integer getAssignments() {
return assignments;
}

public void setAssignments(Integer assignments) {
this.assignments = assignments;
}

public Integer getCollaborations() {
return collaborations;
}

public void setCollaborations(Integer collaborations) {
this.collaborations = collaborations;
}

public Integer getConferences() {
return conferences;
}

public void setConferences(Integer conferences) {
this.conferences = conferences;
}

public Integer getDiscussions() {
return discussions;
}

public void setDiscussions(Integer discussions) {
this.discussions = discussions;
}

public Integer getFiles() {
return files;
}

public void setFiles(Integer files) {
this.files = files;
}

public Integer getGeneral() {
return general;
}

public void setGeneral(Integer general) {
this.general = general;
}

public Integer getGrades() {
return grades;
}

public void setGrades(Integer grades) {
this.grades = grades;
}

public Integer getGroups() {
return groups;
}

public void setGroups(Integer groups) {
this.groups = groups;
}

public Integer getModules() {
return modules;
}

public void setModules(Integer modules) {
this.modules = modules;
}

public Integer getOther() {
return other;
}

public void setOther(Integer other) {
this.other = other;
}

public Integer getPages() {
return pages;
}

public void setPages(Integer pages) {
this.pages = pages;
}

public Integer getQuizzes() {
return quizzes;
}

public void setQuizzes(Integer quizzes) {
this.quizzes = quizzes;
}


}
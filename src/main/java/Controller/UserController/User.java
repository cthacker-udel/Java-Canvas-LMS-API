public class User{

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("sortable_name")
@Expose
private String sortableName;
@SerializedName("short_name")
@Expose
private String shortName;
@SerializedName("sis_user_id")
@Expose
private String sisUserId;
@SerializedName("sis_import_id")
@Expose
private Integer sisImportId;
@SerializedName("integration_id")
@Expose
private String integrationId;
@SerializedName("login_id")
@Expose
private String loginId;
@SerializedName("avatar_url")
@Expose
private String avatarUrl;
@SerializedName("enrollments")
@Expose
private Object enrollments;
@SerializedName("email")
@Expose
private String email;
@SerializedName("locale")
@Expose
private String locale;
@SerializedName("last_login")
@Expose
private String lastLogin;
@SerializedName("time_zone")
@Expose
private String timeZone;
@SerializedName("bio")
@Expose
private String bio;

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

public String getSortableName() {
return sortableName;
}

public void setSortableName(String sortableName) {
this.sortableName = sortableName;
}

public String getShortName() {
return shortName;
}

public void setShortName(String shortName) {
this.shortName = shortName;
}

public String getSisUserId() {
return sisUserId;
}

public void setSisUserId(String sisUserId) {
this.sisUserId = sisUserId;
}

public Integer getSisImportId() {
return sisImportId;
}

public void setSisImportId(Integer sisImportId) {
this.sisImportId = sisImportId;
}

public String getIntegrationId() {
return integrationId;
}

public void setIntegrationId(String integrationId) {
this.integrationId = integrationId;
}

public String getLoginId() {
return loginId;
}

public void setLoginId(String loginId) {
this.loginId = loginId;
}

public String getAvatarUrl() {
return avatarUrl;
}

public void setAvatarUrl(String avatarUrl) {
this.avatarUrl = avatarUrl;
}

public Object getEnrollments() {
return enrollments;
}

public void setEnrollments(Object enrollments) {
this.enrollments = enrollments;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getLocale() {
return locale;
}

public void setLocale(String locale) {
this.locale = locale;
}

public String getLastLogin() {
return lastLogin;
}

public void setLastLogin(String lastLogin) {
this.lastLogin = lastLogin;
}

public String getTimeZone() {
return timeZone;
}

public void setTimeZone(String timeZone) {
this.timeZone = timeZone;
}

public String getBio() {
return bio;
}

public void setBio(String bio) {
this.bio = bio;
}



}
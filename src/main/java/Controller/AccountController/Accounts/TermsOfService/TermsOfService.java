package Controller.AccountController.Accounts.TermsOfService;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TermsOfService {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("terms_type")
    @Expose
    private String termsType;
    @SerializedName("passive")
    @Expose
    private Boolean passive;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("self_registration_type")
    @Expose
    private List<String> selfRegistrationType = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTermsType() {
        return termsType;
    }

    public void setTermsType(String termsType) {
        this.termsType = termsType;
    }

    public Boolean getPassive() {
        return passive;
    }

    public void setPassive(Boolean passive) {
        this.passive = passive;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getSelfRegistrationType() {
        return selfRegistrationType;
    }

    public void setSelfRegistrationType(List<String> selfRegistrationType) {
        this.selfRegistrationType = selfRegistrationType;
    }

}

package Controller.EnrollmentTermsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EnrollmentTermObject {

    @SerializedName("enrollment_terms")
    @Expose
    private List<EnrollmentTerm> enrollmentTerms = null;

    public List<EnrollmentTerm> getEnrollmentTerms() {
        return enrollmentTerms;
    }

    public void setEnrollmentTerms(List<EnrollmentTerm> enrollmentTerms) {
        this.enrollmentTerms = enrollmentTerms;
    }

}

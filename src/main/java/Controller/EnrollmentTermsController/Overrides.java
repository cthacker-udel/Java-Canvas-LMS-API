package Controller.EnrollmentTermsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Overrides {

    @SerializedName("StudentEnrollment")
    @Expose
    private StudentEnrollment studentEnrollment;

    public StudentEnrollment getStudentEnrollment() {
        return studentEnrollment;
    }

    public void setStudentEnrollment(StudentEnrollment studentEnrollment) {
        this.studentEnrollment = studentEnrollment;
    }

}

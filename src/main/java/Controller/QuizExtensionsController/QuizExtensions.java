package Controller.QuizExtensionsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuizExtensions {

    @SerializedName("quiz_extensions")
    @Expose
    private List<CourseQuizExtension> quizExtensions;

    public List<CourseQuizExtension> getQuizExtensions() {
        return quizExtensions;
    }

    public void setQuizExtensions(List<CourseQuizExtension> quizExtensions) {
        this.quizExtensions = quizExtensions;
    }

}

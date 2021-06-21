package Controller.AssignmentExtensionController.SetExtensions;

import Controller.AssignmentExtensionController.AssignmentExtension;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SetExtensions {

    @SerializedName("assignment_extensions")
    @Expose
    List<AssignmentExtension> assignmentExtensions;

}

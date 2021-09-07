package getRequests;

import Client.CanvasClient;
import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class File extends CanvasClient {

    private String courseId;
    private String groupId;
    private String userId;
    private String folderId;
    private String fileId;

    private String contentTypes;
    private String excludeContentTypes;
    private String searchTerm;
    private String include;
    private ArrayList<String> only;
    private String sort;
    private String order;
    private String submissionId;

    private String name;
    private String parentFolderId;
    private String parentFolderPath;
    private String sourceFileId;
    private String onDuplicate;
    private ZonedDateTime lockAt;
    private ZonedDateTime unlockAt;
    private Boolean locked;
    private Boolean hidden;
    private Boolean replace;

    private Integer position;

    private String fileIds;
    private String folderIds;
    private Boolean publish;
    private String usageRightsUseJustification;
    private String usageRightsLegalCopyright;
    private String usageRightsLicense;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();



    }

    public void clearQueries(){



    }

}

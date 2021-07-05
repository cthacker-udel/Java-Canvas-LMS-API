package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bookmark extends CanvasClient {

    private String bookmarkId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> body = new LinkedHashMap<>();

        return body;
    }

    public void clearQueries(){

    }

    public String getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(String bookmarkId) {
        this.bookmarkId = bookmarkId;
    }
}

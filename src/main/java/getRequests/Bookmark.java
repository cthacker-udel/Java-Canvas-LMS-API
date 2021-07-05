package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bookmark extends CanvasClient {

    private String bookmarkId;
    private String name;
    private String url;
    private Integer position;
    private String data;

    public Map<String,Object> generateQueries(){

        Map<String,Object> body = new LinkedHashMap<>();

        if(this.name != null){
            body.put("name",this.name);
        }
        if(this.url != null){
            body.put("url",this.url);
        }
        if(this.position != null){
            body.put("position",this.position);
        }
        if(this.data != null){
            body.put("data",this.data);
        }

        return body;
    }

    public void clearQueries(){

        this.name = null;
        this.url = null;
        this.position = null;
        this.data = null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(String bookmarkId) {
        this.bookmarkId = bookmarkId;
    }
}

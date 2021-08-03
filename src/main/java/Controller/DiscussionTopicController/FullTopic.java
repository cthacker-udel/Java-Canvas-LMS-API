package Controller.DiscussionTopicController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FullTopic {

    @SerializedName("unread_entries")
    @Expose
    private List<Integer> unreadEntries = null;
    @SerializedName("entry_ratings")
    @Expose
    private EntryRatings entryRatings;
    @SerializedName("forced_entries")
    @Expose
    private List<Integer> forcedEntries = null;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("view")
    @Expose
    private List<View> view = null;

    public List<Integer> getUnreadEntries() {
        return unreadEntries;
    }

    public void setUnreadEntries(List<Integer> unreadEntries) {
        this.unreadEntries = unreadEntries;
    }

    public EntryRatings getEntryRatings() {
        return entryRatings;
    }

    public void setEntryRatings(EntryRatings entryRatings) {
        this.entryRatings = entryRatings;
    }

    public List<Integer> getForcedEntries() {
        return forcedEntries;
    }

    public void setForcedEntries(List<Integer> forcedEntries) {
        this.forcedEntries = forcedEntries;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<View> getView() {
        return view;
    }

    public void setView(List<View> view) {
        this.view = view;
    }
}

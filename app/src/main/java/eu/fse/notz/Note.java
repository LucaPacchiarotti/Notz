package eu.fse.notz;

import android.app.Activity;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class Note {

    private String title;
    private String description;
    private int id;
    private boolean showOnTop;

    public Note(String title, String description){
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setShowOnTop(boolean showOnTop) {
        this.showOnTop = showOnTop;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isShowOnTop() {
        return showOnTop;
    }
}

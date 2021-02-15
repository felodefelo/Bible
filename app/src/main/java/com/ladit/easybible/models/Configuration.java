package com.ladit.easybible.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "configuration")
public class Configuration {
    @PrimaryKey @NonNull
    public int revision;

    public String fonts;

    public String booknames;

    public String title;

    public String description;

    public String copyright;

    public int sizefactor;

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public String getFonts() {
        return fonts;
    }

    public void setFonts(String fonts) {
        this.fonts = fonts;
    }

    public String getBooknames() {
        return booknames;
    }

    public void setBooknames(String booknames) {
        this.booknames = booknames;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getSizefactor() {
        return sizefactor;
    }

    public void setSizefactor(int sizefactor) {
        this.sizefactor = sizefactor;
    }
}

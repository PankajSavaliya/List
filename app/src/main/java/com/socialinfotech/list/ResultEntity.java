package com.socialinfotech.list;

/**
 * Created by pankaj on 23/04/16.
 */
public class ResultEntity {
    String header;
    String title;

    public ResultEntity(String header, String title) {
        this.header = header;
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

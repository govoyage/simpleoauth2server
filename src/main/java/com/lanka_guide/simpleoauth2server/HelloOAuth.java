package com.lanka_guide.simpleoauth2server;

public class HelloOAuth {
    private long id;
    private String content;

    public HelloOAuth(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

package org.tw.spike.rest;

public class Post {

    private String title;
    private String body;

    public Post() {
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Post{");
        sb.append("title='").append(title).append('\'');
        sb.append("body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

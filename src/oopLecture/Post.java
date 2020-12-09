package oopLecture;

import java.util.Date;

public class Post {

    //Don't forget the shortcut ctrl+Enter if you want to make a million of these fast

    private String authorName;
    private int numOfViews;
    private String content;
    private String title;
    private Date datePublished;

    public Post(String authorName, int numOfViews, String content, String title, Date datePublished) {
        this.authorName = authorName;
        this.numOfViews = numOfViews;
        this.content = content;
        this.title = title;
        this.datePublished = datePublished;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumOfViews() {
        return numOfViews;
    }

    public void setNumOfViews(int numOfViews) {
        this.numOfViews = numOfViews;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
}

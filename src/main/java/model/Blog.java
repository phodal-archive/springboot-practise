package model;

/**
 * Created by fdhuang on 6/23/16.
 */
public class Blog {
    private final String title;
    private final String content;
    private final String author;
    private final String slug;
    private final String date;

    public Blog(String title, String content, String author, String slug, String date) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.slug = slug;
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public String getSlug() {
        return slug;
    }

    public String getDate() {
        return date;
    }
}

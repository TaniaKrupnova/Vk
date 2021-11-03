package ru.netology.domain;

public class Post {
    private int id;
    private int title;
    private int date;
    private String text;
    private String image;

    private Like like;
    private CommentsInfo commentsInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
    // + getters/setters
}

package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private String image;
    private int replyOwnerId;
    private int replyPostId;
    private int canEdit;

    private Like like;
    private CommentsInfo commentsInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;

    private boolean canPin;
    private boolean canDelete;
    // + getters/setters
}

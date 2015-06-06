package org.iflab.wecentermobileandroidrestructure.model.personal;

import java.io.Serializable;

/**
 * Created by hcjcch on 15/6/6.
 */
public class UserPersonal implements Serializable {
    private String user_name;
    private String avatar_file;
    private int fans_count;
    private int friend_count;
    private int question_count;
    private int answer_count;
    private int topic_focus_count;
    private int agree_count;
    private int thanks_count;
    private int answer_favorite_count;
    private int article_count;
    private int has_focus;
    private String signature;


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAvatar_file() {
        return avatar_file;
    }

    public void setAvatar_file(String avatar_file) {
        this.avatar_file = avatar_file;
    }

    public int getFans_count() {
        return fans_count;
    }

    public void setFans_count(int fans_count) {
        this.fans_count = fans_count;
    }

    public int getFriend_count() {
        return friend_count;
    }

    public void setFriend_count(int friend_count) {
        this.friend_count = friend_count;
    }

    public int getQuestion_count() {
        return question_count;
    }

    public void setQuestion_count(int question_count) {
        this.question_count = question_count;
    }

    public int getAnswer_count() {
        return answer_count;
    }

    public void setAnswer_count(int answer_count) {
        this.answer_count = answer_count;
    }

    public int getTopic_focus_count() {
        return topic_focus_count;
    }

    public void setTopic_focus_count(int topic_focus_count) {
        this.topic_focus_count = topic_focus_count;
    }

    public int getAgree_count() {
        return agree_count;
    }

    public void setAgree_count(int agree_count) {
        this.agree_count = agree_count;
    }

    public int getThanks_count() {
        return thanks_count;
    }

    public void setThanks_count(int thanks_count) {
        this.thanks_count = thanks_count;
    }

    public int getAnswer_favorite_count() {
        return answer_favorite_count;
    }

    public void setAnswer_favorite_count(int answer_favorite_count) {
        this.answer_favorite_count = answer_favorite_count;
    }

    public int getArticle_count() {
        return article_count;
    }

    public void setArticle_count(int article_count) {
        this.article_count = article_count;
    }

    public int getHas_focus() {
        return has_focus;
    }

    public void setHas_focus(int has_focus) {
        this.has_focus = has_focus;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
package com.example.arnold.githubcommit.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arnold on 21/6/16.
 */
public class RepoCommit {

    @SerializedName("url")
    private String url;
    @SerializedName("sha")
    private String sha;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("commit")
    private Commit commit;
    @SerializedName("parents")
    private List<Parent> parents = new ArrayList<Parent>();

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The sha
     */
    public String getSha() {
        return sha;
    }

    /**
     *
     * @param sha
     * The sha
     */
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     *
     * @return
     * The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     *
     * @param htmlUrl
     * The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     *
     * @return
     * The commentsUrl
     */
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     *
     * @param commentsUrl
     * The comments_url
     */
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     *
     * @return
     * The commit
     */
    public Commit getCommit() {
        return commit;
    }

    /**
     *
     * @param commit
     * The commit
     */
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    /**
     *
     * @return
     * The parents
     */
    public List<Parent> getParents() {
        return parents;
    }

    /**
     *
     * @param parents
     * The parents
     */
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

}

package com.bdsoftwaresolution.apitest;

import com.google.gson.annotations.SerializedName;

public class BlogsModel {
    /*@SerializedName("albumId")
    private Integer albumId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    public BlogsModel(Integer albumId, Integer id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }*/
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("img")
    private String img;
    @SerializedName("loc")
    private String loc;
    @SerializedName("desc")
    private String desc;

    public BlogsModel() {
    }

    public BlogsModel(String title, String desc, String loc, String img) {
        this.title = title;
        this.desc = desc;
        this.loc = loc;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

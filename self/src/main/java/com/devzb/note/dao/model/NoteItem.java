package com.devzb.note.dao.model;

import java.util.Date;

public class NoteItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_item.id
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_item.title
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_item.tags
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    private String tags;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_item.gmt_created
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_item.gmt_modified
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_item.content
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_item.id
     *
     * @return the value of note_item.id
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_item.id
     *
     * @param id the value for note_item.id
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_item.title
     *
     * @return the value of note_item.title
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_item.title
     *
     * @param title the value for note_item.title
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_item.tags
     *
     * @return the value of note_item.tags
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_item.tags
     *
     * @param tags the value for note_item.tags
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_item.gmt_created
     *
     * @return the value of note_item.gmt_created
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_item.gmt_created
     *
     * @param gmtCreated the value for note_item.gmt_created
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_item.gmt_modified
     *
     * @return the value of note_item.gmt_modified
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_item.gmt_modified
     *
     * @param gmtModified the value for note_item.gmt_modified
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_item.content
     *
     * @return the value of note_item.content
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_item.content
     *
     * @param content the value for note_item.content
     *
     * @mbggenerated Sun Jan 22 16:30:49 GMT+08:00 2017
     */
    public void setContent(String content) {
        this.content = content;
    }
}
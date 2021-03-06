package szu.csbd.dto;

import java.util.Date;

public class CommentsRemark {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.remark_comment_id
     *
     * @mbggenerated
     */
    private Integer remarkCommentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.offer_id
     *
     * @mbggenerated
     */
    private Integer offerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.offer_comment_id
     *
     * @mbggenerated
     */
    private Integer offerCommentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.remark_comment
     *
     * @mbggenerated
     */
    private String remarkComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.delay_time
     *
     * @mbggenerated
     */
    private Date delayTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.imei
     *
     * @mbggenerated
     */
    private String imei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_remark_comments.ip_adress
     *
     * @mbggenerated
     */
    private String ipAdress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.remark_comment_id
     *
     * @return the value of t_remark_comments.remark_comment_id
     *
     * @mbggenerated
     */
    public Integer getRemarkCommentId() {
        return remarkCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.remark_comment_id
     *
     * @param remarkCommentId the value for t_remark_comments.remark_comment_id
     *
     * @mbggenerated
     */
    public void setRemarkCommentId(Integer remarkCommentId) {
        this.remarkCommentId = remarkCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.offer_id
     *
     * @return the value of t_remark_comments.offer_id
     *
     * @mbggenerated
     */
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.offer_id
     *
     * @param offerId the value for t_remark_comments.offer_id
     *
     * @mbggenerated
     */
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.offer_comment_id
     *
     * @return the value of t_remark_comments.offer_comment_id
     *
     * @mbggenerated
     */
    public Integer getOfferCommentId() {
        return offerCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.offer_comment_id
     *
     * @param offerCommentId the value for t_remark_comments.offer_comment_id
     *
     * @mbggenerated
     */
    public void setOfferCommentId(Integer offerCommentId) {
        this.offerCommentId = offerCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.remark_comment
     *
     * @return the value of t_remark_comments.remark_comment
     *
     * @mbggenerated
     */
    public String getRemarkComment() {
        return remarkComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.remark_comment
     *
     * @param remarkComment the value for t_remark_comments.remark_comment
     *
     * @mbggenerated
     */
    public void setRemarkComment(String remarkComment) {
        this.remarkComment = remarkComment == null ? null : remarkComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.delay_time
     *
     * @return the value of t_remark_comments.delay_time
     *
     * @mbggenerated
     */
    public Date getDelayTime() {
        return delayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.delay_time
     *
     * @param delayTime the value for t_remark_comments.delay_time
     *
     * @mbggenerated
     */
    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.imei
     *
     * @return the value of t_remark_comments.imei
     *
     * @mbggenerated
     */
    public String getImei() {
        return imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.imei
     *
     * @param imei the value for t_remark_comments.imei
     *
     * @mbggenerated
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_remark_comments.ip_adress
     *
     * @return the value of t_remark_comments.ip_adress
     *
     * @mbggenerated
     */
    public String getIpAdress() {
        return ipAdress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_remark_comments.ip_adress
     *
     * @param ipAdress the value for t_remark_comments.ip_adress
     *
     * @mbggenerated
     */
    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress == null ? null : ipAdress.trim();
    }
}
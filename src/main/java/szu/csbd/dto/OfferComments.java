package szu.csbd.dto;

import java.util.Date;

public class OfferComments {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_offer_comments.offer_comment_id
     *
     * @mbggenerated
     */
    private Integer offerCommentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_offer_comments.offer_id
     *
     * @mbggenerated
     */
    private Integer offerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_offer_comments.offer_comment
     *
     * @mbggenerated
     */
    private String offerComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_offer_comments.delay_time
     *
     * @mbggenerated
     */
    private Date delayTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_offer_comments.imei
     *
     * @mbggenerated
     */
    private String imei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_offer_comments.ip_address
     *
     * @mbggenerated
     */
    private String ipAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_offer_comments.offer_comment_id
     *
     * @return the value of t_offer_comments.offer_comment_id
     *
     * @mbggenerated
     */
    public Integer getOfferCommentId() {
        return offerCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_offer_comments.offer_comment_id
     *
     * @param offerCommentId the value for t_offer_comments.offer_comment_id
     *
     * @mbggenerated
     */
    public void setOfferCommentId(Integer offerCommentId) {
        this.offerCommentId = offerCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_offer_comments.offer_id
     *
     * @return the value of t_offer_comments.offer_id
     *
     * @mbggenerated
     */
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_offer_comments.offer_id
     *
     * @param offerId the value for t_offer_comments.offer_id
     *
     * @mbggenerated
     */
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_offer_comments.offer_comment
     *
     * @return the value of t_offer_comments.offer_comment
     *
     * @mbggenerated
     */
    public String getOfferComment() {
        return offerComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_offer_comments.offer_comment
     *
     * @param offerComment the value for t_offer_comments.offer_comment
     *
     * @mbggenerated
     */
    public void setOfferComment(String offerComment) {
        this.offerComment = offerComment == null ? null : offerComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_offer_comments.delay_time
     *
     * @return the value of t_offer_comments.delay_time
     *
     * @mbggenerated
     */
    public Date getDelayTime() {
        return delayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_offer_comments.delay_time
     *
     * @param delayTime the value for t_offer_comments.delay_time
     *
     * @mbggenerated
     */
    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_offer_comments.imei
     *
     * @return the value of t_offer_comments.imei
     *
     * @mbggenerated
     */
    public String getImei() {
        return imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_offer_comments.imei
     *
     * @param imei the value for t_offer_comments.imei
     *
     * @mbggenerated
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_offer_comments.ip_address
     *
     * @return the value of t_offer_comments.ip_address
     *
     * @mbggenerated
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_offer_comments.ip_address
     *
     * @param ipAddress the value for t_offer_comments.ip_address
     *
     * @mbggenerated
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }
}
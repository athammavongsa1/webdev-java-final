package com.example.twitterserver.replies;

import com.example.twitterserver.tweets.Tweet;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "replies")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer replyId;
    @ManyToOne
    private Tweet reply;
    @ManyToOne
    private Tweet repliedTo;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Tweet getReply() {
        return reply;
    }

    public void setReply(Tweet reply) {
        this.reply = reply;
    }

    public Tweet getRepliedTo() {
        return repliedTo;
    }

    public void setRepliedTo(Tweet repliedTo) {
        this.repliedTo = repliedTo;
    }
}

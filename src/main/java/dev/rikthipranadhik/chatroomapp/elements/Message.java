package dev.rikthipranadhik.chatroomapp.elements;

import lombok.ToString;

@ToString
public class Message {
    private String message;
    private String senderID;
    private String receiverID;
    private Status status;

    public Message(String message, String senderID, String receiverID, Status status) {
        this.message = message;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.status = status;
    }

    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public String getSenderID() {
        return senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public Status getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

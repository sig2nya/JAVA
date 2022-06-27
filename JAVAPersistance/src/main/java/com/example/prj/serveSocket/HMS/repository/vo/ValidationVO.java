package com.example.prj.serveSocket.HMS.repository.vo;

public class ValidationVO {
    private String crsId;
    private String seq;
    private String userName;

    public ValidationVO(String crsId, String seq, String userName) {
        this.crsId = crsId;
        this.seq = seq;
        this.userName = userName;
    }

    public String getCrsId() {
        return crsId;
    }

    public void setCrsId(String crsId) {
        this.crsId = crsId;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

package com.example.prj.serveSocket.HMS.repository.vo;

public class ApplInfoVO {
    private int appSeq;
    private int crsId;
    private int seq;
    private String appStatus;
    private String userName;

    private String cancel;
    private String cancelRsn;
    private int crtId;
    private String crtDt;
    private int updtId;
    private String updtDt;

    public ApplInfoVO(int appSeq, int crsId, int seq, String appStatus, String userName, String cancel, String cancelRsn, int crtId, String crtDt, int updtId, String updtDt) {
        this.appSeq = appSeq;
        this.crsId = crsId;
        this.seq = seq;
        this.appStatus = appStatus;
        this.userName = userName;
        this.cancel = cancel;
        this.cancelRsn = cancelRsn;
        this.crtId = crtId;
        this.crtDt = crtDt;
        this.updtId = updtId;
        this.updtDt = updtDt;
    }

    public int getAppSeq() {
        return appSeq;
    }

    public void setAppSeq(int appSeq) {
        this.appSeq = appSeq;
    }

    public int getCrsId() {
        return crsId;
    }

    public void setCrsId(int crsId) {
        this.crsId = crsId;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getCancelRsn() {
        return cancelRsn;
    }

    public void setCancelRsn(String cancelRsn) {
        this.cancelRsn = cancelRsn;
    }

    public int getCrtId() {
        return crtId;
    }

    public void setCrtId(int crtId) {
        this.crtId = crtId;
    }

    public String getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public int getUpdtId() {
        return updtId;
    }

    public void setUpdtId(int updtId) {
        this.updtId = updtId;
    }

    public String getUpdtDt() {
        return updtDt;
    }

    public void setUpdtDt(String updtDt) {
        this.updtDt = updtDt;
    }
}

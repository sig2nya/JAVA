package com.example.prj.serveSocket.HMS.repository.vo;

public class TableVO {
    private String crsId;
    private String crsNm;
    private String edStie;
    private String edFld;
    private String edType;
    private String appFrom;
    private String appTo;
    private String crsStatus;
    private String io;

    public String getCrsId() {
        return crsId;
    }

    public void setCrsId(String crsId) {
        this.crsId = crsId;
    }

    public String getCrsNm() {
        return crsNm;
    }

    public void setCrsNm(String crsNm) {
        this.crsNm = crsNm;
    }

    public String getEdStie() {
        return edStie;
    }

    public void setEdStie(String edStie) {
        this.edStie = edStie;
    }

    public String getEdFld() {
        return edFld;
    }

    public void setEdFld(String edFld) {
        this.edFld = edFld;
    }

    public String getEdType() {
        return edType;
    }

    public void setEdType(String edType) {
        this.edType = edType;
    }

    public String getAppFrom() {
        return appFrom;
    }

    public void setAppFrom(String appFrom) {
        this.appFrom = appFrom;
    }

    public String getAppTo() {
        return appTo;
    }

    public void setAppTo(String appTo) {
        this.appTo = appTo;
    }

    public String getCrsStatus() {
        return crsStatus;
    }

    public void setCrsStatus(String crsStatus) {
        this.crsStatus = crsStatus;
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    public TableVO(String crsId, String crsNm, String edStie, String edFld, String edType, String appFrom, String appTo, String crsStatus, String io) {
        this.crsId = crsId;
        this.crsNm = crsNm;
        this.edStie = edStie;
        this.edFld = edFld;
        this.edType = edType;
        this.appFrom = appFrom;
        this.appTo = appTo;
        this.crsStatus = crsStatus;
        this.io = io;
    }
}

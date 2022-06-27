package com.example.prj.serveSocket.HMS.repository.vo;

public class GridVO {
    private int rnum;
    private String crsId;
    private String closeYn;
    private String fromDt;
    private String toDt;
    private int edTime;
    private String loc;
    private String tcrNm;
    private int maxPeople;
    private int appliedPeople;
    private String seq;
    private String validationSeq;

    public GridVO(int rnum, String crsId, String closeYn, String fromDt, String toDt, int edTime, String loc, String tcrNm, int maxPeople, int appliedPeople, String seq, String validationSeq) {
        this.rnum = rnum;
        this.crsId = crsId;
        this.closeYn = closeYn;
        this.fromDt = fromDt;
        this.toDt = toDt;
        this.edTime = edTime;
        this.loc = loc;
        this.tcrNm = tcrNm;
        this.maxPeople = maxPeople;
        this.appliedPeople = appliedPeople;
        this.seq = seq;
        this.validationSeq = validationSeq;
    }

    public int getRnum() {
        return rnum;
    }

    public void setRnum(int rnum) {
        this.rnum = rnum;
    }

    public String getCrsId() {
        return crsId;
    }

    public void setCrsId(String crsId) {
        this.crsId = crsId;
    }

    public String getCloseYn() {
        return closeYn;
    }

    public void setCloseYn(String closeYn) {
        this.closeYn = closeYn;
    }

    public String getFromDt() {
        return fromDt;
    }

    public void setFromDt(String fromDt) {
        this.fromDt = fromDt;
    }

    public String getToDt() {
        return toDt;
    }

    public void setToDt(String toDt) {
        this.toDt = toDt;
    }

    public int getEdTime() {
        return edTime;
    }

    public void setEdTime(int edTime) {
        this.edTime = edTime;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getTcrNm() {
        return tcrNm;
    }

    public void setTcrNm(String tcrNm) {
        this.tcrNm = tcrNm;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getAppliedPeople() {
        return appliedPeople;
    }

    public void setAppliedPeople(int appliedPeople) {
        this.appliedPeople = appliedPeople;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getValidationSeq() {
        return validationSeq;
    }

    public void setValidationSeq(String validationSeq) {
        this.validationSeq = validationSeq;
    }
}

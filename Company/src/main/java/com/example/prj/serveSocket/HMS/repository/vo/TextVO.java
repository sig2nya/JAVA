package com.example.prj.serveSocket.HMS.repository.vo;

public class TextVO {
    private String crsId;
    private String edTrgt;
    private String edPurpose;
    private String edCont;

    public TextVO(String crsId, String edTrgt, String edPurpose, String edCont) {
        this.crsId = crsId;
        this.edTrgt = edTrgt;
        this.edPurpose = edPurpose;
        this.edCont = edCont;
    }

    public String getCrsId() {
        return crsId;
    }

    public void setCrsId(String crsId) {
        this.crsId = crsId;
    }

    public String getEdTrgt() {
        return edTrgt;
    }

    public void setEdTrgt(String edTrgt) {
        this.edTrgt = edTrgt;
    }

    public String getEdPurpose() {
        return edPurpose;
    }

    public void setEdPurpose(String edPurpose) {
        this.edPurpose = edPurpose;
    }

    public String getEdCont() {
        return edCont;
    }

    public void setEdCont(String edCont) {
        this.edCont = edCont;
    }
}

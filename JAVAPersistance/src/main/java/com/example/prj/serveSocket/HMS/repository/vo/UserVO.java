package com.example.prj.serveSocket.HMS.repository.vo;

import javax.validation.constraints.NotBlank;

public class UserVO {
    private Integer userId;

    @NotBlank(message = "사용자 ID는 필수입니다.")
    private String username;

    @NotBlank(Message = "사용자명은 필수입니다.")
    private String uName;

    private int coId;

    private int role;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getCoId() {
        return coId;
    }

    public void setCoId(int coId) {
        this.coId = coId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}

package com.billy.test1206.pojo;

public class User {
//    @Value("${user.id}")
    private Long id;
//    @Value("${user.userName}")
    private String userName;
//    @Value("${user.note}")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

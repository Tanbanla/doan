package com.example.doan.Object;

public class Thong_bao {
    public Thong_bao(String ID, String title, String content, String sentDate, String img) {
        this.ID = ID;
        Title = title;
        Content = content;
        SentDate = sentDate;
        this.img = img;
    }

    private  String    ID , Title , Content , SentDate,img ;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getSentDate() {
        return SentDate;
    }

    public void setSentDate(String sentDate) {
        SentDate = sentDate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

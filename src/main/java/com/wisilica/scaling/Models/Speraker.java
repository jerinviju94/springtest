package com.wisilica.scaling.Models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sperakers")
public class Speraker {

    public Speraker(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long speraker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;

    private byte[] speaker_photo;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    public byte[] getSpeaker_photo() {
        return speaker_photo;
    }

    public void setSpeaker_photo(byte[] speaker_photo) {
        this.speaker_photo = speaker_photo;
    }

    @ManyToMany(mappedBy = ("speakers"))
    List<Session> sessions;

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }

    private String speaker_bio;

    public long getSperaker_id() {
        return speraker_id;
    }

    public void setSperaker_id(long speraker_id) {
        this.speraker_id = speraker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

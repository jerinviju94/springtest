package com.wisilica.scaling.Models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
public class Session {

    public Session(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long session_id;
    private String session_name;
    private  String session_description;
    private  int session_length;

    @ManyToMany
    @JoinTable(
            name="session_speakers",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    List<Speraker> sperakers;

    public List<Speraker> getSperakers() {
        return sperakers;
    }

    public void setSperakers(List<Speraker> sperakers) {
        this.sperakers = sperakers;
    }

    public long getSession_id() {
        return session_id;
    }

    public void setSession_id(long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getSession_description() {
        return session_description;
    }

    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    public int getSession_length() {
        return session_length;
    }

    public void setSession_length(int session_length) {
        this.session_length = session_length;
    }
}

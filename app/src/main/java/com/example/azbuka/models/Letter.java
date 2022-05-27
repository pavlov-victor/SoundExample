package com.example.azbuka.models;

public class Letter {
    private String name;
    private Integer soundId;

    public Letter(String name, Integer soundId) {
        this.name = name;
        this.soundId = soundId;
    }

    public Letter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSoundId() {
        return soundId;
    }

    public void setSoundId(Integer soundId) {
        this.soundId = soundId;
    }
}

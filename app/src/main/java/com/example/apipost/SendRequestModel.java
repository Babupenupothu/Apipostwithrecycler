package com.example.apipost;

public class SendRequestModel {

    int instantSpotted;
    int code;
    Boolean value;
    String description;
    String other_damage;

    public int getInstantSpotted() {
        return instantSpotted;
    }

    public void setInstantSpotted(int instantSpotted) {
        this.instantSpotted = instantSpotted;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOther_damage() {
        return other_damage;
    }

    public void setOther_damage(String other_damage) {
        this.other_damage = other_damage;
    }


}

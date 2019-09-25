package com.example.apipost;

public class AndroidVersionModel {

    private String ver;
    private String name;
    private String api;

    public AndroidVersionModel(String version, String name, String api) {

        this.ver=version;
        this.name=name;
        this.api=api;

    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}

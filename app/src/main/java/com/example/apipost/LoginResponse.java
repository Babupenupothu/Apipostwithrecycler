package com.example.apipost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {


    public class Data {

        @SerializedName("Token")
        @Expose
        private String token;
        @SerializedName("Roles")
        @Expose
        private List<String> roles = null;
        @SerializedName("FullName")
        @Expose
        private String fullName;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

    }
    @SerializedName("Result")
    @Expose
    private String result;
    @SerializedName("Data")
    @Expose
    private Data data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}

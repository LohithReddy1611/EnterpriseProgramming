package com.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="c", eager=true)
public class CalculatorBean {
    private int v1;
    private int v2;
    private String v3;

    public int getV1() {
        return v1;
    }
    public void setV1(int v1) {
        this.v1 = v1;
    }
    public int getV2() {
        return v2;
    }
    public void setV2(int v2) {
        this.v2 = v2;
    }
    public String getV3() {
        return v3;
    }
    public void setV3(String v3) {
        this.v3 = v3;
    }

    public void callRestAdd() {
        try {
            URL url = new URL("http://localhost:5000/REST-DEMO/c/add/" + v1 + "/" + v2);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            v3 = br.readLine();
            br.close(); // Close the BufferedReader
            con.disconnect(); // Disconnect the HttpURLConnection
        } catch (Exception e) {
            v3 = e.getMessage();
        }
    }

    public void callRestSub() {
        try {
            URL url = new URL("http://localhost:5000/REST-DEMO/c/sub/" + v1 + "/" + v2);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            v3 = br.readLine();
            br.close(); // Close the BufferedReader
            con.disconnect(); // Disconnect the HttpURLConnection
        } catch (Exception e) {
            v3 = e.getMessage();
        }
    }
}
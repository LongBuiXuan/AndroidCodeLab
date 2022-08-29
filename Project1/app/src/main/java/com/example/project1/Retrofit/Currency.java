package com.example.project1.Retrofit;

public class Currency {
    private boolean success;
    private String query;
    private float info;
    private String result;

    public boolean isSuccess(){
        return success;
    }

    public void setSuccess(boolean success){
        this.success =  success;
    }
    public String getQuery(){
        return query;
    }

    public String getResult(){
        return result;
    }


}

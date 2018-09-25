package com.zxp.mybaits;

public class ResultEntity {

    private String state;

    private String describe;

    private Object data;

    public String getState() {
        return state;
    }

    public ResultEntity setState(String state) {
        this.state = state;
        return this;
    }

    public String getDescribe() {
        return describe;
    }

    public ResultEntity setDescribe(String describe) {
        this.describe = describe;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResultEntity setData(Object data) {
        this.data = data;
        return this;
    }


}

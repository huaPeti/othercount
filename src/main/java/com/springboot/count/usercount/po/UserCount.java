package com.springboot.count.usercount.po;

/**
 * @author chen1
 * @annotation:po
 * @create 2018-08-03 10:42
 **/
public class UserCount {
    private  int countId;
    //访问次数
    private String counts;
    //按钮名称
    private String buttonName;

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public int getCountId() {
        return countId;
    }

    public void setCountId(int countId) {
        this.countId = countId;
    }

}


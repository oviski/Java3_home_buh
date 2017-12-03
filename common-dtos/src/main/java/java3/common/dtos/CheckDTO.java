package java3.common.dtos;

import java.io.Serializable;
import java.util.Date;

public class CheckDTO implements Serializable {

    private Long checkID;
    private Date dataPourches;
    private Long sumOfCheck;
    private String shopName;
    private Integer userID;
    private Integer userMoneyAccountID;
    private boolean detailAllow;
    private String comments;

    public Long getCheckID() {
        return checkID;
    }

    public void setCheckID(Long checkID) {
        this.checkID = checkID;
    }

    public Date getDataPourches() {
        return dataPourches;
    }

    public void setDataPourches(Date dataPourches) {
        this.dataPourches = dataPourches;
    }

    public Long getSumOfCheck() {
        return sumOfCheck;
    }

    public void setSumOfCheck(Long sumOfCheck) {
        this.sumOfCheck = sumOfCheck;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getUserMoneyAccountID() {
        return userMoneyAccountID;
    }

    public void setUserMoneyAccountID(Integer userMoneyAccountID) {
        this.userMoneyAccountID = userMoneyAccountID;
    }

    public boolean getDetailAllow() {
        return detailAllow;
    }

    public void setDetailAllow(boolean detailAllow) {
        this.detailAllow = detailAllow;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

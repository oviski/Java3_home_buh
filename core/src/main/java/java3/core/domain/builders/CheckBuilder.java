package java3.core.domain.builders;

import java3.core.domain.Check;

import java.util.Date;

public class CheckBuilder {

//    private Long checkID;
    private Date dataPourches;
    private Long sumOfCheck;
    private String shopName;
    private Integer userID;
    private Integer userMoneyAccountID;
    private boolean detailAllow;
    private String comments;

    private CheckBuilder(){

    }

    public static CheckBuilder createCheck() {

        return new CheckBuilder();
    }

    public Check build() {
        Check check = new Check();
        check.setDataPourches(dataPourches);
        check.setSumOfCheck(sumOfCheck);
        check.setShopName(shopName);
        check.setUserID(userID);
        check.setUserMoneyAccountID(userMoneyAccountID);
        check.setDetailAllow(detailAllow);
        check.setComments(comments);
        return check;
    }
    public CheckBuilder withDatePourches (Date dataPourches){
        this.dataPourches = dataPourches;
        return this;
    }

    public CheckBuilder withSumOfCheck(Long sumOfCheck){
        this.sumOfCheck = sumOfCheck;
        return this;
    }

    public CheckBuilder withShopName(String shopName){
        this.shopName = shopName;
        return this;
    }
    public CheckBuilder withWhoPayID(Integer userID){
        this.userID = userID;
        return this;
    }
    public CheckBuilder withUserMoneyAccountID(Integer userMoneyAccountID){
        this.userMoneyAccountID = userMoneyAccountID;
        return this;
    }
    public CheckBuilder withDetailAllow(Boolean detailAllow){
        this.detailAllow = detailAllow;
        return this;
    }
    public CheckBuilder withComments(String comments){
        this.comments = comments;
        return this;
    }



}
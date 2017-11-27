package java3.common.dtos;

import java.util.Date;

public class CheckDTOBuilder {

    private Long checkID;
    private Date dataPourches;
    private Long sumOfCheck;
    private String shopName;
    private Integer userID;
    private Integer userMoneyAccountID;
    private boolean detailAllow;
    private String comments;

    private CheckDTOBuilder() {

    }

    public static CheckDTOBuilder createCheckDTO() {
        return  new CheckDTOBuilder();
    }

    public CheckDTO build() {
        CheckDTO check = new CheckDTO();
        check.setCheckID(checkID);
        check.setDataPourches(dataPourches);
        check.setSumOfCheck(sumOfCheck);
        check.setShopName(shopName);
        check.setUserID(userID);
        check.setUserMoneyAccountID(userMoneyAccountID);
        check.setDetailAllow(detailAllow);
        check.setComments(comments);
        return check;
    }

    public CheckDTOBuilder withCheckID (Long checkID){
        this.checkID = checkID;
        return this;
    }

    public CheckDTOBuilder withDatePourches (Date dataPourches){
        this.dataPourches = dataPourches;
        return this;
    }

    public CheckDTOBuilder withSumOfCheck(Long sumOfCheck){
        this.sumOfCheck = sumOfCheck;
        return this;
    }

    public CheckDTOBuilder withShopName(String shopName){
        this.shopName = shopName;
        return this;
    }
    public CheckDTOBuilder withUserID(Integer userID){
        this.userID = userID;
        return this;
    }
    public CheckDTOBuilder withUserMoneyAccountID(Integer userMoneyAccountID){
        this.userMoneyAccountID = userMoneyAccountID;
        return this;
    }
    public CheckDTOBuilder withDetailAllow(Boolean detailAllow){
        this.detailAllow = detailAllow;
        return this;
    }
    public CheckDTOBuilder withComments(String comments){
        this.comments = comments;
        return this;
    }
}

/*
package lv.javaguru.java3.common.dtos;

public class UserDTOBuilder {

    private Long id;
    private String login;
    private String password;
    private String email;

    private UserDTOBuilder() {

    }

    public static UserDTOBuilder createUserDTO() {
        return new UserDTOBuilder();
    }

    public UserDTO build() {
        UserDTO user = new UserDTO();
        user.setId(id);
        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);
        return user;
    }

    public UserDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public UserDTOBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public UserDTOBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDTOBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

}
 */
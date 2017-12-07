package java3.core.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "checks")
public class Check{

    @Id
    @GeneratedValue(generator = "clients_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "clients_seq", sequenceName = "clients_seq", allocationSize = 1)
    @Column(name="checkid", nullable = false)
    private Long checkID;

    @Column(name="datapourches", nullable = false)
    private Date dataPourches;

    @Column(name="sumofcheck", nullable = false)
    private Long sumOfCheck;

    @Column(name="shopname", nullable = false)
    private String shopName;

    @Column(name="userid", nullable = false)
    private Integer userID;

    @Column(name="usermoneyaccountid", nullable = false)
    private Integer userMoneyAccountID;

    @Column(name="detailsallow", nullable = false)
    private boolean detailAllow;

    @Column(name="comments")
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

    public boolean isDetailAllow() {
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

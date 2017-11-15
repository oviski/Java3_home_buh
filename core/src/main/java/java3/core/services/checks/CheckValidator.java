package java3.core.services.checks;

import java.util.Date;

public interface CheckValidator {

    void validate(Date dataPourches,
                  Long sumOfCheck,
                  String shopName,
                  Integer userID,
                  Integer userMoneyAccountID,
                  Boolean detailsAllow,
                  String comments);
}

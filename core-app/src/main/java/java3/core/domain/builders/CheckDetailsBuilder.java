package java3.core.domain.builders;

import java3.core.domain.CheckDetails;

/**
 * Created by admin on 24.04.2017.
 */
public class CheckDetailsBuilder {
//    private Long checkDetailsID;
    private Long checkID;
    private Integer checkPositionID;
    private Integer categoryID;
    private Integer subcategoryID;
    private Long productID;
    private Long sumOfProducts;
    private String positionDetail;


    private CheckDetailsBuilder() {}

    public static CheckDetailsBuilder createChecksDetail() {
        return new CheckDetailsBuilder();
    }

    public CheckDetails build() {
        CheckDetails checksDetails = new CheckDetails();
        checksDetails.setCheckID(checkID);
        checksDetails.setCheckPositionID(checkPositionID);
        checksDetails.setCategoryID(categoryID);
        checksDetails.setSubcategoryID(subcategoryID);
        checksDetails.setProductID(productID);
        checksDetails.setSumOfProducts(sumOfProducts);
        checksDetails.setPositionDetail(positionDetail);
        return checksDetails;
    }

    public CheckDetailsBuilder withCheckID(Long checkID){
        this.checkID = checkID;
        return this;
    }
    public CheckDetailsBuilder withCheckPositionID(Integer checkPositionID){
        this.checkPositionID = checkPositionID;
        return this;
    }
    public CheckDetailsBuilder withCategoryID(Integer categoryID){
        this.categoryID = categoryID;
        return this;
    }
    public CheckDetailsBuilder withSubcategoryID(Integer subcategoryID){
        this.subcategoryID = subcategoryID;
        return this;
    }
    public CheckDetailsBuilder withProductsID(Long productID){
        this.productID = productID;
        return this;
    }
    public CheckDetailsBuilder withSumOfProducts(Long sumOfProducts){
        this.sumOfProducts = sumOfProducts;
        return this;
    }
    public CheckDetailsBuilder withPositionDetail(String positionDetail){
        this.positionDetail = positionDetail;
        return this;
    }
}
package java3.core.api.exceptions;

public class ValidationError {

    private String field;
    private String errorCode;
    private String description;

    public ValidationError() {

    }

    public ValidationError(String field, String errorCode) {
        this.field = field;
        this.errorCode = errorCode;
    }

    public ValidationError(String field, String errorCode, String description) {
        this.field = field;
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidationError that = (ValidationError) o;

        if (field != null ? !field.equals(that.field) : that.field != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = field != null ? field.hashCode() : 0;
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
/*
package lv.javaguru.java3.core.api.exceptons;

public class ValidationError {

    private String field;
    private String errorCode;
    private String description;

    public ValidationError() {

    }

    public ValidationError(String field, String errorCode) {
        this.field = field;
        this.errorCode = errorCode;
    }

    public ValidationError(String field, String errorCode, String description) {
        this.field = field;
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidationError that = (ValidationError) o;

        if (field != null ? !field.equals(that.field) : that.field != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = field != null ? field.hashCode() : 0;
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
 */
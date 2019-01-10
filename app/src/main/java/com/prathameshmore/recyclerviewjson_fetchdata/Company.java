package com.prathameshmore.recyclerviewjson_fetchdata;

public class Company {

    private String companyName;
    private String companyDescription;
    private String accountNumber;
    private String imageURL;


    public Company(String companyName, String companyDescription, String accountNumber, String imageURL) {
        this.companyName = companyName;
        this.companyDescription = companyDescription;
        this.accountNumber = accountNumber;
        this.imageURL = imageURL;

    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}

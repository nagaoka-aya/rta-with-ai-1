package com.example.myapp.dto;

/**
 * 顧客情報DTO
 * コントローラーから画面に顧客情報を返すためのクラス
 */
public class CustomerDto {

    /** 顧客ID */
    private String customerId;
    
    /** 顧客名 */
    private String customerName;
    
    /** 業種コード */
    private String industryCode;
    
    /** 業種名 */
    private String industryName;
    
    /**
     * デフォルトコンストラクタ
     */
    public CustomerDto() {
    }
    
    /**
     * コンストラクタ
     * 
     * @param customerId 顧客ID
     * @param customerName 顧客名
     * @param industryCode 業種コード
     * @param industryName 業種名
     */
    public CustomerDto(String customerId, String customerName, String industryCode, String industryName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.industryCode = industryCode;
        this.industryName = industryName;
    }
    
    /**
     * 顧客IDを取得する
     * 
     * @return 顧客ID
     */
    public String getCustomerId() {
        return customerId;
    }
    
    /**
     * 顧客IDを設定する
     * 
     * @param customerId 顧客ID
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    /**
     * 顧客名を取得する
     * 
     * @return 顧客名
     */
    public String getCustomerName() {
        return customerName;
    }
    
    /**
     * 顧客名を設定する
     * 
     * @param customerName 顧客名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    /**
     * 業種コードを取得する
     * 
     * @return 業種コード
     */
    public String getIndustryCode() {
        return industryCode;
    }
    
    /**
     * 業種コードを設定する
     * 
     * @param industryCode 業種コード
     */
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }
    
    /**
     * 業種名を取得する
     * 
     * @return 業種名
     */
    public String getIndustryName() {
        return industryName;
    }
    
    /**
     * 業種名を設定する
     * 
     * @param industryName 業種名
     */
    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }
}

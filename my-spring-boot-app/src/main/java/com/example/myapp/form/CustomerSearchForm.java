package com.example.myapp.form;

/**
 * 顧客検索フォームクラス
 * 画面からの検索条件入力を受け取るためのクラス
 */
public class CustomerSearchForm {

    /** 顧客名 */
    private String customerName;
    
    /** 業種コード */
    private String industryCode;
    
    /**
     * デフォルトコンストラクタ
     */
    public CustomerSearchForm() {
    }
    
    /**
     * コンストラクタ
     * 
     * @param customerName 顧客名
     * @param industryCode 業種コード
     */
    public CustomerSearchForm(String customerName, String industryCode) {
        this.customerName = customerName;
        this.industryCode = industryCode;
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
}

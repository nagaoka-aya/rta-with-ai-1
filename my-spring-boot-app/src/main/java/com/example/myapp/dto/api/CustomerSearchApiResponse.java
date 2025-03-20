package com.example.myapp.dto.api;

/**
 * 顧客検索APIレスポンス用DTO
 */
public class CustomerSearchApiResponse {

    /** クライアントID */
    private String clientId;
    
    /** クライアント名 */
    private String clientName;
    
    /** 業種コード */
    private String industryCode;
    
    /** バージョン番号 */
    private int versionNo;
    
    /**
     * デフォルトコンストラクタ
     */
    public CustomerSearchApiResponse() {
    }
    
    /**
     * コンストラクタ
     * 
     * @param clientId クライアントID
     * @param clientName クライアント名
     * @param industryCode 業種コード
     * @param versionNo バージョン番号
     */
    public CustomerSearchApiResponse(String clientId, String clientName, String industryCode, int versionNo) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.industryCode = industryCode;
        this.versionNo = versionNo;
    }
    
    /**
     * クライアントIDを取得する
     * 
     * @return クライアントID
     */
    public String getClientId() {
        return clientId;
    }
    
    /**
     * クライアントIDを設定する
     * 
     * @param clientId クライアントID
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
    /**
     * クライアント名を取得する
     * 
     * @return クライアント名
     */
    public String getClientName() {
        return clientName;
    }
    
    /**
     * クライアント名を設定する
     * 
     * @param clientName クライアント名
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
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
     * バージョン番号を取得する
     * 
     * @return バージョン番号
     */
    public int getVersionNo() {
        return versionNo;
    }
    
    /**
     * バージョン番号を設定する
     * 
     * @param versionNo バージョン番号
     */
    public void setVersionNo(int versionNo) {
        this.versionNo = versionNo;
    }
}

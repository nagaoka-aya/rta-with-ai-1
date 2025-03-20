package com.example.dto.api;

import java.io.Serializable;

/**
 * 顧客詳細取得APIのリクエストDTO
 */
public class CustomerDetailApiRequest implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 顧客ID
     */
    private String customerId;
    
    /**
     * デフォルトコンストラクタ
     */
    public CustomerDetailApiRequest() {
    }
    
    /**
     * コンストラクタ
     * 
     * @param customerId 顧客ID
     */
    public CustomerDetailApiRequest(String customerId) {
        this.customerId = customerId;
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
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        CustomerDetailApiRequest other = (CustomerDetailApiRequest) obj;
        if (customerId == null) {
            if (other.customerId != null) return false;
        } else if (!customerId.equals(other.customerId)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "CustomerDetailApiRequest [customerId=" + customerId + "]";
    }
}
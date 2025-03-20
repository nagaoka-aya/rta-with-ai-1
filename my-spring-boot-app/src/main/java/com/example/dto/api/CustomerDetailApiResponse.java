package com.example.dto.api;

import java.io.Serializable;

/**
 * 顧客詳細取得APIのレスポンスDTO
 */
public class CustomerDetailApiResponse implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * API処理結果コード
     */
    private String resultCode;
    
    /**
     * API処理結果メッセージ
     */
    private String resultMessage;
    
    /**
     * 顧客情報
     */
    private CustomerInfo customerInfo;
    
    /**
     * デフォルトコンストラクタ
     */
    public CustomerDetailApiResponse() {
    }
    
    /**
     * コンストラクタ
     * 
     * @param resultCode 結果コード
     * @param resultMessage 結果メッセージ
     * @param customerInfo 顧客情報
     */
    public CustomerDetailApiResponse(String resultCode, String resultMessage, CustomerInfo customerInfo) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.customerInfo = customerInfo;
    }
    
    /**
     * 結果コードを取得する
     * 
     * @return 結果コード
     */
    public String getResultCode() {
        return resultCode;
    }
    
    /**
     * 結果コードを設定する
     * 
     * @param resultCode 結果コード
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    
    /**
     * 結果メッセージを取得する
     * 
     * @return 結果メッセージ
     */
    public String getResultMessage() {
        return resultMessage;
    }
    
    /**
     * 結果メッセージを設定する
     * 
     * @param resultMessage 結果メッセージ
     */
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
    
    /**
     * 顧客情報を取得する
     * 
     * @return 顧客情報
     */
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }
    
    /**
     * 顧客情報を設定する
     * 
     * @param customerInfo 顧客情報
     */
    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }
    
    @Override
    public String toString() {
        return "CustomerDetailApiResponse [resultCode=" + resultCode + ", resultMessage=" + resultMessage
                + ", customerInfo=" + customerInfo + "]";
    }
    
    /**
     * 顧客情報
     */
    public static class CustomerInfo implements Serializable {
        
        private static final long serialVersionUID = 1L;
        
        /**
         * 顧客ID
         */
        private String customerId;
        
        /**
         * 顧客名
         */
        private String customerName;
        
        /**
         * 顧客区分
         */
        private String customerType;
        
        /**
         * 住所
         */
        private String address;
        
        /**
         * 電話番号
         */
        private String phoneNumber;
        
        /**
         * 担当者名
         */
        private String contactPerson;
        
        /**
         * デフォルトコンストラクタ
         */
        public CustomerInfo() {
        }
        
        /**
         * コンストラクタ
         * 
         * @param customerId 顧客ID
         * @param customerName 顧客名
         * @param customerType 顧客区分
         * @param address 住所
         * @param phoneNumber 電話番号
         * @param contactPerson 担当者名
         */
        public CustomerInfo(String customerId, String customerName, String customerType,
                            String address, String phoneNumber, String contactPerson) {
            this.customerId = customerId;
            this.customerName = customerName;
            this.customerType = customerType;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.contactPerson = contactPerson;
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
         * 顧客区分を取得する
         * 
         * @return 顧客区分
         */
        public String getCustomerType() {
            return customerType;
        }
        
        /**
         * 顧客区分を設定する
         * 
         * @param customerType 顧客区分
         */
        public void setCustomerType(String customerType) {
            this.customerType = customerType;
        }
        
        /**
         * 住所を取得する
         * 
         * @return 住所
         */
        public String getAddress() {
            return address;
        }
        
        /**
         * 住所を設定する
         * 
         * @param address 住所
         */
        public void setAddress(String address) {
            this.address = address;
        }
        
        /**
         * 電話番号を取得する
         * 
         * @return 電話番号
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }
        
        /**
         * 電話番号を設定する
         * 
         * @param phoneNumber 電話番号
         */
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        
        /**
         * 担当者名を取得する
         * 
         * @return 担当者名
         */
        public String getContactPerson() {
            return contactPerson;
        }
        
        /**
         * 担当者名を設定する
         * 
         * @param contactPerson 担当者名
         */
        public void setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
        }
        
        @Override
        public String toString() {
            return "CustomerInfo [customerId=" + customerId + ", customerName=" + customerName
                    + ", customerType=" + customerType + ", address=" + address
                    + ", phoneNumber=" + phoneNumber + ", contactPerson=" + contactPerson + "]";
        }
    }
}

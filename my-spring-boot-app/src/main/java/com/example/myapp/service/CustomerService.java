package com.example.myapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.myapp.client.CustomerApiClient;
import com.example.myapp.code.util.CodeUtil;
import com.example.myapp.dto.CustomerDto;
import com.example.myapp.dto.api.CustomerSearchApiRequest;
import com.example.myapp.dto.api.CustomerSearchApiResponse;

/**
 * 顧客情報に関するビジネスロジックを提供するサービスクラス
 */
@Service
public class CustomerService {
    
    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
    private static final String INDUSTRY_CODE_ID = "C0100001"; // 業種コードID
    
    private final CustomerApiClient customerApiClient;
    
    /**
     * コンストラクタ
     * 
     * @param customerApiClient 顧客API呼び出し用クライアント
     */
    public CustomerService(CustomerApiClient customerApiClient) {
        this.customerApiClient = customerApiClient;
    }
    
    /**
     * 顧客情報を検索する
     * 
     * @param customerName 顧客名（部分一致）
     * @param industryCode 業種コード
     * @return 検索結果の顧客情報リスト
     */
    public List<CustomerDto> searchCustomers(String customerName, String industryCode) {
        logger.info("顧客検索処理開始: customerName={}, industryCode={}", customerName, industryCode);
        
        // 検索条件の設定
        CustomerSearchApiRequest request = new CustomerSearchApiRequest();
        request.setCustomerName(customerName);
        request.setIndustryCode(industryCode);
        
        // API呼び出し
        List<CustomerSearchApiResponse> responses = customerApiClient.searchCustomers(request);
        
        // APIレスポンスをDTOに変換
        List<CustomerDto> customers = responses.stream()
                .map(this::convertToCustomerDto)
                .collect(Collectors.toList());
        
        logger.info("顧客検索処理完了: 取得件数={}", customers.size());
        return customers;
    }
    
    /**
     * APIレスポンスをDTOに変換する
     * 
     * @param response APIレスポンス
     * @return 顧客DTO
     */
    private CustomerDto convertToCustomerDto(CustomerSearchApiResponse response) {
        CustomerDto dto = new CustomerDto();
        dto.setCustomerId(response.getClientId());
        dto.setCustomerName(response.getClientName());
        dto.setIndustryCode(response.getIndustryCode());
        
        // 業種コードから業種名を取得
        String industryName = CodeUtil.getCodeName(INDUSTRY_CODE_ID, response.getIndustryCode());
        dto.setIndustryName(industryName);
        
        return dto;
    }
}

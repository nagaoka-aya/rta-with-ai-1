package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.dto.api.CustomerDetailApiRequest;
import com.example.dto.api.CustomerDetailApiResponse;
import com.example.exception.ApiCallException;

/**
 * 顧客管理システムとの連携を行うAPIクライアント
 */
@Component
public class CustomerApiClient {
    
    private static final Logger log = LoggerFactory.getLogger(CustomerApiClient.class);

    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${api.customer-management.base-url}")
    private String baseUrl;
    
    @Value("${api.customer-management.customer-detail-endpoint}")
    private String customerDetailEndpoint;
    
    /**
     * 顧客IDから顧客詳細情報を取得する
     * 
     * @param customerId 顧客ID
     * @return 顧客詳細情報
     * @throws ApiCallException API呼び出し時の例外
     */
    public CustomerDetailApiResponse getCustomerDetail(String customerId) throws ApiCallException {
        try {
            log.info("顧客詳細API呼び出し 顧客ID: {}", customerId);
            
            CustomerDetailApiRequest request = new CustomerDetailApiRequest();
            request.setCustomerId(customerId);
            
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            
            String url = UriComponentsBuilder
                    .fromUriString(baseUrl)
                    .path(customerDetailEndpoint)
                    .build()
                    .toUriString();
            
            HttpEntity<CustomerDetailApiRequest> entity = new HttpEntity<>(request, headers);
            
            ResponseEntity<CustomerDetailApiResponse> response = 
                    restTemplate.exchange(url, HttpMethod.POST, entity, CustomerDetailApiResponse.class);
            
            if (response.getBody() == null) {
                throw new ApiCallException("顧客詳細APIのレスポンスが空です。顧客ID: " + customerId);
            }
            
            log.info("顧客詳細API呼び出し成功 顧客ID: {}", customerId);
            return response.getBody();
        } catch (RestClientException e) {
            log.error("顧客詳細API呼び出しエラー 顧客ID: {}", customerId, e);
            throw new ApiCallException("顧客詳細API呼び出し中にエラーが発生しました", e);
        }
    }
}

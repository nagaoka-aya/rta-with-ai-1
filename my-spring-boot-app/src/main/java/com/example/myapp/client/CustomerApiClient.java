package com.example.myapp.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.myapp.dto.api.CustomerSearchApiRequest;
import com.example.myapp.dto.api.CustomerSearchApiResponse;

/**
 * 顧客情報APIクライアントクラス
 * 外部の顧客管理システムのAPIと通信を行うクラス
 */
@Component
public class CustomerApiClient {

    private static final Logger logger = LoggerFactory.getLogger(CustomerApiClient.class);
    
    // @Value("${api.customer.base-url}")
    // private String baseUrl;
    
    // @Value("${api.customer.search-path:/api/customers/search}")
    // private String searchPath;
    
    /**
     * コンストラクタ
     * 
     * @param restTemplate RestTemplateのインスタンス
     */
    public CustomerApiClient() {}
    
    /**
     * 顧客情報を検索する
     * 
     * @param request 検索条件を含むリクエストDTO
     * @return 検索結果の顧客情報リスト
     */
    public List<CustomerSearchApiResponse> searchCustomers(CustomerSearchApiRequest request) {
    //     logger.info("顧客検索API呼び出し開始: customerName={}, industryCode={}", 
    //             request.getCustomerName(), request.getIndustryCode());
        
    //     try {
    //         // URLの構築
    //         UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + searchPath);
            
    //         // パラメータの設定
    //         if (request.getCustomerName() != null && !request.getCustomerName().isEmpty()) {
    //             builder.queryParam("customerName", request.getCustomerName());
    //         }
    //         if (request.getIndustryCode() != null && !request.getIndustryCode().isEmpty()) {
    //             builder.queryParam("industryCode", request.getIndustryCode());
    //         }
            
    //         String url = builder.build().toUriString();
    //         logger.debug("API呼び出しURL: {}", url);
            
    //         // HTTPヘッダーの設定
    //         HttpHeaders headers = new HttpHeaders();
    //         headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    //         headers.setContentType(MediaType.APPLICATION_JSON);
            
    //         // HTTP リクエストエンティティの作成
    //         HttpEntity<CustomerSearchApiRequest> entity = new HttpEntity<>(headers);
            
    //         // API呼び出し
    //         ResponseEntity<List<CustomerSearchApiResponse>> response = restTemplate.exchange(
    //                 url,
    //                 HttpMethod.GET,
    //                 entity,
    //                 new ParameterizedTypeReference<List<CustomerSearchApiResponse>>() {}
    //         );
            
    //         List<CustomerSearchApiResponse> customers = response.getBody();
    //         logger.info("顧客検索API呼び出し完了: 取得件数={}", customers != null ? customers.size() : 0);
            
    //         return customers != null ? customers : Collections.emptyList();
            
    //     } catch (RestClientException e) {
    //         logger.error("顧客検索API呼び出し中にエラーが発生しました", e);
    //         throw e;
    //     }
    // }
        logger.info("顧客検索API呼び出し開始: customerName={}, industryCode={}", 
            request.getCustomerName(), request.getIndustryCode());
        
        // ダミーデータの作成
        CustomerSearchApiResponse dummyResponse1 = new CustomerSearchApiResponse(
            "C001", "Dummy Client 1", "IT", 1);
        CustomerSearchApiResponse dummyResponse2 = new CustomerSearchApiResponse(
            "C002", "Dummy Client 2", "Finance", 1);
        
        List<CustomerSearchApiResponse> dummyResponses = Arrays.asList(dummyResponse1, dummyResponse2);
        
        return dummyResponses;
    }
}

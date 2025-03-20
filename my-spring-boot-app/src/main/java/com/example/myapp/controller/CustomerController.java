package com.example.myapp.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myapp.code.util.CodeUtil;
import com.example.myapp.dto.CustomerDto;
import com.example.myapp.form.CustomerSearchForm;
import com.example.myapp.service.CustomerService;

/**
 * 顧客選択機能のコントローラークラス
 */
@Controller
@RequestMapping("/customer-selection")
public class CustomerController {
    
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private static final String INDUSTRY_CODE_ID = "C0100001"; // 業種コードID
    
    private final CustomerService customerService;
    
    /**
     * コンストラクタ
     * 
     * @param customerService 顧客サービス
     */
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    /**
     * 顧客選択画面を表示する
     * 
     * @param model モデル
     * @return ビュー名
     */
    @GetMapping
    public String showCustomerSelectionPage(Model model) {
        logger.info("顧客選択画面の初期表示");
        
        // 業種コードの選択肢をモデルに追加
        Map<String, String> industryTypes = CodeUtil.getCodeMapByCodeId(INDUSTRY_CODE_ID);
        model.addAttribute("industryTypes", industryTypes);
        
        // 検索フォーム用の空オブジェクトを追加
        model.addAttribute("customerSearchForm", new CustomerSearchForm());
        
        return "client_select";
    }
    
    /**
     * 顧客情報を検索する
     * 
     * @param form 顧客検索フォーム
     * @return 検索結果の顧客情報リスト
     */
    @GetMapping("/search")
    @ResponseBody
    public ResponseEntity<List<CustomerDto>> searchCustomers(CustomerSearchForm form) {
        logger.info("顧客検索処理: customerName={}, industryCode={}", 
                form.getCustomerName(), form.getIndustryCode());
        
        // サービスを呼び出して顧客情報を検索
        List<CustomerDto> customers = customerService.searchCustomers(
                form.getCustomerName(), form.getIndustryCode());
        
        return ResponseEntity.ok(customers);
    }
}

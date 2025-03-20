package com.example.exception;

/**
 * API呼び出し時の例外クラス
 */
public class ApiCallException extends Exception {
    
    private static final long serialVersionUID = 1L;

    /**
     * メッセージを指定して例外を生成する
     * 
     * @param message エラーメッセージ
     */
    public ApiCallException(String message) {
        super(message);
    }
    
    /**
     * メッセージと原因となる例外を指定して例外を生成する
     * 
     * @param message エラーメッセージ
     * @param cause 原因となった例外
     */
    public ApiCallException(String message, Throwable cause) {
        super(message, cause);
    }
}

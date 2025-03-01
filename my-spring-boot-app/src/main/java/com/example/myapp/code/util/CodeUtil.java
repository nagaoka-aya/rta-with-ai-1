package com.example.myapp.code.util;

import com.example.myapp.code.IndustryTypeCode;
import com.example.myapp.code.ProjectClassCode;
import com.example.myapp.code.ProjectTypeCode;
import com.example.myapp.code.FileRequestStatusCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * コードユーティリティクラス
 */
public class CodeUtil {

    /**
     * 業種分類コードのマップを取得する
     * 
     * @return コード値と名称のマップ
     */
    public static Map<String, String> getIndustryTypeCodeMap() {
        return Arrays.stream(IndustryTypeCode.values())
                .sorted((e1, e2) -> Integer.compare(e1.getSortOrder(), e2.getSortOrder()))
                .collect(Collectors.toMap(
                        IndustryTypeCode::getCode,
                        IndustryTypeCode::getName,
                        (x, y) -> y,
                        LinkedHashMap::new
                ));
    }

    /**
     * プロジェクト分類コードのマップを取得する
     * 
     * @return コード値と名称のマップ
     */
    public static Map<String, String> getProjectClassCodeMap() {
        return Arrays.stream(ProjectClassCode.values())
                .sorted((e1, e2) -> Integer.compare(e1.getSortOrder(), e2.getSortOrder()))
                .collect(Collectors.toMap(
                        ProjectClassCode::getCode,
                        ProjectClassCode::getName,
                        (x, y) -> y,
                        LinkedHashMap::new
                ));
    }

    /**
     * プロジェクト種別コードのマップを取得する
     * 
     * @return コード値と名称のマップ
     */
    public static Map<String, String> getProjectTypeCodeMap() {
        return Arrays.stream(ProjectTypeCode.values())
                .sorted((e1, e2) -> Integer.compare(e1.getSortOrder(), e2.getSortOrder()))
                .collect(Collectors.toMap(
                        ProjectTypeCode::getCode,
                        ProjectTypeCode::getName,
                        (x, y) -> y,
                        LinkedHashMap::new
                ));
    }

    /**
     * ファイル作成要求ステータスコードのマップを取得する
     * 
     * @return コード値と名称のマップ
     */
    public static Map<String, String> getFileRequestStatusCodeMap() {
        return Arrays.stream(FileRequestStatusCode.values())
                .sorted((e1, e2) -> Integer.compare(e1.getSortOrder(), e2.getSortOrder()))
                .collect(Collectors.toMap(
                        FileRequestStatusCode::getCode,
                        FileRequestStatusCode::getName,
                        (x, y) -> y,
                        LinkedHashMap::new
                ));
    }

    /**
     * コードIDに対応するマップを取得する
     * 
     * @param codeId コードID
     * @return コード値と名称のマップ
     */
    public static Map<String, String> getCodeMapByCodeId(String codeId) {
        switch (codeId) {
            case "C0100001":
                return getIndustryTypeCodeMap();
            case "C0200001":
                return getProjectClassCodeMap();
            case "C0300001":
                return getProjectTypeCodeMap();
            case "C0400001":
                return getFileRequestStatusCodeMap();
            default:
                return new LinkedHashMap<>();
        }
    }

    /**
     * コード値からコード名称を取得する
     * 
     * @param codeId コードID
     * @param code コード値
     * @return コード名称、見つからない場合は空文字列
     */
    public static String getCodeName(String codeId, String code) {
        Map<String, String> codeMap = getCodeMapByCodeId(codeId);
        return codeMap.getOrDefault(code, "");
    }
}

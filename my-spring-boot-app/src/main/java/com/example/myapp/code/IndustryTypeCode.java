package com.example.myapp.code;

/**
 * 業種分類コード
 * コードID: C0100001
 */
public enum IndustryTypeCode {

    AGRICULTURE("01", "農業", 1),
    CONSTRUCTION("02", "建設業", 2),
    MANUFACTURING("03", "製造業", 3);

    private final String code;
    private final String name;
    private final int sortOrder;

    IndustryTypeCode(String code, String name, int sortOrder) {
        this.code = code;
        this.name = name;
        this.sortOrder = sortOrder;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * コード値からEnumを取得する
     * 
     * @param code コード値
     * @return 対応するEnum、見つからない場合はnull
     */
    public static IndustryTypeCode fromCode(String code) {
        for (IndustryTypeCode value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}

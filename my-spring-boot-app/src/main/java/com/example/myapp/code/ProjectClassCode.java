package com.example.myapp.code;

/**
 * プロジェクト分類コード
 * コードID: C0200001
 */
public enum ProjectClassCode {

    SS("01", "ＳＳ", 1),
    S("02", "Ｓ", 2),
    A("03", "Ａ", 3),
    B("04", "Ｂ", 4),
    C("05", "Ｃ", 5),
    D("06", "Ｄ", 6);

    private final String code;
    private final String name;
    private final int sortOrder;

    ProjectClassCode(String code, String name, int sortOrder) {
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
    public static ProjectClassCode fromCode(String code) {
        for (ProjectClassCode value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}

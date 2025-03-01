package com.example.myapp.code;

/**
 * プロジェクト種別コード
 * コードID: C0300001
 */
public enum ProjectTypeCode {

    NEW_DEVELOPMENT("0101", "新規開発ＰＪ", 1),
    MAINTENANCE_DEVELOPMENT("0202", "保守開発ＰＪ", 2),
    ERP_IMPLEMENTATION("0303", "ＥＲＰ導入支援", 3),
    MAINTENANCE_PROJECT("0404", "保守ＰＪ", 4),
    OPERATION("0505", "運用", 5),
    SERVICE_DEV_MAINTENANCE("0606", "サービス提供（開発・保守）", 6),
    SERVICE_OTHER("0707", "サービス提供（開発・保守以外）", 7),
    MAINTENANCE_CASE("0808", "保守案件", 8),
    OTHER("0909", "その他", 9);

    private final String code;
    private final String name;
    private final int sortOrder;

    ProjectTypeCode(String code, String name, int sortOrder) {
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
    public static ProjectTypeCode fromCode(String code) {
        for (ProjectTypeCode value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}

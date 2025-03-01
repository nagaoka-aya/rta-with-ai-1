package com.example.myapp.code;

/**
 * ファイル作成要求ステータスコード
 * コードID: C0400001
 */
public enum FileRequestStatusCode {

    UNPROCESSED("0101", "未処理", 1),
    PROCESSING("0202", "処理中", 2),
    PROCESSED("0303", "処理済み", 3),
    FAILED("04", "処理失敗", 4);

    private final String code;
    private final String name;
    private final int sortOrder;

    FileRequestStatusCode(String code, String name, int sortOrder) {
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
    public static FileRequestStatusCode fromCode(String code) {
        for (FileRequestStatusCode value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}

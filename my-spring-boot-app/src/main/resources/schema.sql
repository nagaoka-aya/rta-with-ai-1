CREATE TABLE healthcheck (
    id INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(255) NOT NULL
);

-- システムアカウント
CREATE TABLE SYSTEM_ACCOUNT (
    USER_ID INTEGER NOT NULL,                          -- ユーザID
    LOGIN_ID VARCHAR(20) NOT NULL,                     -- ログインID
    USER_PASSWORD VARCHAR(64) NOT NULL,                -- パスワード
    PASSWORD_EXPIRATION_DATE DATE NOT NULL,            -- パスワード有効期限
    FAILED_COUNT SMALLINT NOT NULL,                    -- 認証失敗回数
    EFFECTIVE_DATE_FROM DATE,                          -- 有効期間(FROM)
    EFFECTIVE_DATE_TO DATE,                            -- 有効期間(TO)
    LAST_LOGIN_DATE_TIME TIMESTAMP,                    -- 最終ログイン日時
    PRIMARY KEY (USER_ID),
    UNIQUE (LOGIN_ID),
    FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID)
);

-- プロジェクト
CREATE TABLE PROJECT (
    PROJECT_ID SERIAL PRIMARY KEY,                     -- プロジェクトID
    PROJECT_NAME VARCHAR(128) NOT NULL,                -- プロジェクト名
    PROJECT_TYPE VARCHAR(2) NOT NULL,                  -- プロジェクト種別
    PROJECT_CLASS VARCHAR(2) NOT NULL,                 -- プロジェクト区分
    PROJECT_START_DATE DATE NOT NULL,                  -- プロジェクト開始日付
    PROJECT_END_DATE DATE NOT NULL,                    -- プロジェクト終了日付
    ORGANIZATION_ID INTEGER NOT NULL,                  -- 組織ID
    CLIENT_ID INTEGER NOT NULL,                        -- 顧客ID
    PROJECT_MANAGER VARCHAR(128) NOT NULL,             -- プロジェクトマネージャー
    PROJECT_LEADER VARCHAR(128) NOT NULL,              -- プロジェクトリーダー
    NOTE VARCHAR(512),                                 -- 備考
    SALES INTEGER,                                     -- 売上高
    VERSION_NO BIGINT NOT NULL                        -- バージョン番号
);

-- メール送信要求
CREATE TABLE MAIL_REQUEST (
    MAIL_REQUEST_ID VARCHAR(20) PRIMARY KEY,           -- メール送信要求ID
    SUBJECT VARCHAR(100),                    -- 件名
    MAIL_FROM VARCHAR(256),                  -- 差出人メールアドレス
    REPLY_TO VARCHAR(256),                            -- 返信先メールアドレス
    RETURN_PATH VARCHAR(256),                         -- 戻り先メールアドレス
    CHARSET VARCHAR(20),                     -- 文字セット
    MAIL_BODY VARCHAR(1000),                          -- メール本文
    STATUS VARCHAR(1),                       -- ステータス
    REQUEST_DATETIME TIMESTAMP,              -- 要求日時
    SEND_DATETIME TIMESTAMP                           -- 送信日時
);

-- メール添付ファイル
CREATE TABLE MAIL_ATTACHMENT (
    MAIL_REQUEST_ID VARCHAR(20) NOT NULL,              -- メール送信要求ID
    SERIAL_NUMBER INTEGER NOT NULL,                    -- 連番
    FILE_NAME VARCHAR(100),                           -- 添付ファイル名
    CONTENT_TYPE VARCHAR(30),                         -- Content-Type
    ATTACHED_FILE BLOB,                               -- 添付ファイル
    PRIMARY KEY (MAIL_REQUEST_ID, SERIAL_NUMBER)
);

-- Springセッション
CREATE TABLE SPRING_SESSION (
    PRIMARY_ID CHAR(36) NOT NULL,                      -- プライマリーID
    SESSION_ID CHAR(36) NOT NULL,                      -- セッションID
    CREATION_TIME BIGINT NOT NULL,                     -- 作成日時
    LAST_ACCESS_TIME BIGINT NOT NULL,                  -- 最終アクセス日時
    MAX_INACTIVE_INTERVAL INTEGER NOT NULL,            -- 最大非アクティブ間隔
    EXPIRY_TIME BIGINT NOT NULL,                      -- 有効期限
    PRINCIPAL_NAME VARCHAR(100),
    PRIMARY KEY (PRIMARY_ID),
    UNIQUE (SESSION_ID)
);

-- バッチジョブ実行コンテキスト
CREATE TABLE BATCH_JOB_EXECUTION_CONTEXT (
    JOB_EXECUTION_ID BIGINT PRIMARY KEY,               -- ジョブ実行ID
    SHORT_CONTEXT VARCHAR(2500) NOT NULL,              -- ショートコンテキスト
    SERIALIZED_CONTEXT TEXT,                           -- シリアライズされたコンテキスト
    FOREIGN KEY (JOB_EXECUTION_ID) REFERENCES BATCH_JOB_EXECUTION(JOB_EXECUTION_ID)
);

-- プロジェクトユーザ
CREATE TABLE PROJECT_USER (
    PROJECT_ID INTEGER NOT NULL,                       -- プロジェクトID
    USER_ID INTEGER NOT NULL,                         -- ユーザID
    PRIMARY KEY (PROJECT_ID, USER_ID),
    FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(PROJECT_ID),
    FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID)
);

-- ユーザ
CREATE TABLE USER (
    USER_ID SERIAL PRIMARY KEY,                       -- ユーザID
    KANJI_NAME VARCHAR(128) NOT NULL,                 -- 漢字氏名
    KANA_NAME VARCHAR(128) NOT NULL,                  -- ふりがな
    PM_FLAG BOOLEAN NOT NULL UNIQUE,                  -- PM職フラグ
    FOREIGN KEY (ORGANIZATION_ID) REFERENCES ORGANIZATION(ORGANIZATION_ID)
);

-- 組織
CREATE TABLE ORGANIZATION (
    ORGANIZATION_ID SERIAL PRIMARY KEY,               -- 組織ID
    ORGANIZATION_NAME VARCHAR(128),                   -- 組織名
    UPPER_ORGANIZATION INTEGER,                       -- 上位組織ID 
);

-- 業務日付
CREATE TABLE BUSINESS_DATE (
    SEGMENT_ID VARCHAR(2) PRIMARY KEY,                -- セグメントID
    BUSINESS_DATE VARCHAR(8)                          -- 業務日付
);

-- コード名称
CREATE TABLE CODE_NAME (
    CODE_ID VARCHAR(8) NOT NULL,                      -- コードID
    CODE_VALUE VARCHAR(2) NOT NULL,                   -- コード値
    LANG VARCHAR(2) NOT NULL,                         -- 言語
    SORT_ORDER VARCHAR(1) NOT NULL,                   -- ソート順 
    CODE_NAME VARCHAR(50) NOT NULL,                   -- コード名称
    SHORT_NAME VARCHAR(50),                           -- コード略称
    OPTION01 VARCHAR(40),                            -- オプション01
    OPTION02 VARCHAR(40),                            -- オプション02
    OPTION03 VARCHAR(40),                            -- オプション03
    OPTION04 VARCHAR(40),                            -- オプション04
    OPTION05 VARCHAR(40),                            -- オプション05
    OPTION06 VARCHAR(40),                            -- オプション06
    OPTION07 VARCHAR(40),                            -- オプション07
    OPTION08 VARCHAR(40),                            -- オプション08
    OPTION09 VARCHAR(40),                            -- オプション09
    OPTION10 VARCHAR(40),                            -- オプション10
    PRIMARY KEY (CODE_ID, CODE_VALUE, LANG)
);

-- コードパターン
CREATE TABLE CODE_PATTERN (
    CODE_ID VARCHAR(8) NOT NULL,                      -- コードID
    CODE_VALUE VARCHAR(2) NOT NULL,                   -- コード値
    LANG VARCHAR(2) NOT NULL,                         -- 言語
    PATTERN01 VARCHAR(1) NOT NULL,                      -- パターン01
    PATTERN02 VARCHAR(1),                      -- パターン02
    PATTERN03 VARCHAR(1),                      -- パターン03
    PATTERN04 VARCHAR(1),                      -- パターン04
    PATTERN05 VARCHAR(1),                      -- パターン05
    PATTERN06 VARCHAR(1),                      -- パターン06
    PATTERN07 VARCHAR(1),                      -- パターン07
    PATTERN08 VARCHAR(1),                      -- パターン08
    PATTERN09 VARCHAR(1),                      -- パターン09
    PATTERN10 VARCHAR(1),                      -- パターン10
    PATTERN11 VARCHAR(1),                      -- パターン11
    PATTERN12 VARCHAR(1),                      -- パターン12
    PATTERN13 VARCHAR(1),                      -- パターン13
    PATTERN14 VARCHAR(1),                      -- パターン14
    PATTERN15 VARCHAR(1),                      -- パターン15
    PATTERN16 VARCHAR(1),                      -- パターン16
    PATTERN17 VARCHAR(1),                      -- パターン17
    PATTERN18 VARCHAR(1),                      -- パターン18
    PATTERN19 VARCHAR(1),                      -- パターン19
    PATTERN20 VARCHAR(1),                      -- パターン20
    PRIMARY KEY (CODE_ID, CODE_VALUE, LANG)
);

-- プロジェクトワーク
CREATE TABLE PROJECT_WORK (
    PROJECT_WORK_ID SERIAL PRIMARY KEY,               -- プロジェクト作業ID
    PROJECT_ID INTEGER,                               -- プロジェクトID
    PROJECT_NAME VARCHAR(128) NOT NULL,                   -- プロジェクト名 
    PROJECT_TYPE VARCHAR(2) NOT NULL,                   -- プロジェクト種別
    PROJECT_CLASS VARCHAR(2) NOT NULL,                   -- プロジェクト区分
    PROJECT_START_DATE DATE NOT NULL,                   -- プロジェクト開始日付
    PROJECT_END_DATE DATE NOT NULL,                     -- プロジェクト終了日付
    ORGANIZATION_ID INTEGER NOT NULL,                   -- 組織ID
    CLIENT_ID INTEGER NOT NULL,                        -- 顧客ID
    PROJECT_MANAGER VARCHAR(128) NOT NULL,             -- プロジェクトマネージャー
    PROJECT_LEADER VARCHAR(128) NOT NULL,             -- プロジェクトリーダー
    NOTE VARCHAR(512),                                -- 備考
    SALES INTEGER,                                     -- 売上高
);

-- メールテンプレート
CREATE TABLE MAIL_ATTACHED_FILE (
    MAIL_REQUEST_ID VARCHAR(10) NOT NULL,         -- メールテンプレートID
    SERIAL_NUMBER INTEGER NOT NULL,
    FILE_NAME VARCHAR(100),
    CONTENT_TYPE VARCHAR(30),
    ATTACHED_FILE BLOB,
    PRIMARY KEY (MAIL_REQUEST_ID, SERIAL_NUMBER),
    FOREIGN KEY (MAIL_REQUEST_ID) REFERENCES MAIL_REQUEST(MAIL_REQUEST_ID)
);

-- メール送信先
CREATE TABLE MAIL_RECIPIENT (
    MAIL_REQUEST_ID VARCHAR(20) NOT NULL,             -- メール送信要求ID
    SERIAL_NUMBER INTEGER NOT NULL,                   -- 連番
    RECIPIENT_TYPE VARCHAR(1),               -- 宛先区分
    MAIL_ADDRESS VARCHAR(256),               -- メールアドレス
    PRIMARY KEY (MAIL_REQUEST_ID, SERIAL_NUMBER)
);

-- バッチジョブ実行
CREATE TABLE BATCH_JOB_EXECUTION (
    JOB_EXECUTION_ID BIGINT PRIMARY KEY AUTO_INCREMENT, -- ジョブ実行ID
    VERSION BIGINT,                                   -- バージョン
    JOB_INSTANCE_ID BIGINT NOT NULL,                 -- ジョブインスタンスID
    CREATE_TIME TIMESTAMP NOT NULL,                   -- 作成日時
    START_TIME TIMESTAMP,                            -- 開始日時
    END_TIME TIMESTAMP,                              -- 終了日時
    STATUS VARCHAR(10),                              -- ステータス
    EXIT_CODE VARCHAR(2500),                         -- 終了コード
    EXIT_MESSAGE VARCHAR(2500),                      -- 終了メッセージ
    LAST_UPDATED TIMESTAMP                           -- 最終更新日時
    JOB_CONFIGURATION_LOCATION VARCHAR(2500)         -- ジョブ構成場所
    FOREIGN KEY (JOB_INSTANCE_ID) REFERENCES BATCH_JOB_INSTANCE(JOB_INSTANCE_ID)
);

-- バッチジョブインスタンス
CREATE TABLE BATCH_JOB_INSTANCE (
    JOB_INSTANCE_ID BIGINT PRIMARY KEY AUTO_INCREMENT, -- ジョブインスタンスID
    VERSION BIGINT,                                   -- バージョン
    JOB_NAME VARCHAR(100) NOT NULL,                  -- ジョブ名
    JOB_KEY VARCHAR(32) NOT NULL                     -- ジョブキー
);

-- バッチステップ実行
CREATE TABLE BATCH_STEP_EXECUTION (
    STEP_EXECUTION_ID SERIAL PRIMARY KEY,
    VERSION BIGINT NOT NULL,
    STEP_NAME VARCHAR(100) NOT NULL,
    JOB_EXECUTION_ID BIGINT NOT NULL,
    START_TIME TIMESTAMP,
    END_TIME TIMESTAMP,
    STATUS VARCHAR(10),
    COMMIT_COUNT BIGINT,
    READ_COUNT BIGINT,
    FILTER_COUNT BIGINT,
    WRITE_COUNT BIGINT,
    READ_SKIP_COUNT BIGINT,
    WRITE_SKIP_COUNT BIGINT,
    PROCESS_SKIP_COUNT BIGINT,
    ROLLBACK_COUNT BIGINT,
    EXIT_CODE VARCHAR(2500),
    EXIT_MESSAGE VARCHAR(2500),
    LAST_UPDATED TIMESTAMP,
    FOREIGN KEY (JOB_EXECUTION_ID) REFERENCES BATCH_JOB_EXECUTION(JOB_EXECUTION_ID)
);

-- バッチステップ実行コンテキスト
CREATE TABLE BATCH_STEP_EXECUTION_CONTEXT (
    STEP_EXECUTION_ID BIGINT NOT NULL PRIMARY KEY,
    SHORT_CONTEXT VARCHAR(2500) NOT NULL,
    SERIALIZED_CONTEXT TEXT,
    FOREIGN KEY (STEP_EXECUTION_ID) REFERENCES BATCH_STEP_EXECUTION(STEP_EXECUTION_ID)
);

-- 常駐バッチ状態管理
CREATE TABLE RESIDENT_BATCH_STATE (
    JOB_ID VARCHAR(20) PRIMARY KEY,                    -- ジョブID
    RUNNING BOOLEAN NOT NULL,                     -- フラグ
);

-- ユーザ別従事プロジェクト
CREATE TABLE USER_PROJECT (
    USER_ID INTEGER NOT NULL,                        -- ユーザID
    REQUEST_ID INTEGER NOT NULL,                     -- 要求ID
    FILE_NAME VARCHAR(50),
    CREATE_DATETIME TIMESTAMP,                        -- 作成日時
    EXPIRE_DATETIME TIMESTAMP,                          -- 有効期限
    PRIMARY KEY (USER_ID),
    FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID),
    FOREIGN KEY (REQUEST_ID) REFERENCES PROJECTS_BY_USER_REQUEST(ID)
);

-- ユーザ別従事プロジェクト作成要求
CREATE TABLE PROJECTS_BY_USER_REQUEST (
    ID SERIAL PRIMARY KEY,                   -- 要求ID
    STATUS VARCHAR(2) NOT NULL,              -- ステータス
    REQUEST_DATETIME TIMESTAMP,              -- 要求日時
    USER_ID INTEGER NOT NULL,                        -- ユーザID
    FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID)
);

-- Springセッション属性
CREATE TABLE SPRING_SESSION_ATTRIBUTES (
    SESSION_PRIMARY_ID CHAR(36) NOT NULL,                -- セッションプライマリーID
    ATTRIBUTE_NAME VARCHAR(200) NOT NULL,                -- 属性名
    ATTRIBUTE_BYTES BLOB NOT NULL,                       -- 属性値
    PRIMARY KEY (SESSION_PRIMARY_ID, ATTRIBUTE_NAME)
);

-- バッチジョブ実行パラメータ
CREATE TABLE BATCH_JOB_EXECUTION_PARAMS (
    JOB_EXECUTION_ID BIGINT NOT NULL,                   -- ジョブ実行ID
    TYPE_CD VARCHAR(6) NOT NULL,                        -- データ型
    KEY_NAME VARCHAR(100) NOT NULL,                     -- キー名
    STRING_VAL VARCHAR(250),                            -- 文字列値
    DATE_VAL TIMESTAMP,                                 -- 日時値
    LONG_VAL BIGINT,                                    -- 整数値
    DOUBLE_VAL DOUBLE,                                  -- 小数値
    IDENTIFYING CHAR(1) NOT NULL,                       -- 識別フラグ
    FOREIGN KEY (JOB_EXECUTION_ID) REFERENCES BATCH_JOB_EXECUTION(JOB_EXECUTION_ID) 
);

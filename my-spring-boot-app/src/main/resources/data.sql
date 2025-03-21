INSERT INTO healthcheck (status) VALUES ('OK');

INSERT INTO ORGANIZATION (ORGANIZATION_ID, ORGANIZATION_NAME, UPPER_ORGANIZATION) VALUES
(1, '事業部A', NULL),
(2, '事業部B', NULL),
(3, '部門A1', 1),
(4, '部門A2', 1),
(5, '部門B1', 2),
(6, '部門B2', 2);

INSERT INTO PROJECT (PROJECT_ID, PROJECT_NAME, PROJECT_TYPE, PROJECT_CLASS, PROJECT_START_DATE, PROJECT_END_DATE, ORGANIZATION_ID, CLIENT_ID, PROJECT_MANAGER, PROJECT_LEADER, NOTE, SALES, VERSION_NO) VALUES
(1, 'プロジェクトA', '01', '01', '2023-01-01', '2023-12-31', 1, 1, 'マネージャーA', 'リーダーA', '備考A', 1000000, 1),
(2, 'プロジェクトB', '02', '02', '2023-02-01', '2023-11-30', 2, 2, 'マネージャーB', 'リーダーB', '備考B', 2000000, 1);

INSERT INTO "USER" (USER_ID, KANJI_NAME, KANA_NAME, PM_FLAG) VALUES
(1, 'ユーザA', 'ユーザエー', TRUE),
(2, 'ユーザB', 'ユーザビー', FALSE);
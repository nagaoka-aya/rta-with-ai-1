# サンプルプロジェクト

## メッセージ設計書

### プロジェクト情報

| PJ名           | サンプルプロジェクト |
|----------------|----------------------|
| 作成           | TIS                  |
| 作成日         | 2019/05/16           |
| システム名     | サンプルシステム     |
| 変更           | TIS                  |
| 変更日         | 2022/11/24           |
| サブシステム名 | プロジェクト管理システム |

### 1. メッセージ設計(日本語)

| No. | メッセージID                              | メッセージ内容                                                                 | 備考 |
|-----|-------------------------------------------|------------------------------------------------------------------------------|------|
| 1   | errors.login                              | ログインに失敗しました。ログインIDまたはパスワードが誤っています。             |      |
| 2   | errors.nothing                            | 指定されたデータが存在しません。                                             |      |
| 3   | errors.nothing.search.project             | 条件に一致するプロジェクトがありません。                                     |      |
| 4   | errors.projectDownload.illegalState       | 不正な状態です。                                                             |      |
| 5   | errors.projectUpload.noFile               | ファイルが指定されていません。                                               |      |
| 6   | errors.projectUpload.emptyFile            | ファイルが空です。                                                           |      |
| 7   | errors.projectUpload.fileExceededMaxSize  | ファイルが500KBを超えています。                                              |      |
| 8   | errors.projectUpload.tempFileNotFound     | プロジェクト一括登録の要求に失敗しました。ファイルアップロードからやり直して下さい。 |      |
| 9   | validator.dateRange.message               | TOには、FROMより後の日付を入力して下さい。                                   |      |
| 10  | validator.priceRange.message              | TOには、FROMより大きな金額を入力して下さい。                                 |      |
| 11  | validator.periodConsistencyCheck.message.ProjectCreateForm | 終了日には、開始日より後の日付を入力して下さい。                             |      |
| 12  | validator.periodConsistencyCheck.message.ProjectUpdateForm | 終了日には、開始日より後の日付を入力して下さい。                             |      |

### bean validation message

| No. | メッセージID                                      | メッセージ内容                             | 備考 |
|-----|---------------------------------------------------|--------------------------------------------|------|
| 13  | nablarch.core.validation.ee.Required.message      | 入力してください。                         |      |
| 14  | nablarch.core.validation.ee.Domain.message        | 形式が正しくありません。                   |      |
| 15  | nablarch.core.validation.ee.Digits.integer.message | 数値を入力してください。                   |      |
| 16  | nablarch.core.validation.ee.Digits.fraction.message | 数値を入力してください。                   |      |
| 17  | nablarch.core.validation.ee.Digits.message        | 数値を入力してください。                   |      |
| 18  | nablarch.core.validation.ee.Length.min.message    | {min}文字以上の値を入力してください。       |      |
| 19  | nablarch.core.validation.ee.Length.max.message    | {max}文字以下の値を入力してください。       |      |
| 20  | nablarch.core.validation.ee.Length.min.max.message | {min}文字以上{max}文字以下の値を入力してください。 |      |
| 21  | nablarch.core.validation.ee.Length.fixed.message  | {min}文字の値を入力してください。           |      |
| 22  | nablarch.core.validation.ee.NumberRange.min.message | {min}以上の数値を入力してください。         |      |
| 23  | nablarch.core.validation.ee.NumberRange.max.message | {max}以下の数値を入力してください。         |      |
| 24  | nablarch.core.validation.ee.NumberRange.min.max.message | {min}以上{max}以下の数値を入力してください。 |      |
| 25  | nablarch.core.validation.ee.SystemChar.message    | 不正な文字種の値が指定されました。         |      |
| 26  | nablarch.common.code.validator.ee.CodeValue.message | 不正な値が指定されました。                 |      |

### 独自バリデーション

| No. | メッセージID                                                      | メッセージ内容                             | 備考 |
|-----|-------------------------------------------------------------------|--------------------------------------------|------|
| 27  | typeMismatch.java.util.Date                                       | 日付の形式が正しくありません。             |      |
| 28  | typeMismatch.java.lang.Integer                                    | 数値を入力してください。                   |      |
| 29  | com.nablarch.example.app.entity.core.validation.validator.MoneyRange.message | {min}円から{max}円の範囲で入力してください。 |      |
| 30  | domainType.projectName.message                                    | プロジェクト名は128文字以下の全角文字で入力してください。 |      |
| 31  | domainType.userName.message                                       | 氏名は128文字以下の全角文字で入力してください。 |      |
| 32  | domainType.note.message                                           | 備考は512文字以下のシステム許容文字で入力してください。 |      |

### Spring Security

| No. | メッセージID                                                      | メッセージ内容                             | 備考 |
|-----|-------------------------------------------------------------------|--------------------------------------------|------|
| 33  | AbstractUserDetailsAuthenticationProvider.badCredentials          | ユーザ名かパスワードが正しくありません     |      |
| 34  | AbstractUserDetailsAuthenticationProvider.credentialsExpired      | ユーザ認証情報の有効期限が切れています     |      |
| 35  | AbstractUserDetailsAuthenticationProvider.expired                 | ユーザアカウントの有効期限が切れています   |      |
| 36  | AbstractUserDetailsAuthenticationProvider.locked                  | ユーザアカウントがロックされています       |      |
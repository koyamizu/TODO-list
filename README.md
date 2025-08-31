# アプリケーション名
TODOリスト
# 概要
職業訓練校のメンバー4人で作成いたしました。
## 使用技術
* Java (17)
* Spring Boot (3.5.4)
* MyBatis
* H2 Database
* Bootstrap (3.3.7)
# URLパス
|No|役割|URL|HTTPメソッド|
|---|---|---|---|
|1|TODO一覧を表示|/todos|GET|
|2|TODO詳細ページ表示|/todos/{todo_id}|GET|
|3|TODO新規作成ページ表示|/todos/form|GET|
|4|TODO編集ページ表示|/todos/edit/{todo_id}|GET|
|5|TODO新規作成処理|/todos/save|POST|
|6|TODO編集処理|/todos/update|POST|
|7|TODO削除処理|/todos/delete/{todo_id}|POST|
# 画面一覧
タイトルをクリックすると、詳細画面に遷移します。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 16 28 10" src="https://github.com/user-attachments/assets/9315eb38-2620-428a-8d36-2a8dce28c1f1" />
詳細ページです。編集をしてみます。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 16 29 22" src="https://github.com/user-attachments/assets/c78461d1-ef6b-4aa5-bc22-1dd861dd57cf" />
日付を9/1に変更して更新。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 16 25 20" src="https://github.com/user-attachments/assets/1199e9b1-84a7-43f3-a9c3-eb7f66976ef7" />
更新されました。TODOリストは日付の昇順に表示されます。次に、今更新したものを削除してみます。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 16 28 24" src="https://github.com/user-attachments/assets/232bc4d1-efa7-4224-af1b-12bbdc5b7873" />
削除しました。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 15 53 34" src="https://github.com/user-attachments/assets/33bb205d-25bd-43bb-a6a3-07f14fcf3fde" />
新規作成画面です。何も入力せずに「作成」を押します。
<img width="1287" height="866" alt="image" src="https://github.com/user-attachments/assets/982029ef-8d16-4a7a-bcf4-ffe4c6f3c99c" />
入力エラーが表示されます。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 15 53 43" src="https://github.com/user-attachments/assets/783091c7-2086-4ca6-8b70-83585beddbc2" />
日付を今日より前に設定してもエラーが出ます。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 15 54 39" src="https://github.com/user-attachments/assets/a5d32983-7662-4c5b-8585-f3718883837d" />
正しい日付を入力して「作成」を押すと、追加できたことが確認できます。
<img width="1287" height="866" alt="スクリーンショット 2025-08-29 15 54 49" src="https://github.com/user-attachments/assets/892f0681-843c-4dab-bdad-b0937b6a98c0" />

todolist_Scala
==============
Play framework 2.2.1 tutorial

## 参考

* [初めての Play アプリケーション (2.1.5)](http://www.playframework-ja.org/documentation/2.1.5/ScalaTodoList)
* [Your first Play application (2.2.x)](http://www.playframework.com/documentation/2.2.x/ScalaTodoList)

## ハマったところ

* **フォーム投稿処理** まで終わった後に、実際にフォームに値を入れて submit しても、なぜかタスク一覧に追加されない(^p^)
    * Application.scala の newTask を実装していないので当たり前
* **データベース内のタスクを永続化する** で Evolutions Script を作成した後に画面をリロードしても、Evolution の警告表示が出ない(^p^)
    * DB.withConnection の処理まで書いた後に画面を更新したら警告が出た（チュートリアルと順番が違う）
* import.anorm._ って書いたらそんなものは無えとIDEでエラー(^q^)
    * build.sbt に依存関係を書かないとダメ（チュートリアルには書いてないっぽいぽい）
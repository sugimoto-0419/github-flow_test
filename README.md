# github-flow_test

GitHub flowの練習用リポジトリ

## 手順

1. ブランチを作る
1. ファイルを編集
1. 不具合がなければコミット、プッシュする
1. プルリクエストを送る
1. レビューしてもらう
1. 何にもなければマージする
1. ブランチを削除する
1. ローカルにプルする

## おすすめ VScode 拡張機能

1. [Git Graph](https://marketplace.visualstudio.com/items?itemName=mhutchie.git-graph)
1. [GitHub Pull Requests and Issues](https://marketplace.visualstudio.com/items?itemName=GitHub.vscode-pull-request-github)
1. [GitLens — Git supercharged](https://marketplace.visualstudio.com/items?itemName=eamodio.gitlens)

GitHub Pull Requests and Issuesは、VScodeからプルリクエストを送ることと、マージすることができる。

## コマンドでGitを操作するための基本コマンド一覧

### 実務でよく使うコマンド

#### *＞リモートリポジトリをローカルにクローンする*

`git clone`コマンドで、開発リポジトリをローカルに取得します。  
ディレクトリ名は、「project」とします。

```shell
git clone https://github.com/west-hiroaki/git-test-for-qiita.git project
```

このコマンドは、HTTPSでクローンする場合です。  
SSHでクローンする場合は、[ここ](https://qiita.com/dorara/items/942485e064f3e2bdd4f7)を参照してください。

#### *＞ブランチを確認する*

`git branch -a`コマンドで、ブランチ状態を確認しておきます。  
`-a`パラメータを付けないとローカルブランチのみですが、付けるとリモートブランチも確認できます。  
リモートには、「master」ブランチがあることが分かります。

```shell
git branch -a
```

```shell
* master
  remotes/origin/master
```

#### *＞ブランチを作成する*

`git checkout -b`コマンドで、「master」ブランチから派生させた開発ブランチ「feature/add-image」をローカルに作成します。

```shell
git checkout -b feature/add-image remotes/origin/master
```

```shell
Branch 'feature/add-image' set up to track remote branch 'master' from 'origin'.
Switched to a new branch 'feature/add-image'
```

>この例だと、明示的に派生元ブランチを指定していますが、省略すると現在のブランチから派生されます。

作成と同時に、アクティブブランチが作成した開発ブランチに切り替わっています。  
ローカルブランチを確認すると、「feature/add-image」ブランチに切り替わっているのが分かります。

```shell
git branch -a

* feature/add-image
  master
  remotes/origin/master
```

#### *＞修正したファイル差分を確認する*

`git diff`コマンドで、修正したファイル差分を確認します。  
追加した内容が間違っていないことを確認します。

```shell
git diff index.html
```

```shell
diff --git a/index.html b/index.html
index 08b06f9..830abe4 100644
--- a/index.html
+++ b/index.html
@@ -9,5 +9,6 @@
     <hr>
     <p>github hello!!</p>
     <button>click!</button>
+    <img src="images/github.png" alt="github-logo">
 </body>
 </html>
```

#### 参考サイト

[実務でどんな git コマンドを使っているか振り返ってみる](https://qiita.com/west-hiroaki/items/74cccbc22b2cc7a4aacb)

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

***＞リモートリポジトリをローカルにクローンする***  
`git clone`コマンドで、開発リポジトリをローカルに取得します。  
ディレクトリ名は、「project」とします。

```shell
git clone https://github.com/west-hiroaki/git-test-for-qiita.git project
```

このコマンドは、HTTPSでクローンする場合です。
SSHでクローンする場合は、[ここ](https://qiita.com/dorara/items/942485e064f3e2bdd4f7)を参照してください。

#### 参考サイト

[実務でどんな git コマンドを使っているか振り返ってみる](https://qiita.com/west-hiroaki/items/74cccbc22b2cc7a4aacb)

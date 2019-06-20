---
marp: true
title: Docker
theme: default
paginate: true
footer: ソフトウェア工学　2019年度版
---

<style>
section {
    width: 960px;
    height: 720px;
    font-size: 20pt;
}
em {
    font-style: normal;
    color: purple;
}
strong {
    font-style: normal;
    color: red;
}
img[alt~="center"] {
  display: block;
  margin: 0 auto;
}
</style>

# Docker での利用方法

---

## Docker とは

Docker社が開発しているコンテナ型の仮想環境を作成・配布・実行するためのプラットフォームです．

https://www.docker.com/what-docker

---

## Dockerの仮想環境

- 仮想環境：OS上で別のOSを実行する
	- 例：VirtualBox, VMware, etc.
- コンテナ型の仮想環境
	- ホストマシンのカーネルを利用し，プロセスやユーザなどを隔離することで別のマシンが動いているかのように動かす
	- 軽量かつ高速
	- Dockerでは Linux のコンテナ技術を利用

---

## Dockerの特徴

- Infrastracture as Code
	- インストールや各種環境設定をコード化して管理
- コード化されたファイルを共有することで同じ環境が作れる
- 単なるコードなので環境を配布しやすい
- スクラップ＆ビルドが容易
- 今後（既に？）ソフトウェア開発現場で多く利用される

---

## Docker のインストール

- 注意事項
	- Dockerhub のユーザ登録が必要になる場合があります．
	- PCのスペックによっては全体的に重たくなる場合があります．
	- インストールは*自己責任*で行ってください．インストールしたことによるPCの不調，不具合等については責任を負いません．

---

### Windows 10

- http://www.atmarkit.co.jp/ait/articles/1609/01/news053.html
- [Qiitaの記事](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&ved=0ahUKEwik--32w8DbAhVIfbwKHeQ7BaQQFggoMAA&url=https%3A%2F%2Fqiita.com%2Fchr%2Fitems%2F184b6af37d105bdad145&usg=AOvVaw0rZUIlwJ01vYWJORtitN05)
	- 上記記事の「docker-composeを使ってnginxからローカルのファイルを表示する」の手前まで

### Windows 10 以前

- できれば Windows 10 にしてからインストールしてください．

### MacOSX

- [Qiitaの記事](https://qiita.com/hogehoge1234/items/7c73be819295d183aa5b)

---

<style scoped>
section {
    font-size: 17pt;
}
</style>

## 授業環境の利用

※Windows については私の手元にマシンがないので未検証です．必要があれば適宜読み替えてください

1. ターミナル（Windows の場合は PowerShell?）から以下のコマンドを実行します．
```
docker run --rm -it -h c9host -p 8000:8000 -p 8888:8888 \
  -v myvolume:/home/c9user -e PM2PORT=8000 -e PM2PASSWORD=pm2 \
  -e C9USER=c9user  -e C9UID=1000 -e C9PASSWORD=c9user \
  -e C9HOME=/home/c9user -e C9GROUP=c9user -e C9GID=1000 \
  -e C9PORT=8888  -t okamumu/c9-exp
```
ここで C9USER, C9PASSWORD, C9PORT はそれぞれユーザ名，パスワード，アクセスポート．これを実行して http://localhost:8888 にアクセス（C9PROT=8888とした場合）するとユーザ名とパスワードを尋ねられるので C9USER, C9PASSWORD で設定した値を入力します．

上記のコマンドはユーザデータを格納するため myvolume を作成しています（ユーザデータの永続化）．

---

## Docker の停止

- Cloud9 on Docker を終了する場合は，`docker run` を実行したターミナルで Ctrl+C をします．


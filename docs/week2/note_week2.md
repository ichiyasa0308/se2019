<!-- footer: ソフトウェア工学　2018年度版　第2週-->
<!-- page_number: true -->
<!-- $size: A4 -->

1. 構造化設計／言語とはどのような特徴があるかまとめよ

2. オブジェクト指向設計／言語とはどのような特徴があるかまとめよ

3. C言語，Java 以外の 4 つ以上のプログラミング言語を挙げて「オブジェクト指向」のスタイルでかけるかどうか調査せよ．

4. オブジェクト指向における以下の概念を簡潔に説明せよ．
- カプセル化
- 継承（インヘリタンス）
- 多態性（ポリモフィズム）

5. Java言語で以下の FizzBuzz 問題をプログラミングせよ．

- 1から100まで順番に数字または指定の文字列を出力する
- 3の倍数の時は `Fizz`, 5の倍数の時は `Buzz`, 3の倍数かつ5の倍数の時は`FizzBuzz` と出力する．
- 上記以外の場合は数字を出力する．

```
1
2
Fizz
4
Buzz
...中略...
98
Fizz
Buzz
```

プログラムソースを以下に記述
```java
class FizzBuzz {
  public static void main(String[] args) {
    for (int x=1; x<=100; x++) {
      // 表示処理など
    }
  }
}
```

プログラムソースを以下に記述（関数を使ったもの）
```java
class FizzBuzz {
  /**
    * 数値xを入力として FizzBuzz 文字列を返す．
    * 3の倍数ならFizz, 5の倍数ならBuzz, 3かつ5の倍数なら FizzBuzz, 
    * それ以外は数値を文字列にしたものを返す．
    * TODO: 数値から文字列への変換を調べる
    */
  static String int getFizzBuzzString(int x) {
    // 処理を記述
  }

  // main は改変しないでください
  public static void main(String[] args) {
    for (int x=1; x<=100; x++) {
      System.out.println(getFizzBuzzString(x));
    }
  }
}
```

6. `参照型変数（その２）` での出力予想と，なぜそのような出力になるかその理由を記述せよ．

出力予測：

理由：

7. 以下のプログラムを作成せよ．

- 学生クラス（class Students）で「学生番号を聞く」メソッド（getID）を作成せよ．
- 属性として，講義名（String），担当教員名（String）をもつ，授業クラス（class Lectures）を作成して，「講義名を聞く」（getLectureName），「担当教員名を聞く」（getTeacherName）メソッドを作成せよ．

```java
class Students {
  // 実装
}

class Lectures {
  // 実装
}

class Test {
  public static void main(String[] args) {
    Students[] students = new Students[2];
    Lectures[] lectures = new Lectures[6];

    students[0] = new Students("田中", "b1234567");
    students[1] = new Students("山田", "b1234568");

    lectures[0] = new Lectures("ソフトウェア工学", "岡村");
    lectures[1] = new Lectures("確率論基礎", "土肥");
    lectures[2] = new Lectures("プログラミング１", "亀井");
    lectures[3] = new Lectures("線形代数学１", "栗田");
    lectures[4] = new Lectures("微分積分学１", "向谷");
    lectures[5] = new Lectures("離散数学１", "今井");
    for (int i=0; i<students.length; i++) {
      System.out.println("私の名前は" + students[i].getName() + "です．学生番号は" + students[i].getID() + "です");
    }
    for (int i=0; i<lectures.length; i++) {
      System.out.println(lectures[i].getLectureName() + "の担当は" + lectures[i].getTeachearName() + "です");
    }
  }
}
```

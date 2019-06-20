class StaticTest {
  int x = 2;

  public static int getOne() {
    // 以下はNG: static 関数で non-static 変数を参照してはいけない
    return x;
  }

  public int getTwo() {
    return x;
  }
}

class Test {
  public static void main(String[] args) {
    StaticTest.getOne(); // OK
    // 以下はNG: non-static 変数は new してから呼び出す
    StaticTest.getTwo();
    StaticTest s = new StaticTest();
    s.getOne(); // OK
    s.getTwo(); // OK
  }
}
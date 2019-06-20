class Student {
  String name;
  String id;

  String getName() {
    return name;
  }
}

class Test {
  public static void main(String[] args) {
    Student a, b;
    a = new Student(); // 田中オブジェクトを作成
    b = new Student(); // 山田オブジェクトを作成
    System.out.println(a.getName()); // 田中オブジェクトのメソッドを実行して表示
    System.out.println(b.getName()); // 山田オブジェクトのメソッドを実行して表示
  }
}

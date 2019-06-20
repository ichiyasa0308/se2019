class Student {
  String name;
  String id;

  String getName() {
    return name;
  }

  void setName(String nm) {
    name = nm; // 名前をセットする操作を追加
  }
}

class Test {
  public static void main(String[] args) {
    Students a, b;
    a = new Student(); // 田中オブジェクトを作成
    b = new Student(); // 山田オブジェクトを作成
    a.setName("田中"); // 田中オブジェクトのメソッドを実行
    System.out.println(a.getName());
    System.out.println(b.getName());
  }
}

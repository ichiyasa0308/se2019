class Student {
  String name;
  String id;

  Student(String nm, String i) { // 引数二つ
    name = nm;
    id = i;
  }

  String getName() {
    return name;
  }
}

class Test {
  public static void main(String[] args) {
    Students a, b;
    a = new Student("田中", "b1234567"); // 田中オブジェクトを作成
    b = new Student("山田", "b1234568"); // 山田オブジェクトを作成
    System.out.println(a.getName());
    System.out.println(b.getName());
  }
}

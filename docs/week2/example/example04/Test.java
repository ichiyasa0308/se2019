class Student {
  String name; // 氏名
  String id; // 学生番号
}

class Test { // 実行するためのクラス
  public static void main(String[] args) {
    Student a, b; // Studentsクラスを参照する変数 a, b を定義
    a = new Student(); // 田中オブジェクトを作成
    b = new Student(); // 山田オブジェクトを作成
  }
}
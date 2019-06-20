class Student {
  // 実装
}

class Lecture {
  // 実装
}

class Test {
  public static void main(String[] args) {
    Student[] students = new Student[2];
    Lecture[] lectures = new Lecture[6];

    students[0] = new Student("田中", "b1234567");
    students[1] = new Student("山田", "b1234568");

    lectures[0] = new Lecture("ソフトウェア工学", "岡村");
    lectures[1] = new Lecture("確率論基礎", "土肥");
    lectures[2] = new Lecture("プログラミング１", "亀井");
    lectures[3] = new Lecture("線形代数学１", "栗田");
    lectures[4] = new Lecture("微分積分学１", "向谷");
    lectures[5] = new Lecture("離散数学１", "今井");
    for (int i=0; i<students.length; i++) {
      System.out.println("私の名前は" + students[i].getName() + "です．学生番号は" + students[i].getID() + "です");
    }
    for (int i=0; i<lectures.length; i++) {
      System.out.println(lectures[i].getLectureName() + "の担当は" + lectures[i].getTeacherName() + "です");
    }
  }
}
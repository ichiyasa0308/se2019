class Student {
  String name;
  String id;

  Student(String nm, String i) {
    name = nm;
    id = i;
  }

  String getName() {
    return name;
  }
}

class Test {
  public static void main(String[] args) {
    Student a = new Student("田中", "b1234567");
    Student b = new Student("山田", "b1234568");
    Student c = a;
    a = b;
    b = c;
    System.out.println(a.getName());
    System.out.println(b.getName());
    System.out.println(c.getName());
  }
}
package thisex;

class Person {
  String name;
  int age;
  
  Person( ) {
	this("�̸� ����", 1);
  }

public Person(String string, int i) {
}

void Person1(String name, int age) {
  this.name = name;
  this.age = age;
}
}

public class CallAnotherConst {
  public static void main(String[] args) {
	 Person noName = new Person( );
	 System.out.println(noName.name);
	 System.out.println(noName.age);
  }
}

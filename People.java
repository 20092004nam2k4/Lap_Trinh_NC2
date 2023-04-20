package thuhanh.ConNguoi;

public abstract class People {
  private String name;
  private int age;
  private boolean gender;


  public People(String name , int age , boolean gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  public abstract void Eat();
  public abstract void sleep();


  public abstract void Sleep();
}

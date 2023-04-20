package thuhanh.ConNguoi;

class StutentImpl extends People implements Student{

  public StutentImpl(String name, int age, boolean gender) {
    super(name, age, gender);
  }

  @Override
  public void Eat(){
//    System.out.println ("ăn");
  }
  @Override
  public void Sleep() {

  }
  @Override
  public void sleep() {
    System.out.println ("ngủ");
  }



  @Override
  public void registerCourse(String course) {
    System.out.println ("đăng ký khóa học" );
  }


  @Override
  public void attendClass() {
    System.out.println ("tham gia lớp học");
  }




}

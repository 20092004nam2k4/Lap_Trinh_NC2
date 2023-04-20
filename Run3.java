package thuhanh.ConNguoi;

public class Run3 {
  public static void main(String[] args) {
    StutentImpl stutent = new StutentImpl ("NAM",18,true);
    stutent.Eat ();
    stutent.sleep ();
    stutent.registerCourse ("Programming Node JS");
    stutent.attendClass ();

  }
}

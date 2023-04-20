package thuhanh.DienThoai;

public class Run1 {
  public static void main(String[] args) {
    Mobile [] mobile = new Mobile[2];
    mobile[0] = new Iphone ();
    mobile[1] = new Nokia ();
    for (Mobile go: mobile) {
      System.out.println (go.DownloadApp ());
    }
  }
}

import java.util.Vector;

public class ArrayListDemo {

  public static void main(String[] args) {

    Vector al = new Vector();
    System.out.println("Inisialisasi ukuran ArrayList :  " + al.size());

    //Menambah element ke dalam array list
    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    al.add(1,"A2");//Memasukan objek A2 dalam array pada indek ke 1

    System.out.println("Ukuran setelah penambahan " + al.size());

    //Menampilkan Array List
    System.out.println("Isi Array List: " +  al );

    //Menghapus element dalam array list
    al.remove("F");
    al.remove(2);

    System.out.println("Ukuran setelah penghapusan : " + al.size());
    System.out.println("Isi Array List:" + al);

  }

}
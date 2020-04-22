public class Main {
    public static void main(String[] args) {
      //  int isiGelas = 0;
        // int penuh = 225;

       // System.out.println("Isi Gelas : " + isiGelas + "ml");
       // System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

       // while(isiGelas != penuh){
          //  isiGelas++;
          //  System.out.println("Sedang Mengisi Gelas..");
          //  System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
      //  }

       // System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "ml");

     //   int isiGelas = 0;
     //   int penuh = 225;

     //   System.out.println("Isi Gelas : " + isiGelas + "ml");
     //   System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

     //   do {
     //       isiGelas++;
     //       System.out.println("Sedang Mengisi Gelas..");
     //       System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
     //   }while(isiGelas != penuh);

     //   System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "ml");

             int isiGelas = 0;
             int penuh = 225;

             System.out.println("Isi Gelas : " + isiGelas + "ml");
             System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

             for(isiGelas = 0 ; isiGelas <= penuh ; isiGelas++){
                 System.out.println("Sedang Mengisi Gelas..");
                 System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
             };

             System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "ml");

             int nilaiArr[] = {40,55,63,17,22,68,89,97,89};
             System.out.println(nilaiArr.length);
             System.out.println(nilaiArr[0]);
             System.out.println(nilaiArr[8]);

             String mataKuliah[];
             mataKuliah = new String[10];

             mataKuliah[0] = "Pemrograman Berbasis Objek 1";
             mataKuliah[1] = "Visual 2";
             mataKuliah[2] = "Rekayasa Perangkat Lunak";
             mataKuliah[3] = "Organisasi Komputer";
             mataKuliah[4] = "Pemrograman Web 2";


    }
}

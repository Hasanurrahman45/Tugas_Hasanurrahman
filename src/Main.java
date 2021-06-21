public class Main {
    public static void main(String[] args) {
        String namaDepan = "Hasanur";
        String namaTengah = "Rahman";
        String namaBelakang = "19630404";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.900;

        System.out.println(namaDepan);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan +" "+ namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap);
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(uniskaString.indexOf("NIS"));
        System.out.println(namaLengkap.substring(8));
        System.out.println(namaLengkap.substring(8,12));
        System.out.println(namaLengkap.replace("Yog", "Barr"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split( " ");

        for(String nama : namaArray)
            System.out.println(nama);

    }
}
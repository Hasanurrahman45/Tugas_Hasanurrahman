package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataMahasiswa {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm("19630404");
        mahasiswa.setNama("Hasanurrahman");
        mahasiswa.setTanggalLahir(simpleDateFormat.parse("21-03-2000"));

        System.out.println("Npm \t\t\t : " + mahasiswa.getNpm());
        System.out.println("Nama \t\t\t : " + mahasiswa.getNama());
        System.out.println("Tanggal Lahir \t : " + mahasiswa.getTanggalLahir());

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNpm("19638888");
        mahasiswa2.setNama("Puspa");
        mahasiswa2.setTanggalLahir(simpleDateFormat.parse("08-08-2008"));

        System.out.println("Npm \t\t\t : " + mahasiswa2.getNpm());
        System.out.println("Nama \t\t\t : " + mahasiswa2.getNama());
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.getTanggalLahir()));

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.setNpm("19630406");
        mahasiswa3.setNama("Erpan");
        mahasiswa3.setTanggalLahir(simpleDateFormat.parse("21-02-2000"));

        System.out.println("Npm \t\t\t : " + mahasiswa.getNpm());
        System.out.println("Nama \t\t\t : " + mahasiswa.getNama());
        System.out.println("Tanggal Lahir \t : " + mahasiswa.getTanggalLahir());

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa m = new Mahasiswa("19630405","Puspa", new Date());
        m.tampilkanAtribut();

    }
}

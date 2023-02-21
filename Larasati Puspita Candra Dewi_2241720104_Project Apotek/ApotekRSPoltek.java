import java.util.Scanner;
import java.util.Date;

public class ApotekRSPoltek {
    static void login(String user, String pass) {
        Scanner sc = new Scanner(System.in);
        if (user.equals("admin") && pass.equals("poltek")) {
            System.out.println("Login success!");
        } else {
            System.out.println("Username/Password anda salah, Isi kembali!");
            System.out.print("Masukkan operator: ");
            user = sc.nextLine();
            System.out.print("Masukkan password: ");
            pass = sc.nextLine();
            login(user, pass);

        }
    }

    static void tampilStok(int dataObat[][], String namaObat[], String expObat[]) {
        System.out.println("======================================================================");
        System.out.println("\t\t\t" + "Data Obat Apotik RS.Poltek");
        System.out.println("======================================================================");
        System.out.print("Nama Obat" + "\t\t" + "Exp" + "\t\t\t" + "Qty" + "\t\t" + "Harga");
        System.out.println();
        int x = namaObat.length - 3;
        for (int i = 0; i < x ; i++) {
            System.out.print(namaObat[i] + "\t\t" + expObat[i] + "\t\t");
            for (int j = 0; j < dataObat[0].length; j++) {
                System.out.print(dataObat[i][j] + "\t\t");
            }
            ;
            System.out.println();
        }
    }

    static void tambahStok(int dataObat[][], String namaObat[], String expObat[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jenis obat: ");
        int jenisObat = sc.nextInt();
        for (int i = 0; i < (jenisObat); i++) {
            System.out.println("------------------------");
            System.out.println("Masukkan data obat ke-" + (i + 1));
            System.out.print("Masukkan nama obat: ");
            namaObat[(i + 3)] = sc.next();
            if ((namaObat[(i + 3)].equalsIgnoreCase(namaObat[0]))|| (namaObat[(i + 3)].equalsIgnoreCase(namaObat[1])) 
            ||(namaObat[(i + 3)].equalsIgnoreCase(namaObat[2]))) {
                System.out.println("Data Obat [Amoxilin, Intrizin, Depakote] sudah ada!");
                System.out.print("Masukkan nama obat: ");
                namaObat[(i + 3)] = sc.next();
            }
            System.out.print("Masukkan exp obat: ");
            expObat[(i + 3)] = sc.next();
            for (int j = 0; j < dataObat[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan stok obat: ");
                        dataObat[(i + 3)][j] = sc.nextInt();
                        break;
                    case 1:
                        System.out.print("Masukkan harga: ");
                        dataObat[(i + 3)][j] = sc.nextInt();
                        break;
                }
            }
        }
        tampilStok(dataObat, namaObat, expObat);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, submenu, jenisObat = 0;
        double pot = 0, totalBayar = 0, admin = 0, dibayar = 0, kembalian = 0, disMember = 0, kartuMember = 0;
        String operator = "", password = "", kode = "", pilihMember;
        boolean ulangi = true;
        boolean struk = true;
        String konfirm, konfirm2;
        String[] kodeMember = new String[3];
        kodeMember[0] = "Regular_Poltek";
        kodeMember[1] = "Platinum_Poltek";
        kodeMember[2] = "Gold_Poltek";
        String[] obat = new String[99];
        int beliObat[][] = new int[5][2];
        int dataObat[][] = new int[99][2];
        dataObat[0][0] = 3;
        dataObat[0][1] = 20000;
        dataObat[1][0] = 4;
        dataObat[1][1] = 15000;
        dataObat[2][0] = 4;
        dataObat[2][1] = 25000;
        String[] namaObat = new String[10];
        namaObat[0] = "Amoxilin";
        namaObat[1] = "Intrizin";
        namaObat[2] = "Depakote";
        String[] expObat = new String[99];
        expObat[0] = "22/02/22";
        expObat[1] = "23/03/22";
        expObat[2] = "24/04/22";
        Date date = new Date();
        System.out.print("Masukkan operator: ");
        operator = sc.nextLine();
        System.out.print("Masukkan password: ");
        password = sc.nextLine();
        login(operator, password);

        while (ulangi == true) {
            System.out.print("Apakah yang ingin anda lakukan? (1) Stok Obat atau (2) Transaksi ? ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Pilih submenu? (1) Tampil Stok Obat atau (2) Tambah Stok Obat ? ");
                submenu = sc.nextInt();
                if (submenu == 1) {
                    tampilStok(dataObat, namaObat, expObat, jenisObat);
                } else if (submenu == 2) {

                    tambahStok(dataObat, namaObat, expObat);
                }
            } else if (menu == 2) {
                System.out.print("Masukkan jenis pembeli/pasien [umum/bpjs/asuransi]: ");
                String jenisPasien = sc.next();
                System.out.print("Apakah anda mempunyai kartu member? [true/false]:");
                konfirm = sc.next();
                if (konfirm.equals("true")) {
                    System.out.print("Masukkan kode member: ");
                    kode = sc.next();
                    if (kode.equalsIgnoreCase(kodeMember[0])) {
                        System.out.println("Anda terdaftar member regular!");
                        disMember = 2000;
                    } else if (kode.equalsIgnoreCase(kodeMember[1])) {
                        System.out.println("Anda terdaftar member platinum!");
                        disMember = 3000;
                    } else if (kode.equalsIgnoreCase(kodeMember[2])) {
                        System.out.println("Anda terdaftar member gold!");
                        disMember = 4000;
                    } else {
                        System.out.println("Anda tidak terdatar member!");
                        
                    }
                } else if (konfirm.equals("false")) {
                    System.out.print("Apakah anda ingin mendaftar member? [true/false]:");
                    konfirm2 = sc.next();
                    if (konfirm2.equalsIgnoreCase("true")) {
                        System.out.println("Biaya Pembuatan Member ==> Regular:10000, Platinum:11000, Gold:12000");
                        System.out.print("Pilih jenis member [Regular, Platinum, Gold]:");
                        pilihMember = sc.next();
                        if (pilihMember.equalsIgnoreCase("Regular")) {
                            System.out.println(
                                    "Anda kini terdaftar sebagai member RS.Poltek dengan kode Member [Regular_Poltek]");
                            kartuMember = 10000;
                        } else if (pilihMember.equalsIgnoreCase("Platinum")) {
                            System.out.println(
                                    "Anda kini terdaftar sebagai member RS.Poltek dengan kode Member [Platinum_Poltek]");
                            kartuMember = 11000;
                        } else if (pilihMember.equalsIgnoreCase("Gold")) {
                            System.out.println(
                                    "Anda kini terdaftar sebagai member RS.Poltek dengan kode Member [Gold_Poltek]");
                            kartuMember = 12000;
                        }
                    }
                }
                System.out.print("Masukkan nama pembeli/pasien: ");
                String namaPasien = sc.next();
                System.out.print("Masukkan jumlah resep/jenis obat :");
                int resep = sc.nextInt();
                int subtotal = 0, total = 0;
                for (int i = 0; i < resep; i++) {
                    System.out.println("------------------------");
                    System.out.println("Jenis obat ke-" + (i + 1));
                    System.out.print("Masukkan nama obat: ");
                    obat[i] = sc.next();
                    if (obat[i].equalsIgnoreCase("Amoxilin")) {
                        if (dataObat[0][0] == 0) {
                            System.out.println("Stok Obat Habis!");
                            System.out.print("Masukkan nama obat: ");
                            obat[i] = sc.next();
                        }
                    } else if (obat[i].equalsIgnoreCase("Intrizin")) {
                        if (dataObat[1][0] == 0) {
                            System.out.println("Stok Obat Habis!");
                            System.out.print("Masukkan nama obat: ");
                            obat[i] = sc.next();
                        }
                    } else if (obat[i].equalsIgnoreCase("Depakote")) {
                        if (dataObat[2][0] == 0) {
                            System.out.println("Stok Obat Habis!");
                            System.out.print("Masukkan nama obat: ");
                            obat[i] = sc.next();
                        }
                    } else if (obat[i].equalsIgnoreCase("Cetarizin")) {
                        if (dataObat[3][0] == 0) {
                            System.out.println("Stok Obat Habis!");
                            System.out.print("Masukkan nama obat: ");
                            obat[i] = sc.next();
                        }
                    }else if (obat[i].equalsIgnoreCase("Paramexs")) {
                        if (dataObat[4][0] == 0) {
                            System.out.println("Stok Obat Habis!");
                            System.out.print("Masukkan nama obat: ");
                            obat[i] = sc.next();
                        }
                    }
                    for (int j = 0; j < beliObat[0].length; j++) {
                        switch (j) {
                            case 0:
                                System.out.print("Masukkan jumlah obat: ");
                                beliObat[i][j] = sc.nextInt();
                                if (obat[i].equalsIgnoreCase("Amoxilin")) {
                                    if (beliObat[0][0] > dataObat[0][0]) {
                                        System.out.println("Stok Obat Hanya " + dataObat[0][0]);
                                        System.out.print("Masukkan jumlah obat: ");
                                        beliObat[i][j] = sc.nextInt();
                                        dataObat[0][0] -= beliObat[0][0];
                                    } else {
                                        dataObat[0][0] -= beliObat[0][0];
                                    }

                                } else if (obat[i].equalsIgnoreCase("Intrizin")) {
                                    if (beliObat[0][0] > dataObat[1][0]) {
                                        System.out.println("Stok Obat Hanya " + dataObat[1][0]);
                                        System.out.print("Masukkan jumlah obat: ");
                                        beliObat[i][j] = sc.nextInt();
                                        dataObat[1][0] -= beliObat[0][0];
                                    } else {
                                        dataObat[1][0] -= beliObat[0][0];
                                    }
                                } else if (obat[i].equalsIgnoreCase("Depakote")) {
                                    if (beliObat[0][0] > dataObat[2][0]) {
                                        System.out.println("Stok Obat Hanya " + dataObat[2][0]);
                                        System.out.print("Masukkan jumlah obat: ");
                                        beliObat[i][j] = sc.nextInt();
                                        dataObat[2][0] -= beliObat[0][0];
                                    } else {
                                        dataObat[2][0] -= beliObat[0][0];
                                    }
                                } else if (obat[i].equalsIgnoreCase("Cetarizin")){
                                    if (beliObat[0][0] > dataObat[3][0]) {
                                        System.out.println("Stok Obat Hanya " + dataObat[3][0]);
                                        System.out.print("Masukkan jumlah obat: ");
                                        beliObat[i][j] = sc.nextInt();
                                        dataObat[3][0] -= beliObat[0][0];
                                    } else {
                                        dataObat[3][0] -= beliObat[0][0];
                                    }
                                }else if(obat[i].equalsIgnoreCase("Paramexs")){
                                    if (beliObat[0][0] > dataObat[4][0]) {
                                        System.out.println("Stok Obat Hanya " + dataObat[4][0]);
                                        System.out.print("Masukkan jumlah obat: ");
                                        beliObat[i][j] = sc.nextInt();
                                        dataObat[4][0] -= beliObat[0][0];
                                    } else {
                                        dataObat[4][0] -= beliObat[0][0];
                                    }
                                }
                                break;

                            case 1:
                                System.out.print("Masukkan harga obat: ");
                                beliObat[i][j] = sc.nextInt();
                                break;

                        }
                    }

                }
                System.out.print("Masukkan jenis pembayaran [tunai/transfer/kredit]: ");
                String jenisPembayaran = sc.next();
                System.out.print("Apakah anda ingin cetak struk? [true/false]:");
                struk = sc.nextBoolean();
                if (struk == true) {
                    System.out.println("======================================================================");
                    System.out.println("\t\t\t" + "Struk Obat Apotik RS.Poltek");
                    System.out.println("\t\t" + "Jl. Soekarno Hatta No 01, Kota Malang");
                    System.out.println("======================================================================");
                    System.out.println("Operator: " + operator);
                    System.out.println(date.toString());
                    System.out.println("Pembeli: " + namaPasien);
                    System.out.println("Jenis Pembeli: " + jenisPasien);
                    System.out.println("____________________________________________________________");
                    System.out.print("Nama Obat" + "\t" + "Qty" + "\t" + "Harga" + "\t" + "Subtotal");
                    System.out.println();
                    for (int i = 0; i < resep; i++) {
                        System.out.print(obat[i] + "\t");
                        for (int j = 0; j < 2; j++) {
                            System.out.print(beliObat[i][j] + "\t");
                        }
                        ;
                        subtotal = beliObat[i][0] * beliObat[i][1];
                        System.out.println(subtotal + "\t");
                        total += (beliObat[i][0] * beliObat[i][1]);

                        if (jenisPembayaran.equals("transfer")) {
                            admin = 2000;
                            if (jenisPasien.equals("bpjs")) {
                                pot = total * 0.5;
                            } else if (jenisPasien.equals("asuransi")) {
                                pot = total * 1;
                                admin = 0;
                            } else {
                                pot = 0;
                            }
                        } else if (jenisPembayaran.equals("kredit")) {
                            admin = 1000;
                            if (jenisPasien.equals("bpjs")) {
                                pot = total * 0.5;
                            } else if (jenisPasien.equals("asuransi")) {
                                pot = total * 1;
                                admin = 0;
                            } else {
                                pot = 0;
                            }
                        } else {
                            if (jenisPasien.equals("bpjs")) {
                                pot = total * 0.5;
                            } else if (jenisPasien.equals("asuransi")) {
                                pot = total * 1;
                                admin = 0;
                            } else {
                                pot = 0;
                            }
                            admin = 0;
                        }
                        totalBayar = total - pot + admin - disMember + kartuMember;
                    }

                    System.out.println("_____________________________________________");
                    System.out.println("Total : " + total);
                    System.out.println("Diskon " + jenisPasien + " : " + pot);
                    System.out.println("Diskon Member: " + disMember);
                    System.out.println("Biaya Pembuatan Member: " + kartuMember);
                    System.out.println("Admin  " + jenisPembayaran + " : " + admin);
                    System.out.println("Total Bayar : " + totalBayar);
                    System.out.print("Dibayar : ");
                    dibayar = sc.nextDouble();
                    kembalian = dibayar - totalBayar;
                    System.out.println("Kembalian : " + kembalian);
                    System.out.println("======================================================================");
                    System.out.println("Update Data Obat");
                    tampilStok(dataObat, namaObat, expObat, jenisObat);
                } else {
                }

            } else {

            }
            System.out.println("Apa anda ingin memilih menu lain ?   [true/false]?");
            ulangi = sc.nextBoolean();
        }
    }
}

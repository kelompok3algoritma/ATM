import java.util.Scanner;

public class Atm {
    public int pin;
    public int saldoRekening1 = 5000000;
    public int saldoRekening2 = 1000000;
    public int pilihMenu,jumlahPenarikan,jumlahSimpanUang,noRekTujuan,jumlahTransfer;
    Scanner input = new Scanner(System.in);

    public String Sambutan() {
        System.out.println("Selamat Datang");
        System.out.println("Silahkan Masukan Pin Atm Anda!!");
        pin = input.nextInt();
        if (pin == 21051028) {
            Menu1();
        }
        else if(pin==21051055){
            Menu2();
        }
        else{
            System.out.println("Nomor Pin anda salah!!");
        }
        return Sambutan();
    }
    public void Menu1(){
        System.out.println("1.cek saldo");
        System.out.println("2.simpan uang");
        System.out.println("3.ambil uang");
        System.out.println("4.Transfer uang");
        System.out.println("5.Keluar");
        System.out.println("silahkan pilih menu !");
        pilihMenu=input.nextInt();
        if(pilihMenu==1){
            System.out.println("Saldo anda adalah Rp."+saldoRekening1);
        }
        else if(pilihMenu==2){
            System.out.println("Masukan jumlah uang yang ingin anda simpan!");
            jumlahSimpanUang = input.nextInt();
            System.out.println("Saldo anda sekarang adalah Rp."+(saldoRekening1+jumlahSimpanUang));
        }
        else if(pilihMenu==3){
            System.out.println("Berapa jumlah uang yang ingin anda ambil ?");
            jumlahPenarikan=input.nextInt();
            System.out.println("Anda berhasil menarik uang sejumlah Rp."+jumlahPenarikan);
            System.out.println("Sisa saldo anda sekarang adalah Rp."+(saldoRekening1-jumlahPenarikan));
        }
        else if(pilihMenu==4){
            System.out.println("Silahkan input nomor rekening penerima !");
            noRekTujuan =input.nextInt();
            System.out.println("Silahkan input jumlah yang akan di transfer !");
            jumlahTransfer=input.nextInt();
            if(jumlahTransfer>saldoRekening1){
                System.out.println("Saldo anda tidak mencukupi jumlah transfer!!");
                System.out.println("Mohon pastikan saldo anda mencukupi jumlah transfer!!");
            }
            else if(jumlahTransfer<saldoRekening1){
                System.out.println("Transaksi anda berhasil!!");
                System.out.println("Saldo anda sekarang adalah Rp."+(saldoRekening1-jumlahTransfer));
            }

        }
        else if(pilihMenu==5){
            System.out.println("Terima kasih telah menggunakan atm kami!!");
        }
        else{
            System.out.println("Silahkan input nomor dengan benar!!");
        }
    }


    public void Menu2(){
        System.out.println("1.cek saldo");
        System.out.println("2.simpan uang");
        System.out.println("3.ambil uang");
        System.out.println("4.Transfer uang");
        System.out.println("5.Keluar");
        System.out.println("silahkan pilih menu !");
        pilihMenu=input.nextInt();
        if(pilihMenu==1){
            System.out.println("Saldo anda adalah Rp."+saldoRekening2);
        }
        else if(pilihMenu==2){
            System.out.println("Masukan jumlah uang yang ingin anda simpan!");
            jumlahSimpanUang = input.nextInt();
            System.out.println("Saldo anda sekarang adalah Rp."+(saldoRekening2+jumlahSimpanUang));
        }
        else if(pilihMenu==3){
            System.out.println("Berapa jumlah uang yang ingin anda ambil ?");
            jumlahPenarikan=input.nextInt();
            System.out.println("Anda berhasil menarik uang sejumlah Rp."+jumlahPenarikan);
            System.out.println("Sisa saldo anda sekarang adalah Rp."+(saldoRekening2-jumlahPenarikan));
        }
        else if(pilihMenu==4){
            System.out.println("Silahkan input nomor rekening penerima !");
            noRekTujuan =input.nextInt();
            System.out.println("Silahkan input jumlah yang akan di transfer !");
            jumlahTransfer=input.nextInt();
            if(jumlahTransfer>saldoRekening2){
                System.out.println("Saldo anda tidak mencukupi jumlah transfer!!");
                System.out.println("Mohon pastikan saldo anda mencukupi jumlah transfer!!");
            }
            else if(jumlahTransfer<saldoRekening2){
                System.out.println("Transaksi anda berhasil!!");
                System.out.println("Saldo anda sekarang adalah Rp."+(saldoRekening2-jumlahTransfer));
            }

        }
        else if(pilihMenu==5){
            System.out.println("Terima kasih telah menggunakan atm kami!!");
        }
        else{
            System.out.println("Silahkan input nomor dengan benar!!");
        }
    }
}


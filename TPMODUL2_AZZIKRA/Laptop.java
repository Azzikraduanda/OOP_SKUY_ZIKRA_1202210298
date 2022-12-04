public class Laptop extends Perangkat {

    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, Boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam ;
    }

    @Override
    public void informasi(){
        if (this.webcam == true){
            System.out.println("Laptop ini mempunyai drive jenis " + drive + " dengan ram ukuran " + ram + "GB dan processor kecepatan " + processor + "Ghz. Selain itu laptop ini mempunyai Webcam");
        }else {
            System.out.println("Laptop ini mempunyai drive jenis " + drive + " dengan ram ukuran " + ram + "GB dan processor kecepatan " + processor + "Ghz. Selain itu laptop ini TIDAK mempunyai Webcam");
        }
    }
    public void Game(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    public void Email(String kirim_email) {
        System.out.println("Laptop berhasil mengirim Email ke " + kirim_email);
    }
    public void Email(String kirim_email1, String kirim_email2){
        System.out.println("Laptop berhasil mengirim Email ke " + kirim_email1 + " dan ke " + kirim_email2);
    }
}
public class Handphone extends Perangkat {
    protected boolean fingerprint;


    public Handphone(String drive, int ram, float proccessor, boolean fingerprint){
        super(drive, ram, proccessor);
        this.fingerprint = fingerprint;
    }
    
    @Override
    public void informasi(){
        if (fingerprint == true){
            System.out.println("Handphone mempunyai drive jenis" + drive + " dengan ram ukuran " + ram + "GB dan proccesor  kecepatan" + processor + "Ghz. Selain itu Handphone ini punya fitur Fingerprint");
        }else {
            System.out.println("Handphone mempunyai drive jenis" + drive + " dengan ram ukuran " + ram + "GB dan proccesor  kecepatan" + processor + "Ghz. Selain itu Handphone ini TIDAK mempunyai Fingerprint");
        }
    }

    public void Telfon(int no_hp){
        System.out.println("Handphone berhasil menyambung telfon ke No " + no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }
}

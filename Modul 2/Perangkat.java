public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat (String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.println("Perangkat tidak di deteksi memiliki drive jenis " + drive + " memiliki ram ukuran " + ram + "GB dan processor kecepatan " + processor + "Ghz");
    }
}

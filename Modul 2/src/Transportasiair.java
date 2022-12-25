public class Transportasiair {
    protected int jumlahKursi;
    protected int biaya;


    public Transportasiair (int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
      
    }
    public void informasi(){
        System.out.println("Transportasi air jenis tidak di ketahui dengan jumlah kursi " + jumlahKursi + " di tetapkan dengan biaya sebesar " + biaya );
    }
    public void berlayar(){
        System.out.println("Transportasi air dengan jenis yang tidak di ketahui sedang berlayar" );
    }
    public void berlabuh(){
        System.out.println("Transportasi air dengan jenis yang tidak di ketahui sedang berlabuh pantai" );
    }
}


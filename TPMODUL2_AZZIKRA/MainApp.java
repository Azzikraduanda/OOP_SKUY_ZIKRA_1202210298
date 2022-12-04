public class MainApp {

    public static void main (String[] arg) throws Exception{
        Perangkat p = new Perangkat("Wd blue", 4, 1.80f);
        p.informasi();
        System.out.println();
        
        Handphone kentang = new Handphone(" advan", 3, 2.20f, false);
        kentang.informasi();
        kentang.Telfon(628666);
        kentang.kirimSMS(628777);
        kentang.kirimSMS(628888, 628999);

        Laptop burik = new Laptop("Sandisk", 16, 2.40f, true);
        burik.informasi();
        burik.Game("Sweet Bonazna");
        burik.Email("pragmaticrungkad.com");
        burik.Email("pragmaticbau.com", "pragmaticmelarat@gmail.com");
        System.out.println();


        }
}

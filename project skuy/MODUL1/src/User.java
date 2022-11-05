public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message

    String Nama ;
    int Nomor ;

    public void setNama (String Nama){
        this.Nama = Nama ;
    }

    public void setNomor (String Nomor){
        this.Nomor = Nomor ;
    }
    public void Register (){
        System.out.println("Registrasi Sukses");
        System.out.println("Nama : "+ Nama);
        System.out.println("Nomor :"+ Nomor);
    }
}

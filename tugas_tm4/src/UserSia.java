public class UserSia {
    public static void main(String[] args) {
        User_1 user_1 = new User_1();
        System.out.println(user_1.pengguna);
        user_1.getNIM();
        user_1.getNama("Silvia Angraini");
        user_1.getAlamat("Jl. Cendrawasih kel. Sawah Baru ");
        user_1.getKontak("085883566564");



        User_2 user_2 = new User_2();
        System.out.println(user_2.pengguna);
        user_2.getNID();
        user_2.getNama("Bunga Kaartika");
        user_2.getAlamat("Kembangan, Jakarta Barat");
        user_2.getKontak("081344543124");
        user_2.getLatarPendidikan();
    }
}

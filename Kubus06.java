public class Kubus06 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; 
    }
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi; 
    }
    public static void main(String[] args) {
        int sisi = 2; 

        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volume);
        
        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luasPermukaan);
    }
}

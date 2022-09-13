public class Main {
    public static void main(String[] args) {

        // Dortişlem adlı ayrı bir class oluşturdum.Dört işlem operasyonlarını tanımladım.
        // oluşan class bir değer ataması yapıp sonuc değişkenine istenilen operasyonu gerçekleştirerek atadım.
        // ekrana sonucu yazdırdım.

        DortIslem dortIslem= new DortIslem();
        int sonuc=dortIslem.Topla(3,4);
        System.out.println(sonuc);


    }
}
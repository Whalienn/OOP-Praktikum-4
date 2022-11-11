public class Segitiga extends BangunDatar{
        private int alas = 12;
        private int tinggi = 5;
        
        public float luas(){
            System.out.println("\nMenghitung Luas Segitiga");
            System.out.println("Alas = " + alas);
            System.out.println("Tinggi = " + tinggi);
            System.out.println("Luas Segitiga = " + (alas * tinggi / 2) + " cm");
                return 1;
        }
        
        public float keliling(){
            double sisi = Math.sqrt(alas*alas + tinggi*tinggi);
            System.out.println("\nMenghitung Keliling Segitiga");
            System.out.println("Alas = " + alas);
            System.out.println("Tinggi = " + tinggi);
            System.out.println("Keliling Segtiga = " + (sisi + tinggi + alas) + " cm");
            return 1;
        }
}

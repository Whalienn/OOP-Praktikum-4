public class Lingkaran {
    private int r = 12;

    public float luas() {
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("r=" + r);
        System.out.println("Luas Lingkaran= " + (3.14*r*r)+ " cm^2");
        return 1;

    }

    public float keliling(){
        System.out.println("\nMenghitung Keliling Lingkaran");
        System.out.println("r = " + r);
        System.out.println("Keliling Lingkaran " + (2 * 3.14 * r) + " cm");
        return 1;

    }


    
}

package TugasArray;

public class Tugas_Array {
    public static void main(String[] args) {
        int[] deret = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Panjang array deret: "+deret.length);

        for (int i = 0; i < deret.length; i++){
            System.out.println("elemen ke - "+deret[i]);
        }

        double[] suhu = new double[5];
        suhu[0] = 28.5;
        suhu[1] = 25.5;
        suhu[2] = 26.5;
        suhu[3] = 27.5;
        suhu[4] = 30.5;

        System.out.println("Panjang array suhu: "+suhu.length);

        for (int i = 0; i < suhu.length; i++){
            System.out.println("elemen ke - "+suhu[i]);
        }
    }
}

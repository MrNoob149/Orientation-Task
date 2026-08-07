public class OrientationTask3_2 {
    public static void main(String[] args) {
        final int MAXAGE = 26;

    int[] numbergraph = new int[MAXAGE + 1];

    int agerandom[][] = {
            {18, 18},
            {34, 19},
            {52, 20},
            {68, 21},
            {82, 22},
            {89, 23},
            {94, 24},
            {96, 25},
            {100, MAXAGE},
    };

    for (int i = 1; i <= 10000; i++) {
            int x = (int)(Math.random()*100)+1;
            int j = 0;
        while (x > agerandom[j][0]) j++; {
            numbergraph[agerandom[j][1]]++;
            }
        }

    System.out.println("Age   count    %-share");
    for (int age = 0; age <= MAXAGE; age++) {
        if (numbergraph[age] != 0) {
            String str = "%-4d %-8d %-8.2f\n";
            System.out.printf(str, age, numbergraph[age], ((double) numbergraph[age]) / 10000 * 100);            }
        }
    }
}
public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2]; //4 * 2 = 8
        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [2][2][2][2];


        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        String mensaje = "Nuevas Versiones";
        for (int i = 0; i < androidVersions.length; i++) {
            if(androidVersions[i] == null){
                break;
            }
            else {
                System.out.println(androidVersions[i]);;
            }

        }


        /*for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);

        }

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        /*System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
*/

        int i=7;
        char c = 'w';
        int k=3;
        int m=2;
        System.out.println((i>=6) && (c=='w'));

    }
}

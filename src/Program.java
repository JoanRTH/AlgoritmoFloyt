public class Program {
    public static void main(String[] args) {
        AlgoritmoDFloyt Alg = new AlgoritmoDFloyt();
        SegundaColumna Sec = new SegundaColumna();
        TercerColumna Ter = new TercerColumna();
        CuartaColumna Cua = new CuartaColumna();

        int[][] matriz2 = {
            {0, 1, 2, 3},
            {4, 0, 5, 6},
            {7, 8, 0, 9},
            {10, 11, 12, 0}};

        String[] nodos = {"A", "B", "X", "Y"};
        Alg.calcularRutaMasCorta(matriz2, nodos);
        System.out.println("          Segunda Columna          ");
        Sec.calcularRutaMasCorta2(matriz2, nodos);
        System.out.println("          Tercer Columna          ");
        Ter.calcularRutaMasCorta3(matriz2, nodos);
        //System.out.println("          Cuarta Columna          ");
        //Cua.calcularRutaMasCorta4(matriz2, nodos);

    }
}

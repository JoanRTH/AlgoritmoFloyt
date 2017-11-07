public class CuartaColumna {
    public void calcularRutaMasCorta4(int[][] grafos, String[] nodos){
        
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        //System.out.println(grafos.length);
        for(int a=0;a<grafos.length;a++){
            for(int b=0;b<grafos.length;b++){
                matrizCaminos[b][a] = nodos[a];
            }
        }
        
        //Evaluado a fila y columna 0
        for(int a=0;a<grafos.length;a++){
            if(!(grafos[2][a] == grafos[a][2])){
                //System.out.println("0, " + a + " = " + grafos[0][a]);
                //System.out.println(a + ", 0 = " + grafos[a][0]);
                for(int b=0;b<grafos.length;b++){
                    if(!(grafos[2][b] == grafos[b][2])){
                        System.out.print("0, " + a + " + " + b + ", 0 = " + grafos[2][a] + " + " + grafos[b][2] + " = " + (grafos[2][a] + grafos[b][2]) + " < " + grafos[a][b]);
                       
                        //para ver si hubo algun cambio
                        if((grafos[0][a] + grafos[b][0]) < grafos[a][b]){
                            System.out.println(" Hay cambio");
                        } else {
                            System.out.println(" No hay cambio");
                        }
                    }
                }
            }
        }
    }
}

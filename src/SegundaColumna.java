public class SegundaColumna {
    public void calcularRutaMasCorta2(int[][] grafos, String[] nodos){
        
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        
        
        //Evaluado a fila y columna 0
        for(int a=0;a<grafos.length;a++){
            if(!(grafos[1][a] == grafos[a][1])){
                
                for(int b=0;b<grafos.length;b++){
                    if(!(grafos[1][b] == grafos[b][1])){
                        System.out.print("1, " + a + " + " + b + ", 1 =((((( " + grafos[1][a] + " + " + grafos[b][1] + " =//// " + (grafos[1][a] + grafos[b][1]) + " < " + grafos[a][b]);
                        
                        //para ver si hubo algun cambio
                        if((grafos[1][a] + grafos[b][1]) < grafos[a][b]){
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

public class TercerColumna {
   public void calcularRutaMasCorta3(int[][] grafos, String[] nodos){
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        
        //Evaluado a fila y columna 0
        for(int a=0;a<grafos.length;a++){
            if(!(grafos[2][a] == grafos[a][2])){
                
                for(int b=0;b<grafos.length;b++){
                    if(!(grafos[2][b] == grafos[b][2])){
                        System.out.print("2, " + a + " + " + b + ", 2 =((((( " + grafos[2][a] + " + " + grafos[b][2] + " =//// " + (grafos[2][a] + grafos[b][2]) + " < " + grafos[a][b]);
                        
                        //para ver si hubo algun cambio
                        if((grafos[2][a] + grafos[b][2]) < grafos[a][b]){
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

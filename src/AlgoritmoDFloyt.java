public class AlgoritmoDFloyt {
    public void calcularRutaMasCorta(int[][] grafos, String[] nodos){
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        
        //Evaluado a fila y columna 0
        for(int a=0;a<grafos.length;a++){
            if(!(grafos[0][a] == grafos[a][0])){
                
                for(int b=0;b<grafos.length;b++){
                    if(!(grafos[0][b] == grafos[b][0])){
                        System.out.print("0, " + a + " + " + b + ", 0 = " + grafos[0][a] + " + " + grafos[b][0] + " = " + (grafos[0][a] + grafos[b][0]) + " < " + grafos[a][b]);
                        
                        //para ver si hubo cambio
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


package tabladeverdadcomputacion;

public class TablaComputacion {
    
    private final String expresion;
    
    public TablaComputacion(String expresion){
        this.expresion = expresion;
        resolver();
    }
    
    
    private void resolver(){
        String condicion = estandarizar(expresion);
        System.out.println(condicion);
    }
    
    
    private String estandarizar(String expresion){
        StringBuilder estandar = new StringBuilder(expresion);
        boolean cambios = false;
        int i;
        
        do{
            i = 0;
            while(i < estandar.length()){
                cambios = true;
                if(i < estandar.length()-1 &&
                        (Character.isLetter(estandar.charAt(i)) || estandar.charAt(i) == ')') &&
                        (Character.isLetter(estandar.charAt(i+1)) || estandar.charAt(i+1) == '(')){
                    estandar.insert(i+1, '*');
                }else{
                    cambios = false;
                }
                
                i++;
            }
        }while(cambios);
        
        return estandar.toString();
    }
    
    
    public void impresionSTD(){
        System.out.println("Función en construcción");
    }
}

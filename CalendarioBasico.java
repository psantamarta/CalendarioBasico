
public class CalendarioBasico{
    private int dia;
    private int mes;
    private int anio;

    public CalendarioBasico(){
        dia = 1;
        mes = 1;
        anio = 1;
    }

    public String obtenerFecha(){
        String cadenaDia = "" + dia;
        String cadenaMes = "" + mes;
        String cadenaAnio = "" + anio;
        if (dia < 10){
            cadenaDia = "0" + dia;
        }
        if (mes < 10){
            cadenaMes = "0" + mes;
        }
        if (anio < 10){
            cadenaAnio = "0" + anio;
        }
        return cadenaDia + "-" + cadenaMes + "-" + cadenaAnio; 
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        anio = nuevoAno;
    }
    
    public void avanzarFecha(){
        if (dia <= 30 && mes <= 12 && anio <= 99){
            if (dia == 30){
                dia = 01;                
                if (mes == 12){
                    mes = 01;                        
                    if (anio == 99){
                        anio = 01;
                    }
                    else{
                        anio ++;
                    }                
                }
                else{
                  mes ++;  
                }                
            }
            else{
                dia ++;
            }
        }
        else{
            System.out.println("La fecha que hay registrada no es correcta");
        }
        
    }
}

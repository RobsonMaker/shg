
package controle;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conversoes {
    
    private static SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date stringToData(String entrada){
        Date retorno = null;
        try {
            retorno =  data.parse(entrada);
        } catch (ParseException ex) {
            System.out.println("Erro de conversão");
        }
        return retorno;
    }
    
    public static String dataToString(Date entrada){
        String retorno = null;
        retorno = data.format(entrada);
        return retorno;
    }
    
    public static String dataInvertida(String entrada){
        return entrada.substring(6,10)+"-"+entrada.substring(3,5)+"-"+entrada.substring(0,2);
    }
    
    public static String retornaDia(String entrada){
        return entrada.substring(0,2);
    }
    
    public static long diferencaDatas(String data1, String data2){
        long dt = 0;
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            Date d1 = df.parse(data1);
            Date d2 = df.parse(data2);
            dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
            dt = (dt / 86400000L); // passaram-se 67111 dias
        } catch (ParseException ex) {
            Logger.getLogger(Conversoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dt;
    }
    
    public static Date somaDias(Date data1, int dias){
        Calendar c = Calendar.getInstance();//Instancia a classe Calendar.
        c.setTime(data1);//Altera a data atual,pela sua data
        c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+dias);
        return c.getTime();
    }
    
    public boolean validacaoData(String da1, String da2){
        boolean validacao = false;
        try{
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            Date d1 = df.parse(da1);
            Date d2 = df.parse(da2);
            
            if(d1.getTime() > d2.getTime()){
                validacao = true;
            }
            
    }catch(ParseException ex){
        Logger.getLogger(Conversoes.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        return validacao;
    }
    
    
}

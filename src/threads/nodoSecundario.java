
package threads;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class nodoSecundario extends Thread
{
    private String name, mensaje;
    private nodoBase basesita;
    private Object candado;
    private int speed = 0;
    private boolean esperar = false;
    private Semaphore semaforo;
    
    public nodoSecundario(int time, String name, Semaphore semaforo, nodoBase oficina, Object candado) 
    {
        this.name = name;
        this.speed = time;
        this.semaforo = semaforo;
        this.basesita = oficina;
        this.candado = candado;
    }
    
    public void run()
    { //ERROR
            while(true)
            {
                //Boton de esperar
                synchronized (candado) 
                {
                    try 
                    {
                        if(esperar == true)
                        {
                            candado.wait();
                        }
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(nodoSecundario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                try 
                {
                    this.generar_mensaje();
                    basesita.recibirMensaje(mensaje);
                    Thread.sleep(speed);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(nodoSecundario.class.getName()).log(Level.SEVERE, null, ex);
                }         
        }
        
    }
    
    public void setSpeed(int time)
    {
        this.speed = time;
    }

    public void changeEsperar() 
    {
        if(esperar == true)
        {
            this.esperar = false;
        }
        else
        {
            this.esperar = true;
        }
    }

    private void generar_mensaje() 
    {
        Calendar fecha = new GregorianCalendar();
        int hour = fecha.get(Calendar.HOUR_OF_DAY);
        int minute = fecha.get(Calendar.MINUTE);
        int second = fecha.get(Calendar.SECOND);

        String mensajeHora = hour + ":" + minute + ":" + second;
        this.mensaje = "Envia mensaje a la estacion base/"+name+"/"+mensajeHora;
    }  
    
}

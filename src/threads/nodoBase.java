package threads;

import GUI.GUI;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class nodoBase 
{
    private GUI gui;
    
    private Semaphore semaforo = new Semaphore (1);
    private nodoSecundario array_nodos[] = new nodoSecundario[5];
    private final Object candado = new Object();
    
    private String mensaje_actual, array_mensajes[] = new String[3];
    private static ArrayList<String[]> Lista = new ArrayList<String[]>();
    
    private int numero_nodos, speed, i;
    
    public nodoBase(int numEstacionesRemotas, int speed, GUI gui)
    {
        this.numero_nodos = numEstacionesRemotas;
        this.speed = speed;
        this.gui = gui;
        for (int i = 0; i < numEstacionesRemotas; i++)
        {
            array_nodos[i] = new nodoSecundario(speed, "Nodo#"+(i+1), semaforo, this, candado);
            array_nodos[i].start();
        }
    }
    
    public void actualizar_tabla()
    {
        Object[] fila;
        GUI.getModelo().setRowCount(0);
        
        for (i = 0; i < Lista.size(); i++)
        {
            if(Lista.get(i) != null)
            {
                fila = new Object[3];
                fila[0]= Lista.get(i)[0];
                fila[1]= Lista.get(i)[1];
                fila[2]= Lista.get(i)[2];
                
                GUI.getModelo().addRow(fila); 
            }
            
        }
    }
    
    public synchronized void recibirMensaje(String mens) 
    {
        this.mensaje_actual = mens;
        array_mensajes = mensaje_actual.split("/");
        Lista.add(array_mensajes);
        //System.out.println("Mensaje recibido en base de "+array_mensajes[1]);
        this.gui.textMostrarTexto("Mensaje recibido en base de "+array_mensajes[1]);
    }
    
    public void parador_nodos()
    {
        for(i = 0; i < numero_nodos; ++i)
        {
            array_nodos[i].changeEsperar();
        }
    }
    
    public void reanudador_nodos()
    {
        synchronized (candado) 
        {
            candado.notifyAll();
        }
        for(i = 0; i < numero_nodos; ++i)
        {
            array_nodos[i].changeEsperar();
        }
    }
    
    public void creador_nodos()
    {
        for (int i = 0; i < numero_nodos; i++)
        {
            array_nodos[i] = new nodoSecundario(speed, "Nodo#"+(i+1), semaforo, this, candado);
            array_nodos[i].start();
        }
    }
    public void eliminador_nodos()
    {
        this.parador_nodos();
        for (int i = 0; i < numero_nodos; i++)
        {
            array_nodos[i] = null;
        }
    }
    
    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    public void DramaticoBorradorIntergalacticoDeArrayListV0_0_999()
    {
        Lista.clear();
    }
    public void setNumero_nodos(int numero_nodos) 
    {
        this.numero_nodos = numero_nodos;
    }
    
}

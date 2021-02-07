package com.ordenadores.webservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import com.ordenadores.xml.almacen.*;
 
/**
 * La clase OrdenadorRepository se encarga de generar unos datos ficticios dentro del sevicio
 * para poder probar el funcionamiento del mismo
 * 
 * @author Dani Kuradchyk
 */
@Component
public class OrdenadorRepository {
    
    /** Guarda los distintos ordenadores por id */
    private static final Map<String, Ordenador> ordenadores = new HashMap<>();
    
    /** como klave se guarda al fabricante y se introduce dentro el array de ordenadores correspondiente */
    private static final Map<String, ArrayList<Ordenador>> ordenadoresMarca = new HashMap<>();
    
    /**
     * Introduce todos los datos al iniciar la aplicacion
     */
    @PostConstruct
    public void initData() {
    	ArrayList<Ordenador> pcs= new ArrayList<>();
    	
        Procesador procesador=new Procesador();
        procesador.setNombre("i5 6600");
        procesador.setNucleos(4);
        procesador.setHilos(4);
        procesador.setGhz(3);
        
        Ordenador ordenador=new Ordenador();
        ordenador.setId("1"); 
        ordenador.setFapricante("Asus");
        ordenador.setGrafica("gtx 1060");
        ordenador.setProcesador(procesador);
        ordenador.setRam("8 GB");
        ordenadores.put(ordenador.getId(), ordenador);
        pcs.add(ordenador);
        
        ordenador=new Ordenador();
        ordenador.setId("2"); 
        ordenador.setFapricante("Asus");
        ordenador.setGrafica("gtx 1050 ti");
        ordenador.setProcesador(procesador);
        ordenador.setRam("12 GB");
        ordenadores.put(ordenador.getId(), ordenador);
        pcs.add(ordenador);
        
        ordenador=new Ordenador();
        ordenador.setId("3"); 
        ordenador.setFapricante("Asus");
        ordenador.setGrafica("rx 480");
        ordenador.setProcesador(procesador);
        ordenador.setRam("16 GB");
        ordenadores.put(ordenador.getId(), ordenador);
        pcs.add(ordenador);
        
        ordenadoresMarca.put(ordenador.getFapricante(), pcs);
        
        pcs=new ArrayList<>();
        
        
        
        procesador= new Procesador();
        procesador.setNombre("i3 2600");
        procesador.setNucleos(2);
        procesador.setHilos(4);
        procesador.setGhz(2);
        
        
        ordenador=new Ordenador();
        ordenador.setId("4"); 
        ordenador.setFapricante("Acer");
        ordenador.setGrafica("gt 710");
        ordenador.setProcesador(procesador);
        ordenador.setRam("4 GB");
        ordenadores.put(ordenador.getId(), ordenador);
        pcs.add(ordenador);
        
        ordenador=new Ordenador();
        ordenador.setId("5"); 
        ordenador.setFapricante("Acer");
        ordenador.setGrafica("gtx 760");
        ordenador.setProcesador(procesador);
        ordenador.setRam("8 GB");
        ordenadores.put(ordenador.getId(), ordenador);
        pcs.add(ordenador);
        
        ordenadoresMarca.put(ordenador.getFapricante(), pcs);
        

        
    }
 
    /**
     * Devuelve el ordenador correspondiente a la id que se le pasa por parametros
     *
     * @param id es el  identificador del ordenador a buscar
     * @return devuelve el ordenador correspondiente a la id pasada por parametros
     */
    public Ordenador findOrdenador(String id) {
        Assert.notNull(id, "The Student's name must not be null");
        return ordenadores.get(id);
    }
    
    /**
     *Devuelve una lista de ordenadores especificando su fabricante
     *
     * @param fabricante es el fabricante del que se quieres sacar todos los ordenadores
     * @return la lista de orednadores especificos
     */
    public ArrayList<Ordenador> findOrdenadoresFabr(String fabricante){
    	return ordenadoresMarca.get(fabricante);
    }
}
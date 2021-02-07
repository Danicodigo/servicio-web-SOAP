package com.ordenadores.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.ordenadores.xml.almacen.*;

/**
 * La clase OrdenadorEndpoint.
 * se encarga de relizar las distintas peticiones del servicio
 * 
 * @Dani Kuradchyk
 */
@Endpoint
public class OrdenadorEndpoint 
{
    
    /** The Constant NAMESPACE_URI.  la url de donde se recogen los datos*/
    private static final String NAMESPACE_URI = "http://www.ordenadores.com/xml/almacen";
 
    /** The Ordenador repository. es el repositorio donde estaran guardados nuestros datos */
    private OrdenadorRepository OrdenadorRepository;
 
    /**
     * constructor ordenador endpoint.
     *
     * @param OrdenadorRepository el repositorio de datos del programaa
     */
    @Autowired
    public OrdenadorEndpoint(OrdenadorRepository OrdenadorRepository) {
        this.OrdenadorRepository = OrdenadorRepository;
    }
 
    /**
     * Este metodo sera el encargado de devolver un un ordenador cuando reciba la 
     * solicitud correspondiente
     *
     * @param request la request contiene la id de un ordenador
     * @return the ordenador
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrdenadorDetailsRequest")
    @ResponsePayload
    public OrdenadorDetailsResponse getOrdenador(@RequestPayload OrdenadorDetailsRequest request) {
    	OrdenadorDetailsResponse response = new OrdenadorDetailsResponse();
        response.setOrdenador(OrdenadorRepository.findOrdenador(request.getId()));
 
        return response;
    }
    
    /**
     * Este metodo devolvera los datos de un procesador dependiendo del identificador del 
     * ordenador que se pase por parametros en la consulta
     *
     * @param request la request contiene la id de un ordenador
     * @return devuelve el procesador correspondiente
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrdenadorProcesadorRequest")
    @ResponsePayload
    public OrdenadorProcesadorResponse getOrdenadorProcesador(@RequestPayload OrdenadorProcesadorRequest request) {
    	OrdenadorProcesadorResponse response = new OrdenadorProcesadorResponse();
        response.setProcesador(OrdenadorRepository.findOrdenador(request.getId()).getProcesador());
 
        return response;
    }
    
    /**
     * Este metodo se encarga de devolver el fabricante del ordenador de la request solicitada
     *
     * @param la request contiene la id de un ordenador
     * @return devuelve el fabricante del ordenador especifico
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrdenadorFabricanteRequest")
    @ResponsePayload
    public OrdenadorFabricanteResponse getFabricanteProcesador(@RequestPayload OrdenadorFabricanteRequest request) {
    	OrdenadorFabricanteResponse response = new OrdenadorFabricanteResponse();
        response.setFabricante(OrdenadorRepository.findOrdenador(request.getId()).getFapricante());
 
        return response;
    }
    
    /**
     * Devuelve una lista de ordenadores que pertenezcan al fabricante que se especifica
     * en la request.
     * 
     *
     * @param la request contiene el nombre del fabricante 
     * @return devuelve una lista de ordenadores que pertenezcan al fabricante en especifico
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrdenadoresPorFabricanteRequest")
    @ResponsePayload
    public OrdenadoresPorFabricanteResponse OrdenadoresPorFabricanteProcesador(@RequestPayload OrdenadoresPorFabricanteRequest request) {
    	OrdenadoresPorFabricanteResponse response = new OrdenadoresPorFabricanteResponse();
    	List<Ordenador> ordenadores = OrdenadorRepository.findOrdenadoresFabr(request.getId());
        for (Ordenador ordenador : ordenadores) {
            response.getOrdenadoresporfabricante().add(ordenador);
        }
 
        return response;
    }
}
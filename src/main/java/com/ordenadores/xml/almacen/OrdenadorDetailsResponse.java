//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.05 a las 09:43:49 PM CET 
//


package com.ordenadores.xml.almacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenador" type="{http://www.ordenadores.com/xml/almacen}Ordenador"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ordenador"
})
@XmlRootElement(name = "OrdenadorDetailsResponse")
public class OrdenadorDetailsResponse {

    @XmlElement(required = true)
    protected Ordenador ordenador;

    /**
     * Obtiene el valor de la propiedad ordenador.
     * 
     * @return
     *     possible object is
     *     {@link Ordenador }
     *     
     */
    public Ordenador getOrdenador() {
        return ordenador;
    }

    /**
     * Define el valor de la propiedad ordenador.
     * 
     * @param value
     *     allowed object is
     *     {@link Ordenador }
     *     
     */
    public void setOrdenador(Ordenador value) {
        this.ordenador = value;
    }

}

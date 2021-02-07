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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Procesador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Procesador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nucleos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hilos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ghz" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procesador", propOrder = {
    "nombre",
    "nucleos",
    "hilos",
    "ghz"
})
public class Procesador {

    @XmlElement(required = true)
    protected String nombre;
    protected int nucleos;
    protected int hilos;
    protected float ghz;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nucleos.
     * 
     */
    public int getNucleos() {
        return nucleos;
    }

    /**
     * Define el valor de la propiedad nucleos.
     * 
     */
    public void setNucleos(int value) {
        this.nucleos = value;
    }

    /**
     * Obtiene el valor de la propiedad hilos.
     * 
     */
    public int getHilos() {
        return hilos;
    }

    /**
     * Define el valor de la propiedad hilos.
     * 
     */
    public void setHilos(int value) {
        this.hilos = value;
    }

    /**
     * Obtiene el valor de la propiedad ghz.
     * 
     */
    public float getGhz() {
        return ghz;
    }

    /**
     * Define el valor de la propiedad ghz.
     * 
     */
    public void setGhz(float value) {
        this.ghz = value;
    }

}

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
 * <p>Clase Java para Ordenador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ordenador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procesador" type="{http://www.ordenadores.com/xml/almacen}Procesador"/>
 *         &lt;element name="ram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grafica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fapricante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ordenador", propOrder = {
    "id",
    "procesador",
    "ram",
    "grafica",
    "fapricante"
})
public class Ordenador {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected Procesador procesador;
    @XmlElement(required = true)
    protected String ram;
    @XmlElement(required = true)
    protected String grafica;
    @XmlElement(required = true)
    protected String fapricante;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad procesador.
     * 
     * @return
     *     possible object is
     *     {@link Procesador }
     *     
     */
    public Procesador getProcesador() {
        return procesador;
    }

    /**
     * Define el valor de la propiedad procesador.
     * 
     * @param value
     *     allowed object is
     *     {@link Procesador }
     *     
     */
    public void setProcesador(Procesador value) {
        this.procesador = value;
    }

    /**
     * Obtiene el valor de la propiedad ram.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRam() {
        return ram;
    }

    /**
     * Define el valor de la propiedad ram.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRam(String value) {
        this.ram = value;
    }

    /**
     * Obtiene el valor de la propiedad grafica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrafica() {
        return grafica;
    }

    /**
     * Define el valor de la propiedad grafica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrafica(String value) {
        this.grafica = value;
    }

    /**
     * Obtiene el valor de la propiedad fapricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFapricante() {
        return fapricante;
    }

    /**
     * Define el valor de la propiedad fapricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFapricante(String value) {
        this.fapricante = value;
    }

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.18 às 10:49:54 PM BRT 
//


package com.daniboy.spring_ws_app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WidgetInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WidgetInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wgtAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wgtContractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WidgetInfoType", propOrder = {
    "wgtAmount",
    "wgtContractNumber"
})
public class WidgetInfoType {

    @XmlElement(required = true)
    protected String wgtAmount;
    @XmlElement(required = true)
    protected String wgtContractNumber;

    /**
     * Obtém o valor da propriedade wgtAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgtAmount() {
        return wgtAmount;
    }

    /**
     * Define o valor da propriedade wgtAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgtAmount(String value) {
        this.wgtAmount = value;
    }

    /**
     * Obtém o valor da propriedade wgtContractNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgtContractNumber() {
        return wgtContractNumber;
    }

    /**
     * Define o valor da propriedade wgtContractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgtContractNumber(String value) {
        this.wgtContractNumber = value;
    }

}

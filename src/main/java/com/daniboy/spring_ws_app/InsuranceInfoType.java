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
 * <p>Classe Java de InsuranceInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InsuranceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceInfoType", propOrder = {
    "product",
    "coverageType",
    "coverageOption"
})
public class InsuranceInfoType {

    @XmlElement(required = true)
    protected String product;
    @XmlElement(required = true)
    protected String coverageType;
    @XmlElement(required = true)
    protected String coverageOption;

    /**
     * Obtém o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Obtém o valor da propriedade coverageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageType() {
        return coverageType;
    }

    /**
     * Define o valor da propriedade coverageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageType(String value) {
        this.coverageType = value;
    }

    /**
     * Obtém o valor da propriedade coverageOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageOption() {
        return coverageOption;
    }

    /**
     * Define o valor da propriedade coverageOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageOption(String value) {
        this.coverageOption = value;
    }

}

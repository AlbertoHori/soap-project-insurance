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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Applicant" type="{http://www.daniboy.com/spring_ws_app}ApplicantType"/>
 *         &lt;element name="InsuranceInfo" type="{http://www.daniboy.com/spring_ws_app}InsuranceInfoType"/>
 *         &lt;element name="WidgetInfo" type="{http://www.daniboy.com/spring_ws_app}WidgetInfoType"/>
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
    "applicant",
    "insuranceInfo",
    "widgetInfo"
})
@XmlRootElement(name = "InsuranceRequest")
public class InsuranceRequest {

    @XmlElement(name = "Applicant", required = true)
    protected ApplicantType applicant;
    @XmlElement(name = "InsuranceInfo", required = true)
    protected InsuranceInfoType insuranceInfo;
    @XmlElement(name = "WidgetInfo", required = true)
    protected WidgetInfoType widgetInfo;

    /**
     * Obtém o valor da propriedade applicant.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantType }
     *     
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /**
     * Define o valor da propriedade applicant.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantType }
     *     
     */
    public void setApplicant(ApplicantType value) {
        this.applicant = value;
    }

    /**
     * Obtém o valor da propriedade insuranceInfo.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceInfoType }
     *     
     */
    public InsuranceInfoType getInsuranceInfo() {
        return insuranceInfo;
    }

    /**
     * Define o valor da propriedade insuranceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceInfoType }
     *     
     */
    public void setInsuranceInfo(InsuranceInfoType value) {
        this.insuranceInfo = value;
    }

    /**
     * Obtém o valor da propriedade widgetInfo.
     * 
     * @return
     *     possible object is
     *     {@link WidgetInfoType }
     *     
     */
    public WidgetInfoType getWidgetInfo() {
        return widgetInfo;
    }

    /**
     * Define o valor da propriedade widgetInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WidgetInfoType }
     *     
     */
    public void setWidgetInfo(WidgetInfoType value) {
        this.widgetInfo = value;
    }

}

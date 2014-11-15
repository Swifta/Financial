
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depositfloatresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depositfloatresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orginatingpartnerfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orginatingpartnerbalanceafter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationpartnerbalanceafter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialtransactionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://swifta.com/sub/mats/operation/financial/v1.0}parameterExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depositfloatresponse", propOrder = {
    "orginatingpartnerfee",
    "orginatingpartnerbalanceafter",
    "destinationpartnerbalanceafter",
    "financialtransactionid",
    "extension"
})
public class Depositfloatresponse {

    protected String orginatingpartnerfee;
    protected String orginatingpartnerbalanceafter;
    protected String destinationpartnerbalanceafter;
    protected String financialtransactionid;
    protected ParameterExtension extension;

    /**
     * Gets the value of the orginatingpartnerfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginatingpartnerfee() {
        return orginatingpartnerfee;
    }

    /**
     * Sets the value of the orginatingpartnerfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginatingpartnerfee(String value) {
        this.orginatingpartnerfee = value;
    }

    /**
     * Gets the value of the orginatingpartnerbalanceafter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginatingpartnerbalanceafter() {
        return orginatingpartnerbalanceafter;
    }

    /**
     * Sets the value of the orginatingpartnerbalanceafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginatingpartnerbalanceafter(String value) {
        this.orginatingpartnerbalanceafter = value;
    }

    /**
     * Gets the value of the destinationpartnerbalanceafter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationpartnerbalanceafter() {
        return destinationpartnerbalanceafter;
    }

    /**
     * Sets the value of the destinationpartnerbalanceafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationpartnerbalanceafter(String value) {
        this.destinationpartnerbalanceafter = value;
    }

    /**
     * Gets the value of the financialtransactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialtransactionid() {
        return financialtransactionid;
    }

    /**
     * Sets the value of the financialtransactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialtransactionid(String value) {
        this.financialtransactionid = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterExtension }
     *     
     */
    public ParameterExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterExtension }
     *     
     */
    public void setExtension(ParameterExtension value) {
        this.extension = value;
    }

}

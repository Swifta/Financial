
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cashinresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cashinresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orginatingresourcebalanceafter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationresourcebalanceafter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cashinresponse", propOrder = {
    "fee",
    "orginatingresourcebalanceafter",
    "destinationresourcebalanceafter",
    "financialtransactionid",
    "extension"
})
public class Cashinresponse {

    protected String fee;
    protected String orginatingresourcebalanceafter;
    protected String destinationresourcebalanceafter;
    protected String financialtransactionid;
    protected ParameterExtension extension;

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Gets the value of the orginatingresourcebalanceafter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginatingresourcebalanceafter() {
        return orginatingresourcebalanceafter;
    }

    /**
     * Sets the value of the orginatingresourcebalanceafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginatingresourcebalanceafter(String value) {
        this.orginatingresourcebalanceafter = value;
    }

    /**
     * Gets the value of the destinationresourcebalanceafter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationresourcebalanceafter() {
        return destinationresourcebalanceafter;
    }

    /**
     * Sets the value of the destinationresourcebalanceafter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationresourcebalanceafter(String value) {
        this.destinationresourcebalanceafter = value;
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


package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for floattransferresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="floattransferresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orginatingpartnerbalanceafter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orginatingpartnerfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "floattransferresponse", propOrder = {
    "transactionid",
    "orginatingpartnerbalanceafter",
    "orginatingpartnerfee",
    "extension"
})
public class Floattransferresponse {

    protected String transactionid;
    protected String orginatingpartnerbalanceafter;
    protected String orginatingpartnerfee;
    protected ParameterExtension extension;

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionid() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionid(String value) {
        this.transactionid = value;
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

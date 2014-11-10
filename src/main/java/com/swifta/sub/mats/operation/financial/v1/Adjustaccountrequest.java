
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustaccountrequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustaccountrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjustaccountinstruction" type="{http://swifta.com/sub/mats/operation/financial/v1.0}adjustaccounttransactionparameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustaccountrequest", propOrder = {
    "description",
    "adjustaccountinstruction"
})
public class Adjustaccountrequest {

    protected String description;
    protected Adjustaccounttransactionparameters adjustaccountinstruction;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the adjustaccountinstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustaccounttransactionparameters }
     *     
     */
    public Adjustaccounttransactionparameters getAdjustaccountinstruction() {
        return adjustaccountinstruction;
    }

    /**
     * Sets the value of the adjustaccountinstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustaccounttransactionparameters }
     *     
     */
    public void setAdjustaccountinstruction(Adjustaccounttransactionparameters value) {
        this.adjustaccountinstruction = value;
    }

}

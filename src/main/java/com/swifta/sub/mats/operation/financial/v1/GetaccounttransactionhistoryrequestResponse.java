
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getaccounttransactionhistoryrequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaccounttransactionhistoryrequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://swifta.com/sub/mats/operation/financial/v1.0}getaccounttransactionhistoryresponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getaccounttransactionhistoryrequestResponse", propOrder = {
    "_return"
})
public class GetaccounttransactionhistoryrequestResponse {

    @XmlElement(name = "return")
    protected Getaccounttransactionhistoryresponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Getaccounttransactionhistoryresponse }
     *     
     */
    public Getaccounttransactionhistoryresponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getaccounttransactionhistoryresponse }
     *     
     */
    public void setReturn(Getaccounttransactionhistoryresponse value) {
        this._return = value;
    }

}

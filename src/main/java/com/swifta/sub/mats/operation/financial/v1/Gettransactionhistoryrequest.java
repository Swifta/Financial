
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gettransactionhistoryrequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gettransactionhistoryrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionhistoryparameter" type="{http://swifta.com/sub/mats/operation/financial/v1.0}gettransactionhistoryparameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gettransactionhistoryrequest", propOrder = {
    "transactionhistoryparameter"
})
public class Gettransactionhistoryrequest {

    protected Gettransactionhistoryparameter transactionhistoryparameter;

    /**
     * Gets the value of the transactionhistoryparameter property.
     * 
     * @return
     *     possible object is
     *     {@link Gettransactionhistoryparameter }
     *     
     */
    public Gettransactionhistoryparameter getTransactionhistoryparameter() {
        return transactionhistoryparameter;
    }

    /**
     * Sets the value of the transactionhistoryparameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gettransactionhistoryparameter }
     *     
     */
    public void setTransactionhistoryparameter(Gettransactionhistoryparameter value) {
        this.transactionhistoryparameter = value;
    }

}

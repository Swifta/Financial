
package com.swifta.sub.mats.operation.financial.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getaccounttransactionhistoryresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaccounttransactionhistoryresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalreturned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accounttransactionhistory" type="{http://swifta.com/sub/mats/operation/financial/v1.0}accountTransactionHistory" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getaccounttransactionhistoryresponse", propOrder = {
    "totalreturned",
    "accounttransactionhistory",
    "extension"
})
public class Getaccounttransactionhistoryresponse {

    protected int totalreturned;
    @XmlElement(nillable = true)
    protected List<AccountTransactionHistory> accounttransactionhistory;
    protected ParameterExtension extension;

    /**
     * Gets the value of the totalreturned property.
     * 
     */
    public int getTotalreturned() {
        return totalreturned;
    }

    /**
     * Sets the value of the totalreturned property.
     * 
     */
    public void setTotalreturned(int value) {
        this.totalreturned = value;
    }

    /**
     * Gets the value of the accounttransactionhistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounttransactionhistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounttransactionhistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountTransactionHistory }
     * 
     * 
     */
    public List<AccountTransactionHistory> getAccounttransactionhistory() {
        if (accounttransactionhistory == null) {
            accounttransactionhistory = new ArrayList<AccountTransactionHistory>();
        }
        return this.accounttransactionhistory;
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

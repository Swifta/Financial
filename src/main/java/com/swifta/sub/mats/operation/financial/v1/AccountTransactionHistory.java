
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountTransactionHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountTransactionHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orginatingresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationtype" type="{http://swifta.com/sub/mats/operation/financial/v1.0}operationType" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="entrytype" type="{http://swifta.com/sub/mats/operation/financial/v1.0}entryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountTransactionHistory", propOrder = {
    "transactionid",
    "orginatingresourceid",
    "destinationresourceid",
    "amount",
    "operationtype",
    "date",
    "entrytype"
})
public class AccountTransactionHistory {

    protected long transactionid;
    protected String orginatingresourceid;
    protected String destinationresourceid;
    protected String amount;
    @XmlSchemaType(name = "string")
    protected OperationType operationtype;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "string")
    protected EntryType entrytype;

    /**
     * Gets the value of the transactionid property.
     * 
     */
    public long getTransactionid() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     */
    public void setTransactionid(long value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the orginatingresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginatingresourceid() {
        return orginatingresourceid;
    }

    /**
     * Sets the value of the orginatingresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginatingresourceid(String value) {
        this.orginatingresourceid = value;
    }

    /**
     * Gets the value of the destinationresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationresourceid() {
        return destinationresourceid;
    }

    /**
     * Sets the value of the destinationresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationresourceid(String value) {
        this.destinationresourceid = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the operationtype property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperationtype() {
        return operationtype;
    }

    /**
     * Sets the value of the operationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperationtype(OperationType value) {
        this.operationtype = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the entrytype property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getEntrytype() {
        return entrytype;
    }

    /**
     * Sets the value of the entrytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setEntrytype(EntryType value) {
        this.entrytype = value;
    }

}


package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getaccounttransactionhistoryrequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaccounttransactionhistoryrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountresource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otheraccountresource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="todate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nooftransactionhistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionentrytype" type="{http://swifta.com/sub/mats/operation/financial/v1.0}entryType" minOccurs="0"/>
 *         &lt;element name="operationtype" type="{http://swifta.com/sub/mats/operation/financial/v1.0}operationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getaccounttransactionhistoryrequest", propOrder = {
    "accountresource",
    "otheraccountresource",
    "fromdate",
    "todate",
    "nooftransactionhistory",
    "transactionid",
    "transactionentrytype",
    "operationtype"
})
public class Getaccounttransactionhistoryrequest {

    protected String accountresource;
    protected String otheraccountresource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar todate;
    protected String nooftransactionhistory;
    protected String transactionid;
    @XmlSchemaType(name = "string")
    protected EntryType transactionentrytype;
    @XmlSchemaType(name = "string")
    protected OperationType operationtype;

    /**
     * Gets the value of the accountresource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountresource() {
        return accountresource;
    }

    /**
     * Sets the value of the accountresource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountresource(String value) {
        this.accountresource = value;
    }

    /**
     * Gets the value of the otheraccountresource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtheraccountresource() {
        return otheraccountresource;
    }

    /**
     * Sets the value of the otheraccountresource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtheraccountresource(String value) {
        this.otheraccountresource = value;
    }

    /**
     * Gets the value of the fromdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromdate() {
        return fromdate;
    }

    /**
     * Sets the value of the fromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromdate(XMLGregorianCalendar value) {
        this.fromdate = value;
    }

    /**
     * Gets the value of the todate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTodate() {
        return todate;
    }

    /**
     * Sets the value of the todate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTodate(XMLGregorianCalendar value) {
        this.todate = value;
    }

    /**
     * Gets the value of the nooftransactionhistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNooftransactionhistory() {
        return nooftransactionhistory;
    }

    /**
     * Sets the value of the nooftransactionhistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNooftransactionhistory(String value) {
        this.nooftransactionhistory = value;
    }

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
     * Gets the value of the transactionentrytype property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getTransactionentrytype() {
        return transactionentrytype;
    }

    /**
     * Sets the value of the transactionentrytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setTransactionentrytype(EntryType value) {
        this.transactionentrytype = value;
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

}

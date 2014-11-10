
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for adjustaccounttransactionparameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustaccounttransactionparameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orginatingresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateoftransaction" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="adjusttype" type="{http://swifta.com/sub/mats/operation/financial/v1.0}adjustmentType" minOccurs="0"/>
 *         &lt;element name="originatingresourcedescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationresourcedescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustaccounttransactionparameters", propOrder = {
    "orginatingresourceid",
    "destinationresourceid",
    "amount",
    "dateoftransaction",
    "adjusttype",
    "originatingresourcedescription",
    "destinationresourcedescription"
})
public class Adjustaccounttransactionparameters {

    protected String orginatingresourceid;
    protected String destinationresourceid;
    protected String amount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateoftransaction;
    @XmlSchemaType(name = "string")
    protected AdjustmentType adjusttype;
    protected String originatingresourcedescription;
    protected String destinationresourcedescription;

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
     * Gets the value of the dateoftransaction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateoftransaction() {
        return dateoftransaction;
    }

    /**
     * Sets the value of the dateoftransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateoftransaction(XMLGregorianCalendar value) {
        this.dateoftransaction = value;
    }

    /**
     * Gets the value of the adjusttype property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType }
     *     
     */
    public AdjustmentType getAdjusttype() {
        return adjusttype;
    }

    /**
     * Sets the value of the adjusttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType }
     *     
     */
    public void setAdjusttype(AdjustmentType value) {
        this.adjusttype = value;
    }

    /**
     * Gets the value of the originatingresourcedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingresourcedescription() {
        return originatingresourcedescription;
    }

    /**
     * Sets the value of the originatingresourcedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingresourcedescription(String value) {
        this.originatingresourcedescription = value;
    }

    /**
     * Gets the value of the destinationresourcedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationresourcedescription() {
        return destinationresourcedescription;
    }

    /**
     * Sets the value of the destinationresourcedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationresourcedescription(String value) {
        this.destinationresourcedescription = value;
    }

}


package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustaccountresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustaccountresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode" type="{http://swifta.com/sub/mats/operation/financial/v1.0}statusCode" minOccurs="0"/>
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
@XmlType(name = "adjustaccountresponse", propOrder = {
    "statusCode",
    "extension"
})
public class Adjustaccountresponse {

    @XmlElement(name = "StatusCode")
    @XmlSchemaType(name = "string")
    protected StatusCode statusCode;
    protected ParameterExtension extension;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
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

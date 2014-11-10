
package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASH_IN"/>
 *     &lt;enumeration value="CASH_OUT"/>
 *     &lt;enumeration value="ADJUST"/>
 *     &lt;enumeration value="ADJUST_FEE"/>
 *     &lt;enumeration value="ADJUST_COMMISSION"/>
 *     &lt;enumeration value="FLOAT_TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationType")
@XmlEnum
public enum OperationType {

    CASH_IN,
    CASH_OUT,
    ADJUST,
    ADJUST_FEE,
    ADJUST_COMMISSION,
    FLOAT_TRANSFER;

    public String value() {
        return name();
    }

    public static OperationType fromValue(String v) {
        return valueOf(v);
    }

}


package com.swifta.sub.mats.operation.financial.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="adjustmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADJUST"/>
 *     &lt;enumeration value="ADJUST_FEE"/>
 *     &lt;enumeration value="ADJUST_COMMISSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "adjustmentType")
@XmlEnum
public enum AdjustmentType {

    ADJUST,
    ADJUST_FEE,
    ADJUST_COMMISSION;

    public String value() {
        return name();
    }

    public static AdjustmentType fromValue(String v) {
        return valueOf(v);
    }

}

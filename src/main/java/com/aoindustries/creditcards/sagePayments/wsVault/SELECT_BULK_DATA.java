/**
 * SELECT_BULK_DATA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.creditcards.sagePayments.wsVault;

public class SELECT_BULK_DATA  implements java.io.Serializable {
    private java.lang.String m_ID;

    private java.lang.String m_KEY;

    private java.lang.String[] GUID;

    public SELECT_BULK_DATA() {
    }

    public SELECT_BULK_DATA(
           java.lang.String m_ID,
           java.lang.String m_KEY,
           java.lang.String[] GUID) {
           this.m_ID = m_ID;
           this.m_KEY = m_KEY;
           this.GUID = GUID;
    }


    /**
     * Gets the m_ID value for this SELECT_BULK_DATA.
     * 
     * @return m_ID
     */
    public java.lang.String getM_ID() {
        return m_ID;
    }


    /**
     * Sets the m_ID value for this SELECT_BULK_DATA.
     * 
     * @param m_ID
     */
    public void setM_ID(java.lang.String m_ID) {
        this.m_ID = m_ID;
    }


    /**
     * Gets the m_KEY value for this SELECT_BULK_DATA.
     * 
     * @return m_KEY
     */
    public java.lang.String getM_KEY() {
        return m_KEY;
    }


    /**
     * Sets the m_KEY value for this SELECT_BULK_DATA.
     * 
     * @param m_KEY
     */
    public void setM_KEY(java.lang.String m_KEY) {
        this.m_KEY = m_KEY;
    }


    /**
     * Gets the GUID value for this SELECT_BULK_DATA.
     * 
     * @return GUID
     */
    public java.lang.String[] getGUID() {
        return GUID;
    }


    /**
     * Sets the GUID value for this SELECT_BULK_DATA.
     * 
     * @param GUID
     */
    public void setGUID(java.lang.String[] GUID) {
        this.GUID = GUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SELECT_BULK_DATA)) return false;
        SELECT_BULK_DATA other = (SELECT_BULK_DATA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_ID==null && other.getM_ID()==null) || 
             (this.m_ID!=null &&
              this.m_ID.equals(other.getM_ID()))) &&
            ((this.m_KEY==null && other.getM_KEY()==null) || 
             (this.m_KEY!=null &&
              this.m_KEY.equals(other.getM_KEY()))) &&
            ((this.GUID==null && other.getGUID()==null) || 
             (this.GUID!=null &&
              java.util.Arrays.equals(this.GUID, other.getGUID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getM_ID() != null) {
            _hashCode += getM_ID().hashCode();
        }
        if (getM_KEY() != null) {
            _hashCode += getM_KEY().hashCode();
        }
        if (getGUID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGUID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGUID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SELECT_BULK_DATA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.sagepayments.net/web_services/wsVault/wsVault", ">SELECT_BULK_DATA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.sagepayments.net/web_services/wsVault/wsVault", "M_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.sagepayments.net/web_services/wsVault/wsVault", "M_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.sagepayments.net/web_services/wsVault/wsVault", "GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.sagepayments.net/web_services/wsVault/wsVault", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

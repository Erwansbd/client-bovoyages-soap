/**
 * Voyage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyages.services.soap;

public class Voyage  implements java.io.Serializable {
    private fr.gtm.bovoyages.services.soap.Client client;

    private fr.gtm.bovoyages.services.soap.DatesVoyage datesVoyage;

    private java.lang.String descriptif;

    private long id;

    private java.lang.String region;

    private fr.gtm.bovoyages.services.soap.Voyageur[] voyageurs;

    public Voyage() {
    }

    public Voyage(
           fr.gtm.bovoyages.services.soap.Client client,
           fr.gtm.bovoyages.services.soap.DatesVoyage datesVoyage,
           java.lang.String descriptif,
           long id,
           java.lang.String region,
           fr.gtm.bovoyages.services.soap.Voyageur[] voyageurs) {
           this.client = client;
           this.datesVoyage = datesVoyage;
           this.descriptif = descriptif;
           this.id = id;
           this.region = region;
           this.voyageurs = voyageurs;
    }


    /**
     * Gets the client value for this Voyage.
     * 
     * @return client
     */
    public fr.gtm.bovoyages.services.soap.Client getClient() {
        return client;
    }


    /**
     * Sets the client value for this Voyage.
     * 
     * @param client
     */
    public void setClient(fr.gtm.bovoyages.services.soap.Client client) {
        this.client = client;
    }


    /**
     * Gets the datesVoyage value for this Voyage.
     * 
     * @return datesVoyage
     */
    public fr.gtm.bovoyages.services.soap.DatesVoyage getDatesVoyage() {
        return datesVoyage;
    }


    /**
     * Sets the datesVoyage value for this Voyage.
     * 
     * @param datesVoyage
     */
    public void setDatesVoyage(fr.gtm.bovoyages.services.soap.DatesVoyage datesVoyage) {
        this.datesVoyage = datesVoyage;
    }


    /**
     * Gets the descriptif value for this Voyage.
     * 
     * @return descriptif
     */
    public java.lang.String getDescriptif() {
        return descriptif;
    }


    /**
     * Sets the descriptif value for this Voyage.
     * 
     * @param descriptif
     */
    public void setDescriptif(java.lang.String descriptif) {
        this.descriptif = descriptif;
    }


    /**
     * Gets the id value for this Voyage.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Voyage.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the region value for this Voyage.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Voyage.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the voyageurs value for this Voyage.
     * 
     * @return voyageurs
     */
    public fr.gtm.bovoyages.services.soap.Voyageur[] getVoyageurs() {
        return voyageurs;
    }


    /**
     * Sets the voyageurs value for this Voyage.
     * 
     * @param voyageurs
     */
    public void setVoyageurs(fr.gtm.bovoyages.services.soap.Voyageur[] voyageurs) {
        this.voyageurs = voyageurs;
    }

    public fr.gtm.bovoyages.services.soap.Voyageur getVoyageurs(int i) {
        return this.voyageurs[i];
    }

    public void setVoyageurs(int i, fr.gtm.bovoyages.services.soap.Voyageur _value) {
        this.voyageurs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Voyage)) return false;
        Voyage other = (Voyage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.datesVoyage==null && other.getDatesVoyage()==null) || 
             (this.datesVoyage!=null &&
              this.datesVoyage.equals(other.getDatesVoyage()))) &&
            ((this.descriptif==null && other.getDescriptif()==null) || 
             (this.descriptif!=null &&
              this.descriptif.equals(other.getDescriptif()))) &&
            this.id == other.getId() &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.voyageurs==null && other.getVoyageurs()==null) || 
             (this.voyageurs!=null &&
              java.util.Arrays.equals(this.voyageurs, other.getVoyageurs())));
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
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getDatesVoyage() != null) {
            _hashCode += getDatesVoyage().hashCode();
        }
        if (getDescriptif() != null) {
            _hashCode += getDescriptif().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getVoyageurs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoyageurs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoyageurs(), i);
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
        new org.apache.axis.description.TypeDesc(Voyage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "voyage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "client"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datesVoyage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datesVoyage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "datesVoyage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voyageurs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voyageurs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "voyageur"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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

/**
 * DatesVoyage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyages.services.soap;

public class DatesVoyage  implements java.io.Serializable {
    private java.util.Calendar dateAller;

    private java.util.Calendar dateRetour;

    private int deleted;

    private long id;

    private int nbrePlaces;

    private float prixHT;

    private int promotion;

    public DatesVoyage() {
    }

    public DatesVoyage(
           java.util.Calendar dateAller,
           java.util.Calendar dateRetour,
           int deleted,
           long id,
           int nbrePlaces,
           float prixHT,
           int promotion) {
           this.dateAller = dateAller;
           this.dateRetour = dateRetour;
           this.deleted = deleted;
           this.id = id;
           this.nbrePlaces = nbrePlaces;
           this.prixHT = prixHT;
           this.promotion = promotion;
    }


    /**
     * Gets the dateAller value for this DatesVoyage.
     * 
     * @return dateAller
     */
    public java.util.Calendar getDateAller() {
        return dateAller;
    }


    /**
     * Sets the dateAller value for this DatesVoyage.
     * 
     * @param dateAller
     */
    public void setDateAller(java.util.Calendar dateAller) {
        this.dateAller = dateAller;
    }


    /**
     * Gets the dateRetour value for this DatesVoyage.
     * 
     * @return dateRetour
     */
    public java.util.Calendar getDateRetour() {
        return dateRetour;
    }


    /**
     * Sets the dateRetour value for this DatesVoyage.
     * 
     * @param dateRetour
     */
    public void setDateRetour(java.util.Calendar dateRetour) {
        this.dateRetour = dateRetour;
    }


    /**
     * Gets the deleted value for this DatesVoyage.
     * 
     * @return deleted
     */
    public int getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this DatesVoyage.
     * 
     * @param deleted
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the id value for this DatesVoyage.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this DatesVoyage.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the nbrePlaces value for this DatesVoyage.
     * 
     * @return nbrePlaces
     */
    public int getNbrePlaces() {
        return nbrePlaces;
    }


    /**
     * Sets the nbrePlaces value for this DatesVoyage.
     * 
     * @param nbrePlaces
     */
    public void setNbrePlaces(int nbrePlaces) {
        this.nbrePlaces = nbrePlaces;
    }


    /**
     * Gets the prixHT value for this DatesVoyage.
     * 
     * @return prixHT
     */
    public float getPrixHT() {
        return prixHT;
    }


    /**
     * Sets the prixHT value for this DatesVoyage.
     * 
     * @param prixHT
     */
    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }


    /**
     * Gets the promotion value for this DatesVoyage.
     * 
     * @return promotion
     */
    public int getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this DatesVoyage.
     * 
     * @param promotion
     */
    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatesVoyage)) return false;
        DatesVoyage other = (DatesVoyage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateAller==null && other.getDateAller()==null) || 
             (this.dateAller!=null &&
              this.dateAller.equals(other.getDateAller()))) &&
            ((this.dateRetour==null && other.getDateRetour()==null) || 
             (this.dateRetour!=null &&
              this.dateRetour.equals(other.getDateRetour()))) &&
            this.deleted == other.getDeleted() &&
            this.id == other.getId() &&
            this.nbrePlaces == other.getNbrePlaces() &&
            this.prixHT == other.getPrixHT() &&
            this.promotion == other.getPromotion();
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
        if (getDateAller() != null) {
            _hashCode += getDateAller().hashCode();
        }
        if (getDateRetour() != null) {
            _hashCode += getDateRetour().hashCode();
        }
        _hashCode += getDeleted();
        _hashCode += new Long(getId()).hashCode();
        _hashCode += getNbrePlaces();
        _hashCode += new Float(getPrixHT()).hashCode();
        _hashCode += getPromotion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatesVoyage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "datesVoyage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateAller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRetour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRetour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbrePlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbrePlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixHT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prixHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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

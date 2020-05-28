
package com.bnsf.examples.railyard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yardid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yardname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="railcarid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="railcartype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="linkfromstation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linktostation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "yardid",
    "yardname",
    "railcarid",
    "railcartype",
    "linkid",
    "linkfromstation",
    "linktostation"
})
@XmlRootElement(name = "RailyardData")
public class RailyardData {

    protected int yardid;
    @XmlElement(required = true)
    protected String yardname;
    @XmlElement(required = true)
    protected String railcarid;
    @XmlElement(required = true)
    protected String railcartype;
    protected int linkid;
    @XmlElement(required = true)
    protected String linkfromstation;
    @XmlElement(required = true)
    protected String linktostation;

    /**
     * Gets the value of the yardid property.
     * 
     */
    public int getYardid() {
        return yardid;
    }

    /**
     * Sets the value of the yardid property.
     * 
     */
    public void setYardid(int value) {
        this.yardid = value;
    }

    /**
     * Gets the value of the yardname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardname() {
        return yardname;
    }

    /**
     * Sets the value of the yardname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardname(String value) {
        this.yardname = value;
    }

    /**
     * Gets the value of the railcarid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailcarid() {
        return railcarid;
    }

    /**
     * Sets the value of the railcarid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailcarid(String value) {
        this.railcarid = value;
    }

    /**
     * Gets the value of the railcartype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailcartype() {
        return railcartype;
    }

    /**
     * Sets the value of the railcartype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailcartype(String value) {
        this.railcartype = value;
    }

    /**
     * Gets the value of the linkid property.
     * 
     */
    public int getLinkid() {
        return linkid;
    }

    /**
     * Sets the value of the linkid property.
     * 
     */
    public void setLinkid(int value) {
        this.linkid = value;
    }

    /**
     * Gets the value of the linkfromstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkfromstation() {
        return linkfromstation;
    }

    /**
     * Sets the value of the linkfromstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkfromstation(String value) {
        this.linkfromstation = value;
    }

    /**
     * Gets the value of the linktostation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinktostation() {
        return linktostation;
    }

    /**
     * Sets the value of the linktostation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinktostation(String value) {
        this.linktostation = value;
    }

}

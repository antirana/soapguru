
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="producto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://CapaServicio/}date" minOccurs="0"/>
 *         &lt;element name="num_captura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producto", propOrder = {
    "fecha",
    "numCaptura"
})
public class Producto {

    protected Date fecha;
    @XmlElement(name = "num_captura")
    protected String numCaptura;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFecha(Date value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad numCaptura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCaptura() {
        return numCaptura;
    }

    /**
     * Define el valor de la propiedad numCaptura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCaptura(String value) {
        this.numCaptura = value;
    }

}


package capaservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the capaservicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebRegistraProducto_QNAME = new QName("http://CapaServicio/", "webRegistraProducto");
    private final static QName _WebRegistraProductoResponse_QNAME = new QName("http://CapaServicio/", "webRegistraProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: capaservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebRegistraProductoResponse }
     * 
     */
    public WebRegistraProductoResponse createWebRegistraProductoResponse() {
        return new WebRegistraProductoResponse();
    }

    /**
     * Create an instance of {@link WebRegistraProducto }
     * 
     */
    public WebRegistraProducto createWebRegistraProducto() {
        return new WebRegistraProducto();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebRegistraProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webRegistraProducto")
    public JAXBElement<WebRegistraProducto> createWebRegistraProducto(WebRegistraProducto value) {
        return new JAXBElement<WebRegistraProducto>(_WebRegistraProducto_QNAME, WebRegistraProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebRegistraProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webRegistraProductoResponse")
    public JAXBElement<WebRegistraProductoResponse> createWebRegistraProductoResponse(WebRegistraProductoResponse value) {
        return new JAXBElement<WebRegistraProductoResponse>(_WebRegistraProductoResponse_QNAME, WebRegistraProductoResponse.class, null, value);
    }

}

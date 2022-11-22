 
package CapaServicio;


import CapaDTO.Producto;
import CapaNegocio.NegocioProducto;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author x
 */
@WebService(serviceName = "WebServiceProducto")
public class WebServiceProducto {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "webRegistraProducto")
    public void webInsertarProducto(@WebParam(name = "producto") Producto producto) {
        NegocioProducto auxNegocio = new NegocioProducto();
        auxNegocio.insertarTransaccion(producto);
        
    }
            
  

}

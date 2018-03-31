/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ws.blogic;

import javax.jws.WebService;
import javax.jws.WebMethod;
import org.apache.log4j.Logger;

/**
 *
 * @author Mario Ramirez.
 */

@WebService
public class MiServicioWeb {
    
    /**
    * Campo LOG de tipo Logger.
    */
    protected static final Logger LOG = Logger.getLogger(MiServicioWeb.class);

    @WebMethod
    public String saluda(String nombre) {
        String saludo;
        saludo = "Hola " + nombre;
        LOG.info(saludo);
        return saludo;
    }

}

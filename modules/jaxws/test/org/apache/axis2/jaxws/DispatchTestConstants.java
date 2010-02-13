/*
 * Copyright 2004,2005 The Apache Software Foundation.
 * Copyright 2006 International Business Machines Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.axis2.jaxws;

import javax.xml.namespace.QName;

public class DispatchTestConstants {

    public static final String URL = "http://localhost:8080/axis2/services/EchoService";
    public static final QName QNAME_SERVICE = new QName("http://ws.apache.org/axis2", "EchoService");
    public static final QName QNAME_PORT = new QName("http://ws.apache.org/axis2", "EchoServiceSOAP11port0");

    private static final String sampleSoapEnvelopeHeader = 
        "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" + 
        "<soap:Body>";
    
    private static final String sampleSoapEnvelopeFooter =
        "</soap:Body>" + 
        "</soap:Envelope>";
    
    public static final String sampleBodyContent = 
        "<ns1:echoString xmlns:ns1=\"http://test\">" + 
        "<ns1:input xmlns=\"http://test\">HELLO THERE!!!</ns1:input>" + 
        "</ns1:echoString>";
    
    public static final String sampleSoapMessage = 
        sampleSoapEnvelopeHeader +
        sampleBodyContent + 
        sampleSoapEnvelopeFooter;
}

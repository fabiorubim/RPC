package br.com.quarkup.rpcclient;

import br.com.quarkup.rpcclient.services.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) throws MalformedURLException {
        URL serviceUrl = new URL("http://localhost:8888/rpc/helloWorld?wsdl");

        QName serviceQName = new QName("http://impl.services.rpc.quarkup.com.br/", "HelloWorldImplService");
        Service service = Service.create(serviceUrl, serviceQName);

        QName helloWorldQName = new QName("http://impl.services.rpc.quarkup.com.br/", "HelloWorldImplPort");
        HelloWorld hello = service.getPort(helloWorldQName, HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("Hello World!"));
    }
}

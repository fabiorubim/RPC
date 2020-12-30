package br.com.quarkup.rpc.services.impl;

import br.com.quarkup.rpc.services.HelloWorld;

import javax.jws.WebService;

@WebService(endpointInterface ="br.com.quarkup.rpc.services.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "This is the message from server: " + name;
    }
}

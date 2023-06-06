package org.juangarcia.interfacepoo.homework25;

abstract public class Electronic implements IElectronic{
    String Factory;

    public Electronic(String factory) {
        Factory = factory;
    }

    @Override
    public String getFactory() {
        return null;
    }
}

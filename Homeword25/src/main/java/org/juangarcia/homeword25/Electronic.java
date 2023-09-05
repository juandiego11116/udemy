package org.juangarcia.homeword25;

abstract public class Electronic implements IElectronic{
    String fabricator;

    public Electronic(String fabricator) {
        this.fabricator = fabricator;
    }

    @Override
    public String getFabricator() {
        return fabricator;
    }
}

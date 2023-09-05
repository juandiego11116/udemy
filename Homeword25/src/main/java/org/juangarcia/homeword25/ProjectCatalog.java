package org.juangarcia.homeword25;

import java.util.Date;

public class ProjectCatalog {
    public static void main(String[] args) {
        IProduct[] products = new IProduct[4];
        Date today = new Date();

        products[0] = new TvLcd("LG",50, 500);
        products[1] = new IPhone("Apple", "Black", "14 Pro Max", 2000);
        products[2] = new Comics(20,"Superman");
        products[3] = new Book(24, today,"Juan Diego","helloworld", "hola");

        for(IProduct product: products){
            System.out.print("Tipo de: " + product.getClass().getName().replaceAll("org.juangarcia.homeword25.",""));
            System.out.print(" - ");
            System.out.print("Precio: " + product.getPrice());
            System.out.print(" - ");
            System.out.print("Precio final: " + product.getPriceSell());
            if(product instanceof IElectronic){
                System.out.println("(IElectronic)product = " + ((IElectronic) product).getFabricator());
                if (product instanceof IPhone){
                    System.out.println("Model = " + ((IPhone) product).getModel());
                }
                if(product instanceof TvLcd){
                    System.out.println("Inches = " +((TvLcd) product).getInch());
                }

            }
            if(product instanceof Book){
                System.out.println("Title = " + ((Book) product).getTitle() );
                System.out.println("Author = " + ((Book) product).author);
                if (product instanceof Comics){
                    System.out.println("Character = " + ((Comics) product).getCharacter());
                }
            }
        }

    }
}
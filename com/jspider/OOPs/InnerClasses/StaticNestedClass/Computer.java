package com.jspider.OOPs.InnerClasses.StaticNestedClass;

public class Computer {

    // Data member or Computer Class Attributes
    private String brand;
    private String model;
    private OperatingSystem os;

    // Constructor to inti the Computer Object
    Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    // Inner Class non-static
    class OperatingSystem{

        // Data member or OperatingSystem class Attributes
        private String osName;

        // OperatingSystem Constructor to init object of OperatingSystem class
        OperatingSystem(String osName){
            this.osName = osName;
        }

        // Display Information of Computer with OS class Associated
        public void displayInfo(){
            System.out.println(brand+" Computer Model "+ model+" OS "+osName);
        }
    }

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type: "+type);
        }
    }
}

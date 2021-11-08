/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodp_as4;

/**
 *
 * @author User
 */
public class Pattern {
    
    public static void main(String[] args) {
        
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        Computer component =  builder.setBrand("MSI").setModel("X473").setProcessor("i7").setGpu("Nvidea").setRam("8GB").setSsd("250GB").build();
        System.out.println(component);
        
    }
    
}

class Computer{

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @return the gpu
     */
    public String getGpu() {
        return gpu;
    }

    /**
     * @return the ssd
     */
    public String getSsd() {
        return ssd;
    }
    
    private final String brand;
    private final String model;
    private final String processor;
    private final String ram;
    private final String gpu;
    private final String ssd;

    public Computer(ComputerBuilder cb) {
        this.brand = cb.brand;
        this.model = cb.model;
        this.processor = cb.processor;
        this.ram = cb.ram;
        this.gpu = cb.gpu;
        this.ssd = cb.ssd;
    }
    
    @Override
    public String toString() {
        return "Brand = " + brand +
                "\nModel = " + model +
                "\nProcessor = " + processor +
                "\nRAM = " + ram +
                "\nGPU = " + gpu +
                "\nSSD = " + ssd;
    }
    
    static class ComputerBuilder{

        /**
         * @param processor the processor to set
         */
        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        
        public Computer build(){
            Computer u = new Computer(this);
            return u;
        }

        /**
         * @param brand the brand to set
         */
        public ComputerBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        /**
         * @param model the model to set
         */
        public ComputerBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        /**
         * @param ram the ram to set
         */
        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        /**
         * @param gpu the gpu to set
         */
        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * @param ssd the ssd to set
         */
        public ComputerBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }
        
        private String brand;
        private String model;
        private String processor;
        private String ram;
        private String gpu;
        private String ssd;
        
    }
    
}
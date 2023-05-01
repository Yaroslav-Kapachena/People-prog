package com.example.Computer;

import com.example.People.Player;

public class Computer implements Player {
    private  String brand;
    private  String processor;
    private  String ram;
    public Computer (){
    }
    public Computer(String brand, String processor, String ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void walk() {
        System.out.println("Компьютер не умеет ходит");
    }

    @Override
    public void take() {
        System.out.println("Компьютер не умеет брать что-либо");
    }

    @Override
    public String toString() {
        return  brand+" . " + processor+" . " + ram ;
    }
}

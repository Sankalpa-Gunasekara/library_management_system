package com.example.oop_and_solid;

class vehicle {

    String vehicleName;
    private String vehicleBrand;

    public void setBrand(String brand) {
        this.vehicleBrand = brand;
    }

    public String getBrand() {
        return this.vehicleBrand;
    }
}

class sandbox {

    public static void main(String[] args) {

        vehicle v1 = new vehicle();
        v1.setBrand("Toyota");
        System.out.println(v1.getBrand());

    }

}

class Animal {

    private String name;

    public void setName(String name) {

        this.name = name;

    }

    public String getName(){

        return this.name;
    }

}

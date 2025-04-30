package Assignment2_BuilderPattern;

public class CarBuilder {
    
    private String modelName = "Default Model";
    private String engineType = "Petrol";
    private String color = "White";
    private String transmission = "Manual";
    private boolean sunroof = false;
    private boolean infotainmentSystem = false;

 
    public CarBuilder setModelName(String modelName) {
        this.modelName = modelName;
        return this;  
    }

    public CarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;  
    }

   
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;  
    }

   
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;  
    }

    
    public CarBuilder setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
        return this; 
    }

   
    public CarBuilder setInfotainmentSystem(boolean infotainmentSystem) {
        this.infotainmentSystem = infotainmentSystem;
        return this;  
    }

    public Car build() {
        return new Car(modelName, engineType, color, transmission, sunroof, infotainmentSystem);
    }
}

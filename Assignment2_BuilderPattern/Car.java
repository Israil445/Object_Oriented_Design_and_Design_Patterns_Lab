package Assignment2_BuilderPattern;

public class Car {
    private String modelName;
    private String engineType;
    private String color;
    private String transmission;
    private boolean sunroof;
    private boolean infotainmentSystem;
    
    public Car(String modelName, String engineType, String color, String transmission,
               boolean sunroof, boolean infotainmentSystem) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.color = color;
        this.transmission = transmission;
        this.sunroof = sunroof;
        this.infotainmentSystem = infotainmentSystem;
    }

   
    public String toString() {
        
        return "Model Name=" + modelName + "\nEngine Type=" + engineType + "\nColor=" + color
                + "\nTransmission=" + transmission + "\nSunroof=" + (this.sunroof==true ? "Yes":"No") + "\nInfotainment System=" + (this.infotainmentSystem==true ? "Yes":"No");
    }
}

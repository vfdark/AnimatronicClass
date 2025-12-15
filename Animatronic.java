public class Animatronic{
    String name;
    String type;
    String location;
    int AgressionLevel;
    boolean isActive;
    
    public Animatronic(String name, String type, String location, int AgressionLevel, boolean isActive){
        this.name = name;
        this.type = type;
        this.location = location;
        this.AgressionLevel = AgressionLevel;
        this.isActive = isActive;
    }
    public void Act(){
        if (!isActive){
            System.out.println(name + " is inactive.");
        } else {
            System.out.println(name + " is active and has an aggression level of " + AgressionLevel + ".");
        }
    }
    
}
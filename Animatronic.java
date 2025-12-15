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
            return;
        }
        if (AgressionLevel > 7){
            System.out.println(name + " is attacking!");
        } else if (AgressionLevel > 4){
            System.out.println(name + " is moving closer.");
        } else {
            System.out.println(name + " is idling.");
        }
    }

}
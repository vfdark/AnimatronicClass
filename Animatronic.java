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
    public void DisplayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
        System.out.println("Agression Level: " + AgressionLevel);
        System.out.println("Active: " + isActive);
    }
    public static void main(String[] args) {
        Animatronic animatronic1 = new Animatronic("Freddy", "Bear", "Stage", 8, true);
        Animatronic animatronic2 = new Animatronic("Bonnie", "Rabbit", "Backstage", 5, true);
        Animatronic animatronic3 = new Animatronic("Chica", "Chicken", "Kitchen", 3, false);
        
        animatronic1.DisplayInfo();
        animatronic1.Act();
        animatronic2.DisplayInfo();
        animatronic2.Act();
        animatronic3.DisplayInfo();
        animatronic3.Act();
    }

}



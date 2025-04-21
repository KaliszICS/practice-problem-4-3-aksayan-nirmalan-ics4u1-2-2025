public class Chair {
    private int legs;
    private String material;

    public Chair(){
        this.legs=4;
        this.material="wood";
    }
    public Chair(int legs){
        this.legs=legs;
        this.material="wood";
    }
    public Chair(int legs, String materials){
        this.legs=legs;
        this.material=materials;
    }

    public int getLegs(){
        return legs;
    }
    public String getMaterial(){
        return material;
    }
}

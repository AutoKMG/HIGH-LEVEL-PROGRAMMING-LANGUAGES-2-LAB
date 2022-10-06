public class RollerCoaster {
    private String name;
    private String world;
    private int height;
    private int time;

    public RollerCoaster(String name, String world, int height, int time){
        this.name = name;
        this.world = world;
        this.height = height;
        this.time = time;
    }

    @Override
    public String toString(){
        return this.name + "(" + this.world + ")" + ": "+ this.time;
    }

}

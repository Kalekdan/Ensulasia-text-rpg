package main.java.com.pixolestudios.items;

public abstract class Item {
    private String name;
    private float value;
    private float weight;

    protected Item(String name, float value, float weight){
        this.name = name;
        this.value = value;
        this.weight = weight;
    }
}

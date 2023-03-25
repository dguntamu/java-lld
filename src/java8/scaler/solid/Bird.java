package java8.scaler.bird;

public abstract class Bird {
    private String name;
    private Integer birdType;
    private String color;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirdType() {
        return birdType;
    }

    public void setBirdType(Integer birdType) {
        this.birdType = birdType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void breath(){
        System.out.println("Breathing");
    }
}

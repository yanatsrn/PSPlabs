package lab3.entities;

public class Film {
    String name;
    String producer;
    int minutes;
    String audience;

    public Film() {
    }

    public Film(int minutes, String audience) {
        this.minutes = minutes;
        this.audience = audience;
    }

    public Film(String producer, int minutes, String audience) {
        this.producer = producer;
        this.minutes = minutes;
        this.audience = audience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "Film{" +
                "producer='" + producer + '\'' +
                ", minutes=" + minutes +
                ", audience='" + audience + '\'' +
                '}';
    }

    public void name(String audience) {
        if(audience.equals("18+"))
        System.out.println("Подростками младше 18 нельзя смотреть фильм" + getName());
    }
}

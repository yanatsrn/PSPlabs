package lab3.entities;

public class Cartoon extends Film {

    String painter;
    String style;

    public Cartoon() {
    }

    public Cartoon(String painter, String style) {
        this.painter = painter;
        this.style = style;
    }

    public Cartoon(String producer, int minutes, String audience, String painter, String style) {
        super(producer, minutes, audience);
        this.painter = painter;
        this.style = style;
    }

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Cartoon{" +
                "painter='" + painter + '\'' +
                ", style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", minutes=" + minutes +
                ", audience='" + audience + '\'' +
                '}';
    }

    public void name() {
        System.out.println("Мультик" + getName() + " в рисовке от художника " + getPainter());
    }
}

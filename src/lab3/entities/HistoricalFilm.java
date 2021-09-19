package lab3.entities;

public class HistoricalFilm extends Film{
    String period;
    Enum<Quality> qualityOfAccuracy = Quality.NORMAL;

    public HistoricalFilm() {
    }

    public HistoricalFilm(String period, Enum<Quality> qualityOfAccuracy) {
        this.period = period;
        this.qualityOfAccuracy = qualityOfAccuracy;
    }

    public HistoricalFilm(String producer, int minutes, String audience, String period, Enum<Quality> qualityOfAccuracy) {
        super(producer, minutes, audience);
        this.period = period;
        this.qualityOfAccuracy = qualityOfAccuracy;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Enum<Quality> getQualityOfAccuracy() {
        return qualityOfAccuracy;
    }

    public void setQualityOfAccuracy(Enum<Quality> qualityOfAccuracy) {
        this.qualityOfAccuracy = qualityOfAccuracy;
    }

    @Override
    public String toString() {
        return "HistoricalFilm{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", minutes=" + minutes +
                ", audience='" + audience + '\'' +
                ", period='" + period + '\'' +
                ", qualityOfAccuracy=" + qualityOfAccuracy +
                '}';
    }

    public void name(String period, Enum<Quality> quality) {
        if (quality.equals(Quality.IDEAL) || quality.equals(Quality.GOOD)) {
            System.out.println("Исторический фильм " + getName() + " стоит посмотреть, " +
                    "если интересуетесь историей");
        }
    }
}

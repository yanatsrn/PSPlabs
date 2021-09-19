package lab3.entities;

public class MusicalFilm extends Film{

    String instrument;
    int countOfSongs;

    public MusicalFilm() {
    }

    public MusicalFilm(String instrument, int countOfSongs) {
        this.instrument = instrument;
        this.countOfSongs = countOfSongs;
    }

    public MusicalFilm(String producer, int minutes, String audience, String instrument, int countOfSongs) {
        super(producer, minutes, audience);
        this.instrument = instrument;
        this.countOfSongs = countOfSongs;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getCountOfSongs() {
        return countOfSongs;
    }

    public void setCountOfSongs(int countOfSongs) {
        this.countOfSongs = countOfSongs;
    }

    @Override
    public String toString() {
        return "MusicalFilm{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", minutes=" + minutes +
                ", audience='" + audience + '\'' +
                ", instrument='" + instrument + '\'' +
                ", countOfSongs=" + countOfSongs +
                '}';
    }

    @Override
    public void name(String audience) {
        if(audience.equals("14+"))
            System.out.println("Детям младше 14 нельзя смотреть мюзикл" + getName());
    }
}

public class Radio {
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    private int currentStation;
    private int numberOfStations = 10;
    private final int firstStation = 0;
    private int lastStation = calculateLastStation();

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.lastStation = calculateLastStation();
    }

    public Radio(int numberOfStations, int currentStation, int currentVolume) {
        this.numberOfStations = numberOfStations;
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;
        this.lastStation = calculateLastStation();
    }

    public int calculateLastStation() {
        return firstStation + numberOfStations - 1;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void nextStation() {
        if (currentStation < lastStation) {
            currentStation++;
        } else {
            currentStation = firstStation;
        }
    }

    public void prevStation() {
        if (currentStation > firstStation) {
            currentStation--;
        } else {
            currentStation = lastStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < firstStation) {
            return;
        }
        if (currentStation > lastStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}

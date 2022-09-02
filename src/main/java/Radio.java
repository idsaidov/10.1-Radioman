public class Radio {
    private int currentStation;
    private int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;
    public int firstStation = 0;
    public int lastStation = 9;

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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseTheSoundVolumeLevel() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceTheSoundVolumeLevel() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}

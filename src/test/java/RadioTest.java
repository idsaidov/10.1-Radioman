import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RadioTest {
    @Test
    public void shouldCreateDefaultRadio() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.getLastStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateCustomRadio() {
        Radio radio = new Radio(20);
        int expected = 19;
        int actual = radio.getLastStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/nextStation.csv")
    public void shouldSetNextStation(String name, int numberOfStations, int CurrentStation, int expected) {
        Radio radio = new Radio(numberOfStations, CurrentStation, 0);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/prevStation.csv")
    public void shouldSetPrevStation(String name, int numberOfStations, int CurrentStation, int expected) {
        Radio radio = new Radio(numberOfStations, CurrentStation, 0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/setStation.csv")
    public void shouldSetStation(String name, int CurrentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(CurrentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/increaseVolume.csv")
    public void shouldIncreaseVolume(String name, int volume, int expected) {
        Radio radio = new Radio(0, 0, volume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/decreaseVolume.csv")
    public void shouldDecreaseVolume(String name, int volume, int expected) {
        Radio radio = new Radio(0, 0, volume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
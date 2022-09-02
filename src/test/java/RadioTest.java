import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/nextStation.csv")
    void shouldSetNextStation(String name, int station, int expected) {
        radio.setCurrentStation(station);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/prevStation.csv")
    void shouldSetPrevStation(String name, int station, int expected) {
        radio.setCurrentStation(station);
        radio.prevStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/setStation.csv")
    void shouldSetStation(String name, int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/increaseVolume.csv")
    void shouldIncreaseVolume(String name, int volume, int expected) {
        radio.setCurrentVolume(volume);
        radio.increaseTheSoundVolumeLevel();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/decreaseVolume.csv")
    void shouldDecreaseVolume(String name, int volume, int expected) {
        radio.setCurrentVolume(volume);
        radio.reduceTheSoundVolumeLevel();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest()
    @CsvFileSource(files="src/test/resources/setCurrentVolume.csv")
    void shouldSetCurrentVolume(String name, int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
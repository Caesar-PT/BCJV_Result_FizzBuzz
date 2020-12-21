import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Chia hết cho 3")
    void Chiahetcho3() {
        int number = 9;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chia hết cho 5")
    void Chiahetcho5() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chia hết cho 3 va 5")
    void Chiahetcho35() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong Chia hết cho 3 va 5")
    void KhongChiahetcho35() {
        int number = 4;
        String expected = "Bon";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chuoi chua 3")
    void Chuoichua3() {
        int number = 137;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chuoi chua 5")
    void Chuoichua5() {
        int number = 157;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chuoi nho hon 100")
    void Chuoinhohon100() {
        int number = 82;
        String expected = "Tam Hai";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chuoi lon hon 100")
    void Chuoilonhon100() {
        int number = 101;
        String expected = "101";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

}
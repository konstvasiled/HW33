package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MultiplyTest {
    @Test multiply_test_instance() {
        assertThat(Calculator.multiply(2.0, 2.0), instanceOf(Double.class)); }
    @Test multiply_test_m2() {
        assertThat(Calculator.multiply(2.0, 2.0), equalTo(4.0)); }
    @Test multiply_test_m3() {
        assertThat(Calculator.multiply(2.0, 2.0, 2.0), equalTo(8.0)); }
    @Test multiply_test_m4() {
        assertThat(Calculator.multiply(2.0, 2.0,2.0,2.0), equalTo(16.0));}
}

package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubstractTest {
    @Test public void substract_test_instance() {
        assertThat(Calculator.subtract(4.0, 2.0), instanceOf(Double.class));}
    @Test public void substract_test_s2() {
        assertThat(Calculator.subtract(3.0, 2.0), equalTo(1.0));}
    @Test public void substract_test_s3() {
        assertThat(Calculator.subtract(6.0, 3.0, 2.0), equalTo(1.0));}
    @Test public void substract_test_s4() {
        assertThat(Calculator.subtract(7.0, 3.0, 2.0, 1.0), equalTo(1.0));}
}

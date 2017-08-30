package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AddTest {
    @Test public void add_test_instance() {
        assertThat(Calculator.add(2.0, 2.0), instanceOf(Double.class));}
    @Test public void add_test_sum2() {
        assertThat(Calculator.add(2.0, 2.0), equalTo(4.0));}
    @Test public void add_test_sum3() {
        assertThat(Calculator.add(2.0, 2.0, 2.0), equalTo(6.0));}
    @Test public void add_test_sum4() {
        assertThat(Calculator.add(2.0, 2.0, 2.0, 2.0), equalTo(8.0));}
}

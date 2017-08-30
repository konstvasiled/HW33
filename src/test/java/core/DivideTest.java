package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DivideTest {
    @Test public void divide_test_instancecheck() {
        assertThat(Calculator.divide(4.0, 2.0), instanceOf(Double.class));}
    @Test public void divide_test_div2() {
        assertThat(Calculator.divide(8.0, 2.0), equalTo(4.0));}
    @Test public void voiddivide_test_div3() {
        assertThat(Calculator.divide(16.0, 2.0, 4.0), equalTo(2.0)); }
    @Test public void divide_test_div4() {
        assertThat(Calculator.divide(30.0, 2.0, 3.0, 2.0), equalTo(2.5));}
}

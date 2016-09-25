package ua.od.hillel.tips;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TipsForServiceTest {
    double total;

    @Before
    public void setUp() {
        total = 100.50;
    }

    @Test
    public void terribleServiceTest() {
        TipsForService terrible = new TerribleService();
        assertThat(terrible.tipsForService(total), is(0.));
    }

    @Test
    public void poorServiceTest() {
        TipsForService poor = new PoorService();
        assertThat(poor.tipsForService(total), is(5.025));
    }

    @Test
    public void goodServiceTest() {
        TipsForService good = new GoodService();
        assertThat(good.tipsForService(total), is(10.05));
    }

    @Test
    public void greatServiceTest() {
        TipsForService great = new GreatService();
        assertThat(great.tipsForService(total), is(15.075));
    }

    @Test
    public void excellentServiceTest() {
        TipsForService excellent = new ExcellentService();
        assertThat(excellent.tipsForService(total), is(20.10));
    }
}

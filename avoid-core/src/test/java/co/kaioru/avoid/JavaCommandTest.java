package co.kaioru.avoid;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class JavaCommandTest {

    @Rule
    public ExpectedException exceptions = ExpectedException.none();

    private SimpleCommandRegistry<SimpleContext> registry;

    @Before
    public void setup() {
        this.registry = new SimpleCommandRegistry<>();
    }

}

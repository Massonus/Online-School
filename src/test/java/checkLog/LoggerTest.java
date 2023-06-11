package checkLog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LoggerTest {

    private Logger target;
    private List<String> stringList = new ArrayList<>();

    @Test
    void addInfo() {
        assertThrows(IllegalAccessError.class, () -> target.addInfo("info", "value"));
    }
}
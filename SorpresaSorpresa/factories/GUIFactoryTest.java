package SorpresaSorpresa.factories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.internal.util.reflection.Whitebox;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GUIFactoryTest {

    @InjectMocks
    private GUIFactory underTest;

    @org.junit.jupiter.api.Test
    void createButton() {
    }

    @org.junit.jupiter.api.Test
    void createCheckbox() {
    }

    @Nested
    class WhenCreatingButton {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenCreatingCheckbox {
        @BeforeEach
        void setup() {
        }
    }
}
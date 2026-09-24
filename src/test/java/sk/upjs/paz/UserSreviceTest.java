package sk.upjs.paz;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSreviceTest {

    @org.junit.jupiter.api.Test
    public void test() {
        var userService = new User_Srevice(Collections.emptyList());

        var got = userService.computeGenderRatio();

        assertEquals(0.0, got.boys());
    }
}

package sk.upjs.paz;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSreviceTest {

    @org.junit.jupiter.api.Test
    public void test_0_data_computeGenderRatio() {
        var userService = new User_Srevice(Collections.emptyList());

        var got = userService.computeGenderRatio();

        assertEquals(new GenderRatio(0,0,0), got);
    }

    @org.junit.jupiter.api.Test
    public void test_normal_computeGenderRatio() {
        var userService = new User_Srevice(
                List.of(
                new User(1L,
                        "johan",
                        "joh228",
                        User.Gender.MALE,
                        LocalDate.MIN,
                        User.Role.STUDENT
                        ),
        new User(2L,
                "johana",
                "joha228",
                User.Gender.FEMALE,
                LocalDate.MAX,
                User.Role.STUDENT
        ))


        );

        var got = userService.computeGenderRatio();
        assertEquals(new GenderRatio(0.5,0.5,0), got);
    }
}

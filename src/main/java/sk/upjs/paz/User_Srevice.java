package sk.upjs.paz;

import java.util.List;

public class User_Srevice {
    private final List<User> database;


    public User_Srevice(List<User> database) {
        this.database = database;
    }

    public GenderRatio computeGenderRatio() {
        if (this.database.isEmpty()) {
            return new GenderRatio(0,0,0);
        }
        double boys_count = 0;
        double girls_count = 0;
        double unknows_count = 0;
        for (User user : database) {
            if (user.gendr() == User.Gender.MALE){
                boys_count++;
            }
            if (user.gendr() == User.Gender.FEMALE){
                girls_count++;
            }
            if (user.gendr() == User.Gender.UNKNOWN){
                unknows_count++;
            }
        }
        double total = boys_count+girls_count+unknows_count;
        return new GenderRatio(boys_count/total, girls_count/total, unknows_count/total);
    }
}

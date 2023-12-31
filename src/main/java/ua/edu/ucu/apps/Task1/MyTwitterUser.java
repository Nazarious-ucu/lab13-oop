package ua.edu.ucu.apps.Task1;


import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MyTwitterUser implements User{

    private TwitterUser tritterUser;

    public MyTwitterUser(TwitterUser tritterUser){
        this.tritterUser = tritterUser;
    }

    @Override
    public String getEmail() {
        return tritterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return tritterUser.getCountry();

    }

    @Override
    public LocalDate getLastActiveDate() {
        return tritterUser.getLastActiveTime();
    }

}

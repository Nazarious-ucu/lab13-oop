package ua.edu.ucu.apps.Task1;

import java.time.LocalDate;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Data
public class MyFacebookUser implements User{

    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();

    }

    @Override
    public LocalDate getLastActiveDate() {
        return facebookUser.getLastActiveTime();
    }

}

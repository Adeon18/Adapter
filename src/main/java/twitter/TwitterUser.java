package twitter;

import interfaces.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser{
    private String getUserMail;
    private String getCountry;
    private Date getLastActiveTime;
}

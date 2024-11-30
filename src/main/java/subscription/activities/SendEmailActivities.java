package subscription.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;
import subscription.model.EmailDetails;

@ActivityInterface
public interface SendEmailActivities {
    @ActivityMethod
    public String sendEmail(EmailDetails details);
}

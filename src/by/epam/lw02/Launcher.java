package by.epam.lw02;

import by.epam.lw02.dto.constant.UserCommand;
import by.epam.lw02.view.SubscriptionView;

/**
 * Created by aleh on 08.03.14.
 */
public class Launcher {

    public static void main(String[] args) {

        SubscriptionView view = new SubscriptionView();
        view.invokeUserCommand(UserCommand.CREATE_LIVE_HACK_BUILDER);
        view.invokeUserCommand(UserCommand.DISPLAY_SUBSCRIPTION);

        view.invokeUserCommand(UserCommand.CREATE_HACKER_BUILDER);
        view.invokeUserCommand(UserCommand.DISPLAY_SUBSCRIPTION);

    }
}

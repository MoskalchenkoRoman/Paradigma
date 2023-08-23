package dz3;
import java.util.logging.Logger;
public class Admin implements iObserver{
    private static final Logger LOGGER = Logger.getLogger(Admin.class.getName());

    @Override
    public void update(String message) {
        LOGGER.info(String.format("%s get new message: %s", this.getClass().getName(), message));
    }

}

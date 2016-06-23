import java.util.Date;
import java.util.List;
import uk.ac.ncl.flowers.polen.*;

public class TestPolen {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String serviceUri = "http://synbio.ncl.ac.uk:8083/notification";
        MessagingSystem messagingSystem = new MessagingSystem.Microbase(serviceUri);

        try {
            List messages = messagingSystem.poll("Part", new Date(2013, 12, 1), 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

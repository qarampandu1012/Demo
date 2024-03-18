package demo.Demo;
import java.time.ZoneId;
import java.util.Set;
import java.util.stream.Collectors;

public class AllAmericanTimeZones {
    public static void main(String[] args) {
        // Get all available time zone IDs
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Filter out time zones related to America
        Set<String> americanZoneIds = allZoneIds.stream()
                .filter(zoneId -> zoneId.startsWith("America/"))
                .collect(Collectors.toSet());

        // Print the American time zones
        System.out.println("All time zones in America:");
        for (String zoneId : americanZoneIds) {
            System.out.println(zoneId);
        }
    }
}

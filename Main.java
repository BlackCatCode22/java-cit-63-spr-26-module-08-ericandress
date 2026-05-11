<dependencies>
    <!-- Web Support -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- HTML Templating -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
class NwsResponse {
    public Properties properties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Properties {
        public String textDescription;
        public String icon;
        public ValueWrapper temperature;
        public ValueWrapper windSpeed;
        public ValueWrapper relativeHumidity;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ValueWrapper {
        public Double value; // NWS returns Celsius/Metric
    }
}

// A clean object to pass to our HTML page
class WeatherView {
    public String city;
    public String description;
    public String tempF;
    public String windMph;
    public String humidity;
    public String iconUrl;

    public WeatherView(String city, NwsResponse res) {
        this.city = city;
        this.description = res.properties.textDescription;
        this.iconUrl = res.properties.icon;

        // Convert Celsius to Fahrenheit
        Double c = res.properties.temperature.value;
        this.tempF = (c != null) ? Math.round((c * 9/5) + 32) + "°F" : "N/A";

        // Convert km/h to mph (approx)
        Double kph = res.properties.windSpeed.value;
        this.windMph = (kph != null) ? Math.round(kph * 0.621371) + " mph" : "0 mph";

        Double hum = res.properties.relativeHumidity.value;
        this.humidity = (hum != null) ? Math.round(hum) + "%" : "N/A";
    }
}
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
        import java.util.Arrays;
import java.util.List;

@Controller
public class WeatherDashboardController {

    @GetMapping("/")
    public String getDashboard(Model model) {
        List<WeatherView> weatherList = Arrays.asList(
                fetchWeather("KFAT", "Fresno, CA"),
                fetchWeather("KNYC", "New York, NY")
        );
        model.addAttribute("weathers", weatherList);
        return "dashboard"; // Points to dashboard.html
    }
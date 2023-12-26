package ua.edu.ucu.apps.Task3;

import java.io.IOException;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Facade {
    private PDLReader pdlReader;

    public Facade(String apiKey) {
        pdlReader = new PDLReader(apiKey);
    }

    public Company getAllInfo(String website) throws IOException {
        Company info = pdlReader.getCompanyInfo(website);
        return info;
    }
}

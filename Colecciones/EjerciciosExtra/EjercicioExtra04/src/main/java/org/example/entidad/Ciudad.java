package org.example.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ciudad {

    private String zip;
    private String city;

    @Override
    public String toString() {
        return "-------------------------" + '\n' +
                "Código postal: " + zip + '\n' +
                "Ciudad: " + city + '\n' +
                "-------------------------";
    }
}

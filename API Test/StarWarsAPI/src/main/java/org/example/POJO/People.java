package org.example.POJO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class People {

    private String name;
    private String skin_color;
    private List<String> films;
}

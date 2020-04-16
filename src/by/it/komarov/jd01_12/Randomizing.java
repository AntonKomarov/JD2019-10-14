package by.it.komarov.jd01_12;

import java.util.Collection;

public class Randomizing {
    public <T extends Collection> T rand(T array, int arraySize, int randValue){
        for (int i = 0; i < arraySize; i++) {
            array.add((int) (1 + Math.random() * randValue));
        }
        return array;
    }
}

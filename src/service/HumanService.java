package service;

import model.Human;

import java.util.ArrayList;

public class HumanService {
    public static ArrayList<Human> convert(ArrayList<String> listHumans) {
        ArrayList<Human> humans = new ArrayList<>(listHumans.size());
        for (String listHuman : listHumans) {
            Human human = new Human(listHuman);
            humans.add(human);
        }
        return humans;
    }

    public static String sort(ArrayList<Human> humans) {
        Human temp;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < humans.size(); i++) {
            for (int j = 1; j < humans.size() - i; j++) {
                if (humans.get(j).getAge() < humans.get(j - 1).getAge()) {
                    temp = humans.get(j);
                    humans.set(j, humans.get(j - 1));
                    humans.set(j - 1, temp);
                }
            }
        }
        for (Human human : humans) {
            result.append(human.toString()).append(" ");
        }
        return result.toString();
    }
}

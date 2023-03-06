package Strategy;

import java.util.List;

class Strategy3 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + ((i % 3 == 2) ? "\n" : ", ");
        }
        return result;
    }
}
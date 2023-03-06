package Strategy;

import java.util.List;

class Strategy2 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + ((i % 2 == 1) ? "\n" : ", ");
        }
        return result;
    }
}
package Strategy;

import java.util.List;

class Strategy2 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        String result = "";
        String[] array = list.toArray(new String[0]);
        for (int i = 0; i < array.length; i++) {
            result += array[i] + ((i % 2 == 1) ? "\n" : ", ");
        }
        return result;
    }
}
package Strategy;

import java.util.List;

public class Strategy1 implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        String result = "";
        for (String item : list) {
            result += item + "\n";
        }
        return result;
    }
}

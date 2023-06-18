package resource.formatter;

import java.util.function.BiConsumer;

public class TimeDurationLineTransform implements BiConsumer<String, StringBuilder> {

    @Override
    public void accept(String lineToFormat, StringBuilder formattedLine) {
        if (lineToFormat.contains(" мин")) {
            formattedLine.append(lineToFormat, lineToFormat.indexOf("y\">") + 3, lineToFormat.indexOf(" мин"));
        }
    }
}

package resource.formatter;

import java.util.function.BiConsumer;

public class NameLineTransform implements BiConsumer<String, StringBuilder> {

    @Override
    public void accept(String lineToFormat, StringBuilder formattedLine) {
        if (lineToFormat.contains("nameRus")) {
            formattedLine.append(lineToFormat, lineToFormat.indexOf("/\">") + 3, lineToFormat.indexOf("</a>"));
        }
    }
}

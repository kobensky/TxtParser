package resource.formatter;

import java.util.function.BiConsumer;

public class TotalScoreLineTransform implements BiConsumer<String, StringBuilder> {

    @Override
    public void accept(String lineToFormat, StringBuilder formattedLine) {
        if (lineToFormat.contains("<b>")) {
            formattedLine.append(lineToFormat, lineToFormat.indexOf("<b>") + 3, lineToFormat.indexOf("</b>"));
        }
    }
}

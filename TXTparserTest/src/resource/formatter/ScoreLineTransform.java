package resource.formatter;

import java.util.function.BiConsumer;

public class ScoreLineTransform implements BiConsumer<String, StringBuilder> {

    @Override
    public void accept(String lineToFormat, StringBuilder formattedLine) {
        if (lineToFormat.contains("удалить оценку")) {
            formattedLine.append(
                    lineToFormat,
                    lineToFormat.indexOf("show();\">") + 9, lineToFormat.indexOf("</div><div class=")
            );
        }
    }
}

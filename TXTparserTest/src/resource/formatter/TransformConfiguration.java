package resource.formatter;

import java.util.List;
import java.util.function.BiConsumer;

public class TransformConfiguration {

    public static List<BiConsumer<String, StringBuilder>> getAllLineTransform() {
        return List.of(
                new ScoreLineTransform(),
                new NameLineTransform(),
                new TimeDurationLineTransform(),
                new TotalScoreLineTransform()
        );
    }
}

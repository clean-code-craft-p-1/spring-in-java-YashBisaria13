package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public float average;
        public float min;
        public float max;

        public Stats(float average, float min, float max) {
            this.average = average;
            this.min = min;
            this.max = max;
        }
    }

    public static Stats getStatistics(List<Float> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        }
        float sum = 0f;
        float min = Float.MAX_VALUE;
        float max = -Float.MAX_VALUE;
        for (Float n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new Stats(sum / numbers.size(), min, max);
    }
}

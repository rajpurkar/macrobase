package macrobase.datamodel;

import java.util.List;

import org.apache.commons.math3.linear.RealVector;

public class TimeDatum extends Datum {
    private Integer time;

    public TimeDatum(Integer time, List<Integer> attributes,
            RealVector metrics) {
        super(attributes, metrics);
        this.time = time;
    }

    @Override
    public Integer getTime() {
        return time;
    }
}
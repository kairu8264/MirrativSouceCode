package to;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    private final TimeUnit timeUnit;

    d(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public final TimeUnit c() {
        return this.timeUnit;
    }
}

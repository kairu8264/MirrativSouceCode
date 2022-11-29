package z8;

/* loaded from: classes.dex */
public enum j {
    DAILY("daily"),
    WEEKLY("weekly");
    
    private final String rawValue;

    j(String str) {
        this.rawValue = str;
    }

    public final String c() {
        return this.rawValue;
    }
}

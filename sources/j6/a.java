package j6;

/* loaded from: classes.dex */
public enum a {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    
    private final boolean readEnabled;
    private final boolean writeEnabled;

    a(boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }

    public final boolean c() {
        return this.readEnabled;
    }

    public final boolean e() {
        return this.writeEnabled;
    }
}

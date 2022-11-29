package p6;

/* loaded from: classes.dex */
public enum g0 {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    SUPRESS(8);
    
    public final int androidLogLevel;

    g0(int i10) {
        this.androidLogLevel = i10;
    }
}

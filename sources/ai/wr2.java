package ai;

/* loaded from: classes3.dex */
public enum wr2 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String zzd;

    wr2(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}

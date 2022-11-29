package ad;

/* loaded from: classes2.dex */
public enum s1 {
    NOT_COMPLETE(0),
    COMPLETE(1);
    
    private final int status;

    s1(int i10) {
        this.status = i10;
    }

    public final int c() {
        return this.status;
    }
}

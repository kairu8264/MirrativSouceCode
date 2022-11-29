package ad;

/* loaded from: classes2.dex */
public enum g2 {
    UNCONFIRMED(0),
    PENDING(4),
    CONFIRMED(5),
    NG(6);
    
    private final int status;

    g2(int i10) {
        this.status = i10;
    }

    public final int c() {
        return this.status;
    }
}

package ad;

/* loaded from: classes2.dex */
public enum v0 {
    UNCONFIRMED(0),
    COMPLETE_REGISTER(2),
    CONFIRMED(3),
    NG_CONFIRM(4),
    COMPLETE_EDIT(5);
    
    private final int status;

    v0(int i10) {
        this.status = i10;
    }

    public final int c() {
        return this.status;
    }
}

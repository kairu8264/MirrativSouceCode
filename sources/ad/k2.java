package ad;

/* loaded from: classes2.dex */
public enum k2 {
    REGISTER(0),
    UPDATE_IDENTIFICATION(1),
    UPDATE_BANK_ACCOUNT(2);
    
    private final int type;

    k2(int i10) {
        this.type = i10;
    }

    public final int c() {
        return this.type;
    }
}

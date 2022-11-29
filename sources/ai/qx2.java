package ai;

/* loaded from: classes3.dex */
public final class qx2 extends tx2 {
    public final /* synthetic */ rx2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx2(rx2 rx2Var, vx2 vx2Var, CharSequence charSequence) {
        super(vx2Var, charSequence);
        this.C = rx2Var;
    }

    @Override // ai.tx2
    public final int d(int i10) {
        int i11 = i10 + 4000;
        if (i11 < this.f10501y.length()) {
            return i11;
        }
        return -1;
    }

    @Override // ai.tx2
    public final int e(int i10) {
        return i10;
    }
}

package ai;

/* loaded from: classes3.dex */
public final class nx2 extends tx2 {
    public final /* synthetic */ px2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx2(px2 px2Var, vx2 vx2Var, CharSequence charSequence) {
        super(vx2Var, charSequence);
        this.C = px2Var;
    }

    @Override // ai.tx2
    public final int d(int i10) {
        yw2 yw2Var = this.C.f8728a;
        CharSequence charSequence = this.f10501y;
        int length = charSequence.length();
        lx2.f(i10, length, "index");
        while (i10 < length) {
            if (yw2Var.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // ai.tx2
    public final int e(int i10) {
        return i10 + 1;
    }
}

package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class e2 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ x2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(x2 x2Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(x2Var, false);
        this.C = x2Var;
        this.A = str;
        this.B = obj;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.C.f36066i;
        ((f1) rh.p.i(f1Var)).logHealthData(5, this.A, yh.b.h1(this.B), yh.b.h1(null), yh.b.h1(null));
    }
}

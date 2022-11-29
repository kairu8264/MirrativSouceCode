package hi;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class k2 extends m2 {
    public final /* synthetic */ Long A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ x2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(x2 x2Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(x2Var, true);
        this.G = x2Var;
        this.A = l10;
        this.B = str;
        this.C = str2;
        this.D = bundle;
        this.E = z10;
        this.F = z11;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        Long l10 = this.A;
        long longValue = l10 == null ? this.f35851w : l10.longValue();
        f1Var = this.G.f36066i;
        ((f1) rh.p.i(f1Var)).logEvent(this.B, this.C, this.D, this.E, this.F, longValue);
    }
}

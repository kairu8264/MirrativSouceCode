package ai;

import android.os.ParcelFileDescriptor;

/* loaded from: classes3.dex */
public final class y40 implements p33<w40, ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p40 f12442a;

    public y40(c50 c50Var, p40 p40Var) {
        this.f12442a = p40Var;
    }

    @Override // ai.p33
    public final /* bridge */ /* synthetic */ s43<ParcelFileDescriptor> a(w40 w40Var) throws Exception {
        mk0 mk0Var = new mk0();
        w40Var.M1(this.f12442a, new x40(this, mk0Var));
        return mk0Var;
    }
}

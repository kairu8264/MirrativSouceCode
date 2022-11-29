package ph;

import android.os.Handler;
import rh.c;

/* loaded from: classes3.dex */
public final class a0 implements c.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f47454a;

    public a0(b0 b0Var) {
        this.f47454a = b0Var;
    }

    @Override // rh.c.e
    public final void a() {
        Handler handler;
        handler = this.f47454a.I.L;
        handler.post(new z(this));
    }
}

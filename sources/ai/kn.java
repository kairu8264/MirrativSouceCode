package ai;

import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class kn implements c.b {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ mk0 f6288w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ln f6289x;

    public kn(ln lnVar, mk0 mk0Var) {
        this.f6289x = lnVar;
        this.f6288w = mk0Var;
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        Object obj;
        obj = this.f6289x.f6624d;
        synchronized (obj) {
            this.f6288w.e(new RuntimeException("Connection failed."));
        }
    }
}

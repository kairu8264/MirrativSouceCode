package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class e10 implements tg.f {

    /* renamed from: a  reason: collision with root package name */
    public final d10 f3492a;

    /* renamed from: b  reason: collision with root package name */
    public final tg.b f3493b;

    /* renamed from: c  reason: collision with root package name */
    public final rg.u f3494c = new rg.u();

    public e10(d10 d10Var) {
        Context context;
        this.f3492a = d10Var;
        tg.b bVar = null;
        try {
            context = (Context) yh.b.z0(d10Var.k());
        } catch (RemoteException | NullPointerException e10) {
            uj0.d("", e10);
            context = null;
        }
        if (context != null) {
            tg.b bVar2 = new tg.b(context);
            try {
                if (true == this.f3492a.h0(yh.b.h1(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e11) {
                uj0.d("", e11);
            }
        }
        this.f3493b = bVar;
    }

    @Override // tg.f
    public final String a() {
        try {
            return this.f3492a.e();
        } catch (RemoteException e10) {
            uj0.d("", e10);
            return null;
        }
    }

    public final d10 b() {
        return this.f3492a;
    }
}

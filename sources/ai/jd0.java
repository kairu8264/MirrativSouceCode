package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class jd0 {

    /* renamed from: d  reason: collision with root package name */
    public static ni0 f5703d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5704a;

    /* renamed from: b  reason: collision with root package name */
    public final rg.b f5705b;

    /* renamed from: c  reason: collision with root package name */
    public final wv f5706c;

    public jd0(Context context, rg.b bVar, wv wvVar) {
        this.f5704a = context;
        this.f5705b = bVar;
        this.f5706c = wvVar;
    }

    public static ni0 a(Context context) {
        ni0 ni0Var;
        synchronized (jd0.class) {
            if (f5703d == null) {
                f5703d = dt.b().k(context, new w80());
            }
            ni0Var = f5703d;
        }
        return ni0Var;
    }

    public final void b(fh.c cVar) {
        as a10;
        ni0 a11 = a(this.f5704a);
        if (a11 == null) {
            cVar.a("Internal Error, query info generator is null.");
            return;
        }
        yh.a h12 = yh.b.h1(this.f5704a);
        wv wvVar = this.f5706c;
        if (wvVar == null) {
            a10 = new bs().a();
        } else {
            a10 = es.f3758a.a(this.f5704a, wvVar);
        }
        try {
            a11.f5(h12, new ri0(null, this.f5705b.name(), null, a10), new id0(this, cVar));
        } catch (RemoteException unused) {
            cVar.a("Internal Error.");
        }
    }
}

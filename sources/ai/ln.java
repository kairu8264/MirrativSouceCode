package ai;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class ln {

    /* renamed from: a  reason: collision with root package name */
    public an f6621a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6622b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6623c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6624d = new Object();

    public ln(Context context) {
        this.f6623c = context;
    }

    public static /* synthetic */ void f(ln lnVar) {
        synchronized (lnVar.f6624d) {
            an anVar = lnVar.f6621a;
            if (anVar == null) {
                return;
            }
            anVar.disconnect();
            lnVar.f6621a = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future<nn> e(bn bnVar) {
        fn fnVar = new fn(this);
        jn jnVar = new jn(this, bnVar, fnVar);
        kn knVar = new kn(this, fnVar);
        synchronized (this.f6624d) {
            an anVar = new an(this.f6623c, wg.t.r().a(), jnVar, knVar);
            this.f6621a = anVar;
            anVar.o();
        }
        return fnVar;
    }
}

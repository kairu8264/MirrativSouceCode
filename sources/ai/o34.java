package ai;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzwl;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class o34 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7635a;

    public o34(Handler handler) {
        this.f7635a = new m34(this, handler);
    }

    public final void a(w34<?> w34Var, c44<?> c44Var, Runnable runnable) {
        w34Var.w();
        w34Var.h("post-response");
        Executor executor = this.f7635a;
        ((m34) executor).f6783w.post(new n34(w34Var, c44Var, runnable));
    }

    public final void b(w34<?> w34Var, zzwl zzwlVar) {
        w34Var.h("post-error");
        c44 b10 = c44.b(zzwlVar);
        Executor executor = this.f7635a;
        ((m34) executor).f6783w.post(new n34(w34Var, b10, null));
    }
}

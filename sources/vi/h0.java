package vi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class h0 extends LifecycleCallback {

    /* renamed from: x  reason: collision with root package name */
    public final List<WeakReference<d0<?>>> f57362x;

    public h0(ph.g gVar) {
        super(gVar);
        this.f57362x = new ArrayList();
        this.f27216w.l("TaskOnStopCallback", this);
    }

    public static h0 l(Activity activity) {
        ph.g c10 = LifecycleCallback.c(activity);
        h0 h0Var = (h0) c10.s("TaskOnStopCallback", h0.class);
        return h0Var == null ? new h0(c10) : h0Var;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        synchronized (this.f57362x) {
            for (WeakReference<d0<?>> weakReference : this.f57362x) {
                d0<?> d0Var = weakReference.get();
                if (d0Var != null) {
                    d0Var.b();
                }
            }
            this.f57362x.clear();
        }
    }

    public final <T> void m(d0<T> d0Var) {
        synchronized (this.f57362x) {
            this.f57362x.add(new WeakReference<>(d0Var));
        }
    }
}

package ph;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
public final class m1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f47525w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f47526x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ n1 f47527y;

    public m1(n1 n1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f47527y = n1Var;
        this.f47525w = lifecycleCallback;
        this.f47526x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        n1 n1Var = this.f47527y;
        i10 = n1Var.f47538y0;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f47525w;
            bundle = n1Var.f47539z0;
            if (bundle != null) {
                bundle3 = n1Var.f47539z0;
                bundle2 = bundle3.getBundle(this.f47526x);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i11 = this.f47527y.f47538y0;
        if (i11 >= 2) {
            this.f47525w.j();
        }
        i12 = this.f47527y.f47538y0;
        if (i12 >= 3) {
            this.f47525w.h();
        }
        i13 = this.f47527y.f47538y0;
        if (i13 >= 4) {
            this.f47525w.k();
        }
        i14 = this.f47527y.f47538y0;
        if (i14 >= 5) {
            this.f47525w.g();
        }
    }
}

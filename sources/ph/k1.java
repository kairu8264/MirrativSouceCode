package ph;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
public final class k1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f47513w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f47514x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ l1 f47515y;

    public k1(l1 l1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f47515y = l1Var;
        this.f47513w = lifecycleCallback;
        this.f47514x = str;
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
        l1 l1Var = this.f47515y;
        i10 = l1Var.f47522x;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f47513w;
            bundle = l1Var.f47523y;
            if (bundle != null) {
                bundle3 = l1Var.f47523y;
                bundle2 = bundle3.getBundle(this.f47514x);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i11 = this.f47515y.f47522x;
        if (i11 >= 2) {
            this.f47513w.j();
        }
        i12 = this.f47515y.f47522x;
        if (i12 >= 3) {
            this.f47513w.h();
        }
        i13 = this.f47515y.f47522x;
        if (i13 >= 4) {
            this.f47513w.k();
        }
        i14 = this.f47515y.f47522x;
        if (i14 >= 5) {
            this.f47513w.g();
        }
    }
}

package ph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class n1 extends Fragment implements g {
    public static final WeakHashMap<androidx.fragment.app.h, WeakReference<n1>> A0 = new WeakHashMap<>();

    /* renamed from: x0  reason: collision with root package name */
    public final Map<String, LifecycleCallback> f47537x0 = Collections.synchronizedMap(new s.a());

    /* renamed from: y0  reason: collision with root package name */
    public int f47538y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public Bundle f47539z0;

    public static n1 l3(androidx.fragment.app.h hVar) {
        n1 n1Var;
        WeakHashMap<androidx.fragment.app.h, WeakReference<n1>> weakHashMap = A0;
        WeakReference<n1> weakReference = weakHashMap.get(hVar);
        if (weakReference == null || (n1Var = weakReference.get()) == null) {
            try {
                n1 n1Var2 = (n1) hVar.a3().e0("SupportLifecycleFragmentImpl");
                if (n1Var2 == null || n1Var2.m1()) {
                    n1Var2 = new n1();
                    hVar.a3().k().d(n1Var2, "SupportLifecycleFragmentImpl").j();
                }
                weakHashMap.put(hVar, new WeakReference<>(n1Var2));
                return n1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
            }
        }
        return n1Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void A1(Bundle bundle) {
        super.A1(bundle);
        this.f47538y0 = 1;
        this.f47539z0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f47537x0.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void F1() {
        super.F1();
        this.f47538y0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f47537x0.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // ph.g
    public final /* synthetic */ Activity L() {
        return j0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Z1() {
        super.Z1();
        this.f47538y0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f47537x0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void b2(Bundle bundle) {
        super.b2(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f47537x0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void c2() {
        super.c2();
        this.f47538y0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f47537x0.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d2() {
        super.d2();
        this.f47538y0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f47537x0.values()) {
            lifecycleCallback.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f0(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f47537x0.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // ph.g
    public final void l(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f47537x0.containsKey(str)) {
            this.f47537x0.put(str, lifecycleCallback);
            if (this.f47538y0 > 0) {
                new fi.e(Looper.getMainLooper()).post(new m1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("LifecycleCallback with tag ");
        sb2.append(str);
        sb2.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // ph.g
    public final <T extends LifecycleCallback> T s(String str, Class<T> cls) {
        return cls.cast(this.f47537x0.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void u1(int i10, int i11, Intent intent) {
        super.u1(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f47537x0.values()) {
            lifecycleCallback.e(i10, i11, intent);
        }
    }
}

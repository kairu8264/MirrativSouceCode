package ph;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class l1 extends Fragment implements g {

    /* renamed from: z  reason: collision with root package name */
    public static final WeakHashMap<Activity, WeakReference<l1>> f47520z = new WeakHashMap<>();

    /* renamed from: w  reason: collision with root package name */
    public final Map<String, LifecycleCallback> f47521w = Collections.synchronizedMap(new s.a());

    /* renamed from: x  reason: collision with root package name */
    public int f47522x = 0;

    /* renamed from: y  reason: collision with root package name */
    public Bundle f47523y;

    public static l1 c(Activity activity) {
        l1 l1Var;
        WeakHashMap<Activity, WeakReference<l1>> weakHashMap = f47520z;
        WeakReference<l1> weakReference = weakHashMap.get(activity);
        if (weakReference == null || (l1Var = weakReference.get()) == null) {
            try {
                l1 l1Var2 = (l1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (l1Var2 == null || l1Var2.isRemoving()) {
                    l1Var2 = new l1();
                    activity.getFragmentManager().beginTransaction().add(l1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference<>(l1Var2));
                return l1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        return l1Var;
    }

    @Override // ph.g
    public final Activity L() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f47521w.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // ph.g
    public final void l(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f47521w.containsKey(str)) {
            this.f47521w.put(str, lifecycleCallback);
            if (this.f47522x > 0) {
                new fi.e(Looper.getMainLooper()).post(new k1(this, lifecycleCallback, str));
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

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f47521w.values()) {
            lifecycleCallback.e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f47522x = 1;
        this.f47523y = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f47521w.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f47522x = 5;
        for (LifecycleCallback lifecycleCallback : this.f47521w.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f47522x = 3;
        for (LifecycleCallback lifecycleCallback : this.f47521w.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f47521w.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f47522x = 2;
        for (LifecycleCallback lifecycleCallback : this.f47521w.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f47522x = 4;
        for (LifecycleCallback lifecycleCallback : this.f47521w.values()) {
            lifecycleCallback.k();
        }
    }

    @Override // ph.g
    public final <T extends LifecycleCallback> T s(String str, Class<T> cls) {
        return cls.cast(this.f47521w.get(str));
    }
}

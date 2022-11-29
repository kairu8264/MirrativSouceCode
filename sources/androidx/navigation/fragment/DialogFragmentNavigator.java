package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.navigation.x;
import java.util.HashSet;

@x.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends x<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15698a;

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f15699b;

    /* renamed from: c  reason: collision with root package name */
    public int f15700c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f15701d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public r f15702e = new r() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.r
        public void i(u uVar, o.b bVar) {
            if (bVar == o.b.ON_STOP) {
                e eVar = (e) uVar;
                if (eVar.v3().isShowing()) {
                    return;
                }
                NavHostFragment.k3(eVar).t();
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a extends androidx.navigation.o implements androidx.navigation.d {
        public String F;

        public a(x<? extends a> xVar) {
            super(xVar);
        }

        public final String H() {
            String str = this.F;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a J(String str) {
            this.F = str;
            return this;
        }

        @Override // androidx.navigation.o
        public void w(Context context, AttributeSet attributeSet) {
            super.w(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, d.f15714c);
            String string = obtainAttributes.getString(d.f15715d);
            if (string != null) {
                J(string);
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f15698a = context;
        this.f15699b = fragmentManager;
    }

    @Override // androidx.navigation.x
    public void c(Bundle bundle) {
        if (bundle != null) {
            this.f15700c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i10 = 0; i10 < this.f15700c; i10++) {
                FragmentManager fragmentManager = this.f15699b;
                e eVar = (e) fragmentManager.e0("androidx-nav-fragment:navigator:dialog:" + i10);
                if (eVar != null) {
                    eVar.g().a(this.f15702e);
                } else {
                    HashSet<String> hashSet = this.f15701d;
                    hashSet.add("androidx-nav-fragment:navigator:dialog:" + i10);
                }
            }
        }
    }

    @Override // androidx.navigation.x
    public Bundle d() {
        if (this.f15700c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f15700c);
        return bundle;
    }

    @Override // androidx.navigation.x
    public boolean e() {
        if (this.f15700c == 0) {
            return false;
        }
        if (this.f15699b.J0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f15699b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx-nav-fragment:navigator:dialog:");
        int i10 = this.f15700c - 1;
        this.f15700c = i10;
        sb2.append(i10);
        Fragment e02 = fragmentManager.e0(sb2.toString());
        if (e02 != null) {
            e02.g().c(this.f15702e);
            ((e) e02).m3();
        }
        return true;
    }

    @Override // androidx.navigation.x
    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    @Override // androidx.navigation.x
    /* renamed from: g */
    public androidx.navigation.o b(a aVar, Bundle bundle, androidx.navigation.u uVar, x.a aVar2) {
        if (this.f15699b.J0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String H = aVar.H();
        if (H.charAt(0) == '.') {
            H = this.f15698a.getPackageName() + H;
        }
        Fragment a10 = this.f15699b.o0().a(this.f15698a.getClassLoader(), H);
        if (e.class.isAssignableFrom(a10.getClass())) {
            e eVar = (e) a10;
            eVar.V2(bundle);
            eVar.g().a(this.f15702e);
            FragmentManager fragmentManager = this.f15699b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("androidx-nav-fragment:navigator:dialog:");
            int i10 = this.f15700c;
            this.f15700c = i10 + 1;
            sb2.append(i10);
            eVar.z3(fragmentManager, sb2.toString());
            return aVar;
        }
        throw new IllegalArgumentException("Dialog destination " + aVar.H() + " is not an instance of DialogFragment");
    }

    public void h(Fragment fragment) {
        if (this.f15701d.remove(fragment.W0())) {
            fragment.g().a(this.f15702e);
        }
    }
}

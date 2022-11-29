package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.e;
import androidx.navigation.NavController;
import androidx.navigation.a0;
import androidx.navigation.fragment.b;
import androidx.navigation.s;
import androidx.navigation.w;
import androidx.navigation.x;

/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    public int A0;
    public boolean B0;

    /* renamed from: x0  reason: collision with root package name */
    public s f15704x0;

    /* renamed from: y0  reason: collision with root package name */
    public Boolean f15705y0 = null;

    /* renamed from: z0  reason: collision with root package name */
    public View f15706z0;

    public static NavController k3(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.H0()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).m3();
            }
            Fragment u02 = fragment2.I0().u0();
            if (u02 instanceof NavHostFragment) {
                return ((NavHostFragment) u02).m3();
            }
        }
        View Z0 = fragment.Z0();
        if (Z0 != null) {
            return w.b(Z0);
        }
        Dialog p32 = fragment instanceof e ? ((e) fragment).p3() : null;
        if (p32 != null && p32.getWindow() != null) {
            return w.b(p32.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        Bundle bundle2;
        s sVar = new s(N2());
        this.f15704x0 = sVar;
        sVar.C(this);
        this.f15704x0.D(L2().c1());
        s sVar2 = this.f15704x0;
        Boolean bool = this.f15705y0;
        sVar2.c(bool != null && bool.booleanValue());
        this.f15705y0 = null;
        this.f15704x0.E(U());
        n3(this.f15704x0);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.B0 = true;
                I0().k().v(this).i();
            }
            this.A0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f15704x0.w(bundle2);
        }
        int i10 = this.A0;
        if (i10 != 0) {
            this.f15704x0.y(i10);
        } else {
            Bundle n02 = n0();
            int i11 = n02 != null ? n02.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = n02 != null ? n02.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i11 != 0) {
                this.f15704x0.z(i11, bundle3);
            }
        }
        super.A1(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(l3());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        View view = this.f15706z0;
        if (view != null && w.b(view) == this.f15704x0) {
            w.e(this.f15706z0, null);
        }
        this.f15706z0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void N1(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.N1(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f15686p);
        int resourceId = obtainStyledAttributes.getResourceId(a0.f15687q, 0);
        if (resourceId != 0) {
            this.A0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d.f15729r);
        if (obtainStyledAttributes2.getBoolean(d.f15730s, false)) {
            this.B0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void X1(boolean z10) {
        s sVar = this.f15704x0;
        if (sVar != null) {
            sVar.c(z10);
        } else {
            this.f15705y0 = Boolean.valueOf(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        super.b2(bundle);
        Bundle x10 = this.f15704x0.x();
        if (x10 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", x10);
        }
        if (this.B0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i10 = this.A0;
        if (i10 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        super.e2(view, bundle);
        if (view instanceof ViewGroup) {
            w.e(view, this.f15704x0);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f15706z0 = view2;
                if (view2.getId() == C0()) {
                    w.e(this.f15706z0, this.f15704x0);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    @Deprecated
    public x<? extends b.a> j3() {
        return new b(N2(), p0(), l3());
    }

    public final int l3() {
        int C0 = C0();
        return (C0 == 0 || C0 == -1) ? c.nav_host_fragment_container : C0;
    }

    public final NavController m3() {
        s sVar = this.f15704x0;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public void n3(NavController navController) {
        navController.k().a(new DialogFragmentNavigator(N2(), p0()));
        navController.k().a(j3());
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        super.x1(context);
        if (this.B0) {
            I0().k().v(this).i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y1(Fragment fragment) {
        super.y1(fragment);
        ((DialogFragmentNavigator) this.f15704x0.k().d(DialogFragmentNavigator.class)).h(fragment);
    }
}

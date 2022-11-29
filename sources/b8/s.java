package b8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class s extends Fragment {
    public s A0;
    public com.bumptech.glide.k B0;
    public Fragment C0;

    /* renamed from: x0  reason: collision with root package name */
    public final b8.a f17093x0;

    /* renamed from: y0  reason: collision with root package name */
    public final q f17094y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Set<s> f17095z0;

    /* loaded from: classes.dex */
    public class a implements q {
        public a() {
        }

        @Override // b8.q
        public Set<com.bumptech.glide.k> a() {
            Set<s> k32 = s.this.k3();
            HashSet hashSet = new HashSet(k32.size());
            for (s sVar : k32) {
                if (sVar.n3() != null) {
                    hashSet.add(sVar.n3());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        this(new b8.a());
    }

    public static FragmentManager p3(Fragment fragment) {
        while (fragment.H0() != null) {
            fragment = fragment.H0();
        }
        return fragment.A0();
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        super.F1();
        this.f17093x0.c();
        v3();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.C0 = null;
        v3();
    }

    @Override // androidx.fragment.app.Fragment
    public void c2() {
        super.c2();
        this.f17093x0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void d2() {
        super.d2();
        this.f17093x0.e();
    }

    public final void j3(s sVar) {
        this.f17095z0.add(sVar);
    }

    public Set<s> k3() {
        s sVar = this.A0;
        if (sVar == null) {
            return Collections.emptySet();
        }
        if (equals(sVar)) {
            return Collections.unmodifiableSet(this.f17095z0);
        }
        HashSet hashSet = new HashSet();
        for (s sVar2 : this.A0.k3()) {
            if (q3(sVar2.m3())) {
                hashSet.add(sVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public b8.a l3() {
        return this.f17093x0;
    }

    public final Fragment m3() {
        Fragment H0 = H0();
        return H0 != null ? H0 : this.C0;
    }

    public com.bumptech.glide.k n3() {
        return this.B0;
    }

    public q o3() {
        return this.f17094y0;
    }

    public final boolean q3(Fragment fragment) {
        Fragment m32 = m3();
        while (true) {
            Fragment H0 = fragment.H0();
            if (H0 == null) {
                return false;
            }
            if (H0.equals(m32)) {
                return true;
            }
            fragment = fragment.H0();
        }
    }

    public final void r3(Context context, FragmentManager fragmentManager) {
        v3();
        s s10 = com.bumptech.glide.c.d(context).n().s(fragmentManager);
        this.A0 = s10;
        if (equals(s10)) {
            return;
        }
        this.A0.j3(this);
    }

    public final void s3(s sVar) {
        this.f17095z0.remove(sVar);
    }

    public void t3(Fragment fragment) {
        FragmentManager p32;
        this.C0 = fragment;
        if (fragment == null || fragment.q0() == null || (p32 = p3(fragment)) == null) {
            return;
        }
        r3(fragment.q0(), p32);
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m3() + "}";
    }

    public void u3(com.bumptech.glide.k kVar) {
        this.B0 = kVar;
    }

    public final void v3() {
        s sVar = this.A0;
        if (sVar != null) {
            sVar.s3(this);
            this.A0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        super.x1(context);
        FragmentManager p32 = p3(this);
        if (p32 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            r3(q0(), p32);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @SuppressLint({"ValidFragment"})
    public s(b8.a aVar) {
        this.f17094y0 = new a();
        this.f17095z0 = new HashSet();
        this.f17093x0 = aVar;
    }
}

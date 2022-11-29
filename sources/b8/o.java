package b8;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class o extends Fragment {
    public o A;
    public Fragment B;

    /* renamed from: w  reason: collision with root package name */
    public final b8.a f17081w;

    /* renamed from: x  reason: collision with root package name */
    public final q f17082x;

    /* renamed from: y  reason: collision with root package name */
    public final Set<o> f17083y;

    /* renamed from: z  reason: collision with root package name */
    public com.bumptech.glide.k f17084z;

    /* loaded from: classes.dex */
    public class a implements q {
        public a() {
        }

        @Override // b8.q
        public Set<com.bumptech.glide.k> a() {
            Set<o> b10 = o.this.b();
            HashSet hashSet = new HashSet(b10.size());
            for (o oVar : b10) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new b8.a());
    }

    public final void a(o oVar) {
        this.f17083y.add(oVar);
    }

    @TargetApi(17)
    public Set<o> b() {
        if (equals(this.A)) {
            return Collections.unmodifiableSet(this.f17083y);
        }
        if (this.A != null && Build.VERSION.SDK_INT >= 17) {
            HashSet hashSet = new HashSet();
            for (o oVar : this.A.b()) {
                if (g(oVar.getParentFragment())) {
                    hashSet.add(oVar);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public b8.a c() {
        return this.f17081w;
    }

    @TargetApi(17)
    public final Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.B;
    }

    public com.bumptech.glide.k e() {
        return this.f17084z;
    }

    public q f() {
        return this.f17082x;
    }

    @TargetApi(17)
    public final boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void h(Activity activity) {
        l();
        o q10 = com.bumptech.glide.c.d(activity).n().q(activity);
        this.A = q10;
        if (equals(q10)) {
            return;
        }
        this.A.a(this);
    }

    public final void i(o oVar) {
        this.f17083y.remove(oVar);
    }

    public void j(Fragment fragment) {
        this.B = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(com.bumptech.glide.k kVar) {
        this.f17084z = kVar;
    }

    public final void l() {
        o oVar = this.A;
        if (oVar != null) {
            oVar.i(this);
            this.A = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f17081w.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f17081w.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f17081w.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public o(b8.a aVar) {
        this.f17082x = new a();
        this.f17083y = new HashSet();
        this.f17081w = aVar;
    }
}

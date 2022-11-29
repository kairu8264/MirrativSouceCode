package h4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import h4.c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jo.h;
import jo.p;
import xn.a0;
import xn.n0;
import xn.t0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34434a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static C0433c f34435b = C0433c.f34437e;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Violation violation);
    }

    /* renamed from: h4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0433c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f34436d = new a(null);

        /* renamed from: e  reason: collision with root package name */
        public static final C0433c f34437e = new C0433c(t0.b(), null, n0.e());

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f34438a;

        /* renamed from: b  reason: collision with root package name */
        public final b f34439b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> f34440c;

        /* renamed from: h4.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(h hVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0433c(Set<? extends a> set, b bVar, Map<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> map) {
            p.h(set, "flags");
            p.h(map, "allowedViolations");
            this.f34438a = set;
            this.f34439b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f34440c = linkedHashMap;
        }

        public final Set<a> a() {
            return this.f34438a;
        }

        public final b b() {
            return this.f34439b;
        }

        public final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> c() {
            return this.f34440c;
        }
    }

    public static final void e(C0433c c0433c, Violation violation) {
        p.h(c0433c, "$policy");
        p.h(violation, "$violation");
        c0433c.b().a(violation);
    }

    public static final void f(String str, Violation violation) {
        p.h(violation, "$violation");
        Log.e("FragmentStrictMode", p.o("Policy violation with PENALTY_DEATH in ", str), violation);
        throw violation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Fragment fragment, String str) {
        p.h(fragment, "fragment");
        p.h(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        c cVar = f34434a;
        cVar.g(fragmentReuseViolation);
        C0433c c10 = cVar.c(fragment);
        if (c10.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.n(c10, fragment.getClass(), fragmentReuseViolation.getClass())) {
            cVar.d(c10, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Fragment fragment, ViewGroup viewGroup) {
        p.h(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        c cVar = f34434a;
        cVar.g(fragmentTagUsageViolation);
        C0433c c10 = cVar.c(fragment);
        if (c10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.n(c10, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            cVar.d(c10, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Fragment fragment) {
        p.h(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        c cVar = f34434a;
        cVar.g(getTargetFragmentUsageViolation);
        C0433c c10 = cVar.c(fragment);
        if (c10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.n(c10, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            cVar.d(c10, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(Fragment fragment, boolean z10) {
        p.h(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z10);
        c cVar = f34434a;
        cVar.g(setUserVisibleHintViolation);
        C0433c c10 = cVar.c(fragment);
        if (c10.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.n(c10, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            cVar.d(c10, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(Fragment fragment, ViewGroup viewGroup) {
        p.h(fragment, "fragment");
        p.h(viewGroup, TtmlNode.RUBY_CONTAINER);
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        c cVar = f34434a;
        cVar.g(wrongFragmentContainerViolation);
        C0433c c10 = cVar.c(fragment);
        if (c10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.n(c10, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            cVar.d(c10, wrongFragmentContainerViolation);
        }
    }

    public final C0433c c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.g1()) {
                FragmentManager I0 = fragment.I0();
                p.g(I0, "declaringFragment.parentFragmentManager");
                if (I0.w0() != null) {
                    C0433c w02 = I0.w0();
                    p.e(w02);
                    p.g(w02, "fragmentManager.strictModePolicy!!");
                    return w02;
                }
            }
            fragment = fragment.H0();
        }
        return f34435b;
    }

    public final void d(final C0433c c0433c, final Violation violation) {
        Fragment a10 = violation.a();
        final String name = a10.getClass().getName();
        if (c0433c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", p.o("Policy violation in ", name), violation);
        }
        if (c0433c.b() != null) {
            m(a10, new Runnable() { // from class: h4.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.e(c.C0433c.this, violation);
                }
            });
        }
        if (c0433c.a().contains(a.PENALTY_DEATH)) {
            m(a10, new Runnable() { // from class: h4.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.f(name, violation);
                }
            });
        }
    }

    public final void g(Violation violation) {
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", p.o("StrictMode violation in ", violation.a().getClass().getName()), violation);
        }
    }

    public final void m(Fragment fragment, Runnable runnable) {
        if (fragment.g1()) {
            Handler h10 = fragment.I0().q0().h();
            p.g(h10, "fragment.parentFragmentManager.host.handler");
            if (p.c(h10.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                h10.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public final boolean n(C0433c c0433c, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = c0433c.c().get(cls);
        if (set == null) {
            return true;
        }
        if (p.c(cls2.getSuperclass(), Violation.class) || !a0.O(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}

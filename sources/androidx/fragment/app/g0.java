package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k3.c;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f15337a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f15338b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<e> f15339c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f15340d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15341e = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d f15342w;

        public a(d dVar) {
            this.f15342w = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g0.this.f15338b.contains(this.f15342w)) {
                this.f15342w.e().a(this.f15342w.f().f15130e0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d f15344w;

        public b(d dVar) {
            this.f15344w = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.f15338b.remove(this.f15344w);
            g0.this.f15339c.remove(this.f15344w);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15346a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15347b;

        static {
            int[] iArr = new int[e.b.values().length];
            f15347b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15347b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15347b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f15346a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15346a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15346a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15346a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        public final x f15348h;

        public d(e.c cVar, e.b bVar, x xVar, k3.c cVar2) {
            super(cVar, bVar, xVar.k(), cVar2);
            this.f15348h = xVar;
        }

        @Override // androidx.fragment.app.g0.e
        public void c() {
            super.c();
            this.f15348h.m();
        }

        @Override // androidx.fragment.app.g0.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f15348h.k();
                View findFocus = k10.f15130e0.findFocus();
                if (findFocus != null) {
                    k10.W2(findFocus);
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View Q2 = f().Q2();
                if (Q2.getParent() == null) {
                    this.f15348h.b();
                    Q2.setAlpha(0.0f);
                }
                if (Q2.getAlpha() == 0.0f && Q2.getVisibility() == 0) {
                    Q2.setVisibility(4);
                }
                Q2.setAlpha(k10.M0());
            } else if (g() == e.b.REMOVING) {
                Fragment k11 = this.f15348h.k();
                View Q22 = k11.Q2();
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + Q22.findFocus() + " on view " + Q22 + " for Fragment " + k11);
                }
                Q22.clearFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public c f15349a;

        /* renamed from: b  reason: collision with root package name */
        public b f15350b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f15351c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f15352d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<k3.c> f15353e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f15354f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f15355g = false;

        /* loaded from: classes.dex */
        public class a implements c.a {
            public a() {
            }

            @Override // k3.c.a
            public void a() {
                e.this.b();
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c c(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i10);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            public static c e(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return c(view.getVisibility());
            }

            public void a(View view) {
                int i10 = c.f15346a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i10 == 2) {
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i10 != 4) {
                } else {
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        public e(c cVar, b bVar, Fragment fragment, k3.c cVar2) {
            this.f15349a = cVar;
            this.f15350b = bVar;
            this.f15351c = fragment;
            cVar2.b(new a());
        }

        public final void a(Runnable runnable) {
            this.f15352d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f15354f = true;
            if (this.f15353e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f15353e).iterator();
            while (it.hasNext()) {
                ((k3.c) it.next()).a();
            }
        }

        public void c() {
            if (this.f15355g) {
                return;
            }
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f15355g = true;
            for (Runnable runnable : this.f15352d) {
                runnable.run();
            }
        }

        public final void d(k3.c cVar) {
            if (this.f15353e.remove(cVar) && this.f15353e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f15349a;
        }

        public final Fragment f() {
            return this.f15351c;
        }

        public b g() {
            return this.f15350b;
        }

        public final boolean h() {
            return this.f15354f;
        }

        public final boolean i() {
            return this.f15355g;
        }

        public final void j(k3.c cVar) {
            l();
            this.f15353e.add(cVar);
        }

        public final void k(c cVar, b bVar) {
            int i10 = c.f15347b[bVar.ordinal()];
            if (i10 == 1) {
                if (this.f15349a == c.REMOVED) {
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f15351c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f15350b + " to ADDING.");
                    }
                    this.f15349a = c.VISIBLE;
                    this.f15350b = b.ADDING;
                }
            } else if (i10 != 2) {
                if (i10 == 3 && this.f15349a != c.REMOVED) {
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f15351c + " mFinalState = " + this.f15349a + " -> " + cVar + ". ");
                    }
                    this.f15349a = cVar;
                }
            } else {
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f15351c + " mFinalState = " + this.f15349a + " -> REMOVED. mLifecycleImpact  = " + this.f15350b + " to REMOVING.");
                }
                this.f15349a = c.REMOVED;
                this.f15350b = b.REMOVING;
            }
        }

        public void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f15349a + "} {mLifecycleImpact = " + this.f15350b + "} {mFragment = " + this.f15351c + "}";
        }
    }

    public g0(ViewGroup viewGroup) {
        this.f15337a = viewGroup;
    }

    public static g0 n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.v0());
    }

    public static g0 o(ViewGroup viewGroup, h0 h0Var) {
        int i10 = g4.b.f32627b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof g0) {
            return (g0) tag;
        }
        g0 a10 = h0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    public final void a(e.c cVar, e.b bVar, x xVar) {
        synchronized (this.f15338b) {
            k3.c cVar2 = new k3.c();
            e h10 = h(xVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, xVar, cVar2);
            this.f15338b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public void b(e.c cVar, x xVar) {
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + xVar.k());
        }
        a(cVar, e.b.ADDING, xVar);
    }

    public void c(x xVar) {
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + xVar.k());
        }
        a(e.c.GONE, e.b.NONE, xVar);
    }

    public void d(x xVar) {
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + xVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, xVar);
    }

    public void e(x xVar) {
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + xVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, xVar);
    }

    public abstract void f(List<e> list, boolean z10);

    public void g() {
        if (this.f15341e) {
            return;
        }
        if (!o3.c0.U(this.f15337a)) {
            j();
            this.f15340d = false;
            return;
        }
        synchronized (this.f15338b) {
            if (!this.f15338b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f15339c);
                this.f15339c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f15339c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f15338b);
                this.f15338b.clear();
                this.f15339c.addAll(arrayList2);
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f15340d);
                this.f15340d = false;
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final e h(Fragment fragment) {
        Iterator<e> it = this.f15338b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        Iterator<e> it = this.f15339c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean U = o3.c0.U(this.f15337a);
        synchronized (this.f15338b) {
            q();
            Iterator<e> it = this.f15338b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f15339c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.D0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (U) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f15337a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f15338b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.D0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (U) {
                        str = "";
                    } else {
                        str = "Container " + this.f15337a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.f15341e) {
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f15341e = false;
            g();
        }
    }

    public e.b l(x xVar) {
        e h10 = h(xVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(xVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f15337a;
    }

    public void p() {
        synchronized (this.f15338b) {
            q();
            this.f15341e = false;
            int size = this.f15338b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f15338b.get(size);
                e.c e10 = e.c.e(eVar.f().f15130e0);
                e.c e11 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e11 == cVar && e10 != cVar) {
                    this.f15341e = eVar.f().l1();
                    break;
                }
                size--;
            }
        }
    }

    public final void q() {
        Iterator<e> it = this.f15338b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.c(next.f().Q2().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z10) {
        this.f15340d = z10;
    }
}

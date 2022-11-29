package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.navigation.o;
import androidx.navigation.u;
import androidx.navigation.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class NavController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15653a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f15654b;

    /* renamed from: c  reason: collision with root package name */
    public t f15655c;

    /* renamed from: d  reason: collision with root package name */
    public q f15656d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f15657e;

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f15658f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15659g;

    /* renamed from: i  reason: collision with root package name */
    public androidx.lifecycle.u f15661i;

    /* renamed from: j  reason: collision with root package name */
    public l f15662j;

    /* renamed from: h  reason: collision with root package name */
    public final Deque<j> f15660h = new ArrayDeque();

    /* renamed from: k  reason: collision with root package name */
    public y f15663k = new y();

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f15664l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.t f15665m = new androidx.lifecycle.r() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.r
        public void i(androidx.lifecycle.u uVar, o.b bVar) {
            NavController navController = NavController.this;
            if (navController.f15656d != null) {
                for (j jVar : navController.f15660h) {
                    jVar.e(bVar);
                }
            }
        }
    };

    /* renamed from: n  reason: collision with root package name */
    public final androidx.activity.e f15666n = new a(false);

    /* renamed from: o  reason: collision with root package name */
    public boolean f15667o = true;

    /* loaded from: classes.dex */
    public class a extends androidx.activity.e {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.e
        public void b() {
            NavController.this.t();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NavController navController, o oVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f15653a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f15654b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        y yVar = this.f15663k;
        yVar.a(new r(yVar));
        this.f15663k.a(new c(this.f15653a));
    }

    public void A(q qVar) {
        B(qVar, null);
    }

    public void B(q qVar, Bundle bundle) {
        q qVar2 = this.f15656d;
        if (qVar2 != null) {
            v(qVar2.r(), true);
        }
        this.f15656d = qVar;
        s(bundle);
    }

    public void C(androidx.lifecycle.u uVar) {
        if (uVar == this.f15661i) {
            return;
        }
        this.f15661i = uVar;
        uVar.g().a(this.f15665m);
    }

    public void D(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f15661i != null) {
            this.f15666n.d();
            onBackPressedDispatcher.a(this.f15661i, this.f15666n);
            this.f15661i.g().c(this.f15665m);
            this.f15661i.g().a(this.f15665m);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    public void E(u0 u0Var) {
        if (this.f15662j == l.g(u0Var)) {
            return;
        }
        if (this.f15660h.isEmpty()) {
            this.f15662j = l.g(u0Var);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }

    public final void F() {
        boolean z10 = true;
        this.f15666n.f((!this.f15667o || h() <= 1) ? false : false);
    }

    public void a(b bVar) {
        if (!this.f15660h.isEmpty()) {
            j peekLast = this.f15660h.peekLast();
            bVar.a(this, peekLast.b(), peekLast.a());
        }
        this.f15664l.add(bVar);
    }

    public final boolean b() {
        while (!this.f15660h.isEmpty() && (this.f15660h.peekLast().b() instanceof q) && v(this.f15660h.peekLast().b().r(), true)) {
        }
        if (this.f15660h.isEmpty()) {
            return false;
        }
        o b10 = this.f15660h.peekLast().b();
        o oVar = null;
        if (b10 instanceof d) {
            Iterator<j> descendingIterator = this.f15660h.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                o b11 = descendingIterator.next().b();
                if (!(b11 instanceof q) && !(b11 instanceof d)) {
                    oVar = b11;
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator<j> descendingIterator2 = this.f15660h.descendingIterator();
        while (descendingIterator2.hasNext()) {
            j next = descendingIterator2.next();
            o.c c10 = next.c();
            o b12 = next.b();
            if (b10 != null && b12.r() == b10.r()) {
                o.c cVar = o.c.RESUMED;
                if (c10 != cVar) {
                    hashMap.put(next, cVar);
                }
                b10 = b10.t();
            } else if (oVar != null && b12.r() == oVar.r()) {
                if (c10 == o.c.RESUMED) {
                    next.i(o.c.STARTED);
                } else {
                    o.c cVar2 = o.c.STARTED;
                    if (c10 != cVar2) {
                        hashMap.put(next, cVar2);
                    }
                }
                oVar = oVar.t();
            } else {
                next.i(o.c.CREATED);
            }
        }
        for (j jVar : this.f15660h) {
            o.c cVar3 = (o.c) hashMap.get(jVar);
            if (cVar3 != null) {
                jVar.i(cVar3);
            } else {
                jVar.j();
            }
        }
        j peekLast = this.f15660h.peekLast();
        Iterator<b> it = this.f15664l.iterator();
        while (it.hasNext()) {
            it.next().a(this, peekLast.b(), peekLast.a());
        }
        return true;
    }

    public void c(boolean z10) {
        this.f15667o = z10;
        F();
    }

    public o d(int i10) {
        q b10;
        q t10;
        q qVar = this.f15656d;
        if (qVar == null) {
            return null;
        }
        if (qVar.r() == i10) {
            return this.f15656d;
        }
        if (this.f15660h.isEmpty()) {
            b10 = this.f15656d;
        } else {
            b10 = this.f15660h.getLast().b();
        }
        if (b10 instanceof q) {
            t10 = b10;
        } else {
            t10 = b10.t();
        }
        return t10.J(i10);
    }

    public final String e(int[] iArr) {
        q qVar;
        q qVar2 = this.f15656d;
        int i10 = 0;
        while (true) {
            o oVar = null;
            if (i10 >= iArr.length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                if (this.f15656d.r() == i11) {
                    oVar = this.f15656d;
                }
            } else {
                oVar = qVar2.J(i11);
            }
            if (oVar == null) {
                return o.p(this.f15653a, i11);
            }
            if (i10 != iArr.length - 1) {
                while (true) {
                    qVar = (q) oVar;
                    if (!(qVar.J(qVar.M()) instanceof q)) {
                        break;
                    }
                    oVar = qVar.J(qVar.M());
                }
                qVar2 = qVar;
            }
            i10++;
        }
    }

    public j f() {
        if (this.f15660h.isEmpty()) {
            return null;
        }
        return this.f15660h.getLast();
    }

    public o g() {
        j f10 = f();
        if (f10 != null) {
            return f10.b();
        }
        return null;
    }

    public final int h() {
        int i10 = 0;
        for (j jVar : this.f15660h) {
            if (!(jVar.b() instanceof q)) {
                i10++;
            }
        }
        return i10;
    }

    public q i() {
        q qVar = this.f15656d;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public t j() {
        if (this.f15655c == null) {
            this.f15655c = new t(this.f15653a, this.f15663k);
        }
        return this.f15655c;
    }

    public y k() {
        return this.f15663k;
    }

    public boolean l(Intent intent) {
        o.a u10;
        q qVar;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (u10 = this.f15656d.u(new n(intent))) != null) {
            o c10 = u10.c();
            int[] j10 = c10.j();
            bundle.putAll(c10.g(u10.e()));
            intArray = j10;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String e10 = e(intArray);
        if (e10 != null) {
            Log.i("NavController", "Could not find destination " + e10 + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i10 = 268435456 & flags;
        if (i10 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            b3.q.k(this.f15653a).f(intent).l();
            Activity activity = this.f15654b;
            if (activity != null) {
                activity.finish();
                this.f15654b.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i10 != 0) {
            if (!this.f15660h.isEmpty()) {
                v(this.f15656d.r(), true);
            }
            int i11 = 0;
            while (i11 < intArray.length) {
                int i12 = i11 + 1;
                int i13 = intArray[i11];
                o d10 = d(i13);
                if (d10 != null) {
                    q(d10, bundle, new u.a().b(0).c(0).a(), null);
                    i11 = i12;
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + o.p(this.f15653a, i13) + " cannot be found from the current destination " + g());
                }
            }
            return true;
        } else {
            q qVar2 = this.f15656d;
            int i14 = 0;
            while (i14 < intArray.length) {
                int i15 = intArray[i14];
                o J = i14 == 0 ? this.f15656d : qVar2.J(i15);
                if (J != null) {
                    if (i14 != intArray.length - 1) {
                        while (true) {
                            qVar = (q) J;
                            if (!(qVar.J(qVar.M()) instanceof q)) {
                                break;
                            }
                            J = qVar.J(qVar.M());
                        }
                        qVar2 = qVar;
                    } else {
                        q(J, J.g(bundle), new u.a().g(this.f15656d.r(), true).b(0).c(0).a(), null);
                    }
                    i14++;
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + o.p(this.f15653a, i15) + " cannot be found in graph " + qVar2);
                }
            }
            this.f15659g = true;
            return true;
        }
    }

    public void m(int i10) {
        n(i10, null);
    }

    public void n(int i10, Bundle bundle) {
        o(i10, bundle, null);
    }

    public void o(int i10, Bundle bundle, u uVar) {
        p(i10, bundle, uVar, null);
    }

    public void p(int i10, Bundle bundle, u uVar, x.a aVar) {
        o b10;
        int i11;
        if (this.f15660h.isEmpty()) {
            b10 = this.f15656d;
        } else {
            b10 = this.f15660h.getLast().b();
        }
        if (b10 != null) {
            e k10 = b10.k(i10);
            Bundle bundle2 = null;
            if (k10 != null) {
                if (uVar == null) {
                    uVar = k10.c();
                }
                i11 = k10.b();
                Bundle a10 = k10.a();
                if (a10 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a10);
                }
            } else {
                i11 = i10;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i11 == 0 && uVar != null && uVar.e() != -1) {
                u(uVar.e(), uVar.f());
                return;
            } else if (i11 != 0) {
                o d10 = d(i11);
                if (d10 == null) {
                    String p10 = o.p(this.f15653a, i11);
                    if (k10 != null) {
                        throw new IllegalArgumentException("Navigation destination " + p10 + " referenced from action " + o.p(this.f15653a, i10) + " cannot be found from the current destination " + b10);
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + p10 + " cannot be found from the current destination " + b10);
                }
                q(d10, bundle2, uVar, aVar);
                return;
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        }
        throw new IllegalStateException("no current navigation node");
    }

    public final void q(o oVar, Bundle bundle, u uVar, x.a aVar) {
        boolean z10 = false;
        boolean v10 = (uVar == null || uVar.e() == -1) ? false : v(uVar.e(), uVar.f());
        x e10 = this.f15663k.e(oVar.s());
        Bundle g10 = oVar.g(bundle);
        o b10 = e10.b(oVar, g10, uVar, aVar);
        if (b10 != null) {
            if (!(b10 instanceof d)) {
                while (!this.f15660h.isEmpty() && (this.f15660h.peekLast().b() instanceof d) && v(this.f15660h.peekLast().b().r(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (oVar instanceof q) {
                q qVar = b10;
                while (true) {
                    q t10 = qVar.t();
                    if (t10 != null) {
                        arrayDeque.addFirst(new j(this.f15653a, t10, g10, this.f15661i, this.f15662j));
                        if (!this.f15660h.isEmpty() && this.f15660h.getLast().b() == t10) {
                            v(t10.r(), true);
                        }
                    }
                    if (t10 == null || t10 == oVar) {
                        break;
                    }
                    qVar = t10;
                }
            }
            q b11 = arrayDeque.isEmpty() ? b10 : ((j) arrayDeque.getFirst()).b();
            while (b11 != null && d(b11.r()) == null) {
                b11 = b11.t();
                if (b11 != null) {
                    arrayDeque.addFirst(new j(this.f15653a, b11, g10, this.f15661i, this.f15662j));
                }
            }
            o b12 = arrayDeque.isEmpty() ? b10 : ((j) arrayDeque.getLast()).b();
            while (!this.f15660h.isEmpty() && (this.f15660h.getLast().b() instanceof q) && ((q) this.f15660h.getLast().b()).K(b12.r(), false) == null && v(this.f15660h.getLast().b().r(), true)) {
            }
            this.f15660h.addAll(arrayDeque);
            if (this.f15660h.isEmpty() || this.f15660h.getFirst().b() != this.f15656d) {
                this.f15660h.addFirst(new j(this.f15653a, this.f15656d, g10, this.f15661i, this.f15662j));
            }
            this.f15660h.add(new j(this.f15653a, b10, b10.g(g10), this.f15661i, this.f15662j));
        } else if (uVar != null && uVar.g()) {
            j peekLast = this.f15660h.peekLast();
            if (peekLast != null) {
                peekLast.f(g10);
            }
            z10 = true;
        }
        F();
        if (v10 || b10 != null || z10) {
            b();
        }
    }

    public void r(p pVar) {
        n(pVar.a(), pVar.b());
    }

    public final void s(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f15657e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                x e10 = this.f15663k.e(next);
                Bundle bundle3 = this.f15657e.getBundle(next);
                if (bundle3 != null) {
                    e10.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f15658f;
        boolean z10 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                k kVar = (k) parcelable;
                o d10 = d(kVar.b());
                if (d10 != null) {
                    Bundle a10 = kVar.a();
                    if (a10 != null) {
                        a10.setClassLoader(this.f15653a.getClassLoader());
                    }
                    this.f15660h.add(new j(this.f15653a, d10, a10, this.f15661i, this.f15662j, kVar.d(), kVar.c()));
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + o.p(this.f15653a, kVar.b()) + " cannot be found from the current destination " + g());
                }
            }
            F();
            this.f15658f = null;
        }
        if (this.f15656d != null && this.f15660h.isEmpty()) {
            if (!this.f15659g && (activity = this.f15654b) != null && l(activity.getIntent())) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            q(this.f15656d, bundle, null, null);
            return;
        }
        b();
    }

    public boolean t() {
        if (this.f15660h.isEmpty()) {
            return false;
        }
        return u(g().r(), true);
    }

    public boolean u(int i10, boolean z10) {
        return v(i10, z10) && b();
    }

    public boolean v(int i10, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f15660h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<j> descendingIterator = this.f15660h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z11 = false;
                break;
            }
            o b10 = descendingIterator.next().b();
            x e10 = this.f15663k.e(b10.s());
            if (z10 || b10.r() != i10) {
                arrayList.add(e10);
            }
            if (b10.r() == i10) {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            Log.i("NavController", "Ignoring popBackStack to destination " + o.p(this.f15653a, i10) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((x) it.next()).e()) {
            j removeLast = this.f15660h.removeLast();
            if (removeLast.g().b().a(o.c.CREATED)) {
                removeLast.i(o.c.DESTROYED);
            }
            l lVar = this.f15662j;
            if (lVar != null) {
                lVar.f(removeLast.B);
            }
            z12 = true;
        }
        F();
        return z12;
    }

    public void w(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f15653a.getClassLoader());
        this.f15657e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f15658f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f15659g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle x() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, x<? extends o>> entry : this.f15663k.f().entrySet()) {
            String key = entry.getKey();
            Bundle d10 = entry.getValue().d();
            if (d10 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, d10);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f15660h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f15660h.size()];
            int i10 = 0;
            for (j jVar : this.f15660h) {
                parcelableArr[i10] = new k(jVar);
                i10++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f15659g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f15659g);
        }
        return bundle;
    }

    public void y(int i10) {
        z(i10, null);
    }

    public void z(int i10, Bundle bundle) {
        B(j().c(i10), bundle);
    }
}

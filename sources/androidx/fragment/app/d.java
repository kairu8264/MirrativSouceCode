package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.g0;
import androidx.fragment.app.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k3.c;

/* loaded from: classes.dex */
public class d extends g0 {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15274a;

        static {
            int[] iArr = new int[g0.e.c.values().length];
            f15274a = iArr;
            try {
                iArr[g0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15274a[g0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15274a[g0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15274a[g0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List f15275w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0.e f15276x;

        public b(List list, g0.e eVar) {
            this.f15275w = list;
            this.f15276x = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15275w.contains(this.f15276x)) {
                this.f15275w.remove(this.f15276x);
                d.this.s(this.f15276x);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f15278a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f15279b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f15280c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g0.e f15281d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k f15282e;

        public c(ViewGroup viewGroup, View view, boolean z10, g0.e eVar, k kVar) {
            this.f15278a = viewGroup;
            this.f15279b = view;
            this.f15280c = z10;
            this.f15281d = eVar;
            this.f15282e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15278a.endViewTransition(this.f15279b);
            if (this.f15280c) {
                this.f15281d.e().a(this.f15279b);
            }
            this.f15282e.a();
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f15281d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0063d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f15284a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g0.e f15285b;

        public C0063d(Animator animator, g0.e eVar) {
            this.f15284a = animator;
            this.f15285b = eVar;
        }

        @Override // k3.c.a
        public void a() {
            this.f15284a.end();
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f15285b + " has been canceled.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0.e f15287a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f15288b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f15289c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k f15290d;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f15288b.endViewTransition(eVar.f15289c);
                e.this.f15290d.a();
            }
        }

        public e(g0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f15287a = eVar;
            this.f15288b = viewGroup;
            this.f15289c = view;
            this.f15290d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15288b.post(new a());
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f15287a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f15287a + " has reached onAnimationStart.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f15293a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f15294b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f15295c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g0.e f15296d;

        public f(View view, ViewGroup viewGroup, k kVar, g0.e eVar) {
            this.f15293a = view;
            this.f15294b = viewGroup;
            this.f15295c = kVar;
            this.f15296d = eVar;
        }

        @Override // k3.c.a
        public void a() {
            this.f15293a.clearAnimation();
            this.f15294b.endViewTransition(this.f15293a);
            this.f15295c.a();
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f15296d + " has been cancelled.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.e f15298w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0.e f15299x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f15300y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ s.a f15301z;

        public g(g0.e eVar, g0.e eVar2, boolean z10, s.a aVar) {
            this.f15298w = eVar;
            this.f15299x = eVar2;
            this.f15300y = z10;
            this.f15301z = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.a(this.f15298w.f(), this.f15299x.f(), this.f15300y, this.f15301z, false);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0 f15302w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f15303x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Rect f15304y;

        public h(c0 c0Var, View view, Rect rect) {
            this.f15302w = c0Var;
            this.f15303x = view;
            this.f15304y = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15302w.h(this.f15303x, this.f15304y);
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList f15306w;

        public i(ArrayList arrayList) {
            this.f15306w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.d(this.f15306w, 4);
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m f15308w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0.e f15309x;

        public j(m mVar, g0.e eVar) {
            this.f15308w = mVar;
            this.f15309x = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15308w.a();
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f15309x + "has completed");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        public boolean f15311c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15312d;

        /* renamed from: e  reason: collision with root package name */
        public i.a f15313e;

        public k(g0.e eVar, k3.c cVar, boolean z10) {
            super(eVar, cVar);
            this.f15312d = false;
            this.f15311c = z10;
        }

        public i.a e(Context context) {
            if (this.f15312d) {
                return this.f15313e;
            }
            i.a b10 = androidx.fragment.app.i.b(context, b().f(), b().e() == g0.e.c.VISIBLE, this.f15311c);
            this.f15313e = b10;
            this.f15312d = true;
            return b10;
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final g0.e f15314a;

        /* renamed from: b  reason: collision with root package name */
        public final k3.c f15315b;

        public l(g0.e eVar, k3.c cVar) {
            this.f15314a = eVar;
            this.f15315b = cVar;
        }

        public void a() {
            this.f15314a.d(this.f15315b);
        }

        public g0.e b() {
            return this.f15314a;
        }

        public k3.c c() {
            return this.f15315b;
        }

        public boolean d() {
            g0.e.c cVar;
            g0.e.c e10 = g0.e.c.e(this.f15314a.f().f15130e0);
            g0.e.c e11 = this.f15314a.e();
            return e10 == e11 || !(e10 == (cVar = g0.e.c.VISIBLE) || e11 == cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        public final Object f15316c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f15317d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f15318e;

        public m(g0.e eVar, k3.c cVar, boolean z10, boolean z11) {
            super(eVar, cVar);
            Object x02;
            Object u02;
            boolean k02;
            if (eVar.e() == g0.e.c.VISIBLE) {
                if (z10) {
                    u02 = eVar.f().N0();
                } else {
                    u02 = eVar.f().u0();
                }
                this.f15316c = u02;
                if (z10) {
                    k02 = eVar.f().l0();
                } else {
                    k02 = eVar.f().k0();
                }
                this.f15317d = k02;
            } else {
                if (z10) {
                    x02 = eVar.f().P0();
                } else {
                    x02 = eVar.f().x0();
                }
                this.f15316c = x02;
                this.f15317d = true;
            }
            if (!z11) {
                this.f15318e = null;
            } else if (z10) {
                this.f15318e = eVar.f().R0();
            } else {
                this.f15318e = eVar.f().Q0();
            }
        }

        public c0 e() {
            c0 f10 = f(this.f15316c);
            c0 f11 = f(this.f15318e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f15316c + " which uses a different Transition  type than its shared element transition " + this.f15318e);
        }

        public final c0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            c0 c0Var = a0.f15246a;
            if (c0Var == null || !c0Var.e(obj)) {
                c0 c0Var2 = a0.f15247b;
                if (c0Var2 == null || !c0Var2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return c0Var2;
            }
            return c0Var;
        }

        public Object g() {
            return this.f15318e;
        }

        public Object h() {
            return this.f15316c;
        }

        public boolean i() {
            return this.f15318e != null;
        }

        public boolean j() {
            return this.f15317d;
        }
    }

    public d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.g0
    public void f(List<g0.e> list, boolean z10) {
        g0.e eVar = null;
        g0.e eVar2 = null;
        for (g0.e eVar3 : list) {
            g0.e.c e10 = g0.e.c.e(eVar3.f().f15130e0);
            int i10 = a.f15274a[eVar3.e().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4 && e10 != g0.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (e10 == g0.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<g0.e> arrayList3 = new ArrayList(list);
        for (g0.e eVar4 : list) {
            k3.c cVar = new k3.c();
            eVar4.j(cVar);
            arrayList.add(new k(eVar4, cVar, z10));
            k3.c cVar2 = new k3.c();
            eVar4.j(cVar2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, cVar2, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, cVar2, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, cVar2, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, cVar2, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<g0.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (g0.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    public void s(g0.e eVar) {
        eVar.e().a(eVar.f().f15130e0);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (o3.f0.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void u(Map<String, View> map, View view) {
        String N = o3.c0.N(view);
        if (N != null) {
            map.put(N, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(s.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(o3.c0.N(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List<k> list, List<g0.e> list2, boolean z10, Map<g0.e, Boolean> map) {
        int i10;
        boolean z11;
        int i11;
        g0.e eVar;
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z12 = false;
        while (true) {
            i10 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                i.a e10 = next.e(context);
                if (e10 == null) {
                    next.a();
                } else {
                    Animator animator = e10.f15358b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        g0.e b10 = next.b();
                        Fragment f10 = b10.f();
                        if (Boolean.TRUE.equals(map.get(b10))) {
                            if (FragmentManager.D0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z13 = b10.e() == g0.e.c.GONE;
                            if (z13) {
                                list2.remove(b10);
                            }
                            View view = f10.f15130e0;
                            m10.startViewTransition(view);
                            animator.addListener(new c(m10, view, z13, b10, next));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.D0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                eVar = b10;
                                sb2.append(eVar);
                                sb2.append(" has started.");
                                Log.v("FragmentManager", sb2.toString());
                            } else {
                                eVar = b10;
                            }
                            next.c().b(new C0063d(animator, eVar));
                            z12 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            g0.e b11 = kVar.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (FragmentManager.D0(i10)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z12) {
                if (FragmentManager.D0(i10)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view2 = f11.f15130e0;
                Animation animation = (Animation) n3.h.g(((i.a) n3.h.g(kVar.e(context))).f15357a);
                if (b11.e() != g0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                    z11 = z12;
                    i11 = i10;
                } else {
                    m10.startViewTransition(view2);
                    i.b bVar = new i.b(animation, m10, view2);
                    z11 = z12;
                    bVar.setAnimationListener(new e(b11, m10, view2, kVar));
                    view2.startAnimation(bVar);
                    i11 = 2;
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b11 + " has started.");
                    }
                }
                kVar.c().b(new f(view2, m10, kVar, b11));
                i10 = i11;
                z12 = z11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<g0.e, Boolean> x(List<m> list, List<g0.e> list2, boolean z10, g0.e eVar, g0.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        HashMap hashMap;
        View view2;
        Object k10;
        s.a aVar;
        ArrayList<View> arrayList3;
        g0.e eVar3;
        ArrayList<View> arrayList4;
        Rect rect;
        c0 c0Var;
        HashMap hashMap2;
        g0.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z11 = z10;
        g0.e eVar5 = eVar;
        g0.e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        c0 c0Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                c0 e10 = mVar.e();
                if (c0Var2 == null) {
                    c0Var2 = e10;
                } else if (e10 != null && c0Var2 != e10) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (c0Var2 == null) {
            for (m mVar2 : list) {
                hashMap3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        s.a aVar2 = new s.a();
        Iterator<m> it = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z12 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (!next.i() || eVar5 == null || eVar6 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                c0Var = c0Var2;
                hashMap2 = hashMap3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object u10 = c0Var2.u(c0Var2.f(next.g()));
                ArrayList<String> S0 = eVar2.f().S0();
                ArrayList<String> S02 = eVar.f().S0();
                ArrayList<String> T0 = eVar.f().T0();
                View view9 = view7;
                int i10 = 0;
                while (i10 < T0.size()) {
                    int indexOf = S0.indexOf(T0.get(i10));
                    ArrayList<String> arrayList7 = T0;
                    if (indexOf != -1) {
                        S0.set(indexOf, S02.get(i10));
                    }
                    i10++;
                    T0 = arrayList7;
                }
                ArrayList<String> T02 = eVar2.f().T0();
                if (!z11) {
                    eVar.f().y0();
                    eVar2.f().v0();
                } else {
                    eVar.f().v0();
                    eVar2.f().y0();
                }
                int i11 = 0;
                for (int size = S0.size(); i11 < size; size = size) {
                    aVar2.put(S0.get(i11), T02.get(i11));
                    i11++;
                }
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    Iterator<String> it2 = T02.iterator();
                    while (it2.hasNext()) {
                        Iterator<String> it3 = it2;
                        Log.v("FragmentManager", "Name: " + it2.next());
                        it2 = it3;
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    Iterator<String> it4 = S0.iterator();
                    while (it4.hasNext()) {
                        Iterator<String> it5 = it4;
                        Log.v("FragmentManager", "Name: " + it4.next());
                        it4 = it5;
                    }
                }
                s.a<String, View> aVar3 = new s.a<>();
                u(aVar3, eVar.f().f15130e0);
                aVar3.v(S0);
                aVar2.v(aVar3.keySet());
                s.a<String, View> aVar4 = new s.a<>();
                u(aVar4, eVar2.f().f15130e0);
                aVar4.v(T02);
                aVar4.v(aVar2.values());
                a0.c(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    c0Var = c0Var2;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    a0.a(eVar2.f(), eVar.f(), z11, aVar3, true);
                    HashMap hashMap4 = hashMap3;
                    View view10 = view6;
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    o3.y.a(m(), new g(eVar2, eVar, z10, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (S0.isEmpty()) {
                        view7 = view9;
                    } else {
                        View view11 = aVar3.get(S0.get(0));
                        c0Var2.p(u10, view11);
                        view7 = view11;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (T02.isEmpty() || (view5 = aVar4.get(T02.get(0))) == null) {
                        view4 = view10;
                    } else {
                        o3.y.a(m(), new h(c0Var2, view5, rect2));
                        view4 = view10;
                        z12 = true;
                    }
                    c0Var2.s(u10, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    c0Var = c0Var2;
                    c0Var2.n(u10, null, null, null, null, u10, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar3, bool);
                    eVar4 = eVar2;
                    hashMap2.put(eVar4, bool);
                    obj3 = u10;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            hashMap3 = hashMap2;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList3;
            c0Var2 = c0Var;
            g0.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view12 = view7;
        s.a aVar5 = aVar2;
        Collection<?> collection = arrayList6;
        g0.e eVar8 = eVar5;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        c0 c0Var3 = c0Var2;
        HashMap hashMap5 = hashMap3;
        View view13 = view6;
        g0.e eVar9 = eVar6;
        View view14 = view13;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar3 : list) {
            if (mVar3.d()) {
                hashMap5.put(mVar3.b(), Boolean.FALSE);
                mVar3.a();
            } else {
                Object f10 = c0Var3.f(mVar3.h());
                g0.e b10 = mVar3.b();
                boolean z13 = obj3 != null && (b10 == eVar8 || b10 == eVar9);
                if (f10 == null) {
                    if (!z13) {
                        hashMap5.put(b10, Boolean.FALSE);
                        mVar3.a();
                    }
                    arrayList2 = collection;
                    str3 = str;
                    arrayList = collection2;
                    view = view14;
                    k10 = obj4;
                    hashMap = hashMap5;
                    view2 = view12;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList10, b10.f().f15130e0);
                    if (z13) {
                        if (b10 == eVar8) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        c0Var3.a(f10, view14);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view14;
                        obj2 = obj5;
                        hashMap = hashMap5;
                        obj = obj6;
                    } else {
                        c0Var3.b(f10, arrayList10);
                        view = view14;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        hashMap = hashMap5;
                        c0Var3.n(f10, f10, arrayList10, null, null, null, null);
                        if (b10.e() == g0.e.c.GONE) {
                            list2.remove(b10);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(b10.f().f15130e0);
                            c0Var3.m(f10, b10.f().f15130e0, arrayList11);
                            o3.y.a(m(), new i(arrayList10));
                        }
                    }
                    if (b10.e() == g0.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z12) {
                            c0Var3.o(f10, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        c0Var3.p(f10, view2);
                    }
                    hashMap.put(b10, Boolean.TRUE);
                    if (mVar3.j()) {
                        obj5 = c0Var3.k(obj2, f10, null);
                        k10 = obj;
                    } else {
                        k10 = c0Var3.k(obj, f10, null);
                        obj5 = obj2;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj4 = k10;
                view12 = view2;
                str = str3;
                view14 = view;
                collection2 = arrayList;
                collection = arrayList2;
            }
        }
        ArrayList<View> arrayList12 = collection;
        String str4 = str;
        ArrayList<View> arrayList13 = collection2;
        HashMap hashMap6 = hashMap5;
        Object j10 = c0Var3.j(obj5, obj4, obj3);
        if (j10 == null) {
            return hashMap6;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object h10 = mVar4.h();
                g0.e b11 = mVar4.b();
                HashMap hashMap7 = hashMap6;
                boolean z14 = obj3 != null && (b11 == eVar8 || b11 == eVar2);
                if (h10 == null && !z14) {
                    str2 = str4;
                } else if (!o3.c0.V(m())) {
                    if (FragmentManager.D0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                    } else {
                        str2 = str4;
                    }
                    mVar4.a();
                } else {
                    str2 = str4;
                    c0Var3.q(mVar4.b().f(), j10, mVar4.c(), new j(mVar4, b11));
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (o3.c0.V(m())) {
            a0.d(arrayList9, 4);
            ArrayList<String> l10 = c0Var3.l(arrayList12);
            if (FragmentManager.D0(2)) {
                Log.v(str5, ">>>>> Beginning transition <<<<<");
                Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it6 = arrayList13.iterator();
                while (it6.hasNext()) {
                    View next2 = it6.next();
                    Log.v(str5, "View: " + next2 + " Name: " + o3.c0.N(next2));
                }
                Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it7 = arrayList12.iterator();
                while (it7.hasNext()) {
                    View next3 = it7.next();
                    Log.v(str5, "View: " + next3 + " Name: " + o3.c0.N(next3));
                }
            }
            c0Var3.c(m(), j10);
            c0Var3.r(m(), arrayList13, arrayList12, l10, aVar5);
            a0.d(arrayList9, 0);
            c0Var3.t(obj3, arrayList13, arrayList12);
            return hashMap8;
        }
        return hashMap8;
    }
}

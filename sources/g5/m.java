package g5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f32741d0 = {2, 1, 3, 4};

    /* renamed from: e0  reason: collision with root package name */
    public static final g f32742e0 = new a();

    /* renamed from: f0  reason: collision with root package name */
    public static ThreadLocal<s.a<Animator, d>> f32743f0 = new ThreadLocal<>();
    public ArrayList<s> P;
    public ArrayList<s> Q;
    public p Z;

    /* renamed from: a0  reason: collision with root package name */
    public e f32744a0;

    /* renamed from: b0  reason: collision with root package name */
    public s.a<String, String> f32745b0;

    /* renamed from: w  reason: collision with root package name */
    public String f32747w = getClass().getName();

    /* renamed from: x  reason: collision with root package name */
    public long f32748x = -1;

    /* renamed from: y  reason: collision with root package name */
    public long f32749y = -1;

    /* renamed from: z  reason: collision with root package name */
    public TimeInterpolator f32750z = null;
    public ArrayList<Integer> A = new ArrayList<>();
    public ArrayList<View> B = new ArrayList<>();
    public ArrayList<String> C = null;
    public ArrayList<Class<?>> D = null;
    public ArrayList<Integer> E = null;
    public ArrayList<View> F = null;
    public ArrayList<Class<?>> G = null;
    public ArrayList<String> H = null;
    public ArrayList<Integer> I = null;
    public ArrayList<View> J = null;
    public ArrayList<Class<?>> K = null;
    public t L = new t();
    public t M = new t();
    public q N = null;
    public int[] O = f32741d0;
    public ViewGroup R = null;
    public boolean S = false;
    public ArrayList<Animator> T = new ArrayList<>();
    public int U = 0;
    public boolean V = false;
    public boolean W = false;
    public ArrayList<f> X = null;
    public ArrayList<Animator> Y = new ArrayList<>();

    /* renamed from: c0  reason: collision with root package name */
    public g f32746c0 = f32742e0;

    /* loaded from: classes.dex */
    public static class a extends g {
        @Override // g5.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s.a f32751a;

        public b(s.a aVar) {
            this.f32751a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32751a.remove(animator);
            m.this.T.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.T.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.t();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f32754a;

        /* renamed from: b  reason: collision with root package name */
        public String f32755b;

        /* renamed from: c  reason: collision with root package name */
        public s f32756c;

        /* renamed from: d  reason: collision with root package name */
        public m0 f32757d;

        /* renamed from: e  reason: collision with root package name */
        public m f32758e;

        public d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f32754a = view;
            this.f32755b = str;
            this.f32756c = sVar;
            this.f32757d = m0Var;
            this.f32758e = mVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    public static s.a<Animator, d> B() {
        s.a<Animator, d> aVar = f32743f0.get();
        if (aVar == null) {
            s.a<Animator, d> aVar2 = new s.a<>();
            f32743f0.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static boolean L(s sVar, s sVar2, String str) {
        Object obj = sVar.f32777a.get(str);
        Object obj2 = sVar2.f32777a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static void g(t tVar, View view, s sVar) {
        tVar.f32780a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f32781b.indexOfKey(id2) >= 0) {
                tVar.f32781b.put(id2, null);
            } else {
                tVar.f32781b.put(id2, view);
            }
        }
        String N = o3.c0.N(view);
        if (N != null) {
            if (tVar.f32783d.containsKey(N)) {
                tVar.f32783d.put(N, null);
            } else {
                tVar.f32783d.put(N, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f32782c.k(itemIdAtPosition) >= 0) {
                    View h10 = tVar.f32782c.h(itemIdAtPosition);
                    if (h10 != null) {
                        o3.c0.B0(h10, false);
                        tVar.f32782c.m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                o3.c0.B0(view, true);
                tVar.f32782c.m(itemIdAtPosition, view);
            }
        }
    }

    public p A() {
        return this.Z;
    }

    public long C() {
        return this.f32748x;
    }

    public List<Integer> D() {
        return this.A;
    }

    public List<String> E() {
        return this.C;
    }

    public List<Class<?>> F() {
        return this.D;
    }

    public List<View> G() {
        return this.B;
    }

    public String[] H() {
        return null;
    }

    public s I(View view, boolean z10) {
        q qVar = this.N;
        if (qVar != null) {
            return qVar.I(view, z10);
        }
        return (z10 ? this.L : this.M).f32780a.get(view);
    }

    public boolean J(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] H = H();
        if (H != null) {
            for (String str : H) {
                if (!L(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f32777a.keySet()) {
            if (L(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.E;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList4 = this.F;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.G;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.G.get(i10).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.H == null || o3.c0.N(view) == null || !this.H.contains(o3.c0.N(view))) {
                    if ((this.A.size() == 0 && this.B.size() == 0 && (((arrayList = this.D) == null || arrayList.isEmpty()) && ((arrayList2 = this.C) == null || arrayList2.isEmpty()))) || this.A.contains(Integer.valueOf(id2)) || this.B.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.C;
                    if (arrayList6 == null || !arrayList6.contains(o3.c0.N(view))) {
                        if (this.D != null) {
                            for (int i11 = 0; i11 < this.D.size(); i11++) {
                                if (this.D.get(i11).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void M(s.a<View, s> aVar, s.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && K(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.P.add(sVar);
                    this.Q.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void N(s.a<View, s> aVar, s.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m10 = aVar.m(size);
            if (m10 != null && K(m10) && (remove = aVar2.remove(m10)) != null && K(remove.f32778b)) {
                this.P.add(aVar.p(size));
                this.Q.add(remove);
            }
        }
    }

    public final void O(s.a<View, s> aVar, s.a<View, s> aVar2, s.e<View> eVar, s.e<View> eVar2) {
        View h10;
        int q10 = eVar.q();
        for (int i10 = 0; i10 < q10; i10++) {
            View r10 = eVar.r(i10);
            if (r10 != null && K(r10) && (h10 = eVar2.h(eVar.l(i10))) != null && K(h10)) {
                s sVar = aVar.get(r10);
                s sVar2 = aVar2.get(h10);
                if (sVar != null && sVar2 != null) {
                    this.P.add(sVar);
                    this.Q.add(sVar2);
                    aVar.remove(r10);
                    aVar2.remove(h10);
                }
            }
        }
    }

    public final void Q(s.a<View, s> aVar, s.a<View, s> aVar2, s.a<String, View> aVar3, s.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View r10 = aVar3.r(i10);
            if (r10 != null && K(r10) && (view = aVar4.get(aVar3.m(i10))) != null && K(view)) {
                s sVar = aVar.get(r10);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.P.add(sVar);
                    this.Q.add(sVar2);
                    aVar.remove(r10);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void R(t tVar, t tVar2) {
        s.a<View, s> aVar = new s.a<>(tVar.f32780a);
        s.a<View, s> aVar2 = new s.a<>(tVar2.f32780a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.O;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    N(aVar, aVar2);
                } else if (i11 == 2) {
                    Q(aVar, aVar2, tVar.f32783d, tVar2.f32783d);
                } else if (i11 == 3) {
                    M(aVar, aVar2, tVar.f32781b, tVar2.f32781b);
                } else if (i11 == 4) {
                    O(aVar, aVar2, tVar.f32782c, tVar2.f32782c);
                }
                i10++;
            } else {
                f(aVar, aVar2);
                return;
            }
        }
    }

    public void T(View view) {
        if (this.W) {
            return;
        }
        s.a<Animator, d> B = B();
        int size = B.size();
        m0 d10 = c0.d(view);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d r10 = B.r(i10);
            if (r10.f32754a != null && d10.equals(r10.f32757d)) {
                g5.a.b(B.m(i10));
            }
        }
        ArrayList<f> arrayList = this.X;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.X.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).e(this);
            }
        }
        this.V = true;
    }

    public void V(ViewGroup viewGroup) {
        d dVar;
        this.P = new ArrayList<>();
        this.Q = new ArrayList<>();
        R(this.L, this.M);
        s.a<Animator, d> B = B();
        int size = B.size();
        m0 d10 = c0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator m10 = B.m(i10);
            if (m10 != null && (dVar = B.get(m10)) != null && dVar.f32754a != null && d10.equals(dVar.f32757d)) {
                s sVar = dVar.f32756c;
                View view = dVar.f32754a;
                s I = I(view, true);
                s x10 = x(view, true);
                if (I == null && x10 == null) {
                    x10 = this.M.f32780a.get(view);
                }
                if (!(I == null && x10 == null) && dVar.f32758e.J(sVar, x10)) {
                    if (!m10.isRunning() && !m10.isStarted()) {
                        B.remove(m10);
                    } else {
                        m10.cancel();
                    }
                }
            }
        }
        s(viewGroup, this.L, this.M, this.P, this.Q);
        a0();
    }

    public m W(f fVar) {
        ArrayList<f> arrayList = this.X;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.X.size() == 0) {
            this.X = null;
        }
        return this;
    }

    public m X(View view) {
        this.B.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.V) {
            if (!this.W) {
                s.a<Animator, d> B = B();
                int size = B.size();
                m0 d10 = c0.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d r10 = B.r(i10);
                    if (r10.f32754a != null && d10.equals(r10.f32757d)) {
                        g5.a.c(B.m(i10));
                    }
                }
                ArrayList<f> arrayList = this.X;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.X.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).b(this);
                    }
                }
            }
            this.V = false;
        }
    }

    public final void Z(Animator animator, s.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            h(animator);
        }
    }

    public void a0() {
        h0();
        s.a<Animator, d> B = B();
        Iterator<Animator> it = this.Y.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (B.containsKey(next)) {
                h0();
                Z(next, B);
            }
        }
        this.Y.clear();
        t();
    }

    public m b(f fVar) {
        if (this.X == null) {
            this.X = new ArrayList<>();
        }
        this.X.add(fVar);
        return this;
    }

    public m b0(long j10) {
        this.f32749y = j10;
        return this;
    }

    public m c(int i10) {
        if (i10 != 0) {
            this.A.add(Integer.valueOf(i10));
        }
        return this;
    }

    public void c0(e eVar) {
        this.f32744a0 = eVar;
    }

    public void cancel() {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).cancel();
        }
        ArrayList<f> arrayList = this.X;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.X.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).a(this);
        }
    }

    public m d0(TimeInterpolator timeInterpolator) {
        this.f32750z = timeInterpolator;
        return this;
    }

    public m e(View view) {
        this.B.add(view);
        return this;
    }

    public void e0(g gVar) {
        if (gVar == null) {
            this.f32746c0 = f32742e0;
        } else {
            this.f32746c0 = gVar;
        }
    }

    public final void f(s.a<View, s> aVar, s.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s r10 = aVar.r(i10);
            if (K(r10.f32778b)) {
                this.P.add(r10);
                this.Q.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s r11 = aVar2.r(i11);
            if (K(r11.f32778b)) {
                this.Q.add(r11);
                this.P.add(null);
            }
        }
    }

    public void f0(p pVar) {
    }

    public m g0(long j10) {
        this.f32748x = j10;
        return this;
    }

    public void h(Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void h0() {
        if (this.U == 0) {
            ArrayList<f> arrayList = this.X;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.X.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).d(this);
                }
            }
            this.W = false;
        }
        this.U++;
    }

    public abstract void i(s sVar);

    public String i0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f32749y != -1) {
            str2 = str2 + "dur(" + this.f32749y + ") ";
        }
        if (this.f32748x != -1) {
            str2 = str2 + "dly(" + this.f32748x + ") ";
        }
        if (this.f32750z != null) {
            str2 = str2 + "interp(" + this.f32750z + ") ";
        }
        if (this.A.size() > 0 || this.B.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.A.size() > 0) {
                for (int i10 = 0; i10 < this.A.size(); i10++) {
                    if (i10 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.A.get(i10);
                }
            }
            if (this.B.size() > 0) {
                for (int i11 = 0; i11 < this.B.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.B.get(i11);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public final void k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.E;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.F;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.G;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.G.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z10) {
                        m(sVar);
                    } else {
                        i(sVar);
                    }
                    sVar.f32779c.add(this);
                    l(sVar);
                    if (z10) {
                        g(this.L, view, sVar);
                    } else {
                        g(this.M, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.I;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.J;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.K;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.K.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public void l(s sVar) {
    }

    public abstract void m(s sVar);

    public void n(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        s.a<String, String> aVar;
        o(z10);
        if ((this.A.size() <= 0 && this.B.size() <= 0) || (((arrayList = this.C) != null && !arrayList.isEmpty()) || ((arrayList2 = this.D) != null && !arrayList2.isEmpty()))) {
            k(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.A.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.A.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        m(sVar);
                    } else {
                        i(sVar);
                    }
                    sVar.f32779c.add(this);
                    l(sVar);
                    if (z10) {
                        g(this.L, findViewById, sVar);
                    } else {
                        g(this.M, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.B.size(); i11++) {
                View view = this.B.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    m(sVar2);
                } else {
                    i(sVar2);
                }
                sVar2.f32779c.add(this);
                l(sVar2);
                if (z10) {
                    g(this.L, view, sVar2);
                } else {
                    g(this.M, view, sVar2);
                }
            }
        }
        if (z10 || (aVar = this.f32745b0) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.L.f32783d.remove(this.f32745b0.m(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.L.f32783d.put(this.f32745b0.r(i13), view2);
            }
        }
    }

    public void o(boolean z10) {
        if (z10) {
            this.L.f32780a.clear();
            this.L.f32781b.clear();
            this.L.f32782c.c();
            return;
        }
        this.M.f32780a.clear();
        this.M.f32781b.clear();
        this.M.f32782c.c();
    }

    @Override // 
    /* renamed from: q */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.Y = new ArrayList<>();
            mVar.L = new t();
            mVar.M = new t();
            mVar.P = null;
            mVar.Q = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void s(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i10;
        View view;
        Animator animator;
        s sVar;
        Animator animator2;
        s sVar2;
        s.a<Animator, d> B = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f32779c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f32779c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 == null || sVar4 == null || J(sVar3, sVar4)) {
                    Animator r10 = r(viewGroup, sVar3, sVar4);
                    if (r10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f32778b;
                            String[] H = H();
                            if (H != null && H.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f32780a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < H.length) {
                                        sVar2.f32777a.put(H[i12], sVar5.f32777a.get(H[i12]));
                                        i12++;
                                        r10 = r10;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = r10;
                                i10 = size;
                                int size2 = B.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = B.get(B.m(i13));
                                    if (dVar.f32756c != null && dVar.f32754a == view2 && dVar.f32755b.equals(y()) && dVar.f32756c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i10 = size;
                                animator2 = r10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i10 = size;
                            view = sVar3.f32778b;
                            animator = r10;
                            sVar = null;
                        }
                        if (animator != null) {
                            B.put(animator, new d(view, y(), this, c0.d(viewGroup), sVar));
                            this.Y.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.Y.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    public void t() {
        int i10 = this.U - 1;
        this.U = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.X;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.X.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < this.L.f32782c.q(); i12++) {
                View r10 = this.L.f32782c.r(i12);
                if (r10 != null) {
                    o3.c0.B0(r10, false);
                }
            }
            for (int i13 = 0; i13 < this.M.f32782c.q(); i13++) {
                View r11 = this.M.f32782c.r(i13);
                if (r11 != null) {
                    o3.c0.B0(r11, false);
                }
            }
            this.W = true;
        }
    }

    public String toString() {
        return i0("");
    }

    public long u() {
        return this.f32749y;
    }

    public e v() {
        return this.f32744a0;
    }

    public TimeInterpolator w() {
        return this.f32750z;
    }

    public s x(View view, boolean z10) {
        q qVar = this.N;
        if (qVar != null) {
            return qVar.x(view, z10);
        }
        ArrayList<s> arrayList = z10 ? this.P : this.Q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            s sVar = arrayList.get(i11);
            if (sVar == null) {
                return null;
            }
            if (sVar.f32778b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.Q : this.P).get(i10);
        }
        return null;
    }

    public String y() {
        return this.f32747w;
    }

    public g z() {
        return this.f32746c0;
    }
}

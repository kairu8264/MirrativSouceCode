package q1;

import androidx.compose.ui.platform.u2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l0.z1;
import q1.a1;
import q1.y0;
import s1.k;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final s1.k f48518a;

    /* renamed from: b  reason: collision with root package name */
    public l0.m f48519b;

    /* renamed from: c  reason: collision with root package name */
    public a1 f48520c;

    /* renamed from: d  reason: collision with root package name */
    public int f48521d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<s1.k, a> f48522e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Object, s1.k> f48523f;

    /* renamed from: g  reason: collision with root package name */
    public final b f48524g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Object, s1.k> f48525h;

    /* renamed from: i  reason: collision with root package name */
    public final a1.a f48526i;

    /* renamed from: j  reason: collision with root package name */
    public int f48527j;

    /* renamed from: k  reason: collision with root package name */
    public int f48528k;

    /* renamed from: l  reason: collision with root package name */
    public final String f48529l;

    /* loaded from: classes.dex */
    public final class b implements z0 {

        /* renamed from: w  reason: collision with root package name */
        public m2.q f48535w = m2.q.Rtl;

        /* renamed from: x  reason: collision with root package name */
        public float f48536x;

        /* renamed from: y  reason: collision with root package name */
        public float f48537y;

        public b() {
        }

        @Override // m2.d
        public float G0() {
            return this.f48537y;
        }

        @Override // q1.z0
        public List<b0> V(Object obj, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            jo.p.h(pVar, "content");
            return a0.this.w(obj, pVar);
        }

        public void d(float f10) {
            this.f48536x = f10;
        }

        public void e(float f10) {
            this.f48537y = f10;
        }

        @Override // m2.d
        public float getDensity() {
            return this.f48536x;
        }

        @Override // q1.m
        public m2.q getLayoutDirection() {
            return this.f48535w;
        }

        public void h(m2.q qVar) {
            jo.p.h(qVar, "<set-?>");
            this.f48535w = qVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends k.h {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ io.p<z0, m2.b, d0> f48540c;

        /* loaded from: classes.dex */
        public static final class a implements d0 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d0 f48541a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a0 f48542b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int f48543c;

            public a(d0 d0Var, a0 a0Var, int i10) {
                this.f48541a = d0Var;
                this.f48542b = a0Var;
                this.f48543c = i10;
            }

            @Override // q1.d0
            public void c() {
                this.f48542b.f48521d = this.f48543c;
                this.f48541a.c();
                a0 a0Var = this.f48542b;
                a0Var.n(a0Var.f48521d);
            }

            @Override // q1.d0
            public Map<q1.a, Integer> e() {
                return this.f48541a.e();
            }

            @Override // q1.d0
            public int getHeight() {
                return this.f48541a.getHeight();
            }

            @Override // q1.d0
            public int getWidth() {
                return this.f48541a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.p<? super z0, ? super m2.b, ? extends d0> pVar, String str) {
            super(str);
            this.f48540c = pVar;
        }

        @Override // q1.c0
        public d0 c(e0 e0Var, List<? extends b0> list, long j10) {
            jo.p.h(e0Var, "$this$measure");
            jo.p.h(list, "measurables");
            a0.this.f48524g.h(e0Var.getLayoutDirection());
            a0.this.f48524g.d(e0Var.getDensity());
            a0.this.f48524g.e(e0Var.G0());
            a0.this.f48521d = 0;
            return new a(this.f48540c.invoke(a0.this.f48524g, m2.b.b(j10)), a0.this, a0.this.f48521d);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements y0.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f48545b;

        public d(Object obj) {
            this.f48545b = obj;
        }

        @Override // q1.y0.a
        public int a() {
            m0.e<s1.k> A0;
            s1.k kVar = (s1.k) a0.this.f48525h.get(this.f48545b);
            if (kVar == null || (A0 = kVar.A0()) == null) {
                return 0;
            }
            return A0.p();
        }

        @Override // q1.y0.a
        public void b(int i10, long j10) {
            s1.k kVar = (s1.k) a0.this.f48525h.get(this.f48545b);
            if (kVar == null || !kVar.L0()) {
                return;
            }
            int p10 = kVar.A0().p();
            if (i10 >= 0 && i10 < p10) {
                if (!kVar.g()) {
                    s1.k kVar2 = a0.this.f48518a;
                    kVar2.G = true;
                    s1.o.a(kVar).q(kVar.A0().n()[i10], j10);
                    kVar2.G = false;
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + p10 + ')');
        }

        @Override // q1.y0.a
        public void dispose() {
            a0.this.q();
            s1.k kVar = (s1.k) a0.this.f48525h.remove(this.f48545b);
            if (kVar != null) {
                if (a0.this.f48528k > 0) {
                    int indexOf = a0.this.f48518a.Z().indexOf(kVar);
                    if (indexOf >= a0.this.f48518a.Z().size() - a0.this.f48528k) {
                        a0.this.f48527j++;
                        a0 a0Var = a0.this;
                        a0Var.f48528k--;
                        int size = (a0.this.f48518a.Z().size() - a0.this.f48528k) - a0.this.f48527j;
                        a0.this.r(indexOf, size, 1);
                        a0.this.n(size);
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a f48546w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f48547x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(a aVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            super(2);
            this.f48546w = aVar;
            this.f48547x = pVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            boolean a10 = this.f48546w.a();
            io.p<l0.i, Integer, wn.v> pVar = this.f48547x;
            iVar.H(207, Boolean.valueOf(a10));
            boolean a11 = iVar.a(a10);
            if (a10) {
                pVar.invoke(iVar, 0);
            } else {
                iVar.g(a11);
            }
            iVar.w();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public a0(s1.k kVar, a1 a1Var) {
        jo.p.h(kVar, "root");
        jo.p.h(a1Var, "slotReusePolicy");
        this.f48518a = kVar;
        this.f48520c = a1Var;
        this.f48522e = new LinkedHashMap();
        this.f48523f = new LinkedHashMap();
        this.f48524g = new b();
        this.f48525h = new LinkedHashMap();
        this.f48526i = new a1.a(null, 1, null);
        this.f48529l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static /* synthetic */ void s(a0 a0Var, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        a0Var.r(i10, i11, i12);
    }

    public final s1.k A(Object obj) {
        int i10;
        if (this.f48527j == 0) {
            return null;
        }
        int size = this.f48518a.Z().size() - this.f48528k;
        int i11 = size - this.f48527j;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            } else if (jo.p.c(p(i13), obj)) {
                i10 = i13;
                break;
            } else {
                i13--;
            }
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                a aVar = this.f48522e.get(this.f48518a.Z().get(i12));
                jo.p.e(aVar);
                a aVar2 = aVar;
                if (this.f48520c.b(obj, aVar2.e())) {
                    aVar2.j(obj);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            r(i13, i11, 1);
        }
        this.f48527j--;
        s1.k kVar = this.f48518a.Z().get(i11);
        a aVar3 = this.f48522e.get(kVar);
        jo.p.e(aVar3);
        aVar3.f(true);
        v0.h.f56484e.g();
        return kVar;
    }

    public final c0 k(io.p<? super z0, ? super m2.b, ? extends d0> pVar) {
        jo.p.h(pVar, "block");
        return new c(pVar, this.f48529l);
    }

    public final s1.k l(int i10) {
        s1.k kVar = new s1.k(true);
        s1.k kVar2 = this.f48518a;
        kVar2.G = true;
        this.f48518a.H0(i10, kVar);
        kVar2.G = false;
        return kVar;
    }

    public final void m() {
        s1.k kVar = this.f48518a;
        kVar.G = true;
        for (a aVar : this.f48522e.values()) {
            l0.l b10 = aVar.b();
            if (b10 != null) {
                b10.dispose();
            }
        }
        this.f48518a.e1();
        kVar.G = false;
        this.f48522e.clear();
        this.f48523f.clear();
        this.f48528k = 0;
        this.f48527j = 0;
        this.f48525h.clear();
        q();
    }

    public final void n(int i10) {
        this.f48527j = 0;
        int size = (this.f48518a.Z().size() - this.f48528k) - 1;
        if (i10 <= size) {
            this.f48526i.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f48526i.add(p(i11));
                    if (i11 == size) {
                        break;
                    }
                    i11++;
                }
            }
            this.f48520c.a(this.f48526i);
            while (size >= i10) {
                s1.k kVar = this.f48518a.Z().get(size);
                a aVar = this.f48522e.get(kVar);
                jo.p.e(aVar);
                a aVar2 = aVar;
                Object e10 = aVar2.e();
                if (this.f48526i.contains(e10)) {
                    kVar.r1(k.i.NotUsed);
                    this.f48527j++;
                    aVar2.f(false);
                } else {
                    s1.k kVar2 = this.f48518a;
                    kVar2.G = true;
                    this.f48522e.remove(kVar);
                    l0.l b10 = aVar2.b();
                    if (b10 != null) {
                        b10.dispose();
                    }
                    this.f48518a.f1(size, 1);
                    kVar2.G = false;
                }
                this.f48523f.remove(e10);
                size--;
            }
        }
        q();
    }

    public final void o() {
        for (Map.Entry<s1.k, a> entry : this.f48522e.entrySet()) {
            entry.getValue().i(true);
        }
        if (this.f48518a.i0()) {
            return;
        }
        s1.k.k1(this.f48518a, false, 1, null);
    }

    public final Object p(int i10) {
        a aVar = this.f48522e.get(this.f48518a.Z().get(i10));
        jo.p.e(aVar);
        return aVar.e();
    }

    public final void q() {
        if (this.f48522e.size() == this.f48518a.Z().size()) {
            if ((this.f48518a.Z().size() - this.f48527j) - this.f48528k >= 0) {
                if (this.f48525h.size() == this.f48528k) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f48528k + ". Map size " + this.f48525h.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f48518a.Z().size() + ". Reusable children " + this.f48527j + ". Precomposed children " + this.f48528k).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f48522e.size() + ") and the children count on the SubcomposeLayout (" + this.f48518a.Z().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final void r(int i10, int i11, int i12) {
        s1.k kVar = this.f48518a;
        kVar.G = true;
        this.f48518a.S0(i10, i11, i12);
        kVar.G = false;
    }

    public final y0.a t(Object obj, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        q();
        if (!this.f48523f.containsKey(obj)) {
            Map<Object, s1.k> map = this.f48525h;
            s1.k kVar = map.get(obj);
            if (kVar == null) {
                kVar = A(obj);
                if (kVar != null) {
                    r(this.f48518a.Z().indexOf(kVar), this.f48518a.Z().size(), 1);
                    this.f48528k++;
                } else {
                    kVar = l(this.f48518a.Z().size());
                    this.f48528k++;
                }
                map.put(obj, kVar);
            }
            x(kVar, obj, pVar);
        }
        return new d(obj);
    }

    public final void u(l0.m mVar) {
        this.f48519b = mVar;
    }

    public final void v(a1 a1Var) {
        jo.p.h(a1Var, "value");
        if (this.f48520c != a1Var) {
            this.f48520c = a1Var;
            n(0);
        }
    }

    public final List<b0> w(Object obj, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        q();
        k.g g02 = this.f48518a.g0();
        if (g02 == k.g.Measuring || g02 == k.g.LayingOut) {
            Map<Object, s1.k> map = this.f48523f;
            s1.k kVar = map.get(obj);
            if (kVar == null) {
                kVar = this.f48525h.remove(obj);
                if (kVar != null) {
                    int i10 = this.f48528k;
                    if (i10 > 0) {
                        this.f48528k = i10 - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    kVar = A(obj);
                    if (kVar == null) {
                        kVar = l(this.f48521d);
                    }
                }
                map.put(obj, kVar);
            }
            s1.k kVar2 = kVar;
            int indexOf = this.f48518a.Z().indexOf(kVar2);
            int i11 = this.f48521d;
            if (indexOf >= i11) {
                if (i11 != indexOf) {
                    s(this, indexOf, i11, 0, 4, null);
                }
                this.f48521d++;
                x(kVar2, obj, pVar);
                return kVar2.W();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    public final void x(s1.k kVar, Object obj, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        Map<s1.k, a> map = this.f48522e;
        a aVar = map.get(kVar);
        if (aVar == null) {
            aVar = new a(obj, q1.e.f48560a.a(), null, 4, null);
            map.put(kVar, aVar);
        }
        a aVar2 = aVar;
        l0.l b10 = aVar2.b();
        boolean t10 = b10 != null ? b10.t() : true;
        if (aVar2.c() != pVar || t10 || aVar2.d()) {
            aVar2.h(pVar);
            y(kVar, aVar2);
            aVar2.i(false);
        }
    }

    public final void y(s1.k kVar, a aVar) {
        v0.h a10 = v0.h.f56484e.a();
        try {
            v0.h k10 = a10.k();
            s1.k kVar2 = this.f48518a;
            kVar2.G = true;
            io.p<l0.i, Integer, wn.v> c10 = aVar.c();
            l0.l b10 = aVar.b();
            l0.m mVar = this.f48519b;
            if (mVar != null) {
                aVar.g(z(b10, kVar, mVar, s0.c.c(-34810602, true, new e(aVar, c10))));
                kVar2.G = false;
                wn.v vVar = wn.v.f59242a;
                a10.r(k10);
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } finally {
            a10.d();
        }
    }

    public final l0.l z(l0.l lVar, s1.k kVar, l0.m mVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        if (lVar == null || lVar.j()) {
            lVar = u2.a(kVar, mVar);
        }
        lVar.n(pVar);
        return lVar;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Object f48530a;

        /* renamed from: b  reason: collision with root package name */
        public io.p<? super l0.i, ? super Integer, wn.v> f48531b;

        /* renamed from: c  reason: collision with root package name */
        public l0.l f48532c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f48533d;

        /* renamed from: e  reason: collision with root package name */
        public final l0.s0 f48534e;

        public a(Object obj, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.l lVar) {
            l0.s0 e10;
            jo.p.h(pVar, "content");
            this.f48530a = obj;
            this.f48531b = pVar;
            this.f48532c = lVar;
            e10 = z1.e(Boolean.TRUE, null, 2, null);
            this.f48534e = e10;
        }

        public final boolean a() {
            return ((Boolean) this.f48534e.getValue()).booleanValue();
        }

        public final l0.l b() {
            return this.f48532c;
        }

        public final io.p<l0.i, Integer, wn.v> c() {
            return this.f48531b;
        }

        public final boolean d() {
            return this.f48533d;
        }

        public final Object e() {
            return this.f48530a;
        }

        public final void f(boolean z10) {
            this.f48534e.setValue(Boolean.valueOf(z10));
        }

        public final void g(l0.l lVar) {
            this.f48532c = lVar;
        }

        public final void h(io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            jo.p.h(pVar, "<set-?>");
            this.f48531b = pVar;
        }

        public final void i(boolean z10) {
            this.f48533d = z10;
        }

        public final void j(Object obj) {
            this.f48530a = obj;
        }

        public /* synthetic */ a(Object obj, io.p pVar, l0.l lVar, int i10, jo.h hVar) {
            this(obj, pVar, (i10 & 4) != 0 ? null : lVar);
        }
    }
}

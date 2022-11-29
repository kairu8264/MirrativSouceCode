package z;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import u.u0;
import uo.q0;
import xn.n0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f62309a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f62310b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, e> f62311c;

    /* renamed from: d  reason: collision with root package name */
    public Map<Object, Integer> f62312d;

    /* renamed from: e  reason: collision with root package name */
    public int f62313e;

    /* renamed from: f  reason: collision with root package name */
    public int f62314f;

    /* renamed from: g  reason: collision with root package name */
    public int f62315g;

    /* renamed from: h  reason: collision with root package name */
    public int f62316h;

    /* renamed from: i  reason: collision with root package name */
    public final Set<Object> f62317i;

    @co.f(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", l = {266}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62318w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0 f62319x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f62319x = m0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f62319x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62318w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a<m2.k, u.n> a10 = this.f62319x.a();
                m2.k b10 = m2.k.b(this.f62319x.d());
                this.f62318w = 1;
                if (a10.v(b10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f62319x.e(false);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyListItemPlacementAnimator.kt", l = {400}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62320w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0 f62321x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.c0<m2.k> f62322y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0 m0Var, u.c0<m2.k> c0Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f62321x = m0Var;
            this.f62322y = c0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f62321x, this.f62322y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            u.i iVar;
            Object c10 = bo.c.c();
            int i10 = this.f62320w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (this.f62321x.a().r()) {
                        u.c0<m2.k> c0Var = this.f62322y;
                        iVar = c0Var instanceof u0 ? (u0) c0Var : p.a();
                    } else {
                        iVar = this.f62322y;
                    }
                    u.i iVar2 = iVar;
                    u.a<m2.k, u.n> a10 = this.f62321x.a();
                    m2.k b10 = m2.k.b(this.f62321x.d());
                    this.f62320w = 1;
                    if (u.a.f(a10, b10, iVar2, null, null, this, 12, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f62321x.e(false);
            } catch (CancellationException unused) {
            }
            return wn.v.f59242a;
        }
    }

    public o(q0 q0Var, boolean z10) {
        jo.p.h(q0Var, "scope");
        this.f62309a = q0Var;
        this.f62310b = z10;
        this.f62311c = new LinkedHashMap();
        this.f62312d = n0.e();
        this.f62313e = -1;
        this.f62315g = -1;
        this.f62317i = new LinkedHashSet();
    }

    public final int a(int i10, int i11, int i12, long j10, boolean z10, int i13, int i14, List<b0> list) {
        po.i t10;
        po.i t11;
        int i15 = 0;
        int i16 = this.f62315g;
        boolean z11 = z10 ? i16 > i10 : i16 < i10;
        int i17 = this.f62313e;
        boolean z12 = z10 ? i17 < i10 : i17 > i10;
        if (z11) {
            if (!z10) {
                t11 = po.n.t(this.f62315g + 1, i10);
            } else {
                t11 = po.n.t(i10 + 1, this.f62315g);
            }
            int k10 = t11.k();
            int m10 = t11.m();
            if (k10 <= m10) {
                while (true) {
                    i15 += c(list, k10, i12);
                    if (k10 == m10) {
                        break;
                    }
                    k10++;
                }
            }
            return i13 + this.f62316h + i15 + d(j10);
        } else if (z12) {
            if (!z10) {
                t10 = po.n.t(i10 + 1, this.f62313e);
            } else {
                t10 = po.n.t(this.f62313e + 1, i10);
            }
            int k11 = t10.k();
            int m11 = t10.m();
            if (k11 <= m11) {
                while (true) {
                    i11 += c(list, k11, i12);
                    if (k11 == m11) {
                        break;
                    }
                    k11++;
                }
            }
            return (this.f62314f - i11) + d(j10);
        } else {
            return i14;
        }
    }

    public final long b(Object obj, int i10, int i11, int i12, long j10) {
        jo.p.h(obj, "key");
        e eVar = this.f62311c.get(obj);
        if (eVar == null) {
            return j10;
        }
        m0 m0Var = eVar.b().get(i10);
        long n10 = m0Var.a().o().n();
        long a10 = eVar.a();
        long a11 = m2.l.a(m2.k.j(n10) + m2.k.j(a10), m2.k.k(n10) + m2.k.k(a10));
        long d10 = m0Var.d();
        long a12 = eVar.a();
        long a13 = m2.l.a(m2.k.j(d10) + m2.k.j(a12), m2.k.k(d10) + m2.k.k(a12));
        if (m0Var.b() && ((d(a13) < i11 && d(a11) < i11) || (d(a13) > i12 && d(a11) > i12))) {
            uo.l.d(this.f62309a, null, null, new a(m0Var, null), 3, null);
        }
        return a11;
    }

    public final int c(List<b0> list, int i10, int i11) {
        if (!list.isEmpty() && i10 >= ((b0) xn.a0.X(list)).getIndex() && i10 <= ((b0) xn.a0.i0(list)).getIndex()) {
            if (i10 - ((b0) xn.a0.X(list)).getIndex() < ((b0) xn.a0.i0(list)).getIndex() - i10) {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    b0 b0Var = list.get(i12);
                    if (b0Var.getIndex() == i10) {
                        return b0Var.j();
                    }
                    if (b0Var.getIndex() > i10) {
                        break;
                    }
                }
            } else {
                for (int l10 = xn.s.l(list); -1 < l10; l10--) {
                    b0 b0Var2 = list.get(l10);
                    if (b0Var2.getIndex() == i10) {
                        return b0Var2.j();
                    }
                    if (b0Var2.getIndex() < i10) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    public final int d(long j10) {
        return this.f62310b ? m2.k.k(j10) : m2.k.j(j10);
    }

    public final void e(int i10, int i11, int i12, boolean z10, List<b0> list, j0 j0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int d10;
        long j10;
        e eVar;
        b0 b0Var;
        int a10;
        long g10;
        jo.p.h(list, "positionedItems");
        jo.p.h(j0Var, "itemProvider");
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                z11 = false;
                break;
            } else if (list.get(i16).d()) {
                z11 = true;
                break;
            } else {
                i16++;
            }
        }
        if (!z11) {
            f();
            return;
        }
        int i17 = this.f62310b ? i12 : i11;
        int i18 = i10;
        if (z10) {
            i18 = -i18;
        }
        long h10 = h(i18);
        b0 b0Var2 = (b0) xn.a0.X(list);
        b0 b0Var3 = (b0) xn.a0.i0(list);
        int size2 = list.size();
        int i19 = 0;
        for (int i20 = 0; i20 < size2; i20++) {
            b0 b0Var4 = list.get(i20);
            e eVar2 = this.f62311c.get(b0Var4.e());
            if (eVar2 != null) {
                eVar2.c(b0Var4.getIndex());
            }
            i19 += b0Var4.j();
        }
        int size3 = i19 / list.size();
        this.f62317i.clear();
        int size4 = list.size();
        int i21 = 0;
        while (i21 < size4) {
            b0 b0Var5 = list.get(i21);
            this.f62317i.add(b0Var5.e());
            e eVar3 = this.f62311c.get(b0Var5.e());
            if (eVar3 == null) {
                if (b0Var5.d()) {
                    e eVar4 = new e(b0Var5.getIndex());
                    Integer num = this.f62312d.get(b0Var5.e());
                    long h11 = b0Var5.h(i15);
                    int f10 = b0Var5.f(i15);
                    if (num == null) {
                        a10 = d(h11);
                        j10 = h11;
                        eVar = eVar4;
                        b0Var = b0Var5;
                        i13 = i21;
                        i14 = size4;
                    } else {
                        if (!z10) {
                            d10 = d(h11);
                        } else {
                            d10 = (d(h11) - b0Var5.j()) + f10;
                        }
                        j10 = h11;
                        eVar = eVar4;
                        b0Var = b0Var5;
                        i13 = i21;
                        i14 = size4;
                        a10 = a(num.intValue(), b0Var5.j(), size3, h10, z10, i17, d10, list) + (z10 ? b0Var.a() - f10 : i15);
                    }
                    if (this.f62310b) {
                        g10 = m2.k.g(j10, 0, a10, 1, null);
                    } else {
                        g10 = m2.k.g(j10, a10, 0, 2, null);
                    }
                    int i22 = b0Var.i();
                    for (int i23 = i15; i23 < i22; i23++) {
                        b0 b0Var6 = b0Var;
                        long h12 = b0Var6.h(i23);
                        long a11 = m2.l.a(m2.k.j(h12) - m2.k.j(j10), m2.k.k(h12) - m2.k.k(j10));
                        eVar.b().add(new m0(m2.l.a(m2.k.j(g10) + m2.k.j(a11), m2.k.k(g10) + m2.k.k(a11)), b0Var6.f(i23), null));
                        wn.v vVar = wn.v.f59242a;
                    }
                    b0 b0Var7 = b0Var;
                    e eVar5 = eVar;
                    this.f62311c.put(b0Var7.e(), eVar5);
                    g(b0Var7, eVar5);
                } else {
                    i13 = i21;
                    i14 = size4;
                }
            } else {
                i13 = i21;
                i14 = size4;
                if (b0Var5.d()) {
                    long a12 = eVar3.a();
                    eVar3.d(m2.l.a(m2.k.j(a12) + m2.k.j(h10), m2.k.k(a12) + m2.k.k(h10)));
                    g(b0Var5, eVar3);
                } else {
                    this.f62311c.remove(b0Var5.e());
                }
            }
            i21 = i13 + 1;
            size4 = i14;
            i15 = 0;
        }
        if (!z10) {
            this.f62313e = b0Var2.getIndex();
            this.f62314f = b0Var2.b();
            this.f62315g = b0Var3.getIndex();
            this.f62316h = (b0Var3.b() + b0Var3.j()) - i17;
        } else {
            this.f62313e = b0Var3.getIndex();
            this.f62314f = (i17 - b0Var3.b()) - b0Var3.a();
            this.f62315g = b0Var2.getIndex();
            this.f62316h = (-b0Var2.b()) + (b0Var2.j() - b0Var2.a());
        }
        Iterator<Map.Entry<Object, e>> it = this.f62311c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, e> next = it.next();
            if (!this.f62317i.contains(next.getKey())) {
                e value = next.getValue();
                long a13 = value.a();
                value.d(m2.l.a(m2.k.j(a13) + m2.k.j(h10), m2.k.k(a13) + m2.k.k(h10)));
                Integer num2 = j0Var.c().get(next.getKey());
                List<m0> b10 = value.b();
                int size5 = b10.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size5) {
                        z12 = false;
                        break;
                    }
                    m0 m0Var = b10.get(i24);
                    long d11 = m0Var.d();
                    long a14 = value.a();
                    long a15 = m2.l.a(m2.k.j(d11) + m2.k.j(a14), m2.k.k(d11) + m2.k.k(a14));
                    if (d(a15) + m0Var.c() > 0 && d(a15) < i17) {
                        z12 = true;
                        break;
                    }
                    i24++;
                }
                List<m0> b11 = value.b();
                int size6 = b11.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size6) {
                        z13 = false;
                        break;
                    } else if (b11.get(i25).b()) {
                        z13 = true;
                        break;
                    } else {
                        i25++;
                    }
                }
                boolean z14 = !z13;
                if ((z12 || !z14) && num2 != null && !value.b().isEmpty()) {
                    i0 a16 = j0Var.a(z.b.b(num2.intValue()));
                    int a17 = a(num2.intValue(), a16.e(), size3, h10, z10, i17, i17, list);
                    if (z10) {
                        a17 = (i17 - a17) - a16.d();
                    }
                    b0 f11 = a16.f(a17, i11, i12);
                    list.add(f11);
                    g(f11, value);
                } else {
                    it.remove();
                }
            }
        }
        this.f62312d = j0Var.c();
    }

    public final void f() {
        this.f62311c.clear();
        this.f62312d = n0.e();
        this.f62313e = -1;
        this.f62314f = 0;
        this.f62315g = -1;
        this.f62316h = 0;
    }

    public final void g(b0 b0Var, e eVar) {
        while (eVar.b().size() > b0Var.i()) {
            xn.x.F(eVar.b());
        }
        while (eVar.b().size() < b0Var.i()) {
            int size = eVar.b().size();
            long h10 = b0Var.h(size);
            List<m0> b10 = eVar.b();
            long a10 = eVar.a();
            b10.add(new m0(m2.l.a(m2.k.j(h10) - m2.k.j(a10), m2.k.k(h10) - m2.k.k(a10)), b0Var.f(size), null));
        }
        List<m0> b11 = eVar.b();
        int size2 = b11.size();
        for (int i10 = 0; i10 < size2; i10++) {
            m0 m0Var = b11.get(i10);
            long d10 = m0Var.d();
            long a11 = eVar.a();
            long a12 = m2.l.a(m2.k.j(d10) + m2.k.j(a11), m2.k.k(d10) + m2.k.k(a11));
            long h11 = b0Var.h(i10);
            m0Var.f(b0Var.f(i10));
            u.c0<m2.k> c10 = b0Var.c(i10);
            if (!m2.k.i(a12, h11)) {
                long a13 = eVar.a();
                m0Var.g(m2.l.a(m2.k.j(h11) - m2.k.j(a13), m2.k.k(h11) - m2.k.k(a13)));
                if (c10 != null) {
                    m0Var.e(true);
                    uo.l.d(this.f62309a, null, null, new b(m0Var, c10, null), 3, null);
                }
            }
        }
    }

    public final long h(int i10) {
        boolean z10 = this.f62310b;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return m2.l.a(i11, i10);
    }
}

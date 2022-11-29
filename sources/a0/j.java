package a0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import u.u0;
import uo.q0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f131a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f132b;

    /* renamed from: c  reason: collision with root package name */
    public int f133c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Object, f> f134d;

    /* renamed from: e  reason: collision with root package name */
    public Map<Object, Integer> f135e;

    /* renamed from: f  reason: collision with root package name */
    public int f136f;

    /* renamed from: g  reason: collision with root package name */
    public int f137g;

    /* renamed from: h  reason: collision with root package name */
    public int f138h;

    /* renamed from: i  reason: collision with root package name */
    public int f139i;

    /* renamed from: j  reason: collision with root package name */
    public final Set<Object> f140j;

    @co.f(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$getAnimatedOffset$1", f = "LazyGridItemPlacementAnimator.kt", l = {324}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f141w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o0 f142x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f142x = o0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f142x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f141w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a<m2.k, u.n> a10 = this.f142x.a();
                m2.k b10 = m2.k.b(this.f142x.d());
                this.f141w = 1;
                if (a10.v(b10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f142x.e(false);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Integer, Integer> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<x> f144x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<x> list) {
            super(1);
            this.f144x = list;
        }

        public final Integer a(int i10) {
            return Integer.valueOf(j.this.f132b ? this.f144x.get(i10).b() : this.f144x.get(i10).c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyGridItemPlacementAnimator.kt", l = {420}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f145w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o0 f146x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u.c0<m2.k> f147y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0 o0Var, u.c0<m2.k> c0Var, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f146x = o0Var;
            this.f147y = c0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f146x, this.f147y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            u.i iVar;
            Object c10 = bo.c.c();
            int i10 = this.f145w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (this.f146x.a().r()) {
                        u.c0<m2.k> c0Var = this.f147y;
                        iVar = c0Var instanceof u0 ? (u0) c0Var : k.a();
                    } else {
                        iVar = this.f147y;
                    }
                    u.i iVar2 = iVar;
                    u.a<m2.k, u.n> a10 = this.f146x.a();
                    m2.k b10 = m2.k.b(this.f146x.d());
                    this.f145w = 1;
                    if (u.a.f(a10, b10, iVar2, null, null, this, 12, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f146x.e(false);
            } catch (CancellationException unused) {
            }
            return wn.v.f59242a;
        }
    }

    public j(q0 q0Var, boolean z10) {
        jo.p.h(q0Var, "scope");
        this.f131a = q0Var;
        this.f132b = z10;
        this.f134d = new LinkedHashMap();
        this.f135e = xn.n0.e();
        this.f136f = -1;
        this.f138h = -1;
        this.f140j = new LinkedHashSet();
    }

    public final int b(int i10, int i11, int i12, long j10, boolean z10, int i13, int i14) {
        boolean z11 = false;
        if (this.f133c != 0) {
            int i15 = this.f138h;
            boolean z12 = z10 ? i15 > i10 : i15 < i10;
            if (z10 ? this.f136f < i10 : this.f136f > i10) {
                z11 = true;
            }
            if (z12) {
                int abs = Math.abs(i10 - this.f138h);
                int i16 = this.f133c;
                return i13 + this.f139i + (i12 * ((((abs + i16) - 1) / i16) - 1)) + d(j10);
            } else if (z11) {
                int abs2 = Math.abs(this.f136f - i10);
                int i17 = this.f133c;
                return ((this.f137g - i11) - (i12 * ((((abs2 + i17) - 1) / i17) - 1))) + d(j10);
            } else {
                return i14;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final long c(Object obj, int i10, int i11, int i12, long j10) {
        jo.p.h(obj, "key");
        f fVar = this.f134d.get(obj);
        if (fVar == null) {
            return j10;
        }
        o0 o0Var = fVar.d().get(i10);
        long n10 = o0Var.a().o().n();
        long c10 = fVar.c();
        long a10 = m2.l.a(m2.k.j(n10) + m2.k.j(c10), m2.k.k(n10) + m2.k.k(c10));
        long d10 = o0Var.d();
        long c11 = fVar.c();
        long a11 = m2.l.a(m2.k.j(d10) + m2.k.j(c11), m2.k.k(d10) + m2.k.k(c11));
        if (o0Var.b() && ((d(a11) < i11 && d(a10) < i11) || (d(a11) > i12 && d(a10) > i12))) {
            uo.j.d(this.f131a, null, null, new a(o0Var, null), 3, null);
        }
        return a10;
    }

    public final int d(long j10) {
        return this.f132b ? m2.k.k(j10) : m2.k.j(j10);
    }

    public final void e(int i10, int i11, int i12, int i13, boolean z10, List<x> list, h0 h0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        long d10;
        int i14;
        int i15;
        int d11;
        long j10;
        f fVar;
        x xVar;
        int b10;
        long g10;
        jo.p.h(list, "positionedItems");
        jo.p.h(h0Var, "measuredItemProvider");
        int size = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                z11 = false;
                break;
            } else if (list.get(i16).h()) {
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
        this.f133c = i13;
        int i17 = this.f132b ? i12 : i11;
        int i18 = i10;
        if (z10) {
            i18 = -i18;
        }
        long h10 = h(i18);
        x xVar2 = (x) xn.a0.X(list);
        x xVar3 = (x) xn.a0.i0(list);
        int size2 = list.size();
        for (int i19 = 0; i19 < size2; i19++) {
            x xVar4 = list.get(i19);
            f fVar2 = this.f134d.get(xVar4.i());
            if (fVar2 != null) {
                fVar2.g(xVar4.getIndex());
                fVar2.f(xVar4.g());
                fVar2.e(xVar4.f());
            }
        }
        b bVar = new b(list);
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < list.size()) {
            int intValue = bVar.invoke(Integer.valueOf(i20)).intValue();
            if (intValue == -1) {
                i20++;
            } else {
                int i23 = 0;
                while (i20 < list.size() && bVar.invoke(Integer.valueOf(i20)).intValue() == intValue) {
                    i23 = Math.max(i23, list.get(i20).o());
                    i20++;
                }
                i21 += i23;
                i22++;
            }
        }
        int i24 = i21 / i22;
        this.f140j.clear();
        int i25 = 0;
        for (int size3 = list.size(); i25 < size3; size3 = i15) {
            x xVar5 = list.get(i25);
            this.f140j.add(xVar5.i());
            f fVar3 = this.f134d.get(xVar5.i());
            if (fVar3 == null) {
                if (xVar5.h()) {
                    f fVar4 = new f(xVar5.getIndex(), xVar5.g(), xVar5.f());
                    Integer num = this.f135e.get(xVar5.i());
                    long p10 = xVar5.p();
                    if (num == null) {
                        b10 = d(p10);
                        j10 = p10;
                        fVar = fVar4;
                        xVar = xVar5;
                        i14 = i25;
                        i15 = size3;
                    } else {
                        if (!z10) {
                            d11 = d(p10);
                        } else {
                            d11 = d(p10) - xVar5.o();
                        }
                        j10 = p10;
                        fVar = fVar4;
                        xVar = xVar5;
                        i14 = i25;
                        i15 = size3;
                        b10 = b(num.intValue(), xVar5.o(), i24, h10, z10, i17, d11);
                    }
                    if (this.f132b) {
                        g10 = m2.k.g(j10, 0, b10, 1, null);
                    } else {
                        g10 = m2.k.g(j10, b10, 0, 2, null);
                    }
                    int q10 = xVar.q();
                    for (int i26 = 0; i26 < q10; i26++) {
                        fVar.d().add(new o0(g10, xVar.m(i26), null));
                        wn.v vVar = wn.v.f59242a;
                    }
                    x xVar6 = xVar;
                    f fVar5 = fVar;
                    this.f134d.put(xVar6.i(), fVar5);
                    g(xVar6, fVar5);
                } else {
                    i14 = i25;
                    i15 = size3;
                }
            } else {
                i14 = i25;
                i15 = size3;
                if (xVar5.h()) {
                    long c10 = fVar3.c();
                    fVar3.h(m2.l.a(m2.k.j(c10) + m2.k.j(h10), m2.k.k(c10) + m2.k.k(h10)));
                    g(xVar5, fVar3);
                } else {
                    this.f134d.remove(xVar5.i());
                }
            }
            i25 = i14 + 1;
        }
        if (!z10) {
            this.f136f = xVar2.getIndex();
            this.f137g = d(xVar2.d());
            this.f138h = xVar3.getIndex();
            this.f139i = (d(xVar3.d()) + xVar3.k()) - i17;
        } else {
            this.f136f = xVar3.getIndex();
            this.f137g = (i17 - d(xVar3.d())) - xVar3.j();
            this.f138h = xVar2.getIndex();
            this.f139i = (-d(xVar2.d())) + (xVar2.k() - (this.f132b ? m2.o.f(xVar2.a()) : m2.o.g(xVar2.a())));
        }
        Iterator<Map.Entry<Object, f>> it = this.f134d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, f> next = it.next();
            if (!this.f140j.contains(next.getKey())) {
                f value = next.getValue();
                long c11 = value.c();
                value.h(m2.l.a(m2.k.j(c11) + m2.k.j(h10), m2.k.k(c11) + m2.k.k(h10)));
                Integer num2 = h0Var.c().get(next.getKey());
                List<o0> d12 = value.d();
                int size4 = d12.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size4) {
                        z12 = false;
                        break;
                    }
                    o0 o0Var = d12.get(i27);
                    long d13 = o0Var.d();
                    long c12 = value.c();
                    long a10 = m2.l.a(m2.k.j(d13) + m2.k.j(c12), m2.k.k(d13) + m2.k.k(c12));
                    if (d(a10) + o0Var.c() > 0 && d(a10) < i17) {
                        z12 = true;
                        break;
                    }
                    i27++;
                }
                List<o0> d14 = value.d();
                int size5 = d14.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size5) {
                        z13 = false;
                        break;
                    } else if (d14.get(i28).b()) {
                        z13 = true;
                        break;
                    } else {
                        i28++;
                    }
                }
                boolean z14 = !z13;
                if ((z12 || !z14) && num2 != null && !value.d().isEmpty()) {
                    int b11 = e.b(num2.intValue());
                    if (this.f132b) {
                        d10 = m2.b.f40509b.e(value.b());
                    } else {
                        d10 = m2.b.f40509b.d(value.b());
                    }
                    g0 b12 = h0.b(h0Var, b11, 0, d10, 2, null);
                    int b13 = b(num2.intValue(), b12.e(), i24, h10, z10, i17, i17);
                    if (z10) {
                        b13 = (i17 - b13) - b12.d();
                    }
                    x f10 = b12.f(b13, value.a(), i11, i12, -1, -1, b12.d());
                    list.add(f10);
                    g(f10, value);
                } else {
                    it.remove();
                }
            }
        }
        this.f135e = h0Var.c();
    }

    public final void f() {
        this.f134d.clear();
        this.f135e = xn.n0.e();
        this.f136f = -1;
        this.f137g = 0;
        this.f138h = -1;
        this.f139i = 0;
    }

    public final void g(x xVar, f fVar) {
        while (fVar.d().size() > xVar.q()) {
            xn.x.F(fVar.d());
        }
        while (fVar.d().size() < xVar.q()) {
            int size = fVar.d().size();
            long d10 = xVar.d();
            List<o0> d11 = fVar.d();
            long c10 = fVar.c();
            d11.add(new o0(m2.l.a(m2.k.j(d10) - m2.k.j(c10), m2.k.k(d10) - m2.k.k(c10)), xVar.m(size), null));
        }
        List<o0> d12 = fVar.d();
        int size2 = d12.size();
        for (int i10 = 0; i10 < size2; i10++) {
            o0 o0Var = d12.get(i10);
            long d13 = o0Var.d();
            long c11 = fVar.c();
            long a10 = m2.l.a(m2.k.j(d13) + m2.k.j(c11), m2.k.k(d13) + m2.k.k(c11));
            long p10 = xVar.p();
            o0Var.f(xVar.m(i10));
            u.c0<m2.k> e10 = xVar.e(i10);
            if (!m2.k.i(a10, p10)) {
                long c12 = fVar.c();
                o0Var.g(m2.l.a(m2.k.j(p10) - m2.k.j(c12), m2.k.k(p10) - m2.k.k(c12)));
                if (e10 != null) {
                    o0Var.e(true);
                    uo.j.d(this.f131a, null, null, new c(o0Var, e10, null), 3, null);
                }
            }
        }
    }

    public final long h(int i10) {
        boolean z10 = this.f132b;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return m2.l.a(i11, i10);
    }
}

package qn;

import io.l;
import io.p;
import java.util.Iterator;
import jo.m;
import jo.q;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import u.w;
import u.y;
import xn.a0;
import z.g0;
import z.n;
import z.v;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f49610a;

    /* renamed from: b  reason: collision with root package name */
    public final p<h, i, Integer> f49611b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49612c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f49613d;

    /* renamed from: e  reason: collision with root package name */
    public final c2 f49614e;

    /* loaded from: classes4.dex */
    public static final class a extends q implements io.a<i> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final i invoke() {
            ro.g<i> n10 = b.this.n();
            b bVar = b.this;
            i iVar = null;
            for (i iVar2 : n10) {
                i iVar3 = iVar2;
                if (iVar3.b() <= ((Number) bVar.f49611b.invoke(bVar, iVar3)).intValue()) {
                    iVar = iVar2;
                }
            }
            return iVar;
        }
    }

    /* renamed from: qn.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0747b extends m implements l<n, c> {
        public static final C0747b F = new C0747b();

        public C0747b() {
            super(1, c.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
        }

        @Override // io.l
        /* renamed from: i */
        public final c invoke(n nVar) {
            jo.p.h(nVar, "p0");
            return new c(nVar);
        }
    }

    public /* synthetic */ b(g0 g0Var, p pVar, int i10, int i11, jo.h hVar) {
        this(g0Var, pVar, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // qn.h
    public boolean a() {
        n nVar = (n) a0.j0(this.f49610a.p().b());
        if (nVar == null) {
            return false;
        }
        return nVar.getIndex() < m() - 1 || nVar.b() + nVar.a() > f();
    }

    @Override // qn.h
    public boolean b() {
        n nVar = (n) a0.Z(this.f49610a.p().b());
        if (nVar == null) {
            return false;
        }
        return nVar.getIndex() > 0 || nVar.b() < g();
    }

    @Override // qn.h
    public int c(float f10, w<Float> wVar, float f11) {
        float c10;
        jo.p.h(wVar, "decayAnimationSpec");
        i e10 = e();
        if (e10 == null) {
            return -1;
        }
        float k10 = k();
        if (k10 <= 0.0f) {
            return e10.a();
        }
        int d10 = d(e10.a());
        int d11 = d(e10.a() + 1);
        if (Math.abs(f10) < 0.5f) {
            return po.n.m(Math.abs(d10) < Math.abs(d11) ? e10.a() : e10.a() + 1, 0, m() - 1);
        }
        float l10 = po.n.l(y.a(wVar, 0.0f, f10), -f11, f11);
        if (f10 < 0.0f) {
            c10 = po.n.h(l10 + d11, 0.0f);
        } else {
            c10 = po.n.c(l10 + d10, 0.0f);
        }
        double d12 = k10;
        int m10 = po.n.m(e10.a() + lo.c.b((c10 / d12) - (d10 / d12)), 0, m() - 1);
        j jVar = j.f49657a;
        return m10;
    }

    @Override // qn.h
    public int d(int i10) {
        i iVar;
        int c10;
        int intValue;
        boolean z10;
        Iterator<i> it = n().iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            iVar = it.next();
            if (iVar.a() == i10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        i iVar2 = iVar;
        if (iVar2 != null) {
            c10 = iVar2.b();
            intValue = this.f49611b.invoke(this, iVar2).intValue();
        } else {
            i e10 = e();
            if (e10 == null) {
                return 0;
            }
            c10 = lo.c.c((i10 - e10.a()) * k()) + e10.b();
            intValue = this.f49611b.invoke(this, e10).intValue();
        }
        return c10 - intValue;
    }

    @Override // qn.h
    public i e() {
        return (i) this.f49614e.getValue();
    }

    @Override // qn.h
    public int f() {
        return this.f49610a.p().d() - l();
    }

    @Override // qn.h
    public int g() {
        return this.f49612c;
    }

    @Override // qn.h
    public int h() {
        return this.f49610a.p().a();
    }

    public final int j() {
        v p10 = this.f49610a.p();
        if (p10.b().size() >= 2) {
            n nVar = p10.b().get(0);
            return p10.b().get(1).b() - (nVar.a() + nVar.b());
        }
        return 0;
    }

    public final float k() {
        Object next;
        int max;
        v p10 = this.f49610a.p();
        if (p10.b().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = p10.b().iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int b10 = ((n) next).b();
                do {
                    Object next2 = it.next();
                    int b11 = ((n) next2).b();
                    if (b10 > b11) {
                        next = next2;
                        b10 = b11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        n nVar = (n) next;
        if (nVar == null) {
            return -1.0f;
        }
        Iterator<T> it2 = p10.b().iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                n nVar2 = (n) obj;
                int b12 = nVar2.b() + nVar2.a();
                do {
                    Object next3 = it2.next();
                    n nVar3 = (n) next3;
                    int b13 = nVar3.b() + nVar3.a();
                    if (b12 < b13) {
                        obj = next3;
                        b12 = b13;
                    }
                } while (it2.hasNext());
            }
        }
        n nVar4 = (n) obj;
        if (nVar4 == null) {
            return -1.0f;
        }
        if (Math.max(nVar.b() + nVar.a(), nVar4.b() + nVar4.a()) - Math.min(nVar.b(), nVar4.b()) == 0) {
            return -1.0f;
        }
        return (max + j()) / p10.b().size();
    }

    public final int l() {
        return ((Number) this.f49613d.getValue()).intValue();
    }

    public final int m() {
        return this.f49610a.p().a();
    }

    public ro.g<i> n() {
        return ro.n.r(a0.M(this.f49610a.p().b()), C0747b.F);
    }

    public final void o(int i10) {
        this.f49613d.setValue(Integer.valueOf(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g0 g0Var, p<? super h, ? super i, Integer> pVar, int i10) {
        s0 e10;
        jo.p.h(g0Var, "lazyListState");
        jo.p.h(pVar, "snapOffsetForItem");
        this.f49610a = g0Var;
        this.f49611b = pVar;
        e10 = z1.e(Integer.valueOf(i10), null, 2, null);
        this.f49613d = e10;
        this.f49614e = u1.b(new a());
    }
}

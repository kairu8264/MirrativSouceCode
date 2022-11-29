package w1;

import java.util.ArrayList;
import java.util.List;
import xn.a0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final m f57935a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f57936b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f57937c;

    /* renamed from: d  reason: collision with root package name */
    public q f57938d;

    /* renamed from: e  reason: collision with root package name */
    public final k f57939e;

    /* renamed from: f  reason: collision with root package name */
    public final int f57940f;

    /* renamed from: g  reason: collision with root package name */
    public final s1.k f57941g;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f57942w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(1);
            this.f57942w = hVar;
        }

        public final void a(y yVar) {
            jo.p.h(yVar, "$this$fakeSemanticsNode");
            w.I(yVar, this.f57942w.m());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f57943w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f57943w = str;
        }

        public final void a(y yVar) {
            jo.p.h(yVar, "$this$fakeSemanticsNode");
            w.A(yVar, this.f57943w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f57944w = new c();

        public c() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            k j10;
            jo.p.h(kVar, "it");
            m j11 = r.j(kVar);
            boolean z10 = true;
            if (j11 == null || (j10 = j11.j()) == null || !j10.s()) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f57945w = new d();

        public d() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            jo.p.h(kVar, "it");
            return Boolean.valueOf(r.j(kVar) != null);
        }
    }

    public q(m mVar, boolean z10) {
        jo.p.h(mVar, "outerSemanticsEntity");
        this.f57935a = mVar;
        this.f57936b = z10;
        this.f57939e = mVar.j();
        this.f57940f = mVar.c().getId();
        this.f57941g = mVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List d(q qVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return qVar.c(list, z10);
    }

    public static /* synthetic */ List x(q qVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return qVar.w(z10, z11);
    }

    public final void a(List<q> list) {
        h k10;
        k10 = r.k(this);
        if (k10 != null && this.f57939e.s() && (!list.isEmpty())) {
            list.add(b(k10, new a(k10)));
        }
        k kVar = this.f57939e;
        t tVar = t.f57947a;
        if (kVar.g(tVar.c()) && (!list.isEmpty()) && this.f57939e.s()) {
            List list2 = (List) l.a(this.f57939e, tVar.c());
            String str = list2 != null ? (String) a0.Z(list2) : null;
            if (str != null) {
                list.add(0, b(null, new b(str)));
            }
        }
    }

    public final q b(h hVar, io.l<? super y, wn.v> lVar) {
        q qVar = new q(new m(new s1.k(true).c0(), new o(hVar != null ? r.l(this) : r.e(this), false, false, lVar)), false);
        qVar.f57937c = true;
        qVar.f57938d = this;
        return qVar;
    }

    public final List<q> c(List<q> list, boolean z10) {
        List x10 = x(this, z10, false, 2, null);
        int size = x10.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) x10.get(i10);
            if (qVar.u()) {
                list.add(qVar);
            } else if (!qVar.f57939e.r()) {
                d(qVar, list, false, 2, null);
            }
        }
        return list;
    }

    public final s1.p e() {
        if (this.f57939e.s()) {
            m i10 = r.i(this.f57941g);
            if (i10 == null) {
                i10 = this.f57935a;
            }
            return i10.b();
        }
        return this.f57935a.b();
    }

    public final b1.h f() {
        return !this.f57941g.L0() ? b1.h.f16726e.a() : q1.r.b(e());
    }

    public final List<q> g(boolean z10, boolean z11, boolean z12) {
        if (!z11 && this.f57939e.r()) {
            return xn.s.k();
        }
        if (u()) {
            return d(this, null, z10, 1, null);
        }
        return w(z10, z12);
    }

    public final k h() {
        if (u()) {
            k j10 = this.f57939e.j();
            v(j10);
            return j10;
        }
        return this.f57939e;
    }

    public final int i() {
        return this.f57940f;
    }

    public final q1.v j() {
        return this.f57941g;
    }

    public final s1.k k() {
        return this.f57941g;
    }

    public final m l() {
        return this.f57935a;
    }

    public final q m() {
        q qVar = this.f57938d;
        if (qVar != null) {
            return qVar;
        }
        s1.k f10 = this.f57936b ? r.f(this.f57941g, c.f57944w) : null;
        if (f10 == null) {
            f10 = r.f(this.f57941g, d.f57945w);
        }
        m j10 = f10 != null ? r.j(f10) : null;
        if (j10 == null) {
            return null;
        }
        return new q(j10, this.f57936b);
    }

    public final long n() {
        return !this.f57941g.L0() ? b1.f.f16721b.c() : q1.r.e(e());
    }

    public final List<q> o() {
        return g(false, false, true);
    }

    public final List<q> p() {
        return g(true, false, true);
    }

    public final long q() {
        return e().a();
    }

    public final b1.h r() {
        m mVar;
        if (this.f57939e.s()) {
            mVar = r.i(this.f57941g);
            if (mVar == null) {
                mVar = this.f57935a;
            }
        } else {
            mVar = this.f57935a;
        }
        return mVar.l();
    }

    public final k s() {
        return this.f57939e;
    }

    public final boolean t() {
        return this.f57937c;
    }

    public final boolean u() {
        return this.f57936b && this.f57939e.s();
    }

    public final void v(k kVar) {
        if (this.f57939e.r()) {
            return;
        }
        List x10 = x(this, false, false, 3, null);
        int size = x10.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) x10.get(i10);
            if (!qVar.u()) {
                kVar.t(qVar.f57939e);
                qVar.v(kVar);
            }
        }
    }

    public final List<q> w(boolean z10, boolean z11) {
        List h10;
        if (this.f57937c) {
            return xn.s.k();
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            h10 = z.c(this.f57941g, null, 1, null);
        } else {
            h10 = r.h(this.f57941g, null, 1, null);
        }
        int size = h10.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new q((m) h10.get(i10), this.f57936b));
        }
        if (z11) {
            a(arrayList);
        }
        return arrayList;
    }
}

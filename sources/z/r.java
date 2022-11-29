package z;

import java.util.List;
import java.util.Map;
import l0.c2;
import l0.l1;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final c2<t> f62324a;

    /* renamed from: b  reason: collision with root package name */
    public final i f62325b;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f62327x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62328y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(2);
            this.f62327x = i10;
            this.f62328y = i11;
        }

        public final void a(l0.i iVar, int i10) {
            r.this.g(this.f62327x, iVar, this.f62328y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public r(c2<t> c2Var) {
        jo.p.h(c2Var, "itemsSnapshot");
        this.f62324a = c2Var;
        this.f62325b = new i();
    }

    @Override // b0.f
    public Object a(int i10) {
        return this.f62324a.getValue().b(i10);
    }

    @Override // z.q
    public i b() {
        return this.f62325b;
    }

    @Override // b0.f
    public Map<Object, Integer> c() {
        return this.f62324a.getValue().f();
    }

    @Override // b0.f
    public int d() {
        return this.f62324a.getValue().d();
    }

    @Override // b0.f
    public Object e(int i10) {
        return this.f62324a.getValue().e(i10);
    }

    @Override // z.q
    public List<Integer> f() {
        return this.f62324a.getValue().c();
    }

    @Override // b0.f
    public void g(int i10, l0.i iVar, int i11) {
        int i12;
        l0.i h10 = iVar.h(1704733014);
        if ((i11 & 14) == 0) {
            i12 = (h10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h10.P(this) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            this.f62324a.getValue().a(b(), i10, h10, ((i12 << 3) & 112) | 512);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(i10, i11));
    }
}

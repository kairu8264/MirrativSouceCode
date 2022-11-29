package a0;

import a0.d0;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f148a;

    /* renamed from: b  reason: collision with root package name */
    public final int f149b;

    /* renamed from: c  reason: collision with root package name */
    public final int f150c;

    /* renamed from: d  reason: collision with root package name */
    public final h0 f151d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f152e;

    /* renamed from: f  reason: collision with root package name */
    public final n0 f153f;

    /* renamed from: g  reason: collision with root package name */
    public final io.p<Integer, Integer, m2.b> f154g;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<Integer, Integer, m2.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<Integer> f155w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f156x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j0 f157y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> list, int i10, j0 j0Var) {
            super(2);
            this.f155w = list;
            this.f156x = i10;
            this.f157y = j0Var;
        }

        public final long a(int i10, int i11) {
            int intValue = (this.f155w.get((i10 + i11) - 1).intValue() - (i10 == 0 ? 0 : this.f155w.get(i10 - 1).intValue())) + (this.f156x * (i11 - 1));
            if (this.f157y.f148a) {
                return m2.b.f40509b.e(intValue);
            }
            return m2.b.f40509b.d(intValue);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ m2.b invoke(Integer num, Integer num2) {
            return m2.b.b(a(num.intValue(), num2.intValue()));
        }
    }

    public j0(boolean z10, List<Integer> list, int i10, int i11, int i12, h0 h0Var, d0 d0Var, n0 n0Var) {
        jo.p.h(list, "slotSizesSums");
        jo.p.h(h0Var, "measuredItemProvider");
        jo.p.h(d0Var, "spanLayoutProvider");
        jo.p.h(n0Var, "measuredLineFactory");
        this.f148a = z10;
        this.f149b = i11;
        this.f150c = i12;
        this.f151d = h0Var;
        this.f152e = d0Var;
        this.f153f = n0Var;
        this.f154g = new a(list, i10, this);
    }

    public final i0 b(int i10) {
        d0.c c10 = this.f152e.c(i10);
        int size = c10.b().size();
        int i11 = (size == 0 || c10.a() + size == this.f149b) ? 0 : this.f150c;
        g0[] g0VarArr = new g0[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int d10 = c.d(c10.b().get(i13).g());
            g0 a10 = this.f151d.a(e.b(c10.a() + i13), i11, this.f154g.invoke(Integer.valueOf(i12), Integer.valueOf(d10)).t());
            i12 += d10;
            wn.v vVar = wn.v.f59242a;
            g0VarArr[i13] = a10;
        }
        return this.f153f.a(i10, g0VarArr, c10.b(), i11);
    }

    public final io.p<Integer, Integer, m2.b> c() {
        return this.f154g;
    }
}

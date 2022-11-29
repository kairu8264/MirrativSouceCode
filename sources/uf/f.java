package uf;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import io.l;
import io.p;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jo.q;
import l0.c2;
import l0.s0;
import l0.u1;
import l0.z1;
import u0.i;
import u0.k;
import v.d0;
import w.b0;
import w.y;
import wn.m;
import wn.v;
import xn.r;
import z.g0;
import z.n;

/* loaded from: classes3.dex */
public final class f implements b0 {

    /* renamed from: h  reason: collision with root package name */
    public static final c f55890h = new c(null);

    /* renamed from: i  reason: collision with root package name */
    public static final i<f, ?> f55891i = u0.a.a(a.f55899w, b.f55900w);

    /* renamed from: a  reason: collision with root package name */
    public final g0 f55892a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f55893b;

    /* renamed from: c  reason: collision with root package name */
    public int f55894c;

    /* renamed from: d  reason: collision with root package name */
    public final c2 f55895d;

    /* renamed from: e  reason: collision with root package name */
    public final c2 f55896e;

    /* renamed from: f  reason: collision with root package name */
    public final s0 f55897f;

    /* renamed from: g  reason: collision with root package name */
    public final s0 f55898g;

    /* loaded from: classes3.dex */
    public static final class a extends q implements p<k, f, List<? extends Object>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f55899w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final List<Object> invoke(k kVar, f fVar) {
            jo.p.h(kVar, "$this$listSaver");
            jo.p.h(fVar, "it");
            return r.d(Integer.valueOf(fVar.i()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<List<? extends Object>, f> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f55900w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final f invoke(List<? extends Object> list) {
            jo.p.h(list, "it");
            Object obj = list.get(0);
            jo.p.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return new f(((Integer) obj).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final i<f, ?> a() {
            return f.f55891i;
        }
    }

    @co.f(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", l = {217, 222, 225, 233, PsExtractor.VIDEO_STREAM_MASK, 252}, m = "animateScrollToPage")
    /* loaded from: classes3.dex */
    public static final class d extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f55901w;

        /* renamed from: x  reason: collision with root package name */
        public int f55902x;

        /* renamed from: y  reason: collision with root package name */
        public int f55903y;

        /* renamed from: z  reason: collision with root package name */
        public float f55904z;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return f.this.g(0, 0.0f, this);
        }
    }

    @co.f(c = "com.google.accompanist.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements p<y, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f55905w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(y yVar, ao.d<? super v> dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f55905w == 0) {
                m.b(obj);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: uf.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0876f extends q implements io.a<Float> {
        public C0876f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            n j10 = f.this.j();
            return Float.valueOf(j10 != null ? po.n.l((-j10.b()) / j10.a(), -1.0f, 1.0f) : 0.0f);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends q implements io.a<Integer> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(f.this.l().p().a());
        }
    }

    public f() {
        this(0, 1, null);
    }

    public f(int i10) {
        s0 e10;
        s0 e11;
        s0 e12;
        this.f55892a = new g0(i10, 0, 2, null);
        e10 = z1.e(Integer.valueOf(i10), null, 2, null);
        this.f55893b = e10;
        this.f55895d = u1.b(new g());
        this.f55896e = u1.b(new C0876f());
        e11 = z1.e(null, null, 2, null);
        this.f55897f = e11;
        e12 = z1.e(null, null, 2, null);
        this.f55898g = e12;
    }

    public static /* synthetic */ Object h(f fVar, int i10, float f10, ao.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return fVar.g(i10, f10, dVar);
    }

    @Override // w.b0
    public Object a(d0 d0Var, p<? super y, ? super ao.d<? super v>, ? extends Object> pVar, ao.d<? super v> dVar) {
        Object a10 = this.f55892a.a(d0Var, pVar, dVar);
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }

    @Override // w.b0
    public boolean c() {
        return this.f55892a.c();
    }

    @Override // w.b0
    public float d(float f10) {
        return this.f55892a.d(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da A[Catch: all -> 0x01d8, TryCatch #1 {all -> 0x01d8, blocks: (B:45:0x00cf, B:47:0x00da, B:51:0x00f0), top: B:101:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0 A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #1 {all -> 0x01d8, blocks: (B:45:0x00cf, B:47:0x00da, B:51:0x00f0), top: B:101:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:19:0x0057, B:76:0x0189, B:77:0x0197, B:79:0x019d, B:85:0x01b0, B:87:0x01b4, B:89:0x01ba, B:55:0x010d, B:56:0x011b, B:58:0x0121, B:65:0x0135, B:67:0x0139, B:70:0x0151, B:72:0x015c), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:19:0x0057, B:76:0x0189, B:77:0x0197, B:79:0x019d, B:85:0x01b0, B:87:0x01b4, B:89:0x01ba, B:55:0x010d, B:56:0x011b, B:58:0x0121, B:65:0x0135, B:67:0x0139, B:70:0x0151, B:72:0x015c), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:19:0x0057, B:76:0x0189, B:77:0x0197, B:79:0x019d, B:85:0x01b0, B:87:0x01b4, B:89:0x01ba, B:55:0x010d, B:56:0x011b, B:58:0x0121, B:65:0x0135, B:67:0x0139, B:70:0x0151, B:72:0x015c), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:19:0x0057, B:76:0x0189, B:77:0x0197, B:79:0x019d, B:85:0x01b0, B:87:0x01b4, B:89:0x01ba, B:55:0x010d, B:56:0x011b, B:58:0x0121, B:65:0x0135, B:67:0x0139, B:70:0x0151, B:72:0x015c), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v0, types: [float] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(int r18, float r19, ao.d<? super wn.v> r20) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.f.g(int, float, ao.d):java.lang.Object");
    }

    public final int i() {
        return o();
    }

    public final n j() {
        n nVar;
        boolean z10;
        List<n> b10 = this.f55892a.p().b();
        ListIterator<n> listIterator = b10.listIterator(b10.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                nVar = null;
                break;
            }
            nVar = listIterator.previous();
            if (nVar.getIndex() == i()) {
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
        return nVar;
    }

    public final float k() {
        return ((Number) this.f55896e.getValue()).floatValue();
    }

    public final g0 l() {
        return this.f55892a;
    }

    public final n m() {
        Object obj;
        z.v p10 = this.f55892a.p();
        Iterator<T> it = p10.b().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                n nVar = (n) next;
                int min = Math.min(nVar.b() + nVar.a(), p10.d() - this.f55894c) - Math.max(nVar.b(), 0);
                do {
                    Object next2 = it.next();
                    n nVar2 = (n) next2;
                    int min2 = Math.min(nVar2.b() + nVar2.a(), p10.d() - this.f55894c) - Math.max(nVar2.b(), 0);
                    if (min < min2) {
                        next = next2;
                        min = min2;
                    }
                } while (it.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        return (n) obj;
    }

    public final int n() {
        return ((Number) this.f55895d.getValue()).intValue();
    }

    public final int o() {
        return ((Number) this.f55893b.getValue()).intValue();
    }

    public final void p() {
        t(null);
    }

    public final void q(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + '[' + i10 + "] must be >= 0").toString());
    }

    public final void r(float f10, String str) {
        boolean z10 = false;
        if (-1.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException((str + " must be >= 0 and <= 1").toString());
    }

    public final void s(int i10) {
        this.f55894c = i10;
    }

    public final void t(Integer num) {
        this.f55897f.setValue(num);
    }

    public String toString() {
        return "PagerState(pageCount=" + n() + ", currentPage=" + i() + ", currentPageOffset=" + k() + ')';
    }

    public final void u(int i10) {
        if (i10 != o()) {
            w(i10);
        }
    }

    public final void v(io.a<Integer> aVar) {
        this.f55898g.setValue(aVar);
    }

    public final void w(int i10) {
        this.f55893b.setValue(Integer.valueOf(i10));
    }

    public final void x() {
        n m10 = m();
        if (m10 != null) {
            u(m10.getIndex());
        }
    }

    public /* synthetic */ f(int i10, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}

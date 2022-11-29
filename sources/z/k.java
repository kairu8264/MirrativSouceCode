package z;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import q1.c;
import q1.s0;
import z.j;

/* loaded from: classes.dex */
public final class k implements r1.d<q1.c>, q1.c {

    /* renamed from: w  reason: collision with root package name */
    public final g0 f62275w;

    /* renamed from: x  reason: collision with root package name */
    public final j f62276x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f62277y;

    /* renamed from: z  reason: collision with root package name */
    public final m2.q f62278z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62279a;

        static {
            int[] iArr = new int[m2.q.values().length];
            iArr[m2.q.Ltr.ordinal()] = 1;
            iArr[m2.q.Rtl.ordinal()] = 2;
            f62279a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ jo.e0<j.a> f62281b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f62282c;

        public b(jo.e0<j.a> e0Var, int i10) {
            this.f62281b = e0Var;
            this.f62282c = i10;
        }

        @Override // q1.c.a
        public boolean a() {
            return k.this.g(this.f62281b.f38136w, this.f62282c);
        }
    }

    public k(g0 g0Var, j jVar, boolean z10, m2.q qVar) {
        jo.p.h(g0Var, "state");
        jo.p.h(jVar, "beyondBoundsInfo");
        jo.p.h(qVar, "layoutDirection");
        this.f62275w = g0Var;
        this.f62276x = jVar;
        this.f62277y = z10;
        this.f62278z = qVar;
    }

    public static final boolean i(j.a aVar, k kVar) {
        return aVar.a() < kVar.f62275w.p().a() - 1;
    }

    public static final boolean j(j.a aVar) {
        return aVar.b() > 0;
    }

    @Override // q1.c
    public <T> T a(int i10, io.l<? super c.a, ? extends T> lVar) {
        jo.p.h(lVar, "block");
        jo.e0 e0Var = new jo.e0();
        e0Var.f38136w = (T) this.f62276x.a(this.f62275w.m(), ((n) xn.a0.i0(this.f62275w.p().b())).getIndex());
        T t10 = null;
        while (t10 == null && g((j.a) e0Var.f38136w, i10)) {
            this.f62276x.e((j.a) e0Var.f38136w);
            e0Var.f38136w = (T) c((j.a) e0Var.f38136w, i10);
            s0 t11 = this.f62275w.t();
            if (t11 != null) {
                t11.b();
            }
            t10 = lVar.invoke(new b(e0Var, i10));
        }
        this.f62276x.e((j.a) e0Var.f38136w);
        s0 t12 = this.f62275w.t();
        if (t12 != null) {
            t12.b();
        }
        return t10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r5.f62277y != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5.f62277y != false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r5.f62277y != false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r5.f62277y != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r5.f62277y != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
        if (r5.f62277y != false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z.j.a c(z.j.a r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.b()
            int r6 = r6.a()
            q1.c$b$a r1 = q1.c.b.f48551a
            int r2 = r1.c()
            boolean r2 = q1.c.b.h(r7, r2)
            if (r2 == 0) goto L18
        L14:
            int r0 = r0 + (-1)
            goto L8c
        L18:
            int r2 = r1.b()
            boolean r2 = q1.c.b.h(r7, r2)
            if (r2 == 0) goto L26
        L22:
            int r6 = r6 + 1
            goto L8c
        L26:
            int r2 = r1.a()
            boolean r2 = q1.c.b.h(r7, r2)
            if (r2 == 0) goto L35
            boolean r7 = r5.f62277y
            if (r7 == 0) goto L14
            goto L22
        L35:
            int r2 = r1.d()
            boolean r2 = q1.c.b.h(r7, r2)
            if (r2 == 0) goto L44
            boolean r7 = r5.f62277y
            if (r7 == 0) goto L22
            goto L14
        L44:
            int r2 = r1.e()
            boolean r2 = q1.c.b.h(r7, r2)
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L69
            m2.q r7 = r5.f62278z
            int[] r1 = z.k.a.f62279a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L64
            if (r7 == r3) goto L5f
            goto L8c
        L5f:
            boolean r7 = r5.f62277y
            if (r7 == 0) goto L22
            goto L14
        L64:
            boolean r7 = r5.f62277y
            if (r7 == 0) goto L14
            goto L22
        L69:
            int r1 = r1.f()
            boolean r7 = q1.c.b.h(r7, r1)
            if (r7 == 0) goto L93
            m2.q r7 = r5.f62278z
            int[] r1 = z.k.a.f62279a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L87
            if (r7 == r3) goto L82
            goto L8c
        L82:
            boolean r7 = r5.f62277y
            if (r7 == 0) goto L14
            goto L22
        L87:
            boolean r7 = r5.f62277y
            if (r7 == 0) goto L22
            goto L14
        L8c:
            z.j r7 = r5.f62276x
            z.j$a r6 = r7.a(r0, r6)
            return r6
        L93:
            z.f.a()
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.k.c(z.j$a, int):z.j$a");
    }

    @Override // r1.d
    /* renamed from: f */
    public q1.c getValue() {
        return this;
    }

    public final boolean g(j.a aVar, int i10) {
        c.b.a aVar2 = c.b.f48551a;
        if (c.b.h(i10, aVar2.c())) {
            return j(aVar);
        }
        if (c.b.h(i10, aVar2.b())) {
            return i(aVar, this);
        }
        if (c.b.h(i10, aVar2.a())) {
            return this.f62277y ? i(aVar, this) : j(aVar);
        } else if (c.b.h(i10, aVar2.d())) {
            return this.f62277y ? j(aVar) : i(aVar, this);
        } else if (c.b.h(i10, aVar2.e())) {
            int i11 = a.f62279a[this.f62278z.ordinal()];
            if (i11 == 1) {
                return this.f62277y ? i(aVar, this) : j(aVar);
            } else if (i11 == 2) {
                return this.f62277y ? j(aVar) : i(aVar, this);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!c.b.h(i10, aVar2.f())) {
            f.c();
            throw new KotlinNothingValueException();
        } else {
            int i12 = a.f62279a[this.f62278z.ordinal()];
            if (i12 == 1) {
                return this.f62277y ? j(aVar) : i(aVar, this);
            } else if (i12 == 2) {
                return this.f62277y ? i(aVar, this) : j(aVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // r1.d
    public r1.f<q1.c> getKey() {
        return q1.d.a();
    }
}

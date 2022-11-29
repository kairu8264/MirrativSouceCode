package y;

import x0.a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final c f60957a = new c(null);

    /* renamed from: b  reason: collision with root package name */
    public static final s f60958b = b.f60962e;

    /* renamed from: c  reason: collision with root package name */
    public static final s f60959c = f.f60965e;

    /* renamed from: d  reason: collision with root package name */
    public static final s f60960d = d.f60963e;

    /* loaded from: classes.dex */
    public static final class a extends s {

        /* renamed from: e  reason: collision with root package name */
        public final y.c f60961e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y.c cVar) {
            super(null);
            jo.p.h(cVar, "alignmentLineProvider");
            this.f60961e = cVar;
        }

        @Override // y.s
        public int a(int i10, m2.q qVar, q1.q0 q0Var, int i11) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(q0Var, "placeable");
            int a10 = this.f60961e.a(q0Var);
            if (a10 != Integer.MIN_VALUE) {
                int i12 = i11 - a10;
                return qVar == m2.q.Rtl ? i10 - i12 : i12;
            }
            return 0;
        }

        @Override // y.s
        public Integer b(q1.q0 q0Var) {
            jo.p.h(q0Var, "placeable");
            return Integer.valueOf(this.f60961e.a(q0Var));
        }

        @Override // y.s
        public boolean c() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends s {

        /* renamed from: e  reason: collision with root package name */
        public static final b f60962e = new b();

        public b() {
            super(null);
        }

        @Override // y.s
        public int a(int i10, m2.q qVar, q1.q0 q0Var, int i11) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(q0Var, "placeable");
            return i10 / 2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final s a(y.c cVar) {
            jo.p.h(cVar, "alignmentLineProvider");
            return new a(cVar);
        }

        public final s b(a.b bVar) {
            jo.p.h(bVar, "horizontal");
            return new e(bVar);
        }

        public final s c(a.c cVar) {
            jo.p.h(cVar, "vertical");
            return new g(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends s {

        /* renamed from: e  reason: collision with root package name */
        public static final d f60963e = new d();

        public d() {
            super(null);
        }

        @Override // y.s
        public int a(int i10, m2.q qVar, q1.q0 q0Var, int i11) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(q0Var, "placeable");
            if (qVar == m2.q.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends s {

        /* renamed from: e  reason: collision with root package name */
        public final a.b f60964e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a.b bVar) {
            super(null);
            jo.p.h(bVar, "horizontal");
            this.f60964e = bVar;
        }

        @Override // y.s
        public int a(int i10, m2.q qVar, q1.q0 q0Var, int i11) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(q0Var, "placeable");
            return this.f60964e.a(0, i10, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends s {

        /* renamed from: e  reason: collision with root package name */
        public static final f f60965e = new f();

        public f() {
            super(null);
        }

        @Override // y.s
        public int a(int i10, m2.q qVar, q1.q0 q0Var, int i11) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(q0Var, "placeable");
            if (qVar == m2.q.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends s {

        /* renamed from: e  reason: collision with root package name */
        public final a.c f60966e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a.c cVar) {
            super(null);
            jo.p.h(cVar, "vertical");
            this.f60966e = cVar;
        }

        @Override // y.s
        public int a(int i10, m2.q qVar, q1.q0 q0Var, int i11) {
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(q0Var, "placeable");
            return this.f60966e.a(0, i10);
        }
    }

    public s() {
    }

    public /* synthetic */ s(jo.h hVar) {
        this();
    }

    public abstract int a(int i10, m2.q qVar, q1.q0 q0Var, int i11);

    public Integer b(q1.q0 q0Var) {
        jo.p.h(q0Var, "placeable");
        return null;
    }

    public boolean c() {
        return false;
    }
}

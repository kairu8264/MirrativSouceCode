package a1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<j> f324a = r1.c.a(a.f326w);

    /* renamed from: b  reason: collision with root package name */
    public static final x0.f f325b = x0.f.f59359u.L(new b()).L(new c()).L(new d());

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<j> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f326w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final j invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements r1.d<s> {
        @Override // r1.d
        /* renamed from: a */
        public s getValue() {
            return null;
        }

        @Override // r1.d
        public r1.f<s> getKey() {
            return r.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements r1.d<a1.f> {
        @Override // r1.d
        /* renamed from: a */
        public a1.f getValue() {
            return null;
        }

        @Override // r1.d
        public r1.f<a1.f> getKey() {
            return a1.e.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements r1.d<w> {
        @Override // r1.d
        /* renamed from: a */
        public w getValue() {
            return null;
        }

        @Override // r1.d
        public r1.f<w> getKey() {
            return v.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<c1, wn.v> {
        public e() {
            super(1);
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("focusTarget");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f327w = new f();

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f328w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar) {
                super(0);
                this.f328w = jVar;
            }

            public final void a() {
                z.k(this.f328w);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public f() {
            super(3);
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-326009031);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = new j(y.Inactive, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            j jVar = (j) y10;
            l0.c0.g(new a(jVar), iVar, 0);
            x0.f b10 = k.b(fVar, jVar);
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.c(fVar, a1.c() ? new e() : a1.a(), f.f327w);
    }

    public static final x0.f b(x0.f fVar, j jVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(jVar, "focusModifier");
        return fVar.L(jVar).L(f325b);
    }

    public static final r1.f<j> c() {
        return f324a;
    }
}

package u;

import com.dena.mirrorman.clientlog.logs.LogBase;
import l0.c2;
import u.z0;

/* loaded from: classes.dex */
public final class a1 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<S> f53928w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ z0<T> f53929x;

        /* renamed from: u.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0846a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ z0 f53930a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ z0 f53931b;

            public C0846a(z0 z0Var, z0 z0Var2) {
                this.f53930a = z0Var;
                this.f53931b = z0Var2;
            }

            @Override // l0.z
            public void dispose() {
                this.f53930a.x(this.f53931b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0<S> z0Var, z0<T> z0Var2) {
            super(1);
            this.f53928w = z0Var;
            this.f53929x = z0Var2;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            this.f53928w.e(this.f53929x);
            return new C0846a(this.f53928w, this.f53929x);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<S> f53932w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ z0<S>.a<T, V> f53933x;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ z0 f53934a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ z0.a f53935b;

            public a(z0 z0Var, z0.a aVar) {
                this.f53934a = z0Var;
                this.f53935b = aVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f53934a.v(this.f53935b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z0<S> z0Var, z0<S>.a<T, V> aVar) {
            super(1);
            this.f53932w = z0Var;
            this.f53933x = aVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f53932w, this.f53933x);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<S> f53936w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ z0<S>.d<T, V> f53937x;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ z0 f53938a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ z0.d f53939b;

            public a(z0 z0Var, z0.d dVar) {
                this.f53938a = z0Var;
                this.f53939b = dVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f53938a.w(this.f53939b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z0<S> z0Var, z0<S>.d<T, V> dVar) {
            super(1);
            this.f53936w = z0Var;
            this.f53937x = dVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            this.f53936w.d(this.f53937x);
            return new a(this.f53936w, this.f53937x);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ z0<T> f53940w;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ z0 f53941a;

            public a(z0 z0Var) {
                this.f53941a = z0Var;
            }

            @Override // l0.z
            public void dispose() {
                this.f53941a.t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z0<T> z0Var) {
            super(1);
            this.f53940w = z0Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f53940w);
        }
    }

    public static final <S, T> z0<T> a(z0<S> z0Var, T t10, T t11, String str, l0.i iVar, int i10) {
        jo.p.h(z0Var, "<this>");
        jo.p.h(str, "childLabel");
        iVar.x(-382162874);
        iVar.x(-3686930);
        boolean P = iVar.P(z0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            n0 n0Var = new n0(t10);
            y10 = new z0(n0Var, ((Object) z0Var.h()) + " > " + str);
            iVar.q(y10);
        }
        iVar.O();
        z0<T> z0Var2 = (z0) y10;
        l0.c0.a(z0Var2, new a(z0Var, z0Var2), iVar, 0);
        if (z0Var.q()) {
            z0Var2.y(t10, t11, z0Var.i());
        } else {
            z0Var2.G(t11, iVar, ((i10 >> 3) & 8) | ((i10 >> 6) & 14));
            z0Var2.B(false);
        }
        iVar.O();
        return z0Var2;
    }

    public static final <S, T, V extends p> z0<S>.a<T, V> b(z0<S> z0Var, c1<T, V> c1Var, String str, l0.i iVar, int i10, int i11) {
        jo.p.h(z0Var, "<this>");
        jo.p.h(c1Var, "typeConverter");
        iVar.x(-44505534);
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        iVar.x(-3686930);
        boolean P = iVar.P(z0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new z0.a(z0Var, c1Var, str);
            iVar.q(y10);
        }
        iVar.O();
        z0<S>.a<T, V> aVar = (z0.a) y10;
        l0.c0.a(aVar, new b(z0Var, aVar), iVar, 8);
        if (z0Var.q()) {
            aVar.d();
        }
        iVar.O();
        return aVar;
    }

    public static final <S, T, V extends p> c2<T> c(z0<S> z0Var, T t10, T t11, c0<T> c0Var, c1<T, V> c1Var, String str, l0.i iVar, int i10) {
        jo.p.h(z0Var, "<this>");
        jo.p.h(c0Var, "animationSpec");
        jo.p.h(c1Var, "typeConverter");
        jo.p.h(str, LogBase.LABEL);
        iVar.x(460682138);
        iVar.x(-3686930);
        boolean P = iVar.P(z0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new z0.d(z0Var, t10, l.g(c1Var, t11), c1Var, str);
            iVar.q(y10);
        }
        iVar.O();
        z0.d dVar = (z0.d) y10;
        if (z0Var.q()) {
            dVar.G(t10, t11, c0Var);
        } else {
            dVar.H(t11, c0Var);
        }
        l0.c0.a(dVar, new c(z0Var, dVar), iVar, 0);
        iVar.O();
        return dVar;
    }

    public static final <T> z0<T> d(T t10, String str, l0.i iVar, int i10, int i11) {
        iVar.x(1641299376);
        if ((i11 & 2) != 0) {
            str = null;
        }
        iVar.x(-3687241);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = new z0(t10, str);
            iVar.q(y10);
        }
        iVar.O();
        z0<T> z0Var = (z0) y10;
        z0Var.f(t10, iVar, (i10 & 8) | 48 | (i10 & 14));
        l0.c0.a(z0Var, new d(z0Var), iVar, 6);
        iVar.O();
        return z0Var;
    }
}

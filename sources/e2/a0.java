package e2;

import java.util.List;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f30057d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    public static final u0.i<a0, Object> f30058e = u0.j.a(a.f30062w, b.f30063w);

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f30059a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30060b;

    /* renamed from: c  reason: collision with root package name */
    public final y1.b0 f30061c;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<u0.k, a0, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f30062w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(u0.k kVar, a0 a0Var) {
            jo.p.h(kVar, "$this$Saver");
            jo.p.h(a0Var, "it");
            return xn.s.e(y1.u.t(a0Var.e(), y1.u.d(), kVar), y1.u.t(y1.b0.b(a0Var.g()), y1.u.q(y1.b0.f61064b), kVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Object, a0> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f30063w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final a0 invoke(Object obj) {
            jo.p.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            u0.i<y1.a, Object> d10 = y1.u.d();
            Boolean bool = Boolean.FALSE;
            y1.b0 b0Var = null;
            y1.a a10 = (jo.p.c(obj2, bool) || obj2 == null) ? null : d10.a(obj2);
            jo.p.e(a10);
            Object obj3 = list.get(1);
            u0.i<y1.b0, Object> q10 = y1.u.q(y1.b0.f61064b);
            if (!jo.p.c(obj3, bool) && obj3 != null) {
                b0Var = q10.a(obj3);
            }
            jo.p.e(b0Var);
            return new a0(a10, b0Var.r(), (y1.b0) null, 4, (jo.h) null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    public /* synthetic */ a0(String str, long j10, y1.b0 b0Var, jo.h hVar) {
        this(str, j10, b0Var);
    }

    public a0(y1.a aVar, long j10, y1.b0 b0Var) {
        this.f30059a = aVar;
        this.f30060b = y1.c0.c(j10, 0, h().length());
        this.f30061c = b0Var != null ? y1.b0.b(y1.c0.c(b0Var.r(), 0, h().length())) : null;
    }

    public /* synthetic */ a0(y1.a aVar, long j10, y1.b0 b0Var, jo.h hVar) {
        this(aVar, j10, b0Var);
    }

    public static /* synthetic */ a0 c(a0 a0Var, String str, long j10, y1.b0 b0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = a0Var.f30060b;
        }
        if ((i10 & 4) != 0) {
            b0Var = a0Var.f30061c;
        }
        return a0Var.a(str, j10, b0Var);
    }

    public static /* synthetic */ a0 d(a0 a0Var, y1.a aVar, long j10, y1.b0 b0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a0Var.f30059a;
        }
        if ((i10 & 2) != 0) {
            j10 = a0Var.f30060b;
        }
        if ((i10 & 4) != 0) {
            b0Var = a0Var.f30061c;
        }
        return a0Var.b(aVar, j10, b0Var);
    }

    public final a0 a(String str, long j10, y1.b0 b0Var) {
        jo.p.h(str, "text");
        return new a0(new y1.a(str, null, null, 6, null), j10, b0Var, (jo.h) null);
    }

    public final a0 b(y1.a aVar, long j10, y1.b0 b0Var) {
        jo.p.h(aVar, "annotatedString");
        return new a0(aVar, j10, b0Var, (jo.h) null);
    }

    public final y1.a e() {
        return this.f30059a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return y1.b0.g(this.f30060b, a0Var.f30060b) && jo.p.c(this.f30061c, a0Var.f30061c) && jo.p.c(this.f30059a, a0Var.f30059a);
        }
        return false;
    }

    public final y1.b0 f() {
        return this.f30061c;
    }

    public final long g() {
        return this.f30060b;
    }

    public final String h() {
        return this.f30059a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f30059a.hashCode() * 31) + y1.b0.o(this.f30060b)) * 31;
        y1.b0 b0Var = this.f30061c;
        return hashCode + (b0Var != null ? y1.b0.o(b0Var.r()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f30059a) + "', selection=" + ((Object) y1.b0.q(this.f30060b)) + ", composition=" + this.f30061c + ')';
    }

    public /* synthetic */ a0(y1.a aVar, long j10, y1.b0 b0Var, int i10, jo.h hVar) {
        this(aVar, (i10 & 2) != 0 ? y1.b0.f61064b.a() : j10, (i10 & 4) != 0 ? null : b0Var, (jo.h) null);
    }

    public /* synthetic */ a0(String str, long j10, y1.b0 b0Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? y1.b0.f61064b.a() : j10, (i10 & 4) != 0 ? null : b0Var, (jo.h) null);
    }

    public a0(String str, long j10, y1.b0 b0Var) {
        this(new y1.a(str, null, null, 6, null), j10, b0Var, (jo.h) null);
    }
}

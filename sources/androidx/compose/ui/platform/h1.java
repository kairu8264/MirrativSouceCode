package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f14462a = new h1();

    /* renamed from: b  reason: collision with root package name */
    public static final l0.c1<w1> f14463b = l0.r.c(null, a.f14464w, 1, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<w1> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14464w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final w1 invoke() {
            return null;
        }
    }

    public final w1 a(l0.i iVar, int i10) {
        iVar.x(1835581880);
        e2.c0 c0Var = (e2.c0) iVar.G(o0.l());
        if (c0Var == null) {
            iVar.O();
            return null;
        }
        iVar.x(1157296644);
        boolean P = iVar.P(c0Var);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new q0(c0Var);
            iVar.q(y10);
        }
        iVar.O();
        q0 q0Var = (q0) y10;
        iVar.O();
        return q0Var;
    }

    public final w1 b(l0.i iVar, int i10) {
        iVar.x(-1059476185);
        w1 w1Var = (w1) iVar.G(f14463b);
        if (w1Var == null) {
            w1Var = a(iVar, i10 & 14);
        }
        iVar.O();
        return w1Var;
    }
}

package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class lo0 extends fo0 implements ej<ui> {
    public final dm0 A;
    public boolean B;
    public final ko0 C;
    public final pn0 D;
    public ByteBuffer E;
    public boolean F;
    public final Object G;
    public final String H;
    public final int I;
    public boolean J;

    /* renamed from: z  reason: collision with root package name */
    public String f6631z;

    public lo0(em0 em0Var, dm0 dm0Var) {
        super(em0Var);
        this.A = dm0Var;
        this.C = new ko0();
        this.D = new pn0();
        this.G = new Object();
        this.H = em0Var != null ? em0Var.n() : "";
        this.I = em0Var != null ? em0Var.p() : 0;
    }

    public static final String z(String str) {
        String valueOf = String.valueOf(nj0.d(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final void A() {
        int a10 = (int) this.C.a();
        int a11 = (int) this.D.a(this.E);
        int position = this.E.position();
        int round = Math.round(a11 * (position / a10));
        boolean z10 = round > 0;
        int Q = ul0.Q();
        int R = ul0.R();
        String str = this.f6631z;
        p(str, z(str), position, a10, round, a11, z10, Q, R);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
        r26.J = true;
        r(r27, r11, (int) r26.D.a(r26.E));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
        return true;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:? -> B:45:0x0143). Please submit an issue!!! */
    @Override // ai.fo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.lo0.f(java.lang.String):boolean");
    }

    @Override // ai.fo0
    public final void m() {
        this.B = true;
    }

    @Override // ai.ej
    public final /* bridge */ /* synthetic */ void n(ui uiVar, vi viVar) {
        this.C.b((xi) uiVar);
    }

    public final String u() {
        return this.f6631z;
    }

    public final boolean v() {
        return this.J;
    }

    public final ByteBuffer w() {
        synchronized (this.G) {
            ByteBuffer byteBuffer = this.E;
            if (byteBuffer != null && !this.F) {
                byteBuffer.flip();
                this.F = true;
            }
            this.B = true;
        }
        return this.E;
    }

    @Override // ai.ej
    public final /* bridge */ /* synthetic */ void y(ui uiVar, int i10) {
    }
}

package f0;

import com.google.android.exoplayer2.audio.AacUtil;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f31690a;

    /* renamed from: b  reason: collision with root package name */
    public a f31691b;

    /* renamed from: c  reason: collision with root package name */
    public a f31692c;

    /* renamed from: d  reason: collision with root package name */
    public int f31693d;

    /* renamed from: e  reason: collision with root package name */
    public Long f31694e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31695f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public a f31696a;

        /* renamed from: b  reason: collision with root package name */
        public e2.a0 f31697b;

        public a(a aVar, e2.a0 a0Var) {
            jo.p.h(a0Var, "value");
            this.f31696a = aVar;
            this.f31697b = a0Var;
        }

        public final a a() {
            return this.f31696a;
        }

        public final e2.a0 b() {
            return this.f31697b;
        }

        public final void c(a aVar) {
            this.f31696a = aVar;
        }

        public final void d(e2.a0 a0Var) {
            jo.p.h(a0Var, "<set-?>");
            this.f31697b = a0Var;
        }
    }

    public y0() {
        this(0, 1, null);
    }

    public y0(int i10) {
        this.f31690a = i10;
    }

    public static /* synthetic */ void f(y0 y0Var, e2.a0 a0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = a1.a();
        }
        y0Var.e(a0Var, j10);
    }

    public final void a() {
        this.f31695f = true;
    }

    public final void b(e2.a0 a0Var) {
        e2.a0 b10;
        jo.p.h(a0Var, "value");
        this.f31695f = false;
        a aVar = this.f31691b;
        if (jo.p.c(a0Var, aVar != null ? aVar.b() : null)) {
            return;
        }
        String h10 = a0Var.h();
        a aVar2 = this.f31691b;
        if (jo.p.c(h10, (aVar2 == null || (b10 = aVar2.b()) == null) ? null : b10.h())) {
            a aVar3 = this.f31691b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(a0Var);
            return;
        }
        this.f31691b = new a(this.f31691b, a0Var);
        this.f31692c = null;
        int length = this.f31693d + a0Var.h().length();
        this.f31693d = length;
        if (length > this.f31690a) {
            d();
        }
    }

    public final e2.a0 c() {
        a aVar = this.f31692c;
        if (aVar != null) {
            this.f31692c = aVar.a();
            this.f31691b = new a(this.f31691b, aVar.b());
            this.f31693d += aVar.b().h().length();
            return aVar.b();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[LOOP:0: B:8:0x000e->B:14:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[EDGE_INSN: B:19:0x0023->B:15:0x0023 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            f0.y0$a r0 = r3.f31691b
            r1 = 0
            if (r0 == 0) goto La
            f0.y0$a r2 = r0.a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            f0.y0$a r2 = r0.a()
            if (r2 == 0) goto L1b
            f0.y0$a r2 = r2.a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            f0.y0$a r0 = r0.a()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.c(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.y0.d():void");
    }

    public final void e(e2.a0 a0Var, long j10) {
        jo.p.h(a0Var, "value");
        if (!this.f31695f) {
            Long l10 = this.f31694e;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + z0.a()) {
                return;
            }
        }
        this.f31694e = Long.valueOf(j10);
        b(a0Var);
    }

    public final e2.a0 g() {
        a a10;
        a aVar = this.f31691b;
        if (aVar == null || (a10 = aVar.a()) == null) {
            return null;
        }
        this.f31691b = a10;
        this.f31693d -= aVar.b().h().length();
        this.f31692c = new a(this.f31692c, aVar.b());
        return a10.b();
    }

    public /* synthetic */ y0(int i10, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND : i10);
    }
}

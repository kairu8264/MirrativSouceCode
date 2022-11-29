package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public long f14474a;

    /* renamed from: b  reason: collision with root package name */
    public long f14475b;

    /* renamed from: c  reason: collision with root package name */
    public d2.x f14476c;

    /* renamed from: d  reason: collision with root package name */
    public d2.u f14477d;

    /* renamed from: e  reason: collision with root package name */
    public d2.v f14478e;

    /* renamed from: f  reason: collision with root package name */
    public d2.l f14479f;

    /* renamed from: g  reason: collision with root package name */
    public String f14480g;

    /* renamed from: h  reason: collision with root package name */
    public long f14481h;

    /* renamed from: i  reason: collision with root package name */
    public j2.a f14482i;

    /* renamed from: j  reason: collision with root package name */
    public j2.i f14483j;

    /* renamed from: k  reason: collision with root package name */
    public f2.f f14484k;

    /* renamed from: l  reason: collision with root package name */
    public long f14485l;

    /* renamed from: m  reason: collision with root package name */
    public j2.f f14486m;

    /* renamed from: n  reason: collision with root package name */
    public c1.f1 f14487n;

    public j1(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, c1.f1 f1Var) {
        this.f14474a = j10;
        this.f14475b = j11;
        this.f14476c = xVar;
        this.f14477d = uVar;
        this.f14478e = vVar;
        this.f14479f = lVar;
        this.f14480g = str;
        this.f14481h = j12;
        this.f14482i = aVar;
        this.f14483j = iVar;
        this.f14484k = fVar;
        this.f14485l = j13;
        this.f14486m = fVar2;
        this.f14487n = f1Var;
    }

    public /* synthetic */ j1(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, c1.f1 f1Var, jo.h hVar) {
        this(j10, j11, xVar, uVar, vVar, lVar, str, j12, aVar, iVar, fVar, j13, fVar2, f1Var);
    }

    public final void a(long j10) {
        this.f14485l = j10;
    }

    public final void b(j2.a aVar) {
        this.f14482i = aVar;
    }

    public final void c(long j10) {
        this.f14474a = j10;
    }

    public final void d(String str) {
        this.f14480g = str;
    }

    public final void e(long j10) {
        this.f14475b = j10;
    }

    public final void f(d2.u uVar) {
        this.f14477d = uVar;
    }

    public final void g(d2.v vVar) {
        this.f14478e = vVar;
    }

    public final void h(d2.x xVar) {
        this.f14476c = xVar;
    }

    public final void i(long j10) {
        this.f14481h = j10;
    }

    public final void j(c1.f1 f1Var) {
        this.f14487n = f1Var;
    }

    public final void k(j2.f fVar) {
        this.f14486m = fVar;
    }

    public final void l(j2.i iVar) {
        this.f14483j = iVar;
    }

    public final y1.v m() {
        return new y1.v(this.f14474a, this.f14475b, this.f14476c, this.f14477d, this.f14478e, this.f14479f, this.f14480g, this.f14481h, this.f14482i, this.f14483j, this.f14484k, this.f14485l, this.f14486m, this.f14487n, (jo.h) null);
    }

    public /* synthetic */ j1(long j10, long j11, d2.x xVar, d2.u uVar, d2.v vVar, d2.l lVar, String str, long j12, j2.a aVar, j2.i iVar, f2.f fVar, long j13, j2.f fVar2, c1.f1 f1Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? c1.c0.f18634b.e() : j10, (i10 & 2) != 0 ? m2.r.f40540b.a() : j11, (i10 & 4) != 0 ? null : xVar, (i10 & 8) != 0 ? null : uVar, (i10 & 16) != 0 ? null : vVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? m2.r.f40540b.a() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : iVar, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? c1.c0.f18634b.e() : j13, (i10 & 4096) != 0 ? null : fVar2, (i10 & 8192) != 0 ? null : f1Var, null);
    }
}

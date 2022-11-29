package ai;

/* loaded from: classes3.dex */
public final class ai extends xc {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f1857d = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f1858b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1859c;

    public ai(long j10, boolean z10) {
        this.f1858b = j10;
        this.f1859c = j10;
    }

    @Override // ai.xc
    public final int a() {
        return 1;
    }

    @Override // ai.xc
    public final wc b(int i10, wc wcVar, boolean z10, long j10) {
        fj.c(i10, 0, 1);
        wcVar.f11544a = this.f1859c;
        return wcVar;
    }

    @Override // ai.xc
    public final int c() {
        return 1;
    }

    @Override // ai.xc
    public final vc d(int i10, vc vcVar, boolean z10) {
        fj.c(i10, 0, 1);
        Object obj = z10 ? f1857d : null;
        long j10 = this.f1858b;
        vcVar.f11017a = obj;
        vcVar.f11018b = obj;
        vcVar.f11019c = j10;
        return vcVar;
    }

    @Override // ai.xc
    public final int e(Object obj) {
        return f1857d.equals(obj) ? 0 : -1;
    }
}

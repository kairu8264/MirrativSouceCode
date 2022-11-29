package pi;

/* loaded from: classes3.dex */
public final class n9 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f48078a;

    /* renamed from: b  reason: collision with root package name */
    public long f48079b;

    public n9(vh.f fVar) {
        rh.p.i(fVar);
        this.f48078a = fVar;
    }

    public final void a() {
        this.f48079b = 0L;
    }

    public final void b() {
        this.f48079b = this.f48078a.elapsedRealtime();
    }

    public final boolean c(long j10) {
        return this.f48079b == 0 || this.f48078a.elapsedRealtime() - this.f48079b >= 3600000;
    }
}

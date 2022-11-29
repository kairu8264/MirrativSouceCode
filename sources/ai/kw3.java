package ai;

/* loaded from: classes3.dex */
public class kw3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f6387a;

    /* renamed from: b  reason: collision with root package name */
    public final jw3 f6388b;

    public kw3(long j10, long j11) {
        this.f6387a = j10;
        mw3 mw3Var = j11 == 0 ? mw3.f7081c : new mw3(0L, j11);
        this.f6388b = new jw3(mw3Var, mw3Var);
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        return this.f6388b;
    }

    @Override // ai.lw3
    public final boolean c() {
        return false;
    }

    @Override // ai.lw3
    public final long f() {
        return this.f6387a;
    }
}

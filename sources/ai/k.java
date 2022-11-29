package ai;

/* loaded from: classes3.dex */
public final class k implements zu2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vt2 f6012a;

    public k(vt2 vt2Var) {
        this.f6012a = vt2Var;
    }

    @Override // ai.zu2
    public final void a(int i10, long j10, String str) {
        this.f6012a.f(i10, System.currentTimeMillis() - j10, str);
    }

    @Override // ai.zu2
    public final void b(int i10, long j10) {
        this.f6012a.b(i10, System.currentTimeMillis() - j10);
    }
}

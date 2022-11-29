package wg;

import ai.vt2;
import ai.zu2;

/* loaded from: classes3.dex */
public final class h implements zu2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f58708a;

    public h(i iVar) {
        this.f58708a = iVar;
    }

    @Override // ai.zu2
    public final void a(int i10, long j10, String str) {
        vt2 vt2Var;
        vt2Var = this.f58708a.D;
        vt2Var.f(i10, System.currentTimeMillis() - j10, str);
    }

    @Override // ai.zu2
    public final void b(int i10, long j10) {
        vt2 vt2Var;
        vt2Var = this.f58708a.D;
        vt2Var.b(i10, System.currentTimeMillis() - j10);
    }
}

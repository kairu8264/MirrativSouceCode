package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ar2 implements nq2 {

    /* renamed from: a  reason: collision with root package name */
    public final xq2 f1980a;

    /* renamed from: b  reason: collision with root package name */
    public final vq2 f1981b;

    public ar2(xq2 xq2Var, vq2 vq2Var) {
        this.f1980a = xq2Var;
        this.f1981b = vq2Var;
    }

    @Override // ai.nq2
    public final void a(mq2 mq2Var) {
    }

    @Override // ai.nq2
    public final String b(mq2 mq2Var) {
        xq2 xq2Var = this.f1980a;
        Map<String, String> j10 = mq2Var.j();
        this.f1981b.a(j10);
        return xq2Var.a(j10);
    }
}

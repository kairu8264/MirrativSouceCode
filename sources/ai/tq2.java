package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class tq2 implements nq2 {

    /* renamed from: a  reason: collision with root package name */
    public final xq2 f10376a;

    /* renamed from: b  reason: collision with root package name */
    public final vq2 f10377b;

    /* renamed from: c  reason: collision with root package name */
    public final jq2 f10378c;

    public tq2(jq2 jq2Var, xq2 xq2Var, vq2 vq2Var, byte[] bArr) {
        this.f10378c = jq2Var;
        this.f10376a = xq2Var;
        this.f10377b = vq2Var;
    }

    @Override // ai.nq2
    public final void a(mq2 mq2Var) {
        this.f10378c.a(b(mq2Var));
    }

    @Override // ai.nq2
    public final String b(mq2 mq2Var) {
        xq2 xq2Var = this.f10376a;
        Map<String, String> j10 = mq2Var.j();
        this.f10377b.a(j10);
        return xq2Var.a(j10);
    }
}

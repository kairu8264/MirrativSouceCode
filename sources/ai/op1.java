package ai;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class op1 {

    /* renamed from: a */
    public final Map<String, String> f7876a = new ConcurrentHashMap();

    /* renamed from: b */
    public final /* synthetic */ pp1 f7877b;

    public op1(pp1 pp1Var) {
        this.f7877b = pp1Var;
    }

    public static /* synthetic */ op1 a(op1 op1Var) {
        Map<? extends String, ? extends String> map;
        Map<String, String> map2 = op1Var.f7876a;
        map = op1Var.f7877b.f8494c;
        map2.putAll(map);
        return op1Var;
    }

    public final op1 b(kl2 kl2Var) {
        this.f7876a.put("gqi", kl2Var.f6277b);
        return this;
    }

    public final op1 c(fl2 fl2Var) {
        this.f7876a.put("aai", fl2Var.f4112w);
        return this;
    }

    public final op1 d(String str, String str2) {
        this.f7876a.put(str, str2);
        return this;
    }

    public final void e() {
        Executor executor;
        executor = this.f7877b.f8493b;
        executor.execute(new Runnable(this) { // from class: ai.np1

            /* renamed from: w  reason: collision with root package name */
            public final op1 f7432w;

            {
                this.f7432w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7432w.g();
            }
        });
    }

    public final String f() {
        up1 up1Var;
        up1Var = this.f7877b.f8492a;
        return up1Var.b(this.f7876a);
    }

    public final /* synthetic */ void g() {
        up1 up1Var;
        up1Var = this.f7877b.f8492a;
        up1Var.a(this.f7876a);
    }
}

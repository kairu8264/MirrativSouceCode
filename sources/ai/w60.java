package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class w60 implements r30<l70> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e60 f11499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ yg.f1 f11500b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k70 f11501c;

    public w60(k70 k70Var, u uVar, e60 e60Var, yg.f1 f1Var) {
        this.f11501c = k70Var;
        this.f11499a = e60Var;
        this.f11500b = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ai.r30] */
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(l70 l70Var, Map map) {
        Object obj;
        int i10;
        obj = this.f11501c.f6106a;
        synchronized (obj) {
            uj0.e("JS Engine is requesting an update");
            i10 = this.f11501c.f6113h;
            if (i10 == 0) {
                uj0.e("Starting reload.");
                this.f11501c.f6113h = 2;
                this.f11501c.f(null);
            }
            this.f11499a.z0("/requestReload", this.f11500b.a());
        }
    }
}

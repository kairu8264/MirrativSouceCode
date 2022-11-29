package ai;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ll1 implements Callable<nl1> {

    /* renamed from: a */
    public final wg.a f6603a;

    /* renamed from: b */
    public final cq0 f6604b;

    /* renamed from: c */
    public final Context f6605c;

    /* renamed from: d */
    public final pp1 f6606d;

    /* renamed from: e */
    public final nq2 f6607e;

    /* renamed from: f */
    public final ey1 f6608f;

    /* renamed from: g */
    public final Executor f6609g;

    /* renamed from: h */
    public final u f6610h;

    /* renamed from: i */
    public final zj0 f6611i;

    /* renamed from: j */
    public final fr2 f6612j;

    public ll1(Context context, Executor executor, u uVar, zj0 zj0Var, wg.a aVar, cq0 cq0Var, ey1 ey1Var, fr2 fr2Var, pp1 pp1Var, nq2 nq2Var) {
        this.f6605c = context;
        this.f6609g = executor;
        this.f6610h = uVar;
        this.f6611i = zj0Var;
        this.f6603a = aVar;
        this.f6604b = cq0Var;
        this.f6608f = ey1Var;
        this.f6612j = fr2Var;
        this.f6606d = pp1Var;
        this.f6607e = nq2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ nl1 call() throws Exception {
        nl1 nl1Var = new nl1(this);
        nl1Var.b();
        return nl1Var;
    }
}

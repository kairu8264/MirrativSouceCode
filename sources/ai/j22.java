package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class j22<AdT> implements p33<sl2, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final cq2 f5597a;

    /* renamed from: b  reason: collision with root package name */
    public final x41 f5598b;

    /* renamed from: c  reason: collision with root package name */
    public final cr2 f5599c;

    /* renamed from: d  reason: collision with root package name */
    public final fr2 f5600d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f5601e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f5602f;

    /* renamed from: g  reason: collision with root package name */
    public final x01<AdT> f5603g;

    /* renamed from: h  reason: collision with root package name */
    public final f22 f5604h;

    /* renamed from: i  reason: collision with root package name */
    public final vy1 f5605i;

    public j22(cq2 cq2Var, f22 f22Var, x41 x41Var, cr2 cr2Var, fr2 fr2Var, x01<AdT> x01Var, Executor executor, ScheduledExecutorService scheduledExecutorService, vy1 vy1Var) {
        this.f5597a = cq2Var;
        this.f5604h = f22Var;
        this.f5598b = x41Var;
        this.f5599c = cr2Var;
        this.f5600d = fr2Var;
        this.f5603g = x01Var;
        this.f5601e = executor;
        this.f5602f = scheduledExecutorService;
        this.f5605i = vy1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    @Override // ai.p33
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ ai.s43 a(ai.sl2 r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.j22.a(java.lang.Object):ai.s43");
    }

    public final /* synthetic */ s43 c(sl2 sl2Var, fl2 fl2Var, ry1 ry1Var, Throwable th2) throws Exception {
        f22 f22Var = this.f5604h;
        kl2 kl2Var = sl2Var.f9876b.f9497b;
        s43 h10 = j43.h(ry1Var.a(sl2Var, fl2Var), fl2Var.N, TimeUnit.MILLISECONDS, this.f5602f);
        f22Var.e(kl2Var, fl2Var, h10);
        return h10;
    }
}

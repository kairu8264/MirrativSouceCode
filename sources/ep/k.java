package ep;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final jp.h f30943a;

    public k(jp.h hVar) {
        jo.p.h(hVar, "delegate");
        this.f30943a = hVar;
    }

    public final jp.h a() {
        return this.f30943a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new jp.h(ip.e.f36975h, i10, j10, timeUnit));
        jo.p.h(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}

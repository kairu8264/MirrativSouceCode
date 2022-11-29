package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class u24 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10585a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10586b;

    public u24(int i10, long j10) {
        this.f10585a = i10;
        this.f10586b = j10;
    }

    public static u24 a(nv3 nv3Var, hb hbVar) throws IOException {
        ((hv3) nv3Var).c(hbVar.q(), 0, 8, false);
        hbVar.p(0);
        return new u24(hbVar.D(), hbVar.C());
    }
}

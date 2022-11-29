package kp;

import ep.e0;
import ep.x;
import jo.p;

/* loaded from: classes4.dex */
public final class h extends e0 {
    public final rp.e A;

    /* renamed from: y  reason: collision with root package name */
    public final String f38928y;

    /* renamed from: z  reason: collision with root package name */
    public final long f38929z;

    public h(String str, long j10, rp.e eVar) {
        p.h(eVar, "source");
        this.f38928y = str;
        this.f38929z = j10;
        this.A = eVar;
    }

    @Override // ep.e0
    public long h() {
        return this.f38929z;
    }

    @Override // ep.e0
    public x i() {
        String str = this.f38928y;
        if (str != null) {
            return x.f31036g.b(str);
        }
        return null;
    }

    @Override // ep.e0
    public rp.e n() {
        return this.A;
    }
}

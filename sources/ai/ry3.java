package ai;

import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public final class ry3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f9627a;

    /* renamed from: b  reason: collision with root package name */
    public int f9628b;

    /* renamed from: c  reason: collision with root package name */
    public int f9629c;

    /* renamed from: d  reason: collision with root package name */
    public long f9630d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9631e;

    /* renamed from: f  reason: collision with root package name */
    public final hb f9632f;

    /* renamed from: g  reason: collision with root package name */
    public final hb f9633g;

    /* renamed from: h  reason: collision with root package name */
    public int f9634h;

    /* renamed from: i  reason: collision with root package name */
    public int f9635i;

    public ry3(hb hbVar, hb hbVar2, boolean z10) throws zzaha {
        this.f9633g = hbVar;
        this.f9632f = hbVar2;
        this.f9631e = z10;
        hbVar2.p(12);
        this.f9627a = hbVar2.b();
        hbVar.p(12);
        this.f9635i = hbVar.b();
        qv3.a(hbVar.D() == 1, "first_chunk must be 1");
        this.f9628b = -1;
    }

    public final boolean a() {
        int i10 = this.f9628b + 1;
        this.f9628b = i10;
        if (i10 == this.f9627a) {
            return false;
        }
        this.f9630d = this.f9631e ? this.f9632f.d() : this.f9632f.B();
        if (this.f9628b == this.f9634h) {
            this.f9629c = this.f9633g.b();
            this.f9633g.s(4);
            int i11 = this.f9635i - 1;
            this.f9635i = i11;
            this.f9634h = i11 > 0 ? (-1) + this.f9633g.b() : -1;
        }
        return true;
    }
}

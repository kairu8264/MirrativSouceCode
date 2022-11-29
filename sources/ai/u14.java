package ai;

import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public final class u14 {

    /* renamed from: a  reason: collision with root package name */
    public final x04 f10562a;

    /* renamed from: b  reason: collision with root package name */
    public final pb f10563b;

    /* renamed from: c  reason: collision with root package name */
    public final gb f10564c = new gb(new byte[64], 64);

    /* renamed from: d  reason: collision with root package name */
    public boolean f10565d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10566e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10567f;

    public u14(x04 x04Var, pb pbVar) {
        this.f10562a = x04Var;
        this.f10563b = pbVar;
    }

    public final void a() {
        this.f10567f = false;
        this.f10562a.zza();
    }

    public final void b(hb hbVar) throws zzaha {
        long j10;
        hbVar.u(this.f10564c.f4375a, 0, 3);
        this.f10564c.d(0);
        this.f10564c.f(8);
        this.f10565d = this.f10564c.g();
        this.f10566e = this.f10564c.g();
        this.f10564c.f(6);
        hbVar.u(this.f10564c.f4375a, 0, this.f10564c.h(8));
        this.f10564c.d(0);
        if (this.f10565d) {
            this.f10564c.f(4);
            int h10 = this.f10564c.h(3);
            this.f10564c.f(1);
            int h11 = this.f10564c.h(15);
            this.f10564c.f(1);
            long h12 = (h10 << 30) | (h11 << 15) | this.f10564c.h(15);
            this.f10564c.f(1);
            if (!this.f10567f && this.f10566e) {
                this.f10564c.f(4);
                int h13 = this.f10564c.h(3);
                this.f10564c.f(1);
                int h14 = this.f10564c.h(15);
                this.f10564c.f(1);
                int h15 = this.f10564c.h(15);
                this.f10564c.f(1);
                this.f10563b.e((h14 << 15) | (h13 << 30) | h15);
                this.f10567f = true;
            }
            j10 = this.f10563b.e(h12);
        } else {
            j10 = 0;
        }
        this.f10562a.d(j10, 4);
        this.f10562a.b(hbVar);
        this.f10562a.c();
    }
}

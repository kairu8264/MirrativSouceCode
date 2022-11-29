package o1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f43797a;

    /* renamed from: b  reason: collision with root package name */
    public long f43798b = Long.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public float f43799c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43800d = true;

    public final void a(long j10, float f10) {
        float c10;
        if (this.f43798b != Long.MAX_VALUE && !Float.isNaN(this.f43799c)) {
            if (j10 != this.f43798b) {
                c10 = h.c(this.f43797a);
                float f11 = (f10 - this.f43799c) / (((float) (j10 - this.f43798b)) * 0.001f);
                float abs = this.f43797a + ((f11 - c10) * Math.abs(f11));
                this.f43797a = abs;
                if (this.f43800d) {
                    this.f43797a = abs * 0.5f;
                    this.f43800d = false;
                }
                this.f43798b = j10;
                this.f43799c = f10;
                return;
            }
            this.f43799c = f10;
            return;
        }
        this.f43798b = j10;
        this.f43799c = f10;
    }

    public final float b() {
        float c10;
        c10 = h.c(this.f43797a);
        return c10;
    }

    public final void c() {
        this.f43797a = 0.0f;
        this.f43798b = Long.MAX_VALUE;
        this.f43799c = Float.NaN;
        this.f43800d = true;
    }
}

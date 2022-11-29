package ai;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class jb implements qa {
    public e6 A = e6.f3542d;

    /* renamed from: w  reason: collision with root package name */
    public final v9 f5677w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5678x;

    /* renamed from: y  reason: collision with root package name */
    public long f5679y;

    /* renamed from: z  reason: collision with root package name */
    public long f5680z;

    public jb(v9 v9Var) {
        this.f5677w = v9Var;
    }

    @Override // ai.qa
    public final void A(e6 e6Var) {
        if (this.f5678x) {
            c(z());
        }
        this.A = e6Var;
    }

    public final void a() {
        if (this.f5678x) {
            return;
        }
        this.f5680z = SystemClock.elapsedRealtime();
        this.f5678x = true;
    }

    public final void b() {
        if (this.f5678x) {
            c(z());
            this.f5678x = false;
        }
    }

    public final void c(long j10) {
        this.f5679y = j10;
        if (this.f5678x) {
            this.f5680z = SystemClock.elapsedRealtime();
        }
    }

    @Override // ai.qa
    public final e6 y() {
        return this.A;
    }

    @Override // ai.qa
    public final long z() {
        long a10;
        long j10 = this.f5679y;
        if (this.f5678x) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5680z;
            e6 e6Var = this.A;
            if (e6Var.f3544a == 1.0f) {
                a10 = y2.b(elapsedRealtime);
            } else {
                a10 = e6Var.a(elapsedRealtime);
            }
            return j10 + a10;
        }
        return j10;
    }
}

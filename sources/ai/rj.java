package ai;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class rj implements jj {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9454a;

    /* renamed from: b  reason: collision with root package name */
    public long f9455b;

    /* renamed from: c  reason: collision with root package name */
    public long f9456c;

    /* renamed from: d  reason: collision with root package name */
    public qc f9457d = qc.f8867d;

    public final void a() {
        if (this.f9454a) {
            return;
        }
        this.f9456c = SystemClock.elapsedRealtime();
        this.f9454a = true;
    }

    public final void b() {
        if (this.f9454a) {
            c(q());
            this.f9454a = false;
        }
    }

    public final void c(long j10) {
        this.f9455b = j10;
        if (this.f9454a) {
            this.f9456c = SystemClock.elapsedRealtime();
        }
    }

    public final void d(jj jjVar) {
        c(jjVar.q());
        this.f9457d = jjVar.i0();
    }

    @Override // ai.jj
    public final qc i0() {
        throw null;
    }

    @Override // ai.jj
    public final qc j0(qc qcVar) {
        if (this.f9454a) {
            c(q());
        }
        this.f9457d = qcVar;
        return qcVar;
    }

    @Override // ai.jj
    public final long q() {
        long a10;
        long j10 = this.f9455b;
        if (this.f9454a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9456c;
            qc qcVar = this.f9457d;
            if (qcVar.f8868a == 1.0f) {
                a10 = zb.b(elapsedRealtime);
            } else {
                a10 = qcVar.a(elapsedRealtime);
            }
            return j10 + a10;
        }
        return j10;
    }
}

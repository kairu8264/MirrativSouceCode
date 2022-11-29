package pi;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hi.zc;

/* loaded from: classes3.dex */
public final class k9 {

    /* renamed from: a  reason: collision with root package name */
    public long f48006a;

    /* renamed from: b  reason: collision with root package name */
    public long f48007b;

    /* renamed from: c  reason: collision with root package name */
    public final n f48008c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m9 f48009d;

    public k9(m9 m9Var) {
        this.f48009d = m9Var;
        this.f48008c = new j9(this, m9Var.f48285a);
        long elapsedRealtime = m9Var.f48285a.c().elapsedRealtime();
        this.f48006a = elapsedRealtime;
        this.f48007b = elapsedRealtime;
    }

    public final void a() {
        this.f48008c.b();
        this.f48006a = 0L;
        this.f48007b = 0L;
    }

    public final void b(long j10) {
        this.f48008c.b();
    }

    public final void c(long j10) {
        this.f48009d.f();
        this.f48008c.b();
        this.f48006a = j10;
        this.f48007b = j10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f48009d.f();
        this.f48009d.g();
        zc.b();
        if (this.f48009d.f48285a.y().A(null, c3.f47709k0)) {
            if (this.f48009d.f48285a.m()) {
                this.f48009d.f48285a.E().f47835o.b(this.f48009d.f48285a.c().currentTimeMillis());
            }
        } else {
            this.f48009d.f48285a.E().f47835o.b(this.f48009d.f48285a.c().currentTimeMillis());
        }
        long j11 = j10 - this.f48006a;
        if (!z10 && j11 < 1000) {
            this.f48009d.f48285a.r().u().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f48007b;
            this.f48007b = j10;
        }
        this.f48009d.f48285a.r().u().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        ia.w(this.f48009d.f48285a.K().s(!this.f48009d.f48285a.y().C()), bundle, true);
        g y10 = this.f48009d.f48285a.y();
        b3<Boolean> b3Var = c3.V;
        if (!y10.A(null, b3Var) && z11) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f48009d.f48285a.y().A(null, b3Var) || !z11) {
            this.f48009d.f48285a.I().t(TtmlNode.TEXT_EMPHASIS_AUTO, "_e", bundle);
        }
        this.f48006a = j10;
        this.f48008c.b();
        this.f48008c.d(3600000L);
        return true;
    }
}

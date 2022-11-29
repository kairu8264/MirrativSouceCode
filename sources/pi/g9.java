package pi;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class g9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final long f47876w;

    /* renamed from: x  reason: collision with root package name */
    public final long f47877x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ h9 f47878y;

    public g9(h9 h9Var, long j10, long j11) {
        this.f47878y = h9Var;
        this.f47876w = j10;
        this.f47877x = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47878y.f47920b.f48285a.a().y(new Runnable() { // from class: pi.f9
            @Override // java.lang.Runnable
            public final void run() {
                g9 g9Var = g9.this;
                h9 h9Var = g9Var.f47878y;
                long j10 = g9Var.f47876w;
                long j11 = g9Var.f47877x;
                h9Var.f47920b.f();
                h9Var.f47920b.f48285a.r().o().a("Application going to the background");
                boolean z10 = true;
                h9Var.f47920b.f48285a.E().f47837q.a(true);
                Bundle bundle = new Bundle();
                if (!h9Var.f47920b.f48285a.y().C()) {
                    h9Var.f47920b.f48050e.b(j11);
                    if (h9Var.f47920b.f48285a.y().A(null, c3.f47703h0)) {
                        k9 k9Var = h9Var.f47920b.f48050e;
                        long j12 = k9Var.f48007b;
                        k9Var.f48007b = j11;
                        bundle.putLong("_et", j11 - j12);
                        ia.w(h9Var.f47920b.f48285a.K().s(true), bundle, true);
                    } else {
                        z10 = false;
                    }
                    h9Var.f47920b.f48050e.d(false, z10, j11);
                }
                h9Var.f47920b.f48285a.I().u(TtmlNode.TEXT_EMPHASIS_AUTO, "_ab", j10, bundle);
            }
        });
    }
}

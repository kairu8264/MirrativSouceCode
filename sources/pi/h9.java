package pi;

import android.os.Handler;
import com.google.android.exoplayer2.SimpleExoPlayer;

/* loaded from: classes3.dex */
public final class h9 {

    /* renamed from: a  reason: collision with root package name */
    public g9 f47919a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m9 f47920b;

    public h9(m9 m9Var) {
        this.f47920b = m9Var;
    }

    public final void a(long j10) {
        Handler handler;
        this.f47919a = new g9(this, this.f47920b.f48285a.c().currentTimeMillis(), j10);
        handler = this.f47920b.f48048c;
        handler.postDelayed(this.f47919a, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    public final void b() {
        Handler handler;
        this.f47920b.f();
        if (this.f47919a != null) {
            handler = this.f47920b.f48048c;
            handler.removeCallbacks(this.f47919a);
        }
        this.f47920b.f48285a.E().f47837q.a(false);
    }
}

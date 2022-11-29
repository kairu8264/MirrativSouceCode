package pi;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hi.pc;

/* loaded from: classes3.dex */
public final class l9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m9 f48031a;

    public l9(m9 m9Var) {
        this.f48031a = m9Var;
    }

    public final void a() {
        this.f48031a.f();
        if (this.f48031a.f48285a.E().u(this.f48031a.f48285a.c().currentTimeMillis())) {
            this.f48031a.f48285a.E().f47832l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f48031a.f48285a.r().u().a("Detected application was in foreground");
                c(this.f48031a.f48285a.c().currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        this.f48031a.f();
        this.f48031a.q();
        if (this.f48031a.f48285a.E().u(j10)) {
            this.f48031a.f48285a.E().f47832l.a(true);
        }
        this.f48031a.f48285a.E().f47835o.b(j10);
        if (this.f48031a.f48285a.E().f47832l.b()) {
            c(j10, z10);
        }
    }

    public final void c(long j10, boolean z10) {
        this.f48031a.f();
        if (this.f48031a.f48285a.m()) {
            this.f48031a.f48285a.E().f47835o.b(j10);
            this.f48031a.f48285a.r().u().b("Session started, time", Long.valueOf(this.f48031a.f48285a.c().elapsedRealtime()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f48031a.f48285a.I().N(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", valueOf, j10);
            this.f48031a.f48285a.E().f47832l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f48031a.f48285a.y().A(null, c3.f47699f0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f48031a.f48285a.I().u(TtmlNode.TEXT_EMPHASIS_AUTO, "_s", j10, bundle);
            pc.b();
            if (this.f48031a.f48285a.y().A(null, c3.f47707j0)) {
                String a10 = this.f48031a.f48285a.E().f47840t.a();
                if (TextUtils.isEmpty(a10)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                this.f48031a.f48285a.I().u(TtmlNode.TEXT_EMPHASIS_AUTO, "_ssr", j10, bundle2);
            }
        }
    }
}

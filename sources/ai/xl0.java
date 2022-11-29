package ai;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class xl0 {

    /* renamed from: b  reason: collision with root package name */
    public long f11986b;

    /* renamed from: a  reason: collision with root package name */
    public final long f11985a = TimeUnit.MILLISECONDS.toNanos(((Long) ft.c().c(ox.f8132y)).longValue());

    /* renamed from: c  reason: collision with root package name */
    public boolean f11987c = true;

    public final void a() {
        this.f11987c = true;
    }

    public final void b(SurfaceTexture surfaceTexture, jl0 jl0Var) {
        if (jl0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f11987c || Math.abs(timestamp - this.f11986b) >= this.f11985a) {
            this.f11987c = false;
            this.f11986b = timestamp;
            yg.d2.f61866i.post(new wl0(this, jl0Var));
        }
    }
}

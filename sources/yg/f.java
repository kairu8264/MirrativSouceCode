package yg;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f61881a = false;

    /* renamed from: b  reason: collision with root package name */
    public float f61882b = 1.0f;

    public static float e(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void a(float f10) {
        this.f61882b = f10;
    }

    public final synchronized float b() {
        if (f()) {
            return this.f61882b;
        }
        return 1.0f;
    }

    public final synchronized void c(boolean z10) {
        this.f61881a = z10;
    }

    public final synchronized boolean d() {
        return this.f61881a;
    }

    public final synchronized boolean f() {
        return this.f61882b >= 0.0f;
    }
}

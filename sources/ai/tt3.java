package ai;

import android.view.Surface;

/* loaded from: classes3.dex */
public final class tt3 {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            oa.b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}

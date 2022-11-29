package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* loaded from: classes3.dex */
public final class bk extends Surface {

    /* renamed from: y  reason: collision with root package name */
    public static boolean f2379y;

    /* renamed from: z  reason: collision with root package name */
    public static boolean f2380z;

    /* renamed from: w  reason: collision with root package name */
    public final zj f2381w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2382x;

    public /* synthetic */ bk(zj zjVar, SurfaceTexture surfaceTexture, boolean z10, ak akVar) {
        super(surfaceTexture);
        this.f2381w = zjVar;
    }

    public static synchronized boolean a(Context context) {
        boolean z10;
        synchronized (bk.class) {
            if (!f2380z) {
                int i10 = vj.f11100a;
                if (i10 >= 17) {
                    boolean z11 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i10 == 24) {
                            String str = vj.f11103d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z11 = true;
                    }
                    f2379y = z11;
                }
                f2380z = true;
            }
            z10 = f2379y;
        }
        return z10;
    }

    public static bk b(Context context, boolean z10) {
        if (vj.f11100a >= 17) {
            boolean z11 = true;
            if (z10 && !a(context)) {
                z11 = false;
            }
            fj.d(z11);
            return new zj().a(z10);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f2381w) {
            if (!this.f2382x) {
                this.f2381w.b();
                this.f2382x = true;
            }
        }
    }
}

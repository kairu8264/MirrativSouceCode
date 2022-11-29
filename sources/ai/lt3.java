package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class lt3 extends Surface {
    public static boolean A;

    /* renamed from: z  reason: collision with root package name */
    public static int f6662z;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f6663w;

    /* renamed from: x  reason: collision with root package name */
    public final jt3 f6664x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6665y;

    public /* synthetic */ lt3(jt3 jt3Var, SurfaceTexture surfaceTexture, boolean z10, kt3 kt3Var) {
        super(surfaceTexture);
        this.f6664x = jt3Var;
        this.f6663w = z10;
    }

    public static synchronized boolean a(Context context) {
        int i10;
        String eglQueryString;
        String eglQueryString2;
        synchronized (lt3.class) {
            if (!A) {
                int i11 = sb.f9778a;
                int i12 = 2;
                if (i11 >= 24 && ((i11 >= 26 || (!"samsung".equals(sb.f9780c) && !"XT1650".equals(sb.f9781d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (i11 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i12 = 1;
                    }
                    f6662z = i12;
                    A = true;
                }
                i12 = 0;
                f6662z = i12;
                A = true;
            }
            i10 = f6662z;
        }
        return i10 != 0;
    }

    public static lt3 b(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !a(context)) {
            z11 = false;
        }
        u9.d(z11);
        return new jt3().a(z10 ? f6662z : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f6664x) {
            if (!this.f6665y) {
                this.f6664x.b();
                this.f6665y = true;
            }
        }
    }
}

package ai;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.ads.zzaky;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ca implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] C = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLSurface A;
    public SurfaceTexture B;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f2763w;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2764x = new int[1];

    /* renamed from: y  reason: collision with root package name */
    public EGLDisplay f2765y;

    /* renamed from: z  reason: collision with root package name */
    public EGLContext f2766z;

    public ca(Handler handler, ba baVar) {
        this.f2763w = handler;
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f2765y = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, C, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (eglChooseConfig && iArr2[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f2765y, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                    if (eglCreateContext != null) {
                        this.f2766z = eglCreateContext;
                        EGLDisplay eGLDisplay = this.f2765y;
                        if (i10 == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new zzaky("eglCreatePbufferSurface failed", null);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            this.A = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f2764x, 0);
                            int i11 = 0;
                            while (true) {
                                int glGetError = GLES20.glGetError();
                                if (glGetError == 0) {
                                    break;
                                }
                                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                                Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
                                i11 = glGetError;
                            }
                            if (i11 != 0) {
                                String valueOf2 = String.valueOf(GLU.gluErrorString(i11));
                                Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
                            }
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2764x[0]);
                            this.B = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new zzaky("eglMakeCurrent failed", null);
                    }
                    throw new zzaky("eglCreateContext failed", null);
                }
                throw new zzaky(sb.a0("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
            }
            throw new zzaky("eglInitialize failed", null);
        }
        throw new zzaky("eglGetDisplay failed", null);
    }

    public final void b() {
        this.f2763w.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.B;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f2764x, 0);
            }
            EGLDisplay eGLDisplay = this.f2765y;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f2765y;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.A;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f2765y, this.A);
            }
            EGLContext eGLContext = this.f2766z;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f2765y, eGLContext);
            }
            if (sb.f9778a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f2765y;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f2765y);
            }
            this.f2765y = null;
            this.f2766z = null;
            this.A = null;
            this.B = null;
        } catch (Throwable th2) {
            EGLDisplay eGLDisplay4 = this.f2765y;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f2765y;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.A;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f2765y, this.A);
            }
            EGLContext eGLContext2 = this.f2766z;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f2765y, eGLContext2);
            }
            if (sb.f9778a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f2765y;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f2765y);
            }
            this.f2765y = null;
            this.f2766z = null;
            this.A = null;
            this.B = null;
            throw th2;
        }
    }

    public final SurfaceTexture c() {
        SurfaceTexture surfaceTexture = this.B;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f2763w.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.B;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

package ai;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public final class zj extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    public RuntimeException A;
    public bk B;

    /* renamed from: w  reason: collision with root package name */
    public final int[] f13009w;

    /* renamed from: x  reason: collision with root package name */
    public Handler f13010x;

    /* renamed from: y  reason: collision with root package name */
    public SurfaceTexture f13011y;

    /* renamed from: z  reason: collision with root package name */
    public Error f13012z;

    public zj() {
        super("dummySurface");
        this.f13009w = new int[1];
    }

    public final bk a(boolean z10) {
        boolean z11;
        start();
        this.f13010x = new Handler(getLooper(), this);
        synchronized (this) {
            z11 = false;
            this.f13010x.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            while (this.B == null && this.A == null && this.f13012z == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.A;
        if (runtimeException == null) {
            Error error = this.f13012z;
            if (error == null) {
                return this.B;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void b() {
        this.f13010x.sendEmptyMessage(3);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f13011y.updateTexImage();
                    return true;
                } else if (i10 != 3) {
                    return true;
                } else {
                    try {
                        this.f13011y.release();
                        this.B = null;
                        this.f13011y = null;
                        GLES20.glDeleteTextures(1, this.f13009w, 0);
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
            }
            try {
                boolean z10 = message.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                fj.e(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                fj.e(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                fj.e(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z10 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                fj.e(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z10 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                fj.e(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                fj.e(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f13009w, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13009w[0]);
                this.f13011y = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.B = new bk(this, this.f13011y, z10, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e10);
                this.f13012z = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e11);
                this.A = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13010x.sendEmptyMessage(2);
    }
}

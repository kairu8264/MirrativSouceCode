package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class bm0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, zl0 {
    public static final float[] X = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public final float[] D;
    public float E;
    public float F;
    public float G;
    public int H;
    public int I;
    public SurfaceTexture J;
    public SurfaceTexture K;
    public int L;
    public int M;
    public int N;
    public final FloatBuffer O;
    public final CountDownLatch P;
    public final Object Q;
    public EGL10 R;
    public EGLDisplay S;
    public EGLContext T;
    public EGLSurface U;
    public volatile boolean V;
    public volatile boolean W;

    /* renamed from: w  reason: collision with root package name */
    public final am0 f2398w;

    /* renamed from: x  reason: collision with root package name */
    public final float[] f2399x;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f2400y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f2401z;

    public bm0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = X;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.O = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f2399x = new float[9];
        this.f2400y = new float[9];
        this.f2401z = new float[9];
        this.A = new float[9];
        this.B = new float[9];
        this.C = new float[9];
        this.D = new float[9];
        this.E = Float.NaN;
        am0 am0Var = new am0(context);
        this.f2398w = am0Var;
        am0Var.c(this);
        this.P = new CountDownLatch(1);
        this.Q = new Object();
    }

    public static final void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 21);
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(glGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    public static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    public static final void i(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    public static final void j(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int k(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Could not compile shader ");
                sb2.append(i10);
                sb2.append(":");
                Log.e("SphericalVideoRenderer", sb2.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.I = i10;
        this.H = i11;
        this.K = surfaceTexture;
    }

    public final void b(int i10, int i11) {
        synchronized (this.Q) {
            this.I = i10;
            this.H = i11;
            this.V = true;
            this.Q.notifyAll();
        }
    }

    public final void c() {
        synchronized (this.Q) {
            this.W = true;
            this.K = null;
            this.Q.notifyAll();
        }
    }

    public final SurfaceTexture d() {
        if (this.K == null) {
            return null;
        }
        try {
            this.P.await();
        } catch (InterruptedException unused) {
        }
        return this.J;
    }

    public final void e(float f10, float f11) {
        int i10 = this.I;
        int i11 = this.H;
        float f12 = i10 > i11 ? i10 : i11;
        this.F -= (f10 * 1.7453293f) / f12;
        float f13 = this.G - ((f11 * 1.7453293f) / f12);
        this.G = f13;
        if (f13 < -1.5707964f) {
            this.G = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.G = 1.5707964f;
        }
    }

    public final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.U;
        boolean z10 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z10 = this.R.eglDestroySurface(this.S, this.U) | this.R.eglMakeCurrent(this.S, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.U = null;
        }
        EGLContext eGLContext = this.T;
        if (eGLContext != null) {
            z10 |= this.R.eglDestroyContext(this.S, eGLContext);
            this.T = null;
        }
        EGLDisplay eGLDisplay = this.S;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.R.eglTerminate(eGLDisplay);
            this.S = null;
            return eglTerminate | z10;
        }
        return z10;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.N++;
        synchronized (this.Q) {
            this.Q.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf A[ADDED_TO_REGION] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.bm0.run():void");
    }

    @Override // ai.zl0
    public final void zza() {
        synchronized (this.Q) {
            this.Q.notifyAll();
        }
    }
}

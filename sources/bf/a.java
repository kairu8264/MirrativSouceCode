package bf;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0125a f18322e = new C0125a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18323f = 8;

    /* renamed from: a  reason: collision with root package name */
    public EGLContext f18324a;

    /* renamed from: b  reason: collision with root package name */
    public EGLConfig f18325b;

    /* renamed from: c  reason: collision with root package name */
    public EGLContext f18326c;

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f18327d;

    /* renamed from: bf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0125a {
        public C0125a() {
        }

        public /* synthetic */ C0125a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f18328a;

        /* renamed from: b  reason: collision with root package name */
        public EGLSurface f18329b;

        public b(a aVar, Surface surface) {
            p.h(aVar, "egl");
            p.h(surface, "surface");
            this.f18329b = EGL14.EGL_NO_SURFACE;
            this.f18328a = aVar;
            this.f18329b = aVar.i(surface);
        }

        public final void a() {
            this.f18328a.m(this.f18329b);
        }

        public final void b() {
            this.f18328a.k(this.f18329b);
            this.f18329b = EGL14.EGL_NO_SURFACE;
        }

        public final void c(long j10) {
            EGLExt.eglPresentationTimeANDROID(this.f18328a.f18327d, this.f18329b, j10);
        }

        public final void d() {
            this.f18328a.o(this.f18329b);
        }
    }

    public a(EGLContext eGLContext, boolean z10) {
        this.f18324a = eGLContext;
        this.f18326c = EGL14.EGL_NO_CONTEXT;
        this.f18327d = EGL14.EGL_NO_DISPLAY;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f18327d = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLContext eGLContext2 = this.f18324a;
                this.f18324a = eGLContext2 == null ? EGL14.EGL_NO_CONTEXT : eGLContext2;
                if (this.f18326c == EGL14.EGL_NO_CONTEXT) {
                    EGLConfig l10 = l(z10);
                    this.f18325b = l10;
                    if (l10 != null) {
                        this.f18326c = g(this.f18324a);
                    } else {
                        throw new RuntimeException("chooseConfig failed");
                    }
                }
                EGL14.eglQueryContext(this.f18327d, this.f18326c, 12440, new int[1], 0);
                return;
            }
            this.f18327d = null;
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }

    public final void f(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public final EGLContext g(EGLContext eGLContext) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f18327d, this.f18325b, eGLContext, new int[]{12440, 2, 12344}, 0);
        f("eglCreateContext");
        p.g(eglCreateContext, "context");
        return eglCreateContext;
    }

    public final b h(Surface surface) {
        if (surface == null) {
            return null;
        }
        return new b(this, surface);
    }

    public final EGLSurface i(Object obj) {
        try {
            return EGL14.eglCreateWindowSurface(this.f18327d, this.f18325b, obj, new int[]{12344}, 0);
        } catch (IllegalArgumentException e10) {
            Log.e("EGLBase", "eglCreateWindowSurface", e10);
            return null;
        } catch (UnsupportedOperationException e11) {
            Log.e("EGLBase", "eglCreateWindowSurface", e11);
            return null;
        }
    }

    public final void j() {
        if (!EGL14.eglDestroyContext(this.f18327d, this.f18326c)) {
            Log.e("DefaultContextFactory", "display:" + this.f18327d + " context: " + this.f18326c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("eglDestroyContex:");
            sb2.append(EGL14.eglGetError());
            Log.e("EGLBase", sb2.toString());
        }
        this.f18326c = EGL14.EGL_NO_CONTEXT;
    }

    public final void k(EGLSurface eGLSurface) {
        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            EGL14.eglMakeCurrent(this.f18327d, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f18327d, eGLSurface);
        }
    }

    public final EGLConfig l(boolean z10) {
        int[] iArr = new int[15];
        iArr[0] = 12352;
        iArr[1] = 4;
        iArr[2] = 12324;
        iArr[3] = 8;
        iArr[4] = 12323;
        iArr[5] = 8;
        iArr[6] = 12322;
        iArr[7] = 8;
        iArr[8] = 12321;
        iArr[9] = 8;
        iArr[10] = 12610;
        iArr[11] = 1;
        iArr[12] = z10 ? 12325 : 12344;
        iArr[13] = z10 ? 16 : 0;
        iArr[14] = 12344;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f18327d, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            Log.w("EGLBase", "unable to find RGBA8888 /  EGLConfig");
            return null;
        }
        return eGLConfigArr[0];
    }

    public final boolean m(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.f18327d;
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f18326c)) {
                return true;
            }
            Log.w("TAG", "eglMakeCurrent" + EGL14.eglGetError());
            return false;
        }
        if (EGL14.eglGetError() == 12299) {
            Log.e("EGLBase", "makeCurrent:returned EGL_BAD_NATIVE_WINDOW.");
        }
        return false;
    }

    public final void n() {
        if (this.f18327d != EGL14.EGL_NO_DISPLAY) {
            j();
            EGL14.eglTerminate(this.f18327d);
            EGL14.eglReleaseThread();
        }
        this.f18327d = EGL14.EGL_NO_DISPLAY;
        this.f18326c = EGL14.EGL_NO_CONTEXT;
    }

    public final int o(EGLSurface eGLSurface) {
        if (EGL14.eglSwapBuffers(this.f18327d, eGLSurface)) {
            return 12288;
        }
        return EGL14.eglGetError();
    }
}

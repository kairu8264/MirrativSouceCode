package com.mirrativ.llstream.decoder;

import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class SurfaceUtil {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ void clearSurface$default(Companion companion, Object obj, int i10, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                i10 = Color.argb(255, 39, 39, 39);
            }
            companion.clearSurface(obj, i10);
        }

        public final void clearSurface(Object obj, int i10) {
            if (obj == null) {
                return;
            }
            if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
                EGL egl = EGLContext.getEGL();
                p.f(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
                EGL10 egl10 = (EGL10) egl;
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, null);
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, obj, new int[]{12344});
                egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
                GLES20.glClearColor(((i10 >> 16) & 255) / 255.0f, ((i10 >> 8) & 255) / 255.0f, (i10 & 255) / 255.0f, ((i10 >> 24) & 255) / 255.0f);
                GLES20.glClear(16384);
                egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
                egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
                egl10.eglTerminate(eglGetDisplay);
            }
        }
    }
}

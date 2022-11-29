package com.dena.showroom.flvplayback.impl.util;

import android.opengl.GLES20;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes3.dex */
public class SurfaceUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f26628a = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344};

    public static void clear(SurfaceHolder surfaceHolder) {
        if (surfaceHolder.getSurface() == null || !surfaceHolder.getSurface().isValid()) {
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, f26628a, eGLConfigArr, 1, new int[1]);
        EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfigArr[0], surfaceHolder, null);
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, null);
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
    }
}

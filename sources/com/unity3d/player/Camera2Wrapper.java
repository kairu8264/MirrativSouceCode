package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;

/* loaded from: classes4.dex */
public class Camera2Wrapper implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f28331a;

    /* renamed from: b  reason: collision with root package name */
    private b f28332b = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f28333c = 100;

    public Camera2Wrapper(Context context) {
        this.f28331a = context;
        initCamera2Jni();
    }

    private static int a(float f10) {
        return (int) Math.min(Math.max((f10 * 2000.0f) - 1000.0f, -900.0f), 900.0f);
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i10, int i11, int i12);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    @Override // com.unity3d.player.c
    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    @Override // com.unity3d.player.c
    public final void a(Object obj, Object obj2, Object obj3, int i10, int i11, int i12) {
        nativeFrameReady(obj, obj2, obj3, i10, i11, i12);
    }

    public void closeCamera2() {
        b bVar = this.f28332b;
        if (bVar != null) {
            bVar.b();
        }
        this.f28332b = null;
    }

    public int getCamera2Count() {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return b.a(this.f28331a);
        }
        return 0;
    }

    public int getCamera2FocalLengthEquivalent(int i10) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return b.d(this.f28331a, i10);
        }
        return 0;
    }

    public int[] getCamera2Resolutions(int i10) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return b.e(this.f28331a, i10);
        }
        return null;
    }

    public int getCamera2SensorOrientation(int i10) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return b.a(this.f28331a, i10);
        }
        return 0;
    }

    public Object getCameraFocusArea(float f10, float f11) {
        int a10 = a(f10);
        int a11 = a(1.0f - f11);
        return new Camera.Area(new Rect(a10 - 100, a11 - 100, a10 + 100, a11 + 100), 1000);
    }

    public Rect getFrameSizeCamera2() {
        b bVar = this.f28332b;
        return bVar != null ? bVar.a() : new Rect();
    }

    public boolean initializeCamera2(int i10, int i11, int i12, int i13, int i14) {
        if (PlatformSupport.LOLLIPOP_SUPPORT && this.f28332b == null && UnityPlayer.currentActivity != null) {
            b bVar = new b(this);
            this.f28332b = bVar;
            return bVar.a(this.f28331a, i10, i11, i12, i13, i14);
        }
        return false;
    }

    public boolean isCamera2AutoFocusPointSupported(int i10) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return b.c(this.f28331a, i10);
        }
        return false;
    }

    public boolean isCamera2FrontFacing(int i10) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return b.b(this.f28331a, i10);
        }
        return false;
    }

    public void pauseCamera2() {
        b bVar = this.f28332b;
        if (bVar != null) {
            bVar.d();
        }
    }

    public boolean setAutoFocusPoint(float f10, float f11) {
        b bVar;
        if (!PlatformSupport.LOLLIPOP_SUPPORT || (bVar = this.f28332b) == null) {
            return false;
        }
        return bVar.a(f10, f11);
    }

    public void startCamera2() {
        b bVar = this.f28332b;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void stopCamera2() {
        b bVar = this.f28332b;
        if (bVar != null) {
            bVar.e();
        }
    }
}

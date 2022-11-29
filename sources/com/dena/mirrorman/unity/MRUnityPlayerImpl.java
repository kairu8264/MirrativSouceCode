package com.dena.mirrorman.unity;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.dena.mirrorman.unity.MRUnityPlayerEvent;
import com.unity3d.player.UnityPlayer;
import dq.c;
import g9.a;
import java.lang.reflect.Field;
import jo.p;

/* loaded from: classes3.dex */
public final class MRUnityPlayerImpl implements MRUnityPlayer {
    public static final int $stable = 8;
    private final UnityPlayer unityPlayer;

    public MRUnityPlayerImpl(UnityPlayer unityPlayer) {
        p.h(unityPlayer, "unityPlayer");
        this.unityPlayer = unityPlayer;
    }

    @Override // com.dena.mirrorman.unity.MRUnityPlayer
    public void pause() {
        this.unityPlayer.pause();
        c.c().l(MRUnityPlayerEvent.PauseUnity.INSTANCE);
    }

    @Override // com.dena.mirrorman.unity.MRUnityPlayer
    public void resume() {
        this.unityPlayer.resume();
        c.c().l(MRUnityPlayerEvent.ResumeUnity.INSTANCE);
    }

    @Override // com.dena.mirrorman.unity.MRUnityPlayer
    public void start(FrameLayout frameLayout) {
        p.h(frameLayout, "parent");
        try {
            Field declaredField = this.unityPlayer.getClass().getDeclaredField("mGlView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.unityPlayer);
            p.f(obj, "null cannot be cast to non-null type android.view.SurfaceView");
            ((SurfaceView) obj).setZOrderOnTop(false);
            ViewParent parent = this.unityPlayer.getView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.unityPlayer.getView());
            }
            frameLayout.addView(this.unityPlayer.getView(), -1, -1);
            resume();
            this.unityPlayer.windowFocusChanged(true);
        } catch (Throwable th2) {
            a.c(th2);
        }
    }

    @Override // com.dena.mirrorman.unity.MRUnityPlayer
    public void startWithAlpha(FrameLayout frameLayout) {
        p.h(frameLayout, "parent");
        try {
            Field declaredField = this.unityPlayer.getClass().getDeclaredField("mGlView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.unityPlayer);
            p.f(obj, "null cannot be cast to non-null type android.view.SurfaceView");
            SurfaceView surfaceView = (SurfaceView) obj;
            surfaceView.setZOrderOnTop(true);
            surfaceView.getHolder().setFormat(-2);
            ViewParent parent = this.unityPlayer.getView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.unityPlayer.getView());
            }
            frameLayout.addView(this.unityPlayer.getView(), -1, -1);
            resume();
            this.unityPlayer.windowFocusChanged(true);
        } catch (Throwable th2) {
            a.c(th2);
        }
    }

    @Override // com.dena.mirrorman.unity.MRUnityPlayer
    public void stop() {
        try {
            pause();
            ViewGroup viewGroup = (ViewGroup) this.unityPlayer.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.unityPlayer.getView());
            }
        } catch (Throwable th2) {
            a.c(th2);
        }
    }
}

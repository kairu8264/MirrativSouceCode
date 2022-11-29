package com.unity3d.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    public Activity f28506b;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f28505a = new WeakReference(null);

    /* renamed from: c  reason: collision with root package name */
    public View f28507c = null;

    /* loaded from: classes4.dex */
    public class a extends View implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f28508a;

        public a(Context context) {
            super(context);
        }

        public final void a(SurfaceView surfaceView) {
            Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            this.f28508a = createBitmap;
            PixelCopy.request(surfaceView, createBitmap, this, new Handler(Looper.getMainLooper()));
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(-16777216), new BitmapDrawable(getResources(), this.f28508a)}));
            }
        }
    }

    public f(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f28506b = activity;
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a() {
        Activity activity = this.f28506b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void a(SurfaceView surfaceView) {
        if (PlatformSupport.NOUGAT_SUPPORT && this.f28505a.get() != this.f28506b && this.f28507c == null) {
            a aVar = new a(this.f28506b);
            aVar.a(surfaceView);
            this.f28507c = aVar;
        }
    }

    public final void a(ViewGroup viewGroup) {
        View view = this.f28507c;
        if (view == null || view.getParent() != null) {
            return;
        }
        viewGroup.addView(this.f28507c);
        viewGroup.bringChildToFront(this.f28507c);
    }

    public final void b(ViewGroup viewGroup) {
        View view = this.f28507c;
        if (view == null || view.getParent() == null) {
            return;
        }
        viewGroup.removeView(this.f28507c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f28505a = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

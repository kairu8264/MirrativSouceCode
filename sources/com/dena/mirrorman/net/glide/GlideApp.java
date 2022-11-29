package com.dena.mirrorman.net.glide;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.File;

/* loaded from: classes2.dex */
public final class GlideApp {
    private GlideApp() {
    }

    @SuppressLint({"VisibleForTests"})
    public static void enableHardwareBitmaps() {
        c.c();
    }

    public static c get(Context context) {
        return c.d(context);
    }

    public static File getPhotoCacheDir(Context context) {
        return c.k(context);
    }

    @SuppressLint({"VisibleForTests"})
    @Deprecated
    public static void init(c cVar) {
        c.q(cVar);
    }

    @SuppressLint({"VisibleForTests"})
    public static void tearDown() {
        c.v();
    }

    public static GlideRequests with(Context context) {
        return (GlideRequests) c.B(context);
    }

    public static File getPhotoCacheDir(Context context, String str) {
        return c.l(context, str);
    }

    @SuppressLint({"VisibleForTests"})
    public static void init(Context context, d dVar) {
        c.p(context, dVar);
    }

    public static GlideRequests with(Activity activity) {
        return (GlideRequests) c.z(activity);
    }

    public static GlideRequests with(h hVar) {
        return (GlideRequests) c.E(hVar);
    }

    public static GlideRequests with(Fragment fragment) {
        return (GlideRequests) c.D(fragment);
    }

    @Deprecated
    public static GlideRequests with(android.app.Fragment fragment) {
        return (GlideRequests) c.A(fragment);
    }

    public static GlideRequests with(View view) {
        return (GlideRequests) c.C(view);
    }
}

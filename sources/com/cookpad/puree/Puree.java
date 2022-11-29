package com.cookpad.puree;

import android.util.Log;
import k8.a;

/* loaded from: classes.dex */
public class Puree {

    /* renamed from: a  reason: collision with root package name */
    public static final String f20160a = "Puree";

    /* renamed from: b  reason: collision with root package name */
    public static PureeLogger f20161b;

    /* loaded from: classes.dex */
    public static class NotInitializedException extends IllegalStateException {
    }

    public static void a() {
        if (f20161b == null) {
            throw new NotInitializedException();
        }
    }

    public static void b() {
        a();
        f20161b.a();
    }

    public static synchronized void c(a aVar) {
        synchronized (Puree.class) {
            if (f20161b != null) {
                Log.w(f20160a, "Puree has already been initialized; re-initialize it with the configuration");
            }
            e(aVar.a());
        }
    }

    public static void d(Object obj) {
        a();
        f20161b.g(obj);
    }

    public static void e(PureeLogger pureeLogger) {
        f20161b = pureeLogger;
    }
}

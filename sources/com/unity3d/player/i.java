package com.unity3d.player;

import android.os.Build;
import java.lang.Thread;

/* loaded from: classes4.dex */
final class i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private volatile Thread.UncaughtExceptionHandler f28529a;

    public final synchronized boolean a() {
        boolean z10;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            z10 = false;
        } else {
            this.f28529a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
            z10 = true;
        }
        return z10;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        try {
            Error error = new Error(String.format("FATAL EXCEPTION [%s]\n", thread.getName()) + String.format("Unity version     : %s\n", "2020.3.17f1") + String.format("Device model      : %s %s\n", Build.MANUFACTURER, Build.MODEL) + String.format("Device fingerprint: %s\n", Build.FINGERPRINT) + String.format("Build Type        : %s\n", "Release") + String.format("Scripting Backend : %s\n", "IL2CPP") + String.format("ABI               : %s\n", Build.CPU_ABI) + String.format("Strip Engine Code : %s\n", Boolean.TRUE));
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th2);
            this.f28529a.uncaughtException(thread, error);
        } catch (Throwable unused) {
            this.f28529a.uncaughtException(thread, th2);
        }
    }
}

package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import hi.x2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pi.j7;
import rh.p;
import sk.a;
import vi.j;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f27942b;

    /* renamed from: a  reason: collision with root package name */
    public final x2 f27943a;

    public FirebaseAnalytics(x2 x2Var) {
        p.i(x2Var);
        this.f27943a = x2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f27942b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f27942b == null) {
                    f27942b = new FirebaseAnalytics(x2.u(context, null, null, null, null));
                }
            }
        }
        return f27942b;
    }

    @Keep
    public static j7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        x2 u10 = x2.u(context, null, null, null, bundle);
        if (u10 == null) {
            return null;
        }
        return new a(u10);
    }

    public void a(String str, Bundle bundle) {
        this.f27943a.J(str, bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) j.b(com.google.firebase.installations.a.n().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f27943a.e(activity, str, str2);
    }
}

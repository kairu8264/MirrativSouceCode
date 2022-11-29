package pi;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import pi.b9;

/* loaded from: classes3.dex */
public final class c9<T extends Context & b9> {

    /* renamed from: a  reason: collision with root package name */
    public final T f47749a;

    public c9(T t10) {
        rh.p.i(t10);
        this.f47749a = t10;
    }

    public final int a(final Intent intent, int i10, final int i11) {
        b5 H = b5.H(this.f47749a, null, null);
        final q3 r10 = H.r();
        if (intent == null) {
            r10.v().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.b();
        r10.u().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: pi.y8
                @Override // java.lang.Runnable
                public final void run() {
                    c9.this.c(i11, r10, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().p().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new u5(ba.e0(this.f47749a), null);
        }
        k().v().b("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void c(int i10, q3 q3Var, Intent intent) {
        if (this.f47749a.F(i10)) {
            q3Var.u().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            k().u().a("Completed wakeful intent.");
            this.f47749a.a(intent);
        }
    }

    public final /* synthetic */ void d(q3 q3Var, JobParameters jobParameters) {
        q3Var.u().a("AppMeasurementJobService processed last upload request.");
        this.f47749a.b(jobParameters, false);
    }

    public final void e() {
        b5 H = b5.H(this.f47749a, null, null);
        q3 r10 = H.r();
        H.b();
        r10.u().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        b5 H = b5.H(this.f47749a, null, null);
        q3 r10 = H.r();
        H.b();
        r10.u().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().p().a("onRebind called with null intent");
            return;
        }
        k().u().b("onRebind called. action", intent.getAction());
    }

    public final void h(Runnable runnable) {
        ba e02 = ba.e0(this.f47749a);
        e02.a().y(new a9(this, e02, runnable));
    }

    @TargetApi(24)
    public final boolean i(final JobParameters jobParameters) {
        b5 H = b5.H(this.f47749a, null, null);
        final q3 r10 = H.r();
        String string = jobParameters.getExtras().getString(ActionLogBase.ACTION);
        H.b();
        r10.u().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            h(new Runnable() { // from class: pi.z8
                @Override // java.lang.Runnable
                public final void run() {
                    c9.this.d(r10, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().p().a("onUnbind called with null intent");
            return true;
        }
        k().u().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final q3 k() {
        return b5.H(this.f47749a, null, null).r();
    }
}

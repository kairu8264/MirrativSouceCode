package pi;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;

/* loaded from: classes3.dex */
public final class p9 extends r9 {

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f48137d;

    /* renamed from: e  reason: collision with root package name */
    public n f48138e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f48139f;

    public p9(ba baVar) {
        super(baVar);
        this.f48137d = (AlarmManager) this.f48285a.F().getSystemService("alarm");
    }

    @Override // pi.r9
    public final boolean j() {
        AlarmManager alarmManager = this.f48137d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            p();
            return false;
        }
        return false;
    }

    public final void k() {
        g();
        this.f48285a.r().u().a("Unscheduling upload");
        AlarmManager alarmManager = this.f48137d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        o().b();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }

    public final void l(long j10) {
        g();
        this.f48285a.b();
        Context F = this.f48285a.F();
        if (!ia.X(F)) {
            this.f48285a.r().o().a("Receiver not registered/enabled");
        }
        if (!ia.Y(F, false)) {
            this.f48285a.r().o().a("Service not registered/enabled");
        }
        k();
        this.f48285a.r().u().b("Scheduling upload, millis", Long.valueOf(j10));
        long elapsedRealtime = this.f48285a.c().elapsedRealtime() + j10;
        this.f48285a.y();
        if (j10 < Math.max(0L, c3.f47736y.a(null).longValue()) && !o().e()) {
            o().d(j10);
        }
        this.f48285a.b();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f48137d;
            if (alarmManager != null) {
                this.f48285a.y();
                alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(c3.f47726t.a(null).longValue(), j10), n());
                return;
            }
            return;
        }
        Context F2 = this.f48285a.F();
        ComponentName componentName = new ComponentName(F2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m10 = m();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(ActionLogBase.ACTION, "com.google.android.gms.measurement.UPLOAD");
        hi.v0.a(F2, new JobInfo.Builder(m10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final int m() {
        if (this.f48139f == null) {
            String valueOf = String.valueOf(this.f48285a.F().getPackageName());
            this.f48139f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f48139f.intValue();
    }

    public final PendingIntent n() {
        Context F = this.f48285a.F();
        return hi.u0.a(F, 0, new Intent().setClassName(F, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), hi.u0.f36008a);
    }

    public final n o() {
        if (this.f48138e == null) {
            this.f48138e = new o9(this, this.f48179b.b0());
        }
        return this.f48138e;
    }

    @TargetApi(24)
    public final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f48285a.F().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }
}

package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k5.j;
import l5.b;
import l5.i;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: y  reason: collision with root package name */
    public static final String f16612y = j.f("SystemJobService");

    /* renamed from: w  reason: collision with root package name */
    public i f16613w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, JobParameters> f16614x = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        JobParameters remove;
        j.c().a(f16612y, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f16614x) {
            remove = this.f16614x.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i k10 = i.k(getApplicationContext());
            this.f16613w = k10;
            k10.m().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                j.c().h(f16612y, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f16613w;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f16613w == null) {
            j.c().a(f16612y, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            j.c().b(f16612y, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f16614x) {
            if (this.f16614x.containsKey(a10)) {
                j.c().a(f16612y, String.format("Job is already being executed by SystemJobService: %s", a10), new Throwable[0]);
                return false;
            }
            j.c().a(f16612y, String.format("onStartJob for %s", a10), new Throwable[0]);
            this.f16614x.put(a10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f16529b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f16528a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    aVar.f16530c = jobParameters.getNetwork();
                }
            }
            this.f16613w.v(a10, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f16613w == null) {
            j.c().a(f16612y, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            j.c().b(f16612y, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(f16612y, String.format("onStopJob for %s", a10), new Throwable[0]);
        synchronized (this.f16614x) {
            this.f16614x.remove(a10);
        }
        this.f16613w.x(a10);
        return !this.f16613w.m().f(a10);
    }
}

package kg;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes3.dex */
public class e implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38753a;

    /* renamed from: b  reason: collision with root package name */
    public final lg.d f38754b;

    /* renamed from: c  reason: collision with root package name */
    public final g f38755c;

    public e(Context context, lg.d dVar, g gVar) {
        this.f38753a = context;
        this.f38754b = dVar;
        this.f38755c = gVar;
    }

    @Override // kg.y
    public void a(cg.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // kg.y
    public void b(cg.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f38753a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f38753a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            hg.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long Q = this.f38754b.Q(oVar);
        JobInfo.Builder c11 = this.f38755c.c(new JobInfo.Builder(c10, componentName), oVar.d(), Q, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", og.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        hg.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f38755c.g(oVar.d(), Q, i10)), Long.valueOf(Q), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    public int c(cg.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f38753a.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(oVar.b().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(og.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }
}

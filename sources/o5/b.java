package o5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k5.j;
import k5.n;
import k5.s;
import l5.e;
import l5.i;
import t5.g;
import t5.p;
import t5.q;
import u5.c;

/* loaded from: classes.dex */
public class b implements e {
    public static final String A = j.f("SystemJobScheduler");

    /* renamed from: w  reason: collision with root package name */
    public final Context f44082w;

    /* renamed from: x  reason: collision with root package name */
    public final JobScheduler f44083x;

    /* renamed from: y  reason: collision with root package name */
    public final i f44084y;

    /* renamed from: z  reason: collision with root package name */
    public final a f44085z;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g10) {
            d(jobScheduler, jobInfo.getId());
        }
    }

    public static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            j.c().b(A, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            j.c().b(A, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> b10 = iVar.o().I().b();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                String h10 = h(jobInfo);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = b10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    j.c().a(A, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase o10 = iVar.o();
            o10.e();
            try {
                q L = o10.L();
                for (String str : b10) {
                    L.m(str, -1L);
                }
                o10.A();
            } finally {
                o10.i();
            }
        }
        return z10;
    }

    @Override // l5.e
    public void a(String str) {
        List<Integer> f10 = f(this.f44082w, this.f44083x, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        for (Integer num : f10) {
            d(this.f44083x, num.intValue());
        }
        this.f44084y.o().I().d(str);
    }

    @Override // l5.e
    public boolean c() {
        return true;
    }

    @Override // l5.e
    public void e(p... pVarArr) {
        int d10;
        List<Integer> f10;
        int d11;
        WorkDatabase o10 = this.f44084y.o();
        c cVar = new c(o10);
        for (p pVar : pVarArr) {
            o10.e();
            try {
                p g10 = o10.L().g(pVar.f53192a);
                if (g10 == null) {
                    j.c().h(A, "Skipping scheduling " + pVar.f53192a + " because it's no longer in the DB", new Throwable[0]);
                    o10.A();
                } else if (g10.f53193b != s.a.ENQUEUED) {
                    j.c().h(A, "Skipping scheduling " + pVar.f53192a + " because it is no longer enqueued", new Throwable[0]);
                    o10.A();
                } else {
                    g a10 = o10.I().a(pVar.f53192a);
                    if (a10 != null) {
                        d10 = a10.f53170b;
                    } else {
                        d10 = cVar.d(this.f44084y.i().i(), this.f44084y.i().g());
                    }
                    if (a10 == null) {
                        this.f44084y.o().I().c(new g(pVar.f53192a, d10));
                    }
                    j(pVar, d10);
                    if (Build.VERSION.SDK_INT == 23 && (f10 = f(this.f44082w, this.f44083x, pVar.f53192a)) != null) {
                        int indexOf = f10.indexOf(Integer.valueOf(d10));
                        if (indexOf >= 0) {
                            f10.remove(indexOf);
                        }
                        if (!f10.isEmpty()) {
                            d11 = f10.get(0).intValue();
                        } else {
                            d11 = cVar.d(this.f44084y.i().i(), this.f44084y.i().g());
                        }
                        j(pVar, d11);
                    }
                    o10.A();
                }
                o10.i();
            } catch (Throwable th2) {
                o10.i();
                throw th2;
            }
        }
    }

    public void j(p pVar, int i10) {
        JobInfo a10 = this.f44085z.a(pVar, i10);
        j c10 = j.c();
        String str = A;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f53192a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f44083x.schedule(a10) == 0) {
                j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f53192a), new Throwable[0]);
                if (pVar.f53208q && pVar.f53209r == n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f53208q = false;
                    j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f53192a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f44082w, this.f44083x);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f44084y.o().L().d().size()), Integer.valueOf(this.f44084y.i().h()));
            j.c().b(A, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            j.c().b(A, String.format("Unable to schedule %s", pVar), th2);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f44082w = context;
        this.f44084y = iVar;
        this.f44083x = jobScheduler;
        this.f44085z = aVar;
    }
}

package o5;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import k5.c;
import k5.j;
import k5.k;
import t5.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f44079b = j.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f44080a;

    /* renamed from: o5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0656a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44081a;

        static {
            int[] iArr = new int[k.values().length];
            f44081a = iArr;
            try {
                iArr[k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44081a[k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44081a[k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44081a[k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44081a[k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(Context context) {
        this.f44080a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(c.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    public static int c(k kVar) {
        int i10 = C0656a.f44081a[kVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    j.c().a(f44079b, String.format("API version too low. Cannot convert network type value %s", kVar), new Throwable[0]);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static void d(JobInfo.Builder builder, k kVar) {
        if (Build.VERSION.SDK_INT >= 30 && kVar == k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(kVar));
        }
    }

    public JobInfo a(p pVar, int i10) {
        k5.b bVar = pVar.f53201j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f53192a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f44080a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.f53204m, pVar.f53203l == k5.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f53208q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && bVar.e()) {
            for (c.a aVar : bVar.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z10 = pVar.f53202k > 0;
        if (k3.a.c() && pVar.f53208q && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}

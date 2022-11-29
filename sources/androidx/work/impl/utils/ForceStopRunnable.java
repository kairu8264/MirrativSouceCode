package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k3.a;
import k5.g;
import k5.j;
import k5.s;
import l5.f;
import l5.h;
import l5.i;
import o5.b;
import t5.n;
import t5.p;
import t5.q;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final Context f16636w;

    /* renamed from: x  reason: collision with root package name */
    public final i f16637x;

    /* renamed from: y  reason: collision with root package name */
    public int f16638y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final String f16635z = j.f("ForceStopRunnable");
    public static final long A = TimeUnit.DAYS.toMillis(3650);

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static final String f16639a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.c().g(f16639a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f16636w = context.getApplicationContext();
        this.f16637x = iVar;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, a.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + A;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, d10);
            } else {
                alarmManager.set(0, currentTimeMillis, d10);
            }
        }
    }

    public boolean a() {
        boolean i10 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f16636w, this.f16637x) : false;
        WorkDatabase o10 = this.f16637x.o();
        q L = o10.L();
        n K = o10.K();
        o10.e();
        try {
            List<p> q10 = L.q();
            boolean z10 = (q10 == null || q10.isEmpty()) ? false : true;
            if (z10) {
                for (p pVar : q10) {
                    L.c(s.a.ENQUEUED, pVar.f53192a);
                    L.m(pVar.f53192a, -1L);
                }
            }
            K.a();
            o10.A();
            return z10 || i10;
        } finally {
            o10.i();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            j.c().a(f16635z, "Rescheduling Workers.", new Throwable[0]);
            this.f16637x.s();
            this.f16637x.l().c(false);
        } else if (e()) {
            j.c().a(f16635z, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f16637x.s();
        } else if (a10) {
            j.c().a(f16635z, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f16637x.i(), this.f16637x.o(), this.f16637x.n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            PendingIntent d10 = d(this.f16636w, a.c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f16636w.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (historicalProcessExitReasons.get(i10).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f16636w);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            j.c().h(f16635z, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a i10 = this.f16637x.i();
        if (TextUtils.isEmpty(i10.c())) {
            j.c().a(f16635z, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b10 = u5.f.b(this.f16636w, i10);
        j.c().a(f16635z, String.format("Is default app process = %s", Boolean.valueOf(b10)), new Throwable[0]);
        return b10;
    }

    public boolean h() {
        return this.f16637x.l().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f16636w);
                    j.c().a(f16635z, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                        i10 = this.f16638y + 1;
                        this.f16638y = i10;
                        if (i10 >= 3) {
                            j c10 = j.c();
                            String str = f16635z;
                            c10.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            g d10 = this.f16637x.i().d();
                            if (d10 != null) {
                                j.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                                d10.a(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            j.c().a(f16635z, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                            i(this.f16638y * 300);
                        }
                    }
                    j.c().a(f16635z, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                    i(this.f16638y * 300);
                }
            }
        } finally {
            this.f16637x.r();
        }
    }
}

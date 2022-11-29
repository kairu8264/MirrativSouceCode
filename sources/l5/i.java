package l5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import k5.j;
import k5.m;
import k5.p;
import k5.t;
import k5.u;

/* loaded from: classes.dex */
public class i extends t {

    /* renamed from: j  reason: collision with root package name */
    public static final String f39574j = k5.j.f("WorkManagerImpl");

    /* renamed from: k  reason: collision with root package name */
    public static i f39575k = null;

    /* renamed from: l  reason: collision with root package name */
    public static i f39576l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f39577m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f39578a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.work.a f39579b;

    /* renamed from: c  reason: collision with root package name */
    public WorkDatabase f39580c;

    /* renamed from: d  reason: collision with root package name */
    public w5.a f39581d;

    /* renamed from: e  reason: collision with root package name */
    public List<e> f39582e;

    /* renamed from: f  reason: collision with root package name */
    public d f39583f;

    /* renamed from: g  reason: collision with root package name */
    public u5.e f39584g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f39585h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f39586i;

    public i(Context context, androidx.work.a aVar, w5.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.f38421a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (l5.i.f39576l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        l5.i.f39576l = new l5.i(r4, r5, new w5.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        l5.i.f39575k = l5.i.f39576l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = l5.i.f39577m
            monitor-enter(r0)
            l5.i r1 = l5.i.f39575k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            l5.i r2 = l5.i.f39576l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            l5.i r1 = l5.i.f39576l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            l5.i r1 = new l5.i     // Catch: java.lang.Throwable -> L34
            w5.b r2 = new w5.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            l5.i.f39576l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            l5.i r4 = l5.i.f39576l     // Catch: java.lang.Throwable -> L34
            l5.i.f39575k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.i.e(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static i j() {
        synchronized (f39577m) {
            i iVar = f39575k;
            if (iVar != null) {
                return iVar;
            }
            return f39576l;
        }
    }

    public static i k(Context context) {
        i j10;
        synchronized (f39577m) {
            j10 = j();
            if (j10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof a.c) {
                    e(applicationContext, ((a.c) applicationContext).a());
                    j10 = k(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return j10;
    }

    @Override // k5.t
    public m a(String str) {
        u5.a d10 = u5.a.d(str, this);
        this.f39581d.b(d10);
        return d10.e();
    }

    @Override // k5.t
    public m b(List<? extends u> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public m f(UUID uuid) {
        u5.a b10 = u5.a.b(uuid, this);
        this.f39581d.b(b10);
        return b10.e();
    }

    public List<e> g(Context context, androidx.work.a aVar, w5.a aVar2) {
        return Arrays.asList(f.a(context, this), new m5.b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f39578a;
    }

    public androidx.work.a i() {
        return this.f39579b;
    }

    public u5.e l() {
        return this.f39584g;
    }

    public d m() {
        return this.f39583f;
    }

    public List<e> n() {
        return this.f39582e;
    }

    public WorkDatabase o() {
        return this.f39580c;
    }

    public w5.a p() {
        return this.f39581d;
    }

    public final void q(Context context, androidx.work.a aVar, w5.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f39578a = applicationContext;
        this.f39579b = aVar;
        this.f39581d = aVar2;
        this.f39580c = workDatabase;
        this.f39582e = list;
        this.f39583f = dVar;
        this.f39584g = new u5.e(workDatabase);
        this.f39585h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f39581d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void r() {
        synchronized (f39577m) {
            this.f39585h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f39586i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f39586i = null;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            o5.b.b(h());
        }
        o().L().k();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f39577m) {
            this.f39586i = pendingResult;
            if (this.f39585h) {
                pendingResult.finish();
                this.f39586i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f39581d.b(new u5.h(this, str, aVar));
    }

    public void w(String str) {
        this.f39581d.b(new u5.i(this, str, true));
    }

    public void x(String str) {
        this.f39581d.b(new u5.i(this, str, false));
    }

    public i(Context context, androidx.work.a aVar, w5.a aVar2, boolean z10) {
        this(context, aVar, aVar2, WorkDatabase.C(context.getApplicationContext(), aVar2.c(), z10));
    }

    public i(Context context, androidx.work.a aVar, w5.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        k5.j.e(new j.a(aVar.j()));
        List<e> g10 = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, g10, new d(context, aVar, aVar2, workDatabase, g10));
    }
}

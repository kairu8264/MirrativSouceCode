package ui;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import li.h;
import rh.p;
import vh.i;
import vh.r;
import vh.t;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: r  reason: collision with root package name */
    public static final long f55924r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    public static volatile ScheduledExecutorService f55925s = null;

    /* renamed from: t  reason: collision with root package name */
    public static final Object f55926t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public static volatile e f55927u = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Object f55928a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f55929b;

    /* renamed from: c  reason: collision with root package name */
    public int f55930c;

    /* renamed from: d  reason: collision with root package name */
    public Future<?> f55931d;

    /* renamed from: e  reason: collision with root package name */
    public long f55932e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<f> f55933f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f55934g;

    /* renamed from: h  reason: collision with root package name */
    public int f55935h;

    /* renamed from: i  reason: collision with root package name */
    public li.b f55936i;

    /* renamed from: j  reason: collision with root package name */
    public vh.f f55937j;

    /* renamed from: k  reason: collision with root package name */
    public WorkSource f55938k;

    /* renamed from: l  reason: collision with root package name */
    public final String f55939l;

    /* renamed from: m  reason: collision with root package name */
    public final String f55940m;

    /* renamed from: n  reason: collision with root package name */
    public final Context f55941n;

    /* renamed from: o  reason: collision with root package name */
    public final Map<String, d> f55942o;

    /* renamed from: p  reason: collision with root package name */
    public AtomicInteger f55943p;

    /* renamed from: q  reason: collision with root package name */
    public final ScheduledExecutorService f55944q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f55928a = new Object();
        this.f55930c = 0;
        this.f55933f = new HashSet();
        this.f55934g = true;
        this.f55937j = i.b();
        this.f55942o = new HashMap();
        this.f55943p = new AtomicInteger(0);
        p.j(context, "WakeLock: context must not be null");
        p.f(str, "WakeLock: wakeLockName must not be empty");
        this.f55941n = context.getApplicationContext();
        this.f55940m = str;
        this.f55936i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f55939l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f55939l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f55929b = newWakeLock;
            if (t.c(context)) {
                WorkSource b10 = t.b(context, r.a(packageName) ? context.getPackageName() : packageName);
                this.f55938k = b10;
                if (b10 != null) {
                    i(newWakeLock, b10);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f55925s;
            if (scheduledExecutorService == null) {
                synchronized (f55926t) {
                    scheduledExecutorService = f55925s;
                    if (scheduledExecutorService == null) {
                        h.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f55925s = scheduledExecutorService;
                    }
                }
            }
            this.f55944q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f55928a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f55939l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.f55930c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f55943p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f55924r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f55928a) {
            if (!b()) {
                this.f55936i = li.b.a(false, null);
                this.f55929b.acquire();
                this.f55937j.elapsedRealtime();
            }
            this.f55930c++;
            this.f55935h++;
            f(null);
            d dVar = this.f55942o.get(null);
            if (dVar == null) {
                dVar = new d(null);
                this.f55942o.put(null, dVar);
            }
            dVar.f55946a++;
            long elapsedRealtime = this.f55937j.elapsedRealtime();
            long j11 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
            if (j11 > this.f55932e) {
                this.f55932e = j11;
                Future<?> future = this.f55931d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f55931d = this.f55944q.schedule(new Runnable() { // from class: ui.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.e(a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f55928a) {
            z10 = this.f55930c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f55943p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f55939l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f55928a) {
            f(null);
            if (this.f55942o.containsKey(null)) {
                d dVar = this.f55942o.get(null);
                if (dVar != null) {
                    int i10 = dVar.f55946a - 1;
                    dVar.f55946a = i10;
                    if (i10 == 0) {
                        this.f55942o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f55939l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z10) {
        synchronized (this.f55928a) {
            this.f55934g = z10;
        }
    }

    public final String f(String str) {
        if (this.f55934g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f55933f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f55933f);
        this.f55933f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        f fVar = (f) arrayList.get(0);
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f55928a) {
            if (b()) {
                if (this.f55934g) {
                    int i11 = this.f55930c - 1;
                    this.f55930c = i11;
                    if (i11 > 0) {
                        return;
                    }
                } else {
                    this.f55930c = 0;
                }
                g();
                for (d dVar : this.f55942o.values()) {
                    dVar.f55946a = 0;
                }
                this.f55942o.clear();
                Future<?> future = this.f55931d;
                if (future != null) {
                    future.cancel(false);
                    this.f55931d = null;
                    this.f55932e = 0L;
                }
                this.f55935h = 0;
                if (this.f55929b.isHeld()) {
                    try {
                        this.f55929b.release();
                        if (this.f55936i != null) {
                            this.f55936i = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f55939l).concat(" failed to release!"), e10);
                            if (this.f55936i != null) {
                                this.f55936i = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f55939l).concat(" should be held!"));
                }
            }
        }
    }
}

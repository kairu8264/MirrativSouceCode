package vd;

import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import jo.h;
import jo.p;
import so.e;
import wn.v;
import xn.a0;
import xn.s;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final C0931a f57288i = new C0931a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f57289j = 8;

    /* renamed from: k  reason: collision with root package name */
    public static a f57290k;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f57291a;

    /* renamed from: b  reason: collision with root package name */
    public long f57292b;

    /* renamed from: c  reason: collision with root package name */
    public final long f57293c;

    /* renamed from: d  reason: collision with root package name */
    public final String f57294d;

    /* renamed from: e  reason: collision with root package name */
    public final int f57295e;

    /* renamed from: f  reason: collision with root package name */
    public long f57296f;

    /* renamed from: g  reason: collision with root package name */
    public long f57297g;

    /* renamed from: h  reason: collision with root package name */
    public float f57298h;

    /* renamed from: vd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0931a {
        public C0931a() {
        }

        public /* synthetic */ C0931a(h hVar) {
            this();
        }

        public final a a() {
            a aVar = a.f57290k;
            if (aVar == null) {
                synchronized (this) {
                    aVar = a.f57290k;
                    if (aVar == null) {
                        aVar = new a(null);
                        C0931a c0931a = a.f57288i;
                        a.f57290k = aVar;
                    }
                }
            }
            return aVar;
        }
    }

    public a() {
        this.f57291a = Executors.newSingleThreadScheduledExecutor();
        this.f57292b = -1L;
        this.f57293c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f57294d = "/proc/" + Process.myPid() + "/stat";
        this.f57295e = Runtime.getRuntime().availableProcessors();
    }

    public /* synthetic */ a(h hVar) {
        this();
    }

    public final float c() {
        long j10;
        long j11;
        BufferedReader bufferedReader;
        List k10;
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f57294d));
        } catch (Throwable th2) {
            th = th2;
            j10 = 0;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            g9.a.g("Unable to read 'proc/[pid]/stat' file: " + th.getMessage());
            j11 = this.f57296f;
            if (j11 != 0) {
                this.f57298h = (((float) (j10 - this.f57297g)) * 100.0f) / ((float) (uptimeMillis - j11));
                g9.a.g("totalCPUtime = " + (uptimeMillis - this.f57296f) + ", processCPUTime = " + (((j10 - this.f57297g) * 1000) / this.f57293c) + ", percent = " + this.f57298h);
            }
            this.f57296f = uptimeMillis;
            this.f57297g = j10;
            return this.f57298h;
        }
        try {
            String readLine = bufferedReader.readLine();
            p.g(readLine, "it");
            List<String> d10 = new e(" +").d(readLine, 0);
            if (!d10.isEmpty()) {
                ListIterator<String> listIterator = d10.listIterator(d10.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        k10 = a0.w0(d10, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            k10 = s.k();
            Object[] array = k10.toArray(new String[0]);
            p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            j10 = 0;
            for (int i10 = 13; i10 < 17; i10++) {
                try {
                    j10 += Long.parseLong(strArr[i10]);
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
            v vVar = v.f59242a;
            go.a.a(bufferedReader, null);
            j11 = this.f57296f;
            if (j11 != 0 && j11 != uptimeMillis) {
                this.f57298h = (((float) (j10 - this.f57297g)) * 100.0f) / ((float) (uptimeMillis - j11));
                g9.a.g("totalCPUtime = " + (uptimeMillis - this.f57296f) + ", processCPUTime = " + (((j10 - this.f57297g) * 1000) / this.f57293c) + ", percent = " + this.f57298h);
            }
            this.f57296f = uptimeMillis;
            this.f57297g = j10;
            return this.f57298h;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final float d() {
        return c();
    }

    public final int e() {
        return this.f57295e;
    }
}

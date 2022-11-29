package al;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import cl.a0;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Integer> f13858e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f13859f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13860a;

    /* renamed from: b  reason: collision with root package name */
    public final v f13861b;

    /* renamed from: c  reason: collision with root package name */
    public final a f13862c;

    /* renamed from: d  reason: collision with root package name */
    public final kl.d f13863d;

    static {
        HashMap hashMap = new HashMap();
        f13858e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f13859f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.6");
    }

    public n(Context context, v vVar, a aVar, kl.d dVar) {
        this.f13860a = context;
        this.f13861b = vVar;
        this.f13862c = aVar;
        this.f13863d = dVar;
    }

    public static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f13858e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final a0.b a() {
        return cl.a0.b().h("18.2.6").d(this.f13862c.f13739a).e(this.f13861b.a()).b(this.f13862c.f13743e).c(this.f13862c.f13744f).g(4);
    }

    public a0.e.d b(a0.a aVar) {
        int i10 = this.f13860a.getResources().getConfiguration().orientation;
        return a0.e.d.a().f("anr").e(aVar.h()).b(h(i10, aVar)).c(j(i10)).a();
    }

    public a0.e.d c(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f13860a.getResources().getConfiguration().orientation;
        return a0.e.d.a().f(str).e(j10).b(i(i12, new kl.e(th2, this.f13863d), thread, i10, i11, z10)).c(j(i12)).a();
    }

    public cl.a0 d(String str, long j10) {
        return a().i(r(str, j10)).a();
    }

    public final a0.e.d.a.b.AbstractC0161a f() {
        return a0.e.d.a.b.AbstractC0161a.a().b(0L).d(0L).c(this.f13862c.f13742d).e(this.f13862c.f13740b).a();
    }

    public final cl.b0<a0.e.d.a.b.AbstractC0161a> g() {
        return cl.b0.f(f());
    }

    public final a0.e.d.a h(int i10, a0.a aVar) {
        return a0.e.d.a.a().b(Boolean.valueOf(aVar.b() != 100)).f(i10).d(m(aVar)).a();
    }

    public final a0.e.d.a i(int i10, kl.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j10 = g.j(this.f13862c.f13742d, this.f13860a);
        if (j10 != null) {
            bool = Boolean.valueOf(j10.importance != 100);
        } else {
            bool = null;
        }
        return a0.e.d.a.a().b(bool).f(i10).d(n(eVar, thread, i11, i12, z10)).a();
    }

    public final a0.e.d.c j(int i10) {
        d a10 = d.a(this.f13860a);
        Float b10 = a10.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.doubleValue()) : null;
        int c10 = a10.c();
        boolean o10 = g.o(this.f13860a);
        return a0.e.d.c.a().b(valueOf).c(c10).f(o10).e(i10).g(g.s() - g.a(this.f13860a)).d(g.b(Environment.getDataDirectory().getPath())).a();
    }

    public final a0.e.d.a.b.c k(kl.e eVar, int i10, int i11) {
        return l(eVar, i10, i11, 0);
    }

    public final a0.e.d.a.b.c l(kl.e eVar, int i10, int i11, int i12) {
        String str = eVar.f38868b;
        String str2 = eVar.f38867a;
        StackTraceElement[] stackTraceElementArr = eVar.f38869c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        kl.e eVar2 = eVar.f38870d;
        if (i12 >= i11) {
            kl.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f38870d;
                i13++;
            }
        }
        a0.e.d.a.b.c.AbstractC0164a d10 = a0.e.d.a.b.c.a().f(str).e(str2).c(cl.b0.d(p(stackTraceElementArr, i10))).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(l(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    public final a0.e.d.a.b m(a0.a aVar) {
        return a0.e.d.a.b.a().b(aVar).e(u()).c(g()).a();
    }

    public final a0.e.d.a.b n(kl.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return a0.e.d.a.b.a().f(x(eVar, thread, i10, z10)).d(k(eVar, i10, i11)).e(u()).c(g()).a();
    }

    public final a0.e.d.a.b.AbstractC0167e.AbstractC0169b o(StackTraceElement stackTraceElement, a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a abstractC0170a) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + TopicConstant.SEPARATOR + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = stackTraceElement.getLineNumber();
        }
        return abstractC0170a.e(max).f(str).b(fileName).d(j10).a();
    }

    public final cl.b0<a0.e.d.a.b.AbstractC0167e.AbstractC0169b> p(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(o(stackTraceElement, a0.e.d.a.b.AbstractC0167e.AbstractC0169b.a().c(i10)));
        }
        return cl.b0.d(arrayList);
    }

    public final a0.e.a q() {
        return a0.e.a.a().e(this.f13861b.f()).g(this.f13862c.f13743e).d(this.f13862c.f13744f).f(this.f13861b.a()).b(this.f13862c.f13745g.d()).c(this.f13862c.f13745g.e()).a();
    }

    public final a0.e r(String str, long j10) {
        return a0.e.a().l(j10).i(str).g(f13859f).b(q()).k(t()).d(s()).h(3).a();
    }

    public final a0.e.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e10 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s10 = g.s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean y10 = g.y(this.f13860a);
        int m10 = g.m(this.f13860a);
        String str = Build.MANUFACTURER;
        return a0.e.c.a().b(e10).f(Build.MODEL).c(availableProcessors).h(s10).d(blockCount).i(y10).j(m10).e(str).g(Build.PRODUCT).a();
    }

    public final a0.e.AbstractC0172e t() {
        return a0.e.AbstractC0172e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(g.z(this.f13860a)).a();
    }

    public final a0.e.d.a.b.AbstractC0165d u() {
        return a0.e.d.a.b.AbstractC0165d.a().d("0").c("0").b(0L).a();
    }

    public final a0.e.d.a.b.AbstractC0167e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    public final a0.e.d.a.b.AbstractC0167e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return a0.e.d.a.b.AbstractC0167e.a().d(thread.getName()).c(i10).b(cl.b0.d(p(stackTraceElementArr, i10))).a();
    }

    public final cl.b0<a0.e.d.a.b.AbstractC0167e> x(kl.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, eVar.f38869c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.f13863d.a(entry.getValue())));
                }
            }
        }
        return cl.b0.d(arrayList);
    }
}

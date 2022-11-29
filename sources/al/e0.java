package al;

import android.app.ApplicationExitInfo;
import android.content.Context;
import cl.a0;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final n f13756a;

    /* renamed from: b  reason: collision with root package name */
    public final fl.e f13757b;

    /* renamed from: c  reason: collision with root package name */
    public final gl.c f13758c;

    /* renamed from: d  reason: collision with root package name */
    public final bl.b f13759d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f13760e;

    public e0(n nVar, fl.e eVar, gl.c cVar, bl.b bVar, g0 g0Var) {
        this.f13756a = nVar;
        this.f13757b = eVar;
        this.f13758c = cVar;
        this.f13759d = bVar;
        this.f13760e = g0Var;
    }

    public static a0.a e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return a0.a.a().b(applicationExitInfo.getImportance()).d(applicationExitInfo.getProcessName()).f(applicationExitInfo.getReason()).h(applicationExitInfo.getTimestamp()).c(applicationExitInfo.getPid()).e(applicationExitInfo.getPss()).g(applicationExitInfo.getRss()).i(str).a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static e0 g(Context context, v vVar, fl.f fVar, a aVar, bl.b bVar, g0 g0Var, kl.d dVar, hl.e eVar) {
        return new e0(new n(context, vVar, aVar, dVar), new fl.e(fVar, eVar), gl.c.c(context), bVar, g0Var);
    }

    public static List<a0.c> k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(a0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, c0.f13749w);
        return arrayList;
    }

    public static /* synthetic */ int m(a0.c cVar, a0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public final a0.e.d c(a0.e.d dVar) {
        return d(dVar, this.f13759d, this.f13760e);
    }

    public final a0.e.d d(a0.e.d dVar, bl.b bVar, g0 g0Var) {
        a0.e.d.b g10 = dVar.g();
        String c10 = bVar.c();
        if (c10 != null) {
            g10.d(a0.e.d.AbstractC0171d.a().b(c10).a());
        } else {
            xk.f.f().i("No log data to include with this event.");
        }
        List<a0.c> k10 = k(g0Var.a());
        List<a0.c> k11 = k(g0Var.b());
        if (!k10.isEmpty()) {
            g10.b(dVar.b().g().c(cl.b0.d(k10)).e(cl.b0.d(k11)).a());
        }
        return g10.a();
    }

    public void h(String str, List<a0> list) {
        xk.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : list) {
            a0.d.b a10 = a0Var.a();
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        this.f13757b.l(str, a0.d.a().b(cl.b0.d(arrayList)).a());
    }

    public void i(long j10, String str) {
        this.f13757b.k(str, j10);
    }

    public final ApplicationExitInfo j(String str, List<ApplicationExitInfo> list) {
        long q10 = this.f13757b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < q10) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public boolean l() {
        return this.f13757b.r();
    }

    public SortedSet<String> n() {
        return this.f13757b.p();
    }

    public void o(String str, long j10) {
        this.f13757b.z(this.f13756a.d(str, j10));
    }

    public final boolean p(vi.g<o> gVar) {
        if (gVar.s()) {
            o o10 = gVar.o();
            xk.f f10 = xk.f.f();
            f10.b("Crashlytics report successfully enqueued to DataTransport: " + o10.d());
            File c10 = o10.c();
            if (c10.delete()) {
                xk.f f11 = xk.f.f();
                f11.b("Deleted report file: " + c10.getPath());
                return true;
            }
            xk.f f12 = xk.f.f();
            f12.k("Crashlytics could not delete report file: " + c10.getPath());
            return true;
        }
        xk.f.f().l("Crashlytics report could not be enqueued to DataTransport", gVar.n());
        return false;
    }

    public final void q(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f13757b.y(c(this.f13756a.c(th2, thread, str2, j10, 4, 8, z10)), str, str2.equals("crash"));
    }

    public void r(Throwable th2, Thread thread, String str, long j10) {
        xk.f f10 = xk.f.f();
        f10.i("Persisting fatal event for session " + str);
        q(th2, thread, str, "crash", j10, true);
    }

    public void s(Throwable th2, Thread thread, String str, long j10) {
        xk.f f10 = xk.f.f();
        f10.i("Persisting non-fatal event for session " + str);
        q(th2, thread, str, MRLog.PAYLOAD_KEY_ERROR, j10, false);
    }

    public void t(String str, List<ApplicationExitInfo> list, bl.b bVar, g0 g0Var) {
        ApplicationExitInfo j10 = j(str, list);
        if (j10 == null) {
            xk.f f10 = xk.f.f();
            f10.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        a0.e.d b10 = this.f13756a.b(e(j10));
        xk.f f11 = xk.f.f();
        f11.b("Persisting anr for session " + str);
        this.f13757b.y(d(b10, bVar, g0Var), str, true);
    }

    public void u(String str) {
        String c10 = this.f13760e.c();
        if (c10 == null) {
            xk.f.f().i("Could not persist user ID; no user ID available");
        } else {
            this.f13757b.A(c10, str);
        }
    }

    public void v() {
        this.f13757b.i();
    }

    public vi.g<Void> w(Executor executor) {
        List<o> w10 = this.f13757b.w();
        ArrayList arrayList = new ArrayList();
        for (o oVar : w10) {
            arrayList.add(this.f13758c.g(oVar).j(executor, new vi.a() { // from class: al.d0
                @Override // vi.a
                public final Object a(vi.g gVar) {
                    boolean p10;
                    p10 = e0.this.p(gVar);
                    return Boolean.valueOf(p10);
                }
            }));
        }
        return vi.j.f(arrayList);
    }
}

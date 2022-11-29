package ll;

import android.content.Context;
import cl.c0;
import com.google.android.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import ll.e;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f40385d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a  reason: collision with root package name */
    public final Context f40386a;

    /* renamed from: b  reason: collision with root package name */
    public final d f40387b;

    /* renamed from: c  reason: collision with root package name */
    public final fl.f f40388c;

    public b(Context context, d dVar, fl.f fVar) {
        this.f40386a = context;
        this.f40387b = dVar;
        this.f40388c = fVar;
    }

    public static File b(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void h(fl.f fVar, String str, String str2, String str3) {
        j(new File(fVar.h(str), str3), str2);
    }

    public static void j(File file, String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f40385d));
            try {
                bufferedWriter2.write(str);
                al.g.e(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                al.g.e(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                al.g.e(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public e a(String str) {
        File h10 = this.f40388c.h(str);
        File file = new File(h10, "pending");
        xk.f f10 = xk.f.f();
        f10.i("Minidump directory: " + file.getAbsolutePath());
        File b10 = b(file, ".dmp");
        xk.f f11 = xk.f.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        sb2.append((b10 == null || !b10.exists()) ? "does not exist" : "exists");
        f11.i(sb2.toString());
        e.b bVar = new e.b();
        if (h10 != null && h10.exists() && file.exists()) {
            bVar.l(b(file, ".dmp")).k(b(h10, ".device_info")).n(new File(h10, "session.json")).h(new File(h10, "app.json")).j(new File(h10, "device.json")).m(new File(h10, "os.json"));
        }
        return bVar.i();
    }

    public boolean c(String str) {
        File file = a(str).f40394a;
        return file != null && file.exists();
    }

    public boolean d(String str, String str2, long j10, c0 c0Var) {
        File h10 = this.f40388c.h(str);
        if (h10 != null) {
            try {
                if (this.f40387b.a(h10.getCanonicalPath(), this.f40386a.getAssets())) {
                    e(str, str2, j10);
                    f(str, c0Var.a());
                    i(str, c0Var.d());
                    g(str, c0Var.c());
                    return true;
                }
                return false;
            } catch (IOException e10) {
                xk.f.f().e("Error initializing Crashlytics NDK", e10);
                return false;
            }
        }
        return false;
    }

    public void e(String str, String str2, long j10) {
        h(this.f40388c, str, g.b(str, str2, j10), "session.json");
    }

    public void f(String str, c0.a aVar) {
        h(this.f40388c, str, g.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), "app.json");
    }

    public void g(String str, c0.b bVar) {
        h(this.f40388c, str, g.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), "device.json");
    }

    public void i(String str, c0.c cVar) {
        h(this.f40388c, str, g.e(cVar.d(), cVar.c(), cVar.b()), "os.json");
    }
}

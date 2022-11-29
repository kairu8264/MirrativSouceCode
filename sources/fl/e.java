package fl;

import al.o;
import cl.a0;
import cl.b0;
import com.google.android.exoplayer2.C;
import dl.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f32005d = Charset.forName(C.UTF8_NAME);

    /* renamed from: e  reason: collision with root package name */
    public static final int f32006e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final g f32007f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator<? super File> f32008g = c.f32003w;

    /* renamed from: h  reason: collision with root package name */
    public static final FilenameFilter f32009h = b.f32002a;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f32010a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final f f32011b;

    /* renamed from: c  reason: collision with root package name */
    public final hl.e f32012c;

    public e(f fVar, hl.e eVar) {
        this.f32011b = fVar;
        this.f32012c = eVar;
    }

    public static String B(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f32005d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void G(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f32005d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void H(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f32005d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            f.r(file);
            size--;
        }
        return size;
    }

    public static long h(long j10) {
        return j10 * 1000;
    }

    public static String m(int i10, boolean z10) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i10));
        String str = z10 ? "_" : "";
        return "event" + format + str;
    }

    public static String o(String str) {
        return str.substring(0, f32006e);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void A(String str, String str2) {
        try {
            G(this.f32011b.n(str2, "user-id"), str);
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.l("Could not persist user ID for session " + str2, e10);
        }
    }

    public final void C(File file, a0.d dVar, String str) {
        try {
            g gVar = f32007f;
            G(this.f32011b.f(str), gVar.E(gVar.D(B(file)).m(dVar)));
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.l("Could not synthesize final native report file for " + file, e10);
        }
    }

    public final void D(String str, long j10) {
        boolean z10;
        List<File> o10 = this.f32011b.o(str, f32009h);
        if (o10.isEmpty()) {
            xk.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(o10);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : o10) {
                try {
                    arrayList.add(f32007f.g(B(file)));
                } catch (IOException e10) {
                    xk.f.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            xk.f.f().k("Could not parse event files for session " + str);
            return;
        }
        String str2 = null;
        File n10 = this.f32011b.n(str, "user-id");
        if (n10.isFile()) {
            try {
                str2 = B(n10);
            } catch (IOException e11) {
                xk.f.f().l("Could not read user ID file in " + str, e11);
            }
        }
        E(this.f32011b.n(str, "report"), arrayList, j10, z10, str2);
    }

    public final void E(File file, List<a0.e.d> list, long j10, boolean z10, String str) {
        File k10;
        try {
            g gVar = f32007f;
            a0 l10 = gVar.D(B(file)).n(j10, z10, str).l(b0.d(list));
            a0.e j11 = l10.j();
            if (j11 == null) {
                return;
            }
            if (z10) {
                k10 = this.f32011b.i(j11.h());
            } else {
                k10 = this.f32011b.k(j11.h());
            }
            G(k10, gVar.E(l10));
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.l("Could not synthesize final report file for " + file, e10);
        }
    }

    public final int F(String str, int i10) {
        List<File> o10 = this.f32011b.o(str, a.f32001a);
        Collections.sort(o10, d.f32004w);
        return f(o10, i10);
    }

    public final SortedSet<String> e(String str) {
        this.f32011b.a();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            xk.f f10 = xk.f.f();
            f10.b("Removing session over cap: " + last);
            this.f32011b.b(last);
            p10.remove(last);
        }
        return p10;
    }

    public final void g() {
        int i10 = this.f32012c.a().b().f36854b;
        List<File> n10 = n();
        int size = n10.size();
        if (size <= i10) {
            return;
        }
        for (File file : n10.subList(i10, size)) {
            file.delete();
        }
    }

    public void i() {
        j(this.f32011b.l());
        j(this.f32011b.j());
        j(this.f32011b.g());
    }

    public final void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            xk.f f10 = xk.f.f();
            f10.i("Finalizing report for session " + str2);
            D(str2, j10);
            this.f32011b.b(str2);
        }
        g();
    }

    public void l(String str, a0.d dVar) {
        File n10 = this.f32011b.n(str, "report");
        xk.f f10 = xk.f.f();
        f10.b("Writing native session report for " + str + " to file: " + n10);
        C(n10, dVar, str);
    }

    public final List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f32011b.j());
        arrayList.addAll(this.f32011b.g());
        Comparator<? super File> comparator = f32008g;
        Collections.sort(arrayList, comparator);
        List<File> l10 = this.f32011b.l();
        Collections.sort(l10, comparator);
        arrayList.addAll(l10);
        return arrayList;
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f32011b.c()).descendingSet();
    }

    public long q(String str) {
        return this.f32011b.n(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f32011b.l().isEmpty() && this.f32011b.j().isEmpty() && this.f32011b.g().isEmpty()) ? false : true;
    }

    public List<o> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n10) {
            try {
                arrayList.add(o.a(f32007f.D(B(file)), file.getName(), file));
            } catch (IOException e10) {
                xk.f f10 = xk.f.f();
                f10.l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(a0.e.d dVar, String str, boolean z10) {
        int i10 = this.f32012c.a().b().f36853a;
        try {
            G(this.f32011b.n(str, m(this.f32010a.getAndIncrement(), z10)), f32007f.h(dVar));
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.l("Could not persist event for session " + str, e10);
        }
        F(str, i10);
    }

    public void z(a0 a0Var) {
        a0.e j10 = a0Var.j();
        if (j10 == null) {
            xk.f.f().b("Could not get session for report");
            return;
        }
        String h10 = j10.h();
        try {
            G(this.f32011b.n(h10, "report"), f32007f.E(a0Var));
            H(this.f32011b.n(h10, "start-time"), "", j10.k());
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.c("Could not persist report for session " + h10, e10);
        }
    }
}

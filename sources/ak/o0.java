package ak;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: c  reason: collision with root package name */
    public static final dk.f f13561c = new dk.f("AssetPackStorage");

    /* renamed from: d  reason: collision with root package name */
    public static final long f13562d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f13563e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13564a;

    /* renamed from: b  reason: collision with root package name */
    public final k3 f13565b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f13562d = timeUnit.toMillis(14L);
        f13563e = timeUnit.toMillis(28L);
    }

    public o0(Context context, k3 k3Var) {
        this.f13564a = context;
        this.f13565b = k3Var;
    }

    public static long h(File file, boolean z10) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            if (z10 && file.listFiles().length > 1) {
                f13561c.e("Multiple pack versions found, using highest version code.", new Object[0]);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e10) {
                f13561c.c(e10, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    public static void o(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long h10 = h(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(h10)) && !file2.getName().equals("stale.tmp")) {
                p(file2);
            }
        }
    }

    public static boolean p(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z10 &= p(file2);
            }
        }
        if (file.delete()) {
            return z10;
        }
        return false;
    }

    public final File A(String str, int i10, long j10, String str2) {
        return new File(C(str, i10, j10, str2), "checkpoint_ext.dat");
    }

    public final File B(String str, int i10, long j10, String str2) {
        return new File(C(str, i10, j10, str2), "checkpoint.dat");
    }

    public final File C(String str, int i10, long j10, String str2) {
        return new File(z(str, i10, j10), str2);
    }

    public final File D(String str, int i10, long j10, String str2) {
        return new File(new File(new File(k(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    public final File E(String str, int i10, long j10, String str2) {
        return new File(new File(new File(k(str, i10, j10), "_slices"), "_verified"), str2);
    }

    public final String F(String str) throws IOException {
        int length;
        File file = new File(l(), str);
        if (!file.exists()) {
            f13561c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f13565b.a()));
        if (!file2.exists()) {
            f13561c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f13565b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f13561c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f13565b.a()));
            return null;
        } else if (length > 1) {
            f13561c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f13565b.a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    public final Map<String, Long> G() {
        HashMap hashMap = new HashMap();
        for (File file : n()) {
            String name = file.getName();
            int h10 = (int) h(i(name), true);
            long h11 = h(u(name, h10), true);
            if (v(name, h10, h11).exists()) {
                hashMap.put(name, Long.valueOf(h11));
            }
        }
        return hashMap;
    }

    public final Map<String, Long> H() {
        HashMap hashMap = new HashMap();
        for (String str : I().keySet()) {
            hashMap.put(str, Long.valueOf(s(str)));
        }
        return hashMap;
    }

    public final Map<String, a> I() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : n()) {
                a t10 = t(file.getName());
                if (t10 != null) {
                    hashMap.put(file.getName(), t10);
                }
            }
        } catch (IOException e10) {
            f13561c.b("Could not process directory while scanning installed packs: %s", e10);
        }
        return hashMap;
    }

    public final void J() {
        for (File file : n()) {
            if (file.listFiles() != null) {
                o(file);
                long h10 = h(file, false);
                if (this.f13565b.a() != h10) {
                    try {
                        new File(new File(file, String.valueOf(h10)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f13561c.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    o(file2);
                }
            }
        }
    }

    public final void K() {
        File[] listFiles;
        if (m().exists()) {
            for (File file : m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f13562d) {
                    p(file);
                } else {
                    o(file);
                }
            }
        }
    }

    public final void L() {
        File[] listFiles;
        for (File file : n()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f13563e) {
                        p(file2);
                    }
                }
            }
        }
    }

    public final void M() {
        p(l());
    }

    public final void a(String str, int i10, long j10, int i11) throws IOException {
        File j11 = j(str, i10, j10);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i11));
        j11.getParentFile().mkdirs();
        j11.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(j11);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void b(String str, int i10, long j10) {
        File[] listFiles;
        File[] listFiles2;
        File i11 = i(str);
        if (i11.exists()) {
            for (File file : i11.listFiles()) {
                if (!file.getName().equals(String.valueOf(i10)) && !file.getName().equals("stale.tmp")) {
                    p(file);
                } else if (file.getName().equals(String.valueOf(i10))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j10))) {
                            p(file2);
                        }
                    }
                }
            }
        }
    }

    public final void c(List<String> list) {
        int a10 = this.f13565b.a();
        for (File file : n()) {
            if (!list.contains(file.getName()) && h(file, true) != a10) {
                p(file);
            }
        }
    }

    public final boolean d(String str) {
        if (i(str).exists()) {
            return p(i(str));
        }
        return true;
    }

    public final boolean e(String str, int i10, long j10) {
        if (k(str, i10, j10).exists()) {
            return p(k(str, i10, j10));
        }
        return true;
    }

    public final boolean f(String str, int i10, long j10) {
        if (v(str, i10, j10).exists()) {
            return p(v(str, i10, j10));
        }
        return true;
    }

    public final boolean g(String str) {
        return F(str) != null;
    }

    public final File i(String str) {
        return new File(l(), str);
    }

    public final File j(String str, int i10, long j10) {
        return new File(x(str, i10, j10), "merge.tmp");
    }

    public final File k(String str, int i10, long j10) {
        return new File(new File(new File(m(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    public final File l() {
        return new File(this.f13564a.getFilesDir(), "assetpacks");
    }

    public final File m() {
        return new File(l(), "_tmp");
    }

    public final List<File> n() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e10) {
            f13561c.b("Could not process directory while scanning installed packs. %s", e10);
        }
        if (l().exists() && l().listFiles() != null) {
            for (File file : l().listFiles()) {
                if (!file.getCanonicalPath().equals(m().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int q(String str) {
        return (int) h(i(str), true);
    }

    public final int r(String str, int i10, long j10) throws IOException {
        File j11 = j(str, i10, j10);
        if (j11.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(j11);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e10) {
                        throw new p1("Merge checkpoint file corrupt.", e10);
                    }
                }
                throw new p1("Merge checkpoint file corrupt.");
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
        return 0;
    }

    public final long s(String str) {
        return h(u(str, (int) h(i(str), true)), true);
    }

    public final a t(String str) throws IOException {
        String F = F(str);
        if (F == null) {
            return null;
        }
        File file = new File(F, "assets");
        if (!file.isDirectory()) {
            f13561c.b("Failed to find assets directory: %s", file);
            return null;
        }
        return a.e(F, file.getCanonicalPath());
    }

    public final File u(String str, int i10) {
        return new File(i(str), String.valueOf(i10));
    }

    public final File v(String str, int i10, long j10) {
        return new File(u(str, i10), String.valueOf(j10));
    }

    public final File w(String str, int i10, long j10) {
        return new File(v(str, i10, j10), "_metadata");
    }

    public final File x(String str, int i10, long j10) {
        return new File(k(str, i10, j10), "_packs");
    }

    public final File y(String str, int i10, long j10) {
        return new File(w(str, i10, j10), "properties.dat");
    }

    public final File z(String str, int i10, long j10) {
        return new File(new File(k(str, i10, j10), "_slices"), "_metadata");
    }
}

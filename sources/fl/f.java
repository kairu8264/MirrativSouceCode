package fl;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final File f32013a;

    /* renamed from: b  reason: collision with root package name */
    public final File f32014b;

    /* renamed from: c  reason: collision with root package name */
    public final File f32015c;

    /* renamed from: d  reason: collision with root package name */
    public final File f32016d;

    /* renamed from: e  reason: collision with root package name */
    public final File f32017e;

    public f(Context context) {
        File p10 = p(new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1"));
        this.f32013a = p10;
        this.f32014b = p(new File(p10, "open-sessions"));
        this.f32015c = p(new File(p10, "reports"));
        this.f32016d = p(new File(p10, "priority-reports"));
        this.f32017e = p(new File(p10, "native-reports"));
    }

    public static synchronized File p(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                xk.f f10 = xk.f.f();
                f10.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    public static File q(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> s(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public void a() {
        File[] fileArr = {new File(this.f32013a.getParent(), ".com.google.firebase.crashlytics"), new File(this.f32013a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i10 = 0; i10 < 2; i10++) {
            File file = fileArr[i10];
            if (file.exists() && r(file)) {
                xk.f f10 = xk.f.f();
                f10.b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    public boolean b(String str) {
        return r(new File(this.f32014b, str));
    }

    public List<String> c() {
        return s(this.f32014b.list());
    }

    public File d(String str) {
        return new File(this.f32013a, str);
    }

    public List<File> e(FilenameFilter filenameFilter) {
        return s(this.f32013a.listFiles(filenameFilter));
    }

    public File f(String str) {
        return new File(this.f32017e, str);
    }

    public List<File> g() {
        return s(this.f32017e.listFiles());
    }

    public File h(String str) {
        return q(new File(m(str), "native"));
    }

    public File i(String str) {
        return new File(this.f32016d, str);
    }

    public List<File> j() {
        return s(this.f32016d.listFiles());
    }

    public File k(String str) {
        return new File(this.f32015c, str);
    }

    public List<File> l() {
        return s(this.f32015c.listFiles());
    }

    public final File m(String str) {
        return q(new File(this.f32014b, str));
    }

    public File n(String str, String str2) {
        return new File(m(str), str2);
    }

    public List<File> o(String str, FilenameFilter filenameFilter) {
        return s(m(str).listFiles(filenameFilter));
    }
}

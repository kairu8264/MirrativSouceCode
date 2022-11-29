package go;

import java.io.File;
import jo.p;
import so.o;

/* loaded from: classes4.dex */
public class e extends d {
    public static final File c(String str, String str2, File file) {
        p.h(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        p.g(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static final String d(File file) {
        p.h(file, "<this>");
        String name = file.getName();
        p.g(name, "name");
        return o.D0(name, '.', "");
    }

    public static final File e(File file, File file2) {
        p.h(file, "<this>");
        p.h(file2, "relative");
        if (b.b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        p.g(file3, "this.toString()");
        if ((file3.length() == 0) || o.K(file3, File.separatorChar, false, 2, null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    public static final File f(File file, String str) {
        p.h(file, "<this>");
        p.h(str, "relative");
        return e(file, new File(str));
    }
}

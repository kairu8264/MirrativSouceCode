package go;

import java.io.File;
import jo.p;
import so.o;

/* loaded from: classes4.dex */
public class b {
    public static final int a(String str) {
        int T;
        int T2 = o.T(str, File.separatorChar, 0, false, 4, null);
        if (T2 == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c10 = File.separatorChar;
                if (charAt == c10 && (T = o.T(str, c10, 2, false, 4, null)) >= 0) {
                    int T3 = o.T(str, File.separatorChar, T + 1, false, 4, null);
                    return T3 >= 0 ? T3 + 1 : str.length();
                }
            }
            return 1;
        } else if (T2 <= 0 || str.charAt(T2 - 1) != ':') {
            if (T2 == -1 && o.K(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        } else {
            return T2 + 1;
        }
    }

    public static final boolean b(File file) {
        p.h(file, "<this>");
        String path = file.getPath();
        p.g(path, "path");
        return a(path) > 0;
    }
}

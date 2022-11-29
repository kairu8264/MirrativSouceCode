package g6;

import android.net.Uri;
import j6.m;
import java.io.File;
import jo.p;
import o6.k;
import so.o;

/* loaded from: classes.dex */
public final class a implements c<Uri, File> {
    public final boolean b(Uri uri) {
        if (!k.q(uri)) {
            String scheme = uri.getScheme();
            if (scheme == null || p.c(scheme, "file")) {
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (o.w0(path, '/', false, 2, null) && k.h(uri) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g6.c
    /* renamed from: c */
    public File a(Uri uri, m mVar) {
        if (b(uri)) {
            String path = uri.getPath();
            p.e(path);
            return new File(path);
        }
        return null;
    }
}

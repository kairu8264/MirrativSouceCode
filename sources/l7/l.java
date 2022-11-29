package l7;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import o7.u;

/* loaded from: classes.dex */
public class l implements m7.k<k> {
    @Override // m7.k
    public m7.c b(m7.h hVar) {
        return m7.c.SOURCE;
    }

    @Override // m7.d
    /* renamed from: c */
    public boolean a(u<k> uVar, File file, m7.h hVar) {
        try {
            i8.a.e(uVar.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("WebpEncoder", 5)) {
                Log.w("WebpEncoder", "Failed to encode WebP drawable data", e10);
            }
            return false;
        }
    }
}

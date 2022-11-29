package z7;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import m7.k;
import o7.u;

/* loaded from: classes.dex */
public class d implements k<c> {
    @Override // m7.k
    public m7.c b(m7.h hVar) {
        return m7.c.SOURCE;
    }

    @Override // m7.d
    /* renamed from: c */
    public boolean a(u<c> uVar, File file, m7.h hVar) {
        try {
            i8.a.e(uVar.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}

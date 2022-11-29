package a6;

import a6.q;
import android.content.Context;
import java.io.Closeable;
import rp.y;

/* loaded from: classes.dex */
public final class r {
    public static final q a(rp.e eVar, Context context) {
        return new t(eVar, o6.k.m(context), null);
    }

    public static final q b(rp.e eVar, Context context, q.a aVar) {
        return new t(eVar, o6.k.m(context), aVar);
    }

    public static final q c(y yVar, rp.i iVar, String str, Closeable closeable) {
        return new l(yVar, iVar, str, closeable, null);
    }

    public static /* synthetic */ q d(y yVar, rp.i iVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = rp.i.f51697b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return c(yVar, iVar, str, closeable);
    }
}

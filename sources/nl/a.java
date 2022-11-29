package nl;

import android.content.Intent;
import pk.c;
import vi.g;

/* loaded from: classes4.dex */
public abstract class a {
    public static synchronized a b() {
        a c10;
        synchronized (a.class) {
            c10 = c(c.i());
        }
        return c10;
    }

    public static synchronized a c(c cVar) {
        a aVar;
        synchronized (a.class) {
            aVar = (a) cVar.g(a.class);
        }
        return aVar;
    }

    public abstract g<b> a(Intent intent);
}

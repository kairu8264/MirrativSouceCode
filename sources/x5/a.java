package x5;

import android.content.Context;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59692a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static e f59693b;

    /* renamed from: c  reason: collision with root package name */
    public static f f59694c;

    public static final e a(Context context) {
        e eVar = f59693b;
        return eVar == null ? f59692a.b(context) : eVar;
    }

    public static final synchronized void c(e eVar) {
        synchronized (a.class) {
            f59694c = null;
            f59693b = eVar;
        }
    }

    public final synchronized e b(Context context) {
        e eVar = f59693b;
        if (eVar == null) {
            f fVar = f59694c;
            e a10 = fVar == null ? null : fVar.a();
            if (a10 == null) {
                Context applicationContext = context.getApplicationContext();
                f fVar2 = applicationContext instanceof f ? (f) applicationContext : null;
                a10 = fVar2 == null ? null : fVar2.a();
                if (a10 == null) {
                    a10 = g.a(context);
                }
            }
            f59694c = null;
            f59693b = a10;
            return a10;
        }
        return eVar;
    }
}

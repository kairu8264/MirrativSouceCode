package ak;

import android.content.Context;

/* loaded from: classes3.dex */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    public static f f13353a;

    public static synchronized f a(Context context) {
        f fVar;
        synchronized (f2.class) {
            if (f13353a == null) {
                g1 g1Var = new g1(null);
                g1Var.b(new l4(dk.t.a(context)));
                f13353a = g1Var.a();
            }
            fVar = f13353a;
        }
        return fVar;
    }
}

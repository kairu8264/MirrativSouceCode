package o6;

import android.content.Context;
import b6.a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f44115a = new t();

    /* renamed from: b  reason: collision with root package name */
    public static b6.a f44116b;

    public final synchronized b6.a a(Context context) {
        b6.a aVar;
        aVar = f44116b;
        if (aVar == null) {
            aVar = new a.C0101a().b(go.e.f(k.m(context), "image_cache")).a();
            f44116b = aVar;
        }
        return aVar;
    }
}

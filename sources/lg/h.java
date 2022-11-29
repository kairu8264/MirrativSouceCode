package lg;

import android.content.Context;

/* loaded from: classes3.dex */
public final class h implements fg.b<String> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<Context> f40159a;

    public h(rn.a<Context> aVar) {
        this.f40159a = aVar;
    }

    public static h a(rn.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) fg.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public String get() {
        return c(this.f40159a.get());
    }
}

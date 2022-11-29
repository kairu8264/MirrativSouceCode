package um;

import android.content.Context;
import vk.q;

/* loaded from: classes4.dex */
public class h {

    /* loaded from: classes4.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static vk.d<?> b(String str, String str2) {
        return vk.d.i(f.a(str, str2), f.class);
    }

    public static vk.d<?> c(final String str, final a<Context> aVar) {
        return vk.d.j(f.class).b(q.j(Context.class)).f(new vk.h() { // from class: um.g
            @Override // vk.h
            public final Object a(vk.e eVar) {
                f d10;
                d10 = h.d(str, aVar, eVar);
                return d10;
            }
        }).d();
    }

    public static /* synthetic */ f d(String str, a aVar, vk.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}

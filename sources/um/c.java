package um;

import java.util.Iterator;
import java.util.Set;
import vk.q;

/* loaded from: classes4.dex */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final String f55982a;

    /* renamed from: b  reason: collision with root package name */
    public final d f55983b;

    public c(Set<f> set, d dVar) {
        this.f55982a = e(set);
        this.f55983b = dVar;
    }

    public static vk.d<i> c() {
        return vk.d.c(i.class).b(q.l(f.class)).f(b.f55981a).d();
    }

    public static /* synthetic */ i d(vk.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    public static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // um.i
    public String a() {
        if (this.f55983b.b().isEmpty()) {
            return this.f55982a;
        }
        return this.f55982a + ' ' + e(this.f55983b.b());
    }
}

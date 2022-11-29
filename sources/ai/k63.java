package ai;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class k63<P> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<j63, List<h63<P>>> f6102a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public h63<P> f6103b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<P> f6104c;

    public k63(Class<P> cls) {
        this.f6104c = cls;
    }

    public static <P> k63<P> b(Class<P> cls) {
        return new k63<>(cls);
    }

    public final h63<P> a() {
        return this.f6103b;
    }

    public final void c(h63<P> h63Var) {
        if (h63Var.c() == 3) {
            List<h63<P>> list = this.f6102a.get(new j63(h63Var.b(), null));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f6103b = h63Var;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }

    public final h63<P> d(P p10, pd3 pd3Var) throws GeneralSecurityException {
        byte[] array;
        if (pd3Var.F() == 3) {
            int G = pd3Var.G() - 2;
            if (G != 1) {
                if (G != 2) {
                    if (G == 3) {
                        array = o53.f7666a;
                    } else if (G != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(pd3Var.D()).array();
            } else {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(pd3Var.D()).array();
            }
            h63<P> h63Var = new h63<>(p10, array, pd3Var.F(), pd3Var.G(), pd3Var.D());
            ArrayList arrayList = new ArrayList();
            arrayList.add(h63Var);
            j63 j63Var = new j63(h63Var.b(), null);
            List<h63<P>> put = this.f6102a.put(j63Var, Collections.unmodifiableList(arrayList));
            if (put != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(put);
                arrayList2.add(h63Var);
                this.f6102a.put(j63Var, Collections.unmodifiableList(arrayList2));
            }
            return h63Var;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final Class<P> e() {
        return this.f6104c;
    }
}

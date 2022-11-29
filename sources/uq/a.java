package uq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.h;
import jo.p;
import org.koin.core.error.NoParameterFoundException;
import xn.a0;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0880a f56104b = new C0880a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<Object> f56105a;

    /* renamed from: uq.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0880a {
        public C0880a() {
        }

        public /* synthetic */ C0880a(h hVar) {
            this();
        }
    }

    public a() {
        this(null, 1, null);
    }

    public a(List<Object> list) {
        p.h(list, "_values");
        this.f56105a = list;
    }

    public final a a(Object obj) {
        p.h(obj, "value");
        this.f56105a.add(obj);
        return this;
    }

    public <T> T b(int i10, qo.b<?> bVar) {
        p.h(bVar, "clazz");
        if (this.f56105a.size() > i10) {
            return (T) this.f56105a.get(i10);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i10 + " from " + this + " for type '" + ar.a.a(bVar) + '\'');
    }

    public <T> T c(qo.b<?> bVar) {
        T t10;
        p.h(bVar, "clazz");
        Iterator<T> it = this.f56105a.iterator();
        do {
            t10 = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (bVar.a(next)) {
                t10 = next;
                continue;
            }
        } while (t10 == null);
        return t10;
    }

    public String toString() {
        return p.o("DefinitionParameters", a0.B0(this.f56105a));
    }

    public /* synthetic */ a(List list, int i10, h hVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}

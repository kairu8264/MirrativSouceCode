package ro;

import java.util.Iterator;
import jo.p;
import jo.q;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes4.dex */
public class l extends k {

    /* loaded from: classes4.dex */
    public static final class a implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f51629a;

        public a(Iterator it) {
            this.f51629a = it;
        }

        @Override // ro.g
        public Iterator<T> iterator() {
            return this.f51629a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements io.a<T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ T f51630w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t10) {
            super(0);
            this.f51630w = t10;
        }

        @Override // io.a
        public final T invoke() {
            return this.f51630w;
        }
    }

    public static final <T> g<T> c(Iterator<? extends T> it) {
        p.h(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> d(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        return gVar instanceof ro.a ? gVar : new ro.a(gVar);
    }

    public static final <T> g<T> e(T t10, io.l<? super T, ? extends T> lVar) {
        p.h(lVar, "nextFunction");
        if (t10 == null) {
            return d.f51611a;
        }
        return new f(new b(t10), lVar);
    }
}

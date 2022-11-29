package ro;

import io.p;
import java.util.Iterator;
import wn.v;

/* loaded from: classes4.dex */
public class j {

    /* loaded from: classes4.dex */
    public static final class a implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f51628a;

        public a(p pVar) {
            this.f51628a = pVar;
        }

        @Override // ro.g
        public Iterator<T> iterator() {
            return j.a(this.f51628a);
        }
    }

    public static final <T> Iterator<T> a(p<? super i<? super T>, ? super ao.d<? super v>, ? extends Object> pVar) {
        jo.p.h(pVar, "block");
        h hVar = new h();
        hVar.g(bo.b.a(pVar, hVar, hVar));
        return hVar;
    }

    public static final <T> g<T> b(p<? super i<? super T>, ? super ao.d<? super v>, ? extends Object> pVar) {
        jo.p.h(pVar, "block");
        return new a(pVar);
    }
}

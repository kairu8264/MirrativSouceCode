package u0;

import io.l;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jo.j0;
import jo.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: u0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0848a extends q implements p<k, Original, Object> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p<k, Original, List<Saveable>> f54219w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0848a(p<? super k, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f54219w = pVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(k kVar, Original original) {
            jo.p.h(kVar, "$this$Saver");
            List list = (List) this.f54219w.invoke(kVar, original);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj != null && !kVar.a(obj)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            if (!list.isEmpty()) {
                return new ArrayList(list);
            }
            return null;
        }
    }

    public static final <Original, Saveable> i<Original, Object> a(p<? super k, ? super Original, ? extends List<? extends Saveable>> pVar, l<? super List<? extends Saveable>, ? extends Original> lVar) {
        jo.p.h(pVar, "save");
        jo.p.h(lVar, "restore");
        return j.a(new C0848a(pVar), (l) j0.e(lVar, 1));
    }
}

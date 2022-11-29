package yo;

import ao.g;
import uo.d2;
import zo.g0;

/* loaded from: classes4.dex */
public final class t {

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.p<Integer, g.b, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r<?> f62138w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r<?> rVar) {
            super(2);
            this.f62138w = rVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f62138w.f62133x.get(key);
            if (key != d2.f56001s) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i10 + 1);
            }
            d2 d2Var = (d2) bVar2;
            d2 b10 = t.b((d2) bVar, d2Var);
            if (b10 == d2Var) {
                if (d2Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + d2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(r<?> rVar, ao.g gVar) {
        if (((Number) gVar.fold(0, new a(rVar))).intValue() == rVar.f62134y) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + rVar.f62133x + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final d2 b(d2 d2Var, d2 d2Var2) {
        while (d2Var != null) {
            if (d2Var == d2Var2 || !(d2Var instanceof g0)) {
                return d2Var;
            }
            d2Var = ((g0) d2Var).Z0();
        }
        return null;
    }
}

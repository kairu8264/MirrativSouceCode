package wn;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public class g {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59221a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.SYNCHRONIZED.ordinal()] = 1;
            iArr[i.PUBLICATION.ordinal()] = 2;
            iArr[i.NONE.ordinal()] = 3;
            f59221a = iArr;
        }
    }

    public static final <T> f<T> a(io.a<? extends T> aVar) {
        jo.p.h(aVar, "initializer");
        return new o(aVar, null, 2, null);
    }

    public static final <T> f<T> b(i iVar, io.a<? extends T> aVar) {
        jo.p.h(iVar, "mode");
        jo.p.h(aVar, "initializer");
        int i10 = a.f59221a[iVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new w(aVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new n(aVar);
        }
        return new o(aVar, null, 2, null);
    }
}

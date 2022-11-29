package p2;

import jo.p;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f45737a;

        static {
            int[] iArr = new int[j.values().length];
            iArr[j.SecureOff.ordinal()] = 1;
            iArr[j.SecureOn.ordinal()] = 2;
            iArr[j.Inherit.ordinal()] = 3;
            f45737a = iArr;
        }
    }

    public static final boolean a(j jVar, boolean z10) {
        p.h(jVar, "<this>");
        int i10 = a.f45737a[jVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return z10;
                }
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        return false;
    }
}

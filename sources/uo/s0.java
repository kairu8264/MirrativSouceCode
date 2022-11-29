package uo;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public enum s0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56083a;

        static {
            int[] iArr = new int[s0.values().length];
            iArr[s0.DEFAULT.ordinal()] = 1;
            iArr[s0.ATOMIC.ordinal()] = 2;
            iArr[s0.UNDISPATCHED.ordinal()] = 3;
            iArr[s0.LAZY.ordinal()] = 4;
            f56083a = iArr;
        }
    }

    public final <R, T> void c(io.p<? super R, ? super ao.d<? super T>, ? extends Object> pVar, R r10, ao.d<? super T> dVar) {
        int i10 = a.f56083a[ordinal()];
        if (i10 == 1) {
            ap.a.d(pVar, r10, dVar, null, 4, null);
        } else if (i10 == 2) {
            ao.f.b(pVar, r10, dVar);
        } else if (i10 == 3) {
            ap.b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean e() {
        return this == LAZY;
    }
}

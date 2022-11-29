package wo;

/* loaded from: classes4.dex */
public final class g {
    public static final <E> f<E> a(int i10) {
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        return new d(i10);
                    }
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            }
            return new q();
        }
        return new d(i.f59275t.a());
    }
}

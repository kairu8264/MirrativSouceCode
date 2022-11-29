package yo;

import xo.g0;

/* loaded from: classes4.dex */
public final class w extends xo.x<Integer> implements g0<Integer> {
    public w(int i10) {
        super(1, Integer.MAX_VALUE, wo.h.DROP_OLDEST);
        b(Integer.valueOf(i10));
    }

    @Override // xo.g0
    /* renamed from: Z */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(M().intValue());
        }
        return valueOf;
    }

    public final boolean a0(int i10) {
        boolean b10;
        synchronized (this) {
            b10 = b(Integer.valueOf(M().intValue() + i10));
        }
        return b10;
    }
}

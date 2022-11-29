package ue;

import jo.h;

/* loaded from: classes2.dex */
public enum a {
    LEVEL0(0.0d),
    LEVEL1(0.2d),
    LEVEL2(0.5d),
    LEVEL3(1.0d);
    
    public static final C0871a Companion = new C0871a(null);
    private final double rawValue;

    /* renamed from: ue.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0871a {
        public C0871a() {
        }

        public /* synthetic */ C0871a(h hVar) {
            this();
        }

        public final a a(double d10) {
            if (d10 > -24.0d) {
                return a.LEVEL3;
            }
            if (d10 > -28.0d) {
                return a.LEVEL2;
            }
            if (d10 > -32.0d) {
                return a.LEVEL1;
            }
            return a.LEVEL0;
        }
    }

    a(double d10) {
        this.rawValue = d10;
    }

    public final a c() {
        return this == LEVEL3 ? LEVEL2 : this == LEVEL2 ? LEVEL1 : this == LEVEL1 ? LEVEL0 : LEVEL0;
    }

    public final double e() {
        return this.rawValue;
    }

    public final a h() {
        a aVar = LEVEL0;
        if (this == aVar) {
            return LEVEL1;
        }
        if (this == LEVEL1) {
            return LEVEL2;
        }
        if (this == LEVEL2) {
            return LEVEL3;
        }
        a aVar2 = LEVEL3;
        return this == aVar2 ? aVar2 : aVar;
    }
}

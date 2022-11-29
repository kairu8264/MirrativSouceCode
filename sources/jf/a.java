package jf;

/* loaded from: classes2.dex */
public enum a {
    UNKNOWN(0),
    GAME_ID(1),
    URL(2);
    
    public static final C0525a Companion = new C0525a(null);
    private final int rawValue;

    /* renamed from: jf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0525a {
        public C0525a() {
        }

        public /* synthetic */ C0525a(jo.h hVar) {
            this();
        }

        public final a a(int i10) {
            a aVar;
            a[] values = a.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i11];
                if (aVar.c() == i10) {
                    break;
                }
                i11++;
            }
            return aVar == null ? a.UNKNOWN : aVar;
        }
    }

    a(int i10) {
        this.rawValue = i10;
    }

    public final int c() {
        return this.rawValue;
    }
}

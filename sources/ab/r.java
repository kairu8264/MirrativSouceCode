package ab;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public enum r {
    RECEIPT_ERROR(-1),
    ERROR(0),
    SUCCESS(1),
    USED(2),
    PENDING(3);
    
    public static final a Companion = new a(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r a(int i10) {
            r[] values;
            for (r rVar : r.values()) {
                if (rVar.c() == i10) {
                    return rVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    r(int i10) {
        this.rawValue = i10;
    }

    public final int c() {
        return this.rawValue;
    }
}

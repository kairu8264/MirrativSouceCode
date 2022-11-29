package c9;

/* loaded from: classes.dex */
public enum u {
    STREAMS(0),
    USERS(1),
    APPS(2);
    
    public static final a Companion = new a(null);
    private final int value;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(Integer num) {
            u uVar;
            u[] values = u.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    uVar = null;
                    break;
                }
                uVar = values[i10];
                if (num != null && uVar.c() == num.intValue()) {
                    break;
                }
                i10++;
            }
            return uVar == null ? u.USERS : uVar;
        }
    }

    u(int i10) {
        this.value = i10;
    }

    public final int c() {
        return this.value;
    }
}

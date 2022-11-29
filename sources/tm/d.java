package tm;

import com.google.protobuf.t;

/* loaded from: classes4.dex */
public enum d implements t.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final t.d<d> internalValueMap = new t.d<d>() { // from class: tm.d.a
        @Override // com.google.protobuf.t.d
        /* renamed from: b */
        public d a(int i10) {
            return d.a(i10);
        }
    };
    private final int value;

    /* loaded from: classes4.dex */
    public static final class b implements t.e {

        /* renamed from: a  reason: collision with root package name */
        public static final t.e f53823a = new b();

        @Override // com.google.protobuf.t.e
        public boolean a(int i10) {
            return d.a(i10) != null;
        }
    }

    d(int i10) {
        this.value = i10;
    }

    public static d a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static t.e c() {
        return b.f53823a;
    }

    @Override // com.google.protobuf.t.c
    public final int getNumber() {
        return this.value;
    }
}

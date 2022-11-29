package tm;

import com.google.protobuf.t;

/* loaded from: classes4.dex */
public enum l implements t.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final t.d<l> internalValueMap = new t.d<l>() { // from class: tm.l.a
        @Override // com.google.protobuf.t.d
        /* renamed from: b */
        public l a(int i10) {
            return l.a(i10);
        }
    };
    private final int value;

    /* loaded from: classes4.dex */
    public static final class b implements t.e {

        /* renamed from: a  reason: collision with root package name */
        public static final t.e f53833a = new b();

        @Override // com.google.protobuf.t.e
        public boolean a(int i10) {
            return l.a(i10) != null;
        }
    }

    l(int i10) {
        this.value = i10;
    }

    public static l a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static t.e c() {
        return b.f53833a;
    }

    @Override // com.google.protobuf.t.c
    public final int getNumber() {
        return this.value;
    }
}

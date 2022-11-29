package mp;

/* loaded from: classes4.dex */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final C0607a Companion = new C0607a(null);
    private final int httpCode;

    /* renamed from: mp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0607a {
        public C0607a() {
        }

        public final a a(int i10) {
            a[] values;
            for (a aVar : a.values()) {
                if (aVar.a() == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public /* synthetic */ C0607a(jo.h hVar) {
            this();
        }
    }

    a(int i10) {
        this.httpCode = i10;
    }

    public final int a() {
        return this.httpCode;
    }
}

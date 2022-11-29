package tm;

import com.google.protobuf.a0;
import com.google.protobuf.p0;
import com.google.protobuf.r;
import com.google.protobuf.t;
import com.google.protobuf.z;
import fn.q;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h extends r<h, b> implements fn.n {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile q<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private a0<String, String> customAttributes_ = a0.h();
    private String url_ = "";
    private String responseContentType_ = "";
    private t.i<k> perfSessions_ = r.C();

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53827a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53827a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53827a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53827a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53827a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53827a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53827a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53827a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<h, b> implements fn.n {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b G(Iterable<? extends k> iterable) {
            A();
            ((h) this.f28203x).e0(iterable);
            return this;
        }

        public b H() {
            A();
            ((h) this.f28203x).m0().clear();
            return this;
        }

        public b I() {
            A();
            ((h) this.f28203x).f0();
            return this;
        }

        public long J() {
            return ((h) this.f28203x).u0();
        }

        public String K() {
            return ((h) this.f28203x).v0();
        }

        public boolean L() {
            return ((h) this.f28203x).w0();
        }

        public boolean M() {
            return ((h) this.f28203x).y0();
        }

        public boolean N() {
            return ((h) this.f28203x).C0();
        }

        public b O(Map<String, String> map) {
            A();
            ((h) this.f28203x).m0().putAll(map);
            return this;
        }

        public b Q(long j10) {
            A();
            ((h) this.f28203x).G0(j10);
            return this;
        }

        public b R(d dVar) {
            A();
            ((h) this.f28203x).H0(dVar);
            return this;
        }

        public b T(int i10) {
            A();
            ((h) this.f28203x).I0(i10);
            return this;
        }

        public b V(e eVar) {
            A();
            ((h) this.f28203x).J0(eVar);
            return this;
        }

        public b W(long j10) {
            A();
            ((h) this.f28203x).K0(j10);
            return this;
        }

        public b X(String str) {
            A();
            ((h) this.f28203x).L0(str);
            return this;
        }

        public b Y(long j10) {
            A();
            ((h) this.f28203x).M0(j10);
            return this;
        }

        public b Z(long j10) {
            A();
            ((h) this.f28203x).N0(j10);
            return this;
        }

        public b a0(long j10) {
            A();
            ((h) this.f28203x).O0(j10);
            return this;
        }

        public b b0(long j10) {
            A();
            ((h) this.f28203x).P0(j10);
            return this;
        }

        public b c0(String str) {
            A();
            ((h) this.f28203x).Q0(str);
            return this;
        }

        public b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final z<String, String> f53828a;

        static {
            p0.b bVar = p0.b.STRING;
            f53828a = z.d(bVar, "", bVar, "");
        }
    }

    /* loaded from: classes4.dex */
    public enum d implements t.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final t.d<d> internalValueMap = new a();
        private final int value;

        /* loaded from: classes4.dex */
        public class a implements t.d<d> {
            @Override // com.google.protobuf.t.d
            /* renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements t.e {

            /* renamed from: a  reason: collision with root package name */
            public static final t.e f53829a = new b();

            @Override // com.google.protobuf.t.e
            public boolean a(int i10) {
                return d.a(i10) != null;
            }
        }

        d(int i10) {
            this.value = i10;
        }

        public static d a(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static t.e c() {
            return b.f53829a;
        }

        @Override // com.google.protobuf.t.c
        public final int getNumber() {
            return this.value;
        }
    }

    /* loaded from: classes4.dex */
    public enum e implements t.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final t.d<e> internalValueMap = new a();
        private final int value;

        /* loaded from: classes4.dex */
        public class a implements t.d<e> {
            @Override // com.google.protobuf.t.d
            /* renamed from: b */
            public e a(int i10) {
                return e.a(i10);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements t.e {

            /* renamed from: a  reason: collision with root package name */
            public static final t.e f53830a = new b();

            @Override // com.google.protobuf.t.e
            public boolean a(int i10) {
                return e.a(i10) != null;
            }
        }

        e(int i10) {
            this.value = i10;
        }

        public static e a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return GENERIC_CLIENT_ERROR;
            }
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }

        public static t.e c() {
            return b.f53830a;
        }

        @Override // com.google.protobuf.t.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        r.N(h.class, hVar);
    }

    public static b F0() {
        return DEFAULT_INSTANCE.x();
    }

    public static h i0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53827a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.c(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.c(), "customAttributes_", c.f53828a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<h> qVar = PARSER;
                if (qVar == null) {
                    synchronized (h.class) {
                        qVar = PARSER;
                        if (qVar == null) {
                            qVar = new r.b<>(DEFAULT_INSTANCE);
                            PARSER = qVar;
                        }
                    }
                }
                return qVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean A0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean B0() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean C0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean D0() {
        return (this.bitField0_ & 512) != 0;
    }

    public final a0<String, String> E0() {
        if (!this.customAttributes_.o()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public final void G0(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    public final void H0(d dVar) {
        this.httpMethod_ = dVar.getNumber();
        this.bitField0_ |= 2;
    }

    public final void I0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    public final void J0(e eVar) {
        this.networkClientErrorReason_ = eVar.getNumber();
        this.bitField0_ |= 16;
    }

    public final void K0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    public final void L0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void M0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    public final void N0(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    public final void O0(long j10) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j10;
    }

    public final void P0(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    public final void Q0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    public final void e0(Iterable<? extends k> iterable) {
        g0();
        com.google.protobuf.a.d(iterable, this.perfSessions_);
    }

    public final void f0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = i0().p0();
    }

    public final void g0() {
        t.i<k> iVar = this.perfSessions_;
        if (iVar.L0()) {
            return;
        }
        this.perfSessions_ = r.J(iVar);
    }

    public long h0() {
        return this.clientStartTimeUs_;
    }

    public d j0() {
        d a10 = d.a(this.httpMethod_);
        return a10 == null ? d.HTTP_METHOD_UNKNOWN : a10;
    }

    public int l0() {
        return this.httpResponseCode_;
    }

    public final Map<String, String> m0() {
        return E0();
    }

    public List<k> n0() {
        return this.perfSessions_;
    }

    public long o0() {
        return this.requestPayloadBytes_;
    }

    public String p0() {
        return this.responseContentType_;
    }

    public long q0() {
        return this.responsePayloadBytes_;
    }

    public long s0() {
        return this.timeToRequestCompletedUs_;
    }

    public long t0() {
        return this.timeToResponseCompletedUs_;
    }

    public long u0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String v0() {
        return this.url_;
    }

    public boolean w0() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean x0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean y0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean z0() {
        return (this.bitField0_ & 4) != 0;
    }
}

package tm;

import com.google.protobuf.r;
import fn.q;
import tm.c;

/* loaded from: classes4.dex */
public final class i extends r<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile q<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53831a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53831a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53831a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53831a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53831a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53831a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53831a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53831a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<i, b> implements j {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b G(c.b bVar) {
            A();
            ((i) this.f28203x).X(bVar.a());
            return this;
        }

        public b H(g gVar) {
            A();
            ((i) this.f28203x).Y(gVar);
            return this;
        }

        public b I(h hVar) {
            A();
            ((i) this.f28203x).Z(hVar);
            return this;
        }

        public b J(m mVar) {
            A();
            ((i) this.f28203x).a0(mVar);
            return this;
        }

        @Override // tm.j
        public boolean b() {
            return ((i) this.f28203x).b();
        }

        @Override // tm.j
        public boolean f() {
            return ((i) this.f28203x).f();
        }

        @Override // tm.j
        public h g() {
            return ((i) this.f28203x).g();
        }

        @Override // tm.j
        public boolean m() {
            return ((i) this.f28203x).m();
        }

        @Override // tm.j
        public m n() {
            return ((i) this.f28203x).n();
        }

        @Override // tm.j
        public g o() {
            return ((i) this.f28203x).o();
        }

        public b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        r.N(i.class, iVar);
    }

    public static b W() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53831a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<i> qVar = PARSER;
                if (qVar == null) {
                    synchronized (i.class) {
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

    public c U() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.W() : cVar;
    }

    public boolean V() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void X(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    public final void Y(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    public final void Z(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    public final void a0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    @Override // tm.j
    public boolean b() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // tm.j
    public boolean f() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // tm.j
    public h g() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.i0() : hVar;
    }

    @Override // tm.j
    public boolean m() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // tm.j
    public m n() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.i0() : mVar;
    }

    @Override // tm.j
    public g o() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.a0() : gVar;
    }
}

package tm;

import com.google.protobuf.r;
import com.google.protobuf.t;
import fn.q;

/* loaded from: classes4.dex */
public final class g extends r<g, b> implements fn.n {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile q<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private t.i<e> cpuMetricReadings_ = r.C();
    private t.i<tm.b> androidMemoryReadings_ = r.C();

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53826a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53826a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53826a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53826a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53826a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53826a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53826a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53826a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<g, b> implements fn.n {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b G(tm.b bVar) {
            A();
            ((g) this.f28203x).U(bVar);
            return this;
        }

        public b H(e eVar) {
            A();
            ((g) this.f28203x).V(eVar);
            return this;
        }

        public b I(f fVar) {
            A();
            ((g) this.f28203x).f0(fVar);
            return this;
        }

        public b J(String str) {
            A();
            ((g) this.f28203x).g0(str);
            return this;
        }

        public b() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        r.N(g.class, gVar);
    }

    public static g a0() {
        return DEFAULT_INSTANCE;
    }

    public static b e0() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53826a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", tm.b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<g> qVar = PARSER;
                if (qVar == null) {
                    synchronized (g.class) {
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

    public final void U(tm.b bVar) {
        bVar.getClass();
        W();
        this.androidMemoryReadings_.add(bVar);
    }

    public final void V(e eVar) {
        eVar.getClass();
        X();
        this.cpuMetricReadings_.add(eVar);
    }

    public final void W() {
        t.i<tm.b> iVar = this.androidMemoryReadings_;
        if (iVar.L0()) {
            return;
        }
        this.androidMemoryReadings_ = r.J(iVar);
    }

    public final void X() {
        t.i<e> iVar = this.cpuMetricReadings_;
        if (iVar.L0()) {
            return;
        }
        this.cpuMetricReadings_ = r.J(iVar);
    }

    public int Y() {
        return this.androidMemoryReadings_.size();
    }

    public int Z() {
        return this.cpuMetricReadings_.size();
    }

    public f b0() {
        f fVar = this.gaugeMetadata_;
        return fVar == null ? f.U() : fVar;
    }

    public boolean c0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean d0() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void f0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    public final void g0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}

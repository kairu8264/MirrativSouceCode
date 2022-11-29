package tm;

import com.google.protobuf.a0;
import com.google.protobuf.p0;
import com.google.protobuf.r;
import com.google.protobuf.t;
import com.google.protobuf.z;
import fn.q;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m extends r<m, b> implements fn.n {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile q<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private a0<String, Long> counters_ = a0.h();
    private a0<String, String> customAttributes_ = a0.h();
    private String name_ = "";
    private t.i<m> subtraces_ = r.C();
    private t.i<k> perfSessions_ = r.C();

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53834a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53834a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53834a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53834a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53834a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53834a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53834a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53834a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<m, b> implements fn.n {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b G(Iterable<? extends k> iterable) {
            A();
            ((m) this.f28203x).Z(iterable);
            return this;
        }

        public b H(Iterable<? extends m> iterable) {
            A();
            ((m) this.f28203x).a0(iterable);
            return this;
        }

        public b I(k kVar) {
            A();
            ((m) this.f28203x).b0(kVar);
            return this;
        }

        public b J(m mVar) {
            A();
            ((m) this.f28203x).c0(mVar);
            return this;
        }

        public b K(Map<String, Long> map) {
            A();
            ((m) this.f28203x).l0().putAll(map);
            return this;
        }

        public b L(Map<String, String> map) {
            A();
            ((m) this.f28203x).m0().putAll(map);
            return this;
        }

        public b M(String str, long j10) {
            str.getClass();
            A();
            ((m) this.f28203x).l0().put(str, Long.valueOf(j10));
            return this;
        }

        public b N(long j10) {
            A();
            ((m) this.f28203x).x0(j10);
            return this;
        }

        public b O(long j10) {
            A();
            ((m) this.f28203x).y0(j10);
            return this;
        }

        public b Q(String str) {
            A();
            ((m) this.f28203x).z0(str);
            return this;
        }

        public b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final z<String, Long> f53835a = z.d(p0.b.STRING, "", p0.b.INT64, 0L);
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final z<String, String> f53836a;

        static {
            p0.b bVar = p0.b.STRING;
            f53836a = z.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        r.N(m.class, mVar);
    }

    public static m i0() {
        return DEFAULT_INSTANCE;
    }

    public static b w0() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53834a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f53835a, "subtraces_", m.class, "customAttributes_", d.f53836a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<m> qVar = PARSER;
                if (qVar == null) {
                    synchronized (m.class) {
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

    public final void Z(Iterable<? extends k> iterable) {
        d0();
        com.google.protobuf.a.d(iterable, this.perfSessions_);
    }

    public final void a0(Iterable<? extends m> iterable) {
        e0();
        com.google.protobuf.a.d(iterable, this.subtraces_);
    }

    public final void b0(k kVar) {
        kVar.getClass();
        d0();
        this.perfSessions_.add(kVar);
    }

    public final void c0(m mVar) {
        mVar.getClass();
        e0();
        this.subtraces_.add(mVar);
    }

    public final void d0() {
        t.i<k> iVar = this.perfSessions_;
        if (iVar.L0()) {
            return;
        }
        this.perfSessions_ = r.J(iVar);
    }

    public final void e0() {
        t.i<m> iVar = this.subtraces_;
        if (iVar.L0()) {
            return;
        }
        this.subtraces_ = r.J(iVar);
    }

    public int f0() {
        return s0().size();
    }

    public Map<String, Long> g0() {
        return Collections.unmodifiableMap(s0());
    }

    public Map<String, String> h0() {
        return Collections.unmodifiableMap(t0());
    }

    public long j0() {
        return this.durationUs_;
    }

    public final Map<String, Long> l0() {
        return u0();
    }

    public final Map<String, String> m0() {
        return v0();
    }

    public String n0() {
        return this.name_;
    }

    public List<k> o0() {
        return this.perfSessions_;
    }

    public List<m> p0() {
        return this.subtraces_;
    }

    public boolean q0() {
        return (this.bitField0_ & 4) != 0;
    }

    public final a0<String, Long> s0() {
        return this.counters_;
    }

    public final a0<String, String> t0() {
        return this.customAttributes_;
    }

    public final a0<String, Long> u0() {
        if (!this.counters_.o()) {
            this.counters_ = this.counters_.s();
        }
        return this.counters_;
    }

    public final a0<String, String> v0() {
        if (!this.customAttributes_.o()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public final void x0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    public final void y0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    public final void z0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }
}

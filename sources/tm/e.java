package tm;

import com.google.protobuf.r;
import fn.q;

/* loaded from: classes4.dex */
public final class e extends r<e, b> implements fn.n {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile q<e> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53824a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53824a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53824a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53824a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53824a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53824a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53824a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53824a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<e, b> implements fn.n {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b G(long j10) {
            A();
            ((e) this.f28203x).U(j10);
            return this;
        }

        public b H(long j10) {
            A();
            ((e) this.f28203x).V(j10);
            return this;
        }

        public b I(long j10) {
            A();
            ((e) this.f28203x).W(j10);
            return this;
        }

        public b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        r.N(e.class, eVar);
    }

    public static b T() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53824a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<e> qVar = PARSER;
                if (qVar == null) {
                    synchronized (e.class) {
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

    public final void U(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    public final void V(long j10) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j10;
    }

    public final void W(long j10) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j10;
    }
}

package tm;

import com.google.protobuf.r;
import fn.q;

/* loaded from: classes4.dex */
public final class b extends r<b, C0839b> implements fn.n {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile q<b> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53820a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53820a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53820a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53820a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53820a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53820a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53820a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53820a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: tm.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0839b extends r.a<b, C0839b> implements fn.n {
        public /* synthetic */ C0839b(a aVar) {
            this();
        }

        public C0839b G(long j10) {
            A();
            ((b) this.f28203x).T(j10);
            return this;
        }

        public C0839b H(int i10) {
            A();
            ((b) this.f28203x).U(i10);
            return this;
        }

        public C0839b() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        r.N(b.class, bVar);
    }

    public static C0839b S() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53820a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0839b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<b> qVar = PARSER;
                if (qVar == null) {
                    synchronized (b.class) {
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

    public final void T(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    public final void U(int i10) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i10;
    }
}

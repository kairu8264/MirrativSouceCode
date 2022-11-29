package tm;

import com.google.protobuf.r;
import com.google.protobuf.t;
import fn.q;

/* loaded from: classes4.dex */
public final class n extends r<n, b> implements fn.n {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile q<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53837a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53837a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53837a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53837a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53837a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53837a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53837a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53837a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<n, b> implements fn.n {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes4.dex */
    public enum c implements t.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        
        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final t.d<c> internalValueMap = new a();
        private final int value;

        /* loaded from: classes4.dex */
        public class a implements t.d<c> {
            @Override // com.google.protobuf.t.d
            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements t.e {

            /* renamed from: a  reason: collision with root package name */
            public static final t.e f53838a = new b();

            @Override // com.google.protobuf.t.e
            public boolean a(int i10) {
                return c.a(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return FL_LEGACY_V1;
            }
            return SOURCE_UNKNOWN;
        }

        public static t.e c() {
            return b.f53838a;
        }

        @Override // com.google.protobuf.t.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        r.N(n.class, nVar);
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53837a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.c()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<n> qVar = PARSER;
                if (qVar == null) {
                    synchronized (n.class) {
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
}

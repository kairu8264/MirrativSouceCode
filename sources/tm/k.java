package tm;

import com.google.protobuf.r;
import com.google.protobuf.t;
import fn.q;

/* loaded from: classes4.dex */
public final class k extends r<k, c> implements fn.n {
    private static final k DEFAULT_INSTANCE;
    private static volatile q<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final fn.g<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private t.g sessionVerbosity_ = r.B();

    /* loaded from: classes4.dex */
    public class a implements fn.g<Integer, l> {
        @Override // fn.g
        /* renamed from: b */
        public l a(Integer num) {
            l a10 = l.a(num.intValue());
            return a10 == null ? l.SESSION_VERBOSITY_NONE : a10;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53832a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53832a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53832a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53832a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53832a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53832a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53832a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53832a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends r.a<k, c> implements fn.n {
        public /* synthetic */ c(a aVar) {
            this();
        }

        public c G(l lVar) {
            A();
            ((k) this.f28203x).S(lVar);
            return this;
        }

        public c H(String str) {
            A();
            ((k) this.f28203x).X(str);
            return this;
        }

        public c() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        r.N(k.class, kVar);
    }

    public static c W() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (b.f53832a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.c()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<k> qVar = PARSER;
                if (qVar == null) {
                    synchronized (k.class) {
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

    public final void S(l lVar) {
        lVar.getClass();
        T();
        this.sessionVerbosity_.Y0(lVar.getNumber());
    }

    public final void T() {
        t.g gVar = this.sessionVerbosity_;
        if (gVar.L0()) {
            return;
        }
        this.sessionVerbosity_ = r.I(gVar);
    }

    public l U(int i10) {
        return sessionVerbosity_converter_.a(Integer.valueOf(this.sessionVerbosity_.getInt(i10)));
    }

    public int V() {
        return this.sessionVerbosity_.size();
    }

    public final void X(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}

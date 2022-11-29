package tm;

import com.google.protobuf.r;
import fn.q;

/* loaded from: classes4.dex */
public final class a extends r<a, b> implements fn.n {
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile q<a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: tm.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C0838a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53819a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53819a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53819a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53819a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53819a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53819a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53819a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53819a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<a, b> implements fn.n {
        public /* synthetic */ b(C0838a c0838a) {
            this();
        }

        public b G(String str) {
            A();
            ((a) this.f28203x).X(str);
            return this;
        }

        public b H(String str) {
            A();
            ((a) this.f28203x).Y(str);
            return this;
        }

        public b I(String str) {
            A();
            ((a) this.f28203x).Z(str);
            return this;
        }

        public b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        r.N(a.class, aVar);
    }

    public static a T() {
        return DEFAULT_INSTANCE;
    }

    public static b W() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (C0838a.f53819a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<a> qVar = PARSER;
                if (qVar == null) {
                    synchronized (a.class) {
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

    public boolean U() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean V() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void X(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final void Y(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    public final void Z(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }
}

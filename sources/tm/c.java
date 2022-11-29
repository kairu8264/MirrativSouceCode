package tm;

import com.google.protobuf.a0;
import com.google.protobuf.p0;
import com.google.protobuf.r;
import com.google.protobuf.z;
import fn.q;
import java.util.Map;
import tm.a;

/* loaded from: classes4.dex */
public final class c extends r<c, b> implements fn.n {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile q<c> PARSER;
    private tm.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private a0<String, String> customAttributes_ = a0.h();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53821a;

        static {
            int[] iArr = new int[r.f.values().length];
            f53821a = iArr;
            try {
                iArr[r.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53821a[r.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53821a[r.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53821a[r.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53821a[r.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53821a[r.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53821a[r.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r.a<c, b> implements fn.n {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public boolean G() {
            return ((c) this.f28203x).Z();
        }

        public b H(Map<String, String> map) {
            A();
            ((c) this.f28203x).X().putAll(map);
            return this;
        }

        public b I(a.b bVar) {
            A();
            ((c) this.f28203x).e0(bVar.a());
            return this;
        }

        public b J(String str) {
            A();
            ((c) this.f28203x).f0(str);
            return this;
        }

        public b K(d dVar) {
            A();
            ((c) this.f28203x).g0(dVar);
            return this;
        }

        public b L(String str) {
            A();
            ((c) this.f28203x).h0(str);
            return this;
        }

        public b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: tm.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0840c {

        /* renamed from: a  reason: collision with root package name */
        public static final z<String, String> f53822a;

        static {
            p0.b bVar = p0.b.STRING;
            f53822a = z.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        r.N(c.class, cVar);
    }

    public static c W() {
        return DEFAULT_INSTANCE;
    }

    public static b d0() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.r
    public final Object A(r.f fVar, Object obj, Object obj2) {
        switch (a.f53821a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(null);
            case 3:
                return r.L(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.c(), "customAttributes_", C0840c.f53822a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q<c> qVar = PARSER;
                if (qVar == null) {
                    synchronized (c.class) {
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

    public tm.a V() {
        tm.a aVar = this.androidAppInfo_;
        return aVar == null ? tm.a.T() : aVar;
    }

    public final Map<String, String> X() {
        return c0();
    }

    public boolean Y() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean Z() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean a0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean b0() {
        return (this.bitField0_ & 1) != 0;
    }

    public final a0<String, String> c0() {
        if (!this.customAttributes_.o()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public final void e0(tm.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    public final void f0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public final void g0(d dVar) {
        this.applicationProcessState_ = dVar.getNumber();
        this.bitField0_ |= 8;
    }

    public final void h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }
}

package op;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import jo.p;

/* loaded from: classes4.dex */
public final class l extends f {

    /* renamed from: j  reason: collision with root package name */
    public static final a f45516j = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public final Class<? super SSLSocketFactory> f45517h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f45518i;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public static /* synthetic */ k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String str) {
            p.h(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                p.g(cls3, "paramsClass");
                return new l(cls, cls2, cls3);
            } catch (Exception e10) {
                np.h.f43761c.g().j("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        p.h(cls, "sslSocketClass");
        p.h(cls2, "sslSocketFactoryClass");
        p.h(cls3, "paramClass");
        this.f45517h = cls2;
        this.f45518i = cls3;
    }
}

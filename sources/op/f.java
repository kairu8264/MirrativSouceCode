package op;

import ep.a0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jo.p;
import op.j;
import so.n;

/* loaded from: classes4.dex */
public class f implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final j.a f45498f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f45499g;

    /* renamed from: a  reason: collision with root package name */
    public final Method f45500a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f45501b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f45502c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f45503d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<? super SSLSocket> f45504e;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: op.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0687a implements j.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f45505a;

            public C0687a(String str) {
                this.f45505a = str;
            }

            @Override // op.j.a
            public boolean a(SSLSocket sSLSocket) {
                p.h(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                p.g(name, "sslSocket.javaClass.name");
                return n.C(name, this.f45505a + '.', false, 2, null);
            }

            @Override // op.j.a
            public k b(SSLSocket sSLSocket) {
                p.h(sSLSocket, "sslSocket");
                return f.f45499g.b(sSLSocket.getClass());
            }
        }

        public a() {
        }

        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!p.c(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            p.e(cls2);
            return new f(cls2);
        }

        public final j.a c(String str) {
            p.h(str, "packageName");
            return new C0687a(str);
        }

        public final j.a d() {
            return f.f45498f;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f45499g = aVar;
        f45498f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) {
        p.h(cls, "sslSocketClass");
        this.f45504e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        p.g(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f45500a = declaredMethod;
        this.f45501b = cls.getMethod("setHostname", String.class);
        this.f45502c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f45503d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // op.k
    public boolean a(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        return this.f45504e.isInstance(sSLSocket);
    }

    @Override // op.k
    public boolean b() {
        return np.b.f43733g.b();
    }

    @Override // op.k
    public String c(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f45502c.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    p.g(charset, "StandardCharsets.UTF_8");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (NullPointerException e11) {
                if (p.c(e11.getMessage(), "ssl == null")) {
                    return null;
                }
                throw e11;
            } catch (InvocationTargetException e12) {
                throw new AssertionError(e12);
            }
        }
        return null;
    }

    @Override // op.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f45500a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f45501b.invoke(sSLSocket, str);
                }
                this.f45503d.invoke(sSLSocket, np.h.f43761c.c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}

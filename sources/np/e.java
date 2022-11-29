package np;

import ep.a0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import jo.p;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final b f43745i = new b(null);

    /* renamed from: d  reason: collision with root package name */
    public final Method f43746d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f43747e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f43748f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f43749g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f43750h;

    /* loaded from: classes4.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f43751a;

        /* renamed from: b  reason: collision with root package name */
        public String f43752b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f43753c;

        public a(List<String> list) {
            p.h(list, "protocols");
            this.f43753c = list;
        }

        public final String a() {
            return this.f43752b;
        }

        public final boolean b() {
            return this.f43751a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            p.h(obj, "proxy");
            p.h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (p.c(name, "supports") && p.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (p.c(name, "unsupported") && p.c(Void.TYPE, returnType)) {
                this.f43751a = true;
                return null;
            }
            if (p.c(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f43753c;
                }
            }
            if ((p.c(name, "selectProtocol") || p.c(name, "select")) && p.c(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list.get(i10);
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!this.f43753c.contains(str)) {
                            if (i10 == size) {
                                break;
                            }
                            i10++;
                        } else {
                            this.f43752b = str;
                            return str;
                        }
                    }
                }
                String str2 = this.f43753c.get(0);
                this.f43752b = str2;
                return str2;
            } else if ((p.c(name, "protocolSelected") || p.c(name, "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f43752b = (String) obj4;
                return null;
            } else {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                p.g(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                p.g(method, "putMethod");
                p.g(method2, "getMethod");
                p.g(method3, "removeMethod");
                p.g(cls3, "clientProviderClass");
                p.g(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        p.h(method, "putMethod");
        p.h(method2, "getMethod");
        p.h(method3, "removeMethod");
        p.h(cls, "clientProviderClass");
        p.h(cls2, "serverProviderClass");
        this.f43746d = method;
        this.f43747e = method2;
        this.f43748f = method3;
        this.f43749g = cls;
        this.f43750h = cls2;
    }

    @Override // np.h
    public void b(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        try {
            this.f43748f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        try {
            this.f43746d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f43749g, this.f43750h}, new a(h.f43761c.b(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f43747e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    h.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}

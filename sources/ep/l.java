package ep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final i[] f30944e;

    /* renamed from: f  reason: collision with root package name */
    public static final i[] f30945f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f30946g;

    /* renamed from: h  reason: collision with root package name */
    public static final l f30947h;

    /* renamed from: i  reason: collision with root package name */
    public static final l f30948i;

    /* renamed from: j  reason: collision with root package name */
    public static final l f30949j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f30950k = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30951a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30952b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f30953c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f30954d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f30955a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f30956b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f30957c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f30958d;

        public a(boolean z10) {
            this.f30955a = z10;
        }

        public final l a() {
            return new l(this.f30955a, this.f30958d, this.f30956b, this.f30957c);
        }

        public final a b(i... iVarArr) {
            jo.p.h(iVarArr, "cipherSuites");
            if (this.f30955a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i iVar : iVarArr) {
                    arrayList.add(iVar.c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return c((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(String... strArr) {
            jo.p.h(strArr, "cipherSuites");
            if (this.f30955a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f30956b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z10) {
            if (this.f30955a) {
                this.f30958d = z10;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(g0... g0VarArr) {
            jo.p.h(g0VarArr, "tlsVersions");
            if (this.f30955a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 g0Var : g0VarArr) {
                    arrayList.add(g0Var.a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return f((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(String... strArr) {
            jo.p.h(strArr, "tlsVersions");
            if (this.f30955a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f30957c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(l lVar) {
            jo.p.h(lVar, "connectionSpec");
            this.f30955a = lVar.f();
            this.f30956b = lVar.f30953c;
            this.f30957c = lVar.f30954d;
            this.f30958d = lVar.h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    static {
        i iVar = i.f30912n1;
        i iVar2 = i.f30915o1;
        i iVar3 = i.f30918p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f30882d1;
        i iVar6 = i.f30873a1;
        i iVar7 = i.f30885e1;
        i iVar8 = i.f30903k1;
        i iVar9 = i.f30900j1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f30944e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.K0, i.L0, i.f30896i0, i.f30899j0, i.G, i.K, i.f30901k};
        f30945f = iVarArr2;
        a b10 = new a(true).b((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        f30946g = b10.e(g0Var, g0Var2).d(true).a();
        f30947h = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(g0Var, g0Var2).d(true).a();
        f30948i = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0).d(true).a();
        f30949j = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f30951a = z10;
        this.f30952b = z11;
        this.f30953c = strArr;
        this.f30954d = strArr2;
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        jo.p.h(sSLSocket, "sslSocket");
        l g10 = g(sSLSocket, z10);
        if (g10.i() != null) {
            sSLSocket.setEnabledProtocols(g10.f30954d);
        }
        if (g10.d() != null) {
            sSLSocket.setEnabledCipherSuites(g10.f30953c);
        }
    }

    public final List<i> d() {
        String[] strArr = this.f30953c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(i.f30927s1.b(str));
            }
            return xn.a0.B0(arrayList);
        }
        return null;
    }

    public final boolean e(SSLSocket sSLSocket) {
        jo.p.h(sSLSocket, "socket");
        if (this.f30951a) {
            String[] strArr = this.f30954d;
            if (strArr == null || fp.b.r(strArr, sSLSocket.getEnabledProtocols(), zn.a.e())) {
                String[] strArr2 = this.f30953c;
                return strArr2 == null || fp.b.r(strArr2, sSLSocket.getEnabledCipherSuites(), i.f30927s1.c());
            }
            return false;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (obj == this) {
                return true;
            }
            boolean z10 = this.f30951a;
            l lVar = (l) obj;
            if (z10 != lVar.f30951a) {
                return false;
            }
            return !z10 || (Arrays.equals(this.f30953c, lVar.f30953c) && Arrays.equals(this.f30954d, lVar.f30954d) && this.f30952b == lVar.f30952b);
        }
        return false;
    }

    public final boolean f() {
        return this.f30951a;
    }

    public final l g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f30953c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            jo.p.g(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = fp.b.B(enabledCipherSuites2, this.f30953c, i.f30927s1.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f30954d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            jo.p.g(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = fp.b.B(enabledProtocols2, this.f30954d, zn.a.e());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        jo.p.g(supportedCipherSuites, "supportedCipherSuites");
        int u10 = fp.b.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f30927s1.c());
        if (z10 && u10 != -1) {
            jo.p.g(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u10];
            jo.p.g(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = fp.b.l(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        jo.p.g(enabledCipherSuites, "cipherSuitesIntersection");
        a c10 = aVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        jo.p.g(enabledProtocols, "tlsVersionsIntersection");
        return c10.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final boolean h() {
        return this.f30952b;
    }

    public int hashCode() {
        if (this.f30951a) {
            String[] strArr = this.f30953c;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.f30954d;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f30952b ? 1 : 0);
        }
        return 17;
    }

    public final List<g0> i() {
        String[] strArr = this.f30954d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(g0.Companion.a(str));
            }
            return xn.a0.B0(arrayList);
        }
        return null;
    }

    public String toString() {
        if (this.f30951a) {
            return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f30952b + ')';
        }
        return "ConnectionSpec()";
    }
}

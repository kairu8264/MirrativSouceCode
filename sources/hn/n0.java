package hn;

import com.neovisionaries.ws.client.WebSocketException;
import hn.j0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class n0 {
    public boolean A;
    public r0 B;
    public r0 C;
    public x D;

    /* renamed from: a  reason: collision with root package name */
    public final q0 f36206a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f36207b;

    /* renamed from: d  reason: collision with root package name */
    public o f36209d;

    /* renamed from: i  reason: collision with root package name */
    public s0 f36214i;

    /* renamed from: j  reason: collision with root package name */
    public u0 f36215j;

    /* renamed from: k  reason: collision with root package name */
    public e0 f36216k;

    /* renamed from: l  reason: collision with root package name */
    public x0 f36217l;

    /* renamed from: m  reason: collision with root package name */
    public Map<String, List<String>> f36218m;

    /* renamed from: n  reason: collision with root package name */
    public List<p0> f36219n;

    /* renamed from: o  reason: collision with root package name */
    public String f36220o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f36221p;

    /* renamed from: s  reason: collision with root package name */
    public boolean f36224s;

    /* renamed from: t  reason: collision with root package name */
    public int f36225t;

    /* renamed from: u  reason: collision with root package name */
    public int f36226u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f36227v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f36229x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f36230y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f36231z;

    /* renamed from: h  reason: collision with root package name */
    public final Object f36213h = new Object();

    /* renamed from: q  reason: collision with root package name */
    public boolean f36222q = true;

    /* renamed from: r  reason: collision with root package name */
    public boolean f36223r = true;

    /* renamed from: w  reason: collision with root package name */
    public Object f36228w = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final j0 f36208c = new j0();

    /* renamed from: e  reason: collision with root package name */
    public final s f36210e = new s(this);

    /* renamed from: f  reason: collision with root package name */
    public final a0 f36211f = new a0(this, new e());

    /* renamed from: g  reason: collision with root package name */
    public final b0 f36212g = new b0(this, new e());

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36232a;

        static {
            int[] iArr = new int[v0.values().length];
            f36232a = iArr;
            try {
                iArr[v0.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36232a[v0.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n0(q0 q0Var, boolean z10, String str, String str2, String str3, g0 g0Var) {
        this.f36206a = q0Var;
        this.f36207b = g0Var;
        this.f36209d = new o(z10, str, str2, str3);
    }

    public static String m() {
        byte[] bArr = new byte[16];
        t.n(bArr);
        return b.b(bArr);
    }

    public boolean A() {
        return this.f36223r;
    }

    public boolean B() {
        return z(v0.OPEN);
    }

    public void C(r0 r0Var) {
        synchronized (this.f36213h) {
            this.f36231z = true;
            this.B = r0Var;
            if (this.A) {
                E();
            }
        }
    }

    public void D() {
        boolean z10;
        synchronized (this.f36213h) {
            this.f36229x = true;
            z10 = this.f36230y;
        }
        c();
        if (z10) {
            F();
        }
    }

    public final void E() {
        k();
    }

    public final void F() {
        this.f36211f.i();
        this.f36212g.i();
    }

    public void G(r0 r0Var) {
        synchronized (this.f36213h) {
            this.A = true;
            this.C = r0Var;
            if (this.f36231z) {
                E();
            }
        }
    }

    public void H() {
        boolean z10;
        synchronized (this.f36213h) {
            this.f36230y = true;
            z10 = this.f36229x;
        }
        c();
        if (z10) {
            F();
        }
    }

    public final s0 I(Socket socket) throws WebSocketException {
        try {
            return new s0(new BufferedInputStream(socket.getInputStream()));
        } catch (IOException e10) {
            o0 o0Var = o0.SOCKET_INPUT_STREAM_FAILURE;
            throw new WebSocketException(o0Var, "Failed to get the input stream of the raw socket: " + e10.getMessage(), e10);
        }
    }

    public final u0 J(Socket socket) throws WebSocketException {
        try {
            return new u0(new BufferedOutputStream(socket.getOutputStream()));
        } catch (IOException e10) {
            o0 o0Var = o0.SOCKET_OUTPUT_STREAM_FAILURE;
            throw new WebSocketException(o0Var, "Failed to get the output stream from the raw socket: " + e10.getMessage(), e10);
        }
    }

    public final Map<String, List<String>> K(s0 s0Var, String str) throws WebSocketException {
        return new p(this).d(s0Var, str);
    }

    public n0 L(t0 t0Var) {
        this.f36210e.F(t0Var);
        return this;
    }

    public n0 M(byte[] bArr) {
        return N(r0.g(bArr));
    }

    public n0 N(r0 r0Var) {
        if (r0Var == null) {
            return this;
        }
        synchronized (this.f36208c) {
            v0 c10 = this.f36208c.c();
            if (c10 == v0.OPEN || c10 == v0.CLOSING) {
                x0 x0Var = this.f36217l;
                if (x0Var == null) {
                    return this;
                }
                List<r0> R = R(r0Var);
                if (R == null) {
                    x0Var.m(r0Var);
                } else {
                    for (r0 r0Var2 : R) {
                        x0Var.m(r0Var2);
                    }
                }
                return this;
            }
            return this;
        }
    }

    public void O(List<p0> list) {
        this.f36219n = list;
    }

    public void P(String str) {
        this.f36220o = str;
    }

    public final Map<String, List<String>> Q(Socket socket) throws WebSocketException {
        s0 I = I(socket);
        u0 J = J(socket);
        String m10 = m();
        U(J, m10);
        Map<String, List<String>> K = K(I, m10);
        this.f36214i = I;
        this.f36215j = J;
        return K;
    }

    public final List<r0> R(r0 r0Var) {
        return r0.R(r0Var, this.f36226u, this.D);
    }

    public final void S() {
        e0 e0Var = new e0(this);
        x0 x0Var = new x0(this);
        synchronized (this.f36213h) {
            this.f36216k = e0Var;
            this.f36217l = x0Var;
        }
        e0Var.a();
        x0Var.a();
        e0Var.start();
        x0Var.start();
    }

    public final void T(long j10) {
        e0 e0Var;
        x0 x0Var;
        synchronized (this.f36213h) {
            e0Var = this.f36216k;
            x0Var = this.f36217l;
            this.f36216k = null;
            this.f36217l = null;
        }
        if (e0Var != null) {
            e0Var.I(j10);
        }
        if (x0Var != null) {
            x0Var.n();
        }
    }

    public final void U(u0 u0Var, String str) throws WebSocketException {
        this.f36209d.g(str);
        String d10 = this.f36209d.d();
        List<String[]> c10 = this.f36209d.c();
        String b10 = o.b(d10, c10);
        this.f36210e.u(d10, c10);
        try {
            u0Var.c(b10);
            u0Var.flush();
        } catch (IOException e10) {
            o0 o0Var = o0.OPENING_HAHDSHAKE_REQUEST_FAILURE;
            throw new WebSocketException(o0Var, "Failed to send an opening handshake request to the server: " + e10.getMessage(), e10);
        }
    }

    public n0 a(String str, String str2) {
        this.f36209d.a(str, str2);
        return this;
    }

    public n0 b(t0 t0Var) {
        this.f36210e.a(t0Var);
        return this;
    }

    public final void c() {
        synchronized (this.f36228w) {
            if (this.f36227v) {
                return;
            }
            this.f36227v = true;
            this.f36210e.g(this.f36218m);
        }
    }

    public final void d() throws WebSocketException {
        v0 v0Var;
        synchronized (this.f36208c) {
            if (this.f36208c.c() == v0.CREATED) {
                j0 j0Var = this.f36208c;
                v0Var = v0.CONNECTING;
                j0Var.d(v0Var);
            } else {
                throw new WebSocketException(o0.NOT_IN_CREATED_STATE, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.f36210e.v(v0Var);
    }

    public n0 e() throws WebSocketException {
        d();
        try {
            this.f36218m = Q(this.f36207b.b());
            this.D = j();
            j0 j0Var = this.f36208c;
            v0 v0Var = v0.OPEN;
            j0Var.d(v0Var);
            this.f36210e.v(v0Var);
            S();
            return this;
        } catch (WebSocketException e10) {
            this.f36207b.a();
            j0 j0Var2 = this.f36208c;
            v0 v0Var2 = v0.CLOSED;
            j0Var2.d(v0Var2);
            this.f36210e.v(v0Var2);
            throw e10;
        }
    }

    public n0 f() {
        d dVar = new d(this);
        s sVar = this.f36210e;
        if (sVar != null) {
            sVar.A(l0.CONNECT_THREAD, dVar);
        }
        dVar.start();
        return this;
    }

    public void finalize() throws Throwable {
        if (z(v0.CREATED)) {
            k();
        }
        super.finalize();
    }

    public n0 g() {
        return h(1000, null);
    }

    public n0 h(int i10, String str) {
        return i(i10, str, 10000L);
    }

    public n0 i(int i10, String str, long j10) {
        synchronized (this.f36208c) {
            int i11 = a.f36232a[this.f36208c.c().ordinal()];
            if (i11 == 1) {
                l();
                return this;
            } else if (i11 != 2) {
                return this;
            } else {
                this.f36208c.a(j0.a.CLIENT);
                N(r0.i(i10, str));
                this.f36210e.v(v0.CLOSING);
                if (j10 < 0) {
                    j10 = 10000;
                }
                T(j10);
                return this;
            }
        }
    }

    public final x j() {
        List<p0> list = this.f36219n;
        if (list == null) {
            return null;
        }
        for (p0 p0Var : list) {
            if (p0Var instanceof x) {
                return (x) p0Var;
            }
        }
        return null;
    }

    public void k() {
        v0 v0Var;
        this.f36211f.j();
        this.f36212g.j();
        Socket e10 = this.f36207b.e();
        if (e10 != null) {
            try {
                e10.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f36208c) {
            j0 j0Var = this.f36208c;
            v0Var = v0.CLOSED;
            j0Var.d(v0Var);
        }
        this.f36210e.v(v0Var);
        this.f36210e.i(this.B, this.C, this.f36208c.b());
    }

    public final void l() {
        k kVar = new k(this);
        kVar.a();
        kVar.start();
    }

    public int n() {
        return this.f36225t;
    }

    public o o() {
        return this.f36209d;
    }

    public s0 p() {
        return this.f36214i;
    }

    public s q() {
        return this.f36210e;
    }

    public u0 r() {
        return this.f36215j;
    }

    public x s() {
        return this.D;
    }

    public Socket t() {
        return this.f36207b.e();
    }

    public v0 u() {
        v0 c10;
        synchronized (this.f36208c) {
            c10 = this.f36208c.c();
        }
        return c10;
    }

    public j0 v() {
        return this.f36208c;
    }

    public boolean w() {
        return this.f36222q;
    }

    public boolean x() {
        return this.f36224s;
    }

    public boolean y() {
        return this.f36221p;
    }

    public final boolean z(v0 v0Var) {
        boolean z10;
        synchronized (this.f36208c) {
            z10 = this.f36208c.c() == v0Var;
        }
        return z10;
    }
}

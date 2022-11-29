package hn;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.neovisionaries.ws.client.WebSocketException;
import hn.j0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class e0 extends w0 {
    public List<r0> A;
    public final x B;
    public Object C;
    public Timer D;
    public b E;
    public long F;
    public boolean G;

    /* renamed from: y  reason: collision with root package name */
    public boolean f36149y;

    /* renamed from: z  reason: collision with root package name */
    public r0 f36150z;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36151a;

        static {
            int[] iArr = new int[o0.values().length];
            f36151a = iArr;
            try {
                iArr[o0.INSUFFICENT_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36151a[o0.INVALID_PAYLOAD_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36151a[o0.NO_MORE_FRAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36151a[o0.TOO_LONG_PAYLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36151a[o0.INSUFFICIENT_MEMORY_FOR_PAYLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36151a[o0.NON_ZERO_RESERVED_BITS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36151a[o0.UNEXPECTED_RESERVED_BIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36151a[o0.UNKNOWN_OPCODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36151a[o0.FRAME_MASKED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36151a[o0.FRAGMENTED_CONTROL_FRAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36151a[o0.UNEXPECTED_CONTINUATION_FRAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36151a[o0.CONTINUATION_NOT_CLOSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36151a[o0.TOO_LONG_CONTROL_FRAME_PAYLOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36151a[o0.INTERRUPTED_IN_READING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36151a[o0.IO_ERROR_IN_READING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Socket t10 = e0.this.f36276w.t();
                if (t10 != null) {
                    t10.close();
                }
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ b(e0 e0Var, a aVar) {
            this();
        }
    }

    public e0(n0 n0Var) {
        super("ReadingThread", n0Var, l0.READING_THREAD);
        this.A = new ArrayList();
        this.C = new Object();
        this.B = n0Var.s();
    }

    public final boolean A(r0 r0Var) {
        f(r0Var);
        this.A.add(r0Var);
        if (r0Var.r()) {
            byte[] x10 = x(this.A);
            if (x10 == null) {
                return false;
            }
            if (this.A.get(0).G()) {
                p(x10);
            } else {
                d(x10);
            }
            this.A.clear();
            return true;
        }
        return true;
    }

    public final boolean B(r0 r0Var) {
        h(r0Var);
        int t10 = r0Var.t();
        if (t10 != 0) {
            if (t10 != 1) {
                if (t10 != 2) {
                    switch (t10) {
                        case 8:
                            return z(r0Var);
                        case 9:
                            return C(r0Var);
                        case 10:
                            return D(r0Var);
                        default:
                            return true;
                    }
                }
                return y(r0Var);
            }
            return E(r0Var);
        }
        return A(r0Var);
    }

    public final boolean C(r0 r0Var) {
        l(r0Var);
        this.f36276w.N(r0.o(r0Var.u()));
        return true;
    }

    public final boolean D(r0 r0Var) {
        m(r0Var);
        return true;
    }

    public final boolean E(r0 r0Var) {
        n(r0Var);
        if (!r0Var.r()) {
            this.A.add(r0Var);
            return true;
        }
        p(w(r0Var));
        return true;
    }

    public final void F() {
        this.f36276w.D();
        while (true) {
            synchronized (this) {
                if (!this.f36149y) {
                    r0 H = H();
                    if (H == null) {
                        break;
                    } else if (!B(H)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        V();
        r();
    }

    public final void G() {
        this.f36276w.C(this.f36150z);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hn.r0 H() {
        /*
            r7 = this;
            r0 = 0
            hn.n0 r1 = r7.f36276w     // Catch: com.neovisionaries.ws.client.WebSocketException -> L15 java.io.IOException -> L18 java.io.InterruptedIOException -> L42
            hn.s0 r1 = r1.p()     // Catch: com.neovisionaries.ws.client.WebSocketException -> L15 java.io.IOException -> L18 java.io.InterruptedIOException -> L42
            hn.r0 r1 = r1.c()     // Catch: com.neovisionaries.ws.client.WebSocketException -> L15 java.io.IOException -> L18 java.io.InterruptedIOException -> L42
            r7.L(r1)     // Catch: com.neovisionaries.ws.client.WebSocketException -> Lf java.io.IOException -> L11 java.io.InterruptedIOException -> L13
            return r1
        Lf:
            r2 = move-exception
            goto L66
        L11:
            r2 = move-exception
            goto L1a
        L13:
            r2 = move-exception
            goto L44
        L15:
            r2 = move-exception
            r1 = r0
            goto L66
        L18:
            r2 = move-exception
            r1 = r0
        L1a:
            boolean r3 = r7.f36149y
            if (r3 == 0) goto L25
            boolean r3 = r7.isInterrupted()
            if (r3 == 0) goto L25
            return r0
        L25:
            com.neovisionaries.ws.client.WebSocketException r3 = new com.neovisionaries.ws.client.WebSocketException
            hn.o0 r4 = hn.o0.IO_ERROR_IN_READING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "An I/O error occurred while a frame was being read from the web socket: "
            r5.append(r6)
            java.lang.String r6 = r2.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5, r2)
            goto L65
        L42:
            r2 = move-exception
            r1 = r0
        L44:
            boolean r3 = r7.f36149y
            if (r3 == 0) goto L49
            return r0
        L49:
            com.neovisionaries.ws.client.WebSocketException r3 = new com.neovisionaries.ws.client.WebSocketException
            hn.o0 r4 = hn.o0.INTERRUPTED_IN_READING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Interruption occurred while a frame was being read from the web socket: "
            r5.append(r6)
            java.lang.String r6 = r2.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5, r2)
        L65:
            r2 = r3
        L66:
            boolean r3 = r2 instanceof hn.u
            r4 = 1
            if (r3 == 0) goto L77
            r7.G = r4
            hn.n0 r3 = r7.f36276w
            boolean r3 = r3.A()
            if (r3 == 0) goto L77
            r4 = 0
        L77:
            if (r4 == 0) goto L7f
            r7.g(r2)
            r7.i(r2, r1)
        L7f:
            hn.r0 r1 = r7.u(r2)
            hn.n0 r2 = r7.f36276w
            r2.N(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.e0.H():hn.r0");
    }

    public void I(long j10) {
        synchronized (this) {
            if (this.f36149y) {
                return;
            }
            this.f36149y = true;
            interrupt();
            this.F = j10;
            J();
        }
    }

    public final void J() {
        synchronized (this.C) {
            s();
            K();
        }
    }

    public final void K() {
        this.E = new b(this, null);
        Timer timer = new Timer("ReadingThreadCloseTimer");
        this.D = timer;
        timer.schedule(this.E, this.F);
    }

    public final void L(r0 r0Var) throws WebSocketException {
        U(r0Var);
        O(r0Var);
        N(r0Var);
        M(r0Var);
        P(r0Var);
    }

    public final void M(r0 r0Var) throws WebSocketException {
        if (r0Var.D()) {
            if (!r0Var.r()) {
                throw new WebSocketException(o0.FRAGMENTED_CONTROL_FRAME, "A control frame is fragmented.");
            }
            return;
        }
        boolean z10 = this.A.size() != 0;
        if (r0Var.C()) {
            if (!z10) {
                throw new WebSocketException(o0.UNEXPECTED_CONTINUATION_FRAME, "A continuation frame was detected although a continuation had not started.");
            }
        } else if (z10) {
            throw new WebSocketException(o0.CONTINUATION_NOT_CLOSED, "A non-control frame was detected although the existing continuation had not been closed.");
        }
    }

    public final void N(r0 r0Var) throws WebSocketException {
        if (r0Var.s()) {
            throw new WebSocketException(o0.FRAME_MASKED, "A frame from the server is masked.");
        }
    }

    public final void O(r0 r0Var) throws WebSocketException {
        int t10 = r0Var.t();
        if (t10 == 0 || t10 == 1 || t10 == 2) {
            return;
        }
        switch (t10) {
            case 8:
            case 9:
            case 10:
                return;
            default:
                if (this.f36276w.y()) {
                    return;
                }
                o0 o0Var = o0.UNKNOWN_OPCODE;
                throw new WebSocketException(o0Var, "A frame has an unknown opcode: 0x" + Integer.toHexString(r0Var.t()));
        }
    }

    public final void P(r0 r0Var) throws WebSocketException {
        byte[] u10;
        if (r0Var.D() && (u10 = r0Var.u()) != null && 125 < u10.length) {
            o0 o0Var = o0.TOO_LONG_CONTROL_FRAME_PAYLOAD;
            throw new WebSocketException(o0Var, "The payload size of a control frame exceeds the maximum size (125 bytes): " + u10.length);
        }
    }

    public final void Q(r0 r0Var) throws WebSocketException {
        if ((this.B == null || !R(r0Var)) && r0Var.x()) {
            throw new WebSocketException(o0.UNEXPECTED_RESERVED_BIT, "The RSV1 bit of a frame is set unexpectedly.");
        }
    }

    public final boolean R(r0 r0Var) throws WebSocketException {
        return r0Var.G() || r0Var.A();
    }

    public final void S(r0 r0Var) throws WebSocketException {
        if (r0Var.y()) {
            throw new WebSocketException(o0.UNEXPECTED_RESERVED_BIT, "The RSV2 bit of a frame is set unexpectedly.");
        }
    }

    public final void T(r0 r0Var) throws WebSocketException {
        if (r0Var.z()) {
            throw new WebSocketException(o0.UNEXPECTED_RESERVED_BIT, "The RSV3 bit of a frame is set unexpectedly.");
        }
    }

    public final void U(r0 r0Var) throws WebSocketException {
        if (this.f36276w.y()) {
            return;
        }
        Q(r0Var);
        S(r0Var);
        T(r0Var);
    }

    public final void V() {
        if (!this.G && this.f36150z == null) {
            J();
            do {
                try {
                    r0 c10 = this.f36276w.p().c();
                    if (c10.B()) {
                        this.f36150z = c10;
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            } while (!isInterrupted());
        }
    }

    @Override // hn.w0
    public void b() {
        try {
            F();
        } catch (Throwable th2) {
            o0 o0Var = o0.UNEXPECTED_ERROR_IN_READING_THREAD;
            WebSocketException webSocketException = new WebSocketException(o0Var, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            s q10 = this.f36276w.q();
            q10.j(webSocketException);
            q10.D(webSocketException);
        }
        G();
    }

    public final void c(r0 r0Var) {
        this.f36276w.q().c(r0Var);
    }

    public final void d(byte[] bArr) {
        this.f36276w.q().d(bArr);
    }

    public final void e(r0 r0Var) {
        this.f36276w.q().e(r0Var);
    }

    public final void f(r0 r0Var) {
        this.f36276w.q().h(r0Var);
    }

    public final void g(WebSocketException webSocketException) {
        this.f36276w.q().j(webSocketException);
    }

    public final void h(r0 r0Var) {
        this.f36276w.q().k(r0Var);
    }

    public final void i(WebSocketException webSocketException, r0 r0Var) {
        this.f36276w.q().l(webSocketException, r0Var);
    }

    public final void j(WebSocketException webSocketException, byte[] bArr) {
        this.f36276w.q().o(webSocketException, bArr);
    }

    public final void k(WebSocketException webSocketException, List<r0> list) {
        this.f36276w.q().p(webSocketException, list);
    }

    public final void l(r0 r0Var) {
        this.f36276w.q().q(r0Var);
    }

    public final void m(r0 r0Var) {
        this.f36276w.q().r(r0Var);
    }

    public final void n(r0 r0Var) {
        this.f36276w.q().w(r0Var);
    }

    public final void o(String str) {
        this.f36276w.q().x(str);
    }

    public final void p(byte[] bArr) {
        if (this.f36276w.x()) {
            this.f36276w.q().y(bArr);
            return;
        }
        try {
            o(t.q(bArr));
        } catch (Throwable th2) {
            o0 o0Var = o0.TEXT_MESSAGE_CONSTRUCTION_ERROR;
            WebSocketException webSocketException = new WebSocketException(o0Var, "Failed to convert payload data into a string: " + th2.getMessage(), th2);
            g(webSocketException);
            q(webSocketException, bArr);
        }
    }

    public final void q(WebSocketException webSocketException, byte[] bArr) {
        this.f36276w.q().z(webSocketException, bArr);
    }

    public final void r() {
        synchronized (this.C) {
            s();
        }
    }

    public final void s() {
        Timer timer = this.D;
        if (timer != null) {
            timer.cancel();
            this.D = null;
        }
        b bVar = this.E;
        if (bVar != null) {
            bVar.cancel();
            this.E = null;
        }
    }

    public final byte[] t(List<r0> list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (r0 r0Var : list) {
                byte[] u10 = r0Var.u();
                if (u10 != null && u10.length != 0) {
                    byteArrayOutputStream.write(u10);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException | OutOfMemoryError e10) {
            o0 o0Var = o0.MESSAGE_CONSTRUCTION_ERROR;
            WebSocketException webSocketException = new WebSocketException(o0Var, "Failed to concatenate payloads of multiple frames to construct a message: " + e10.getMessage(), e10);
            g(webSocketException);
            k(webSocketException, list);
            this.f36276w.N(r0.i(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, webSocketException.getMessage()));
            return null;
        }
    }

    public final r0 u(WebSocketException webSocketException) {
        int i10 = a.f36151a[webSocketException.a().ordinal()];
        int i11 = AnalyticsListener.EVENT_AUDIO_ENABLED;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 1002;
                break;
            case 4:
            case 5:
                i11 = AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED;
                break;
        }
        return r0.i(i11, webSocketException.getMessage());
    }

    public final byte[] v(byte[] bArr) {
        try {
            return this.B.i(bArr);
        } catch (WebSocketException e10) {
            g(e10);
            j(e10, bArr);
            this.f36276w.N(r0.i(AnalyticsListener.EVENT_LOAD_ERROR, e10.getMessage()));
            return null;
        }
    }

    public final byte[] w(r0 r0Var) {
        byte[] u10 = r0Var.u();
        return (this.B == null || !r0Var.x()) ? u10 : v(u10);
    }

    public final byte[] x(List<r0> list) {
        byte[] t10 = t(this.A);
        if (t10 == null) {
            return null;
        }
        return (this.B == null || !list.get(0).x()) ? t10 : v(t10);
    }

    public final boolean y(r0 r0Var) {
        c(r0Var);
        if (!r0Var.r()) {
            this.A.add(r0Var);
            return true;
        }
        d(w(r0Var));
        return true;
    }

    public final boolean z(r0 r0Var) {
        v0 v0Var;
        boolean z10;
        j0 v10 = this.f36276w.v();
        this.f36150z = r0Var;
        synchronized (v10) {
            v0 c10 = v10.c();
            v0Var = v0.CLOSING;
            if (c10 == v0Var || c10 == v0.CLOSED) {
                z10 = false;
            } else {
                v10.a(j0.a.SERVER);
                this.f36276w.N(r0Var);
                z10 = true;
            }
        }
        if (z10) {
            this.f36276w.q().v(v0Var);
        }
        e(r0Var);
        return false;
    }
}

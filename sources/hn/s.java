package hn;

import com.neovisionaries.ws.client.WebSocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f36269a;

    /* renamed from: b  reason: collision with root package name */
    public final List<t0> f36270b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f36271c = true;

    /* renamed from: d  reason: collision with root package name */
    public List<t0> f36272d;

    public s(n0 n0Var) {
        this.f36269a = n0Var;
    }

    public void A(l0 l0Var, Thread thread) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onThreadCreated(this.f36269a, l0Var, thread);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void B(l0 l0Var, Thread thread) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onThreadStarted(this.f36269a, l0Var, thread);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void C(l0 l0Var, Thread thread) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onThreadStopping(this.f36269a, l0Var, thread);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void D(WebSocketException webSocketException) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onUnexpectedError(this.f36269a, webSocketException);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public final List<t0> E() {
        synchronized (this.f36270b) {
            if (!this.f36271c) {
                return this.f36272d;
            }
            ArrayList arrayList = new ArrayList(this.f36270b.size());
            for (t0 t0Var : this.f36270b) {
                arrayList.add(t0Var);
            }
            this.f36272d = arrayList;
            this.f36271c = false;
            return arrayList;
        }
    }

    public void F(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        synchronized (this.f36270b) {
            if (this.f36270b.remove(t0Var)) {
                this.f36271c = true;
            }
        }
    }

    public void a(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        synchronized (this.f36270b) {
            this.f36270b.add(t0Var);
            this.f36271c = true;
        }
    }

    public final void b(t0 t0Var, Throwable th2) {
        try {
            t0Var.handleCallbackError(this.f36269a, th2);
        } catch (Throwable unused) {
        }
    }

    public void c(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onBinaryFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void d(byte[] bArr) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onBinaryMessage(this.f36269a, bArr);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void e(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onCloseFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void f(WebSocketException webSocketException) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onConnectError(this.f36269a, webSocketException);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void g(Map<String, List<String>> map) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onConnected(this.f36269a, map);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void h(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onContinuationFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void i(r0 r0Var, r0 r0Var2, boolean z10) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onDisconnected(this.f36269a, r0Var, r0Var2, z10);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void j(WebSocketException webSocketException) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onError(this.f36269a, webSocketException);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void k(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void l(WebSocketException webSocketException, r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onFrameError(this.f36269a, webSocketException, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void m(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onFrameSent(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void n(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onFrameUnsent(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void o(WebSocketException webSocketException, byte[] bArr) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onMessageDecompressionError(this.f36269a, webSocketException, bArr);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void p(WebSocketException webSocketException, List<r0> list) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onMessageError(this.f36269a, webSocketException, list);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void q(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onPingFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void r(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onPongFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void s(WebSocketException webSocketException, r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onSendError(this.f36269a, webSocketException, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void t(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onSendingFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void u(String str, List<String[]> list) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onSendingHandshake(this.f36269a, str, list);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void v(v0 v0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onStateChanged(this.f36269a, v0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void w(r0 r0Var) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onTextFrame(this.f36269a, r0Var);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void x(String str) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onTextMessage(this.f36269a, str);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void y(byte[] bArr) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onTextMessage(this.f36269a, bArr);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }

    public void z(WebSocketException webSocketException, byte[] bArr) {
        for (t0 t0Var : E()) {
            try {
                t0Var.onTextMessageError(this.f36269a, webSocketException, bArr);
            } catch (Throwable th2) {
                b(t0Var, th2);
            }
        }
    }
}

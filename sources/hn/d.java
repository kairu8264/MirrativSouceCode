package hn;

import com.neovisionaries.ws.client.WebSocketException;

/* loaded from: classes4.dex */
public class d extends w0 {
    public d(n0 n0Var) {
        super("ConnectThread", n0Var, l0.CONNECT_THREAD);
    }

    @Override // hn.w0
    public void b() {
        try {
            this.f36276w.e();
        } catch (WebSocketException e10) {
            c(e10);
        }
    }

    public final void c(WebSocketException webSocketException) {
        s q10 = this.f36276w.q();
        q10.j(webSocketException);
        q10.f(webSocketException);
    }
}

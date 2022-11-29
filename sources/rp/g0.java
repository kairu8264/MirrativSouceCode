package rp;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class g0 extends a {

    /* renamed from: m  reason: collision with root package name */
    public final Socket f51687m;

    public g0(Socket socket) {
        jo.p.h(socket, "socket");
        this.f51687m = socket;
    }

    @Override // rp.a
    public IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // rp.a
    public void z() {
        Logger logger;
        Logger logger2;
        try {
            this.f51687m.close();
        } catch (AssertionError e10) {
            if (t.d(e10)) {
                logger2 = u.f51730a;
                logger2.log(Level.WARNING, jo.p.o("Failed to close timed out socket ", this.f51687m), (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            logger = u.f51730a;
            logger.log(Level.WARNING, jo.p.o("Failed to close timed out socket ", this.f51687m), (Throwable) e11);
        }
    }
}

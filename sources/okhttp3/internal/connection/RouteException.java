package okhttp3.internal.connection;

import i7.e;
import java.io.IOException;
import jo.p;
import wn.a;

/* loaded from: classes4.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public IOException f45432w;

    /* renamed from: x  reason: collision with root package name */
    public final IOException f45433x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        p.h(iOException, "firstConnectException");
        this.f45433x = iOException;
        this.f45432w = iOException;
    }

    public final void a(IOException iOException) {
        p.h(iOException, e.f36387u);
        a.a(this.f45433x, iOException);
        this.f45432w = iOException;
    }

    public final IOException b() {
        return this.f45433x;
    }

    public final IOException c() {
        return this.f45432w;
    }
}

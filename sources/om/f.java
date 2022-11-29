package om;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes4.dex */
public class f<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ResponseHandler<? extends T> f45482a;

    /* renamed from: b  reason: collision with root package name */
    public final sm.h f45483b;

    /* renamed from: c  reason: collision with root package name */
    public final mm.d f45484c;

    public f(ResponseHandler<? extends T> responseHandler, sm.h hVar, mm.d dVar) {
        this.f45482a = responseHandler;
        this.f45483b = hVar;
        this.f45484c = dVar;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f45484c.u(this.f45483b.b());
        this.f45484c.m(httpResponse.getStatusLine().getStatusCode());
        Long a10 = h.a(httpResponse);
        if (a10 != null) {
            this.f45484c.s(a10.longValue());
        }
        String b10 = h.b(httpResponse);
        if (b10 != null) {
            this.f45484c.r(b10);
        }
        this.f45484c.b();
        return (T) this.f45482a.handleResponse(httpResponse);
    }
}

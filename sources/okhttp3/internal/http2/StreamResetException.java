package okhttp3.internal.http2;

import java.io.IOException;
import jo.p;
import mp.a;

/* loaded from: classes4.dex */
public final class StreamResetException extends IOException {

    /* renamed from: w  reason: collision with root package name */
    public final a f45434w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        p.h(aVar, "errorCode");
        this.f45434w = aVar;
    }
}

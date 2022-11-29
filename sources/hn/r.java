package hn;

import com.neovisionaries.ws.client.WebSocketException;

/* loaded from: classes4.dex */
public class r extends WebSocketException {

    /* renamed from: x  reason: collision with root package name */
    public final int f36260x;

    /* renamed from: y  reason: collision with root package name */
    public final int f36261y;

    public r(int i10, int i11) {
        super(o0.INSUFFICENT_DATA, "The end of the stream has been reached unexpectedly.");
        this.f36260x = i10;
        this.f36261y = i11;
    }

    public int b() {
        return this.f36261y;
    }
}

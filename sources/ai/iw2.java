package ai;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class iw2 extends bw2 {

    /* renamed from: w  reason: collision with root package name */
    public yx2<Integer> f5434w;

    /* renamed from: x  reason: collision with root package name */
    public yx2<Integer> f5435x;

    /* renamed from: y  reason: collision with root package name */
    public hw2 f5436y;

    /* renamed from: z  reason: collision with root package name */
    public HttpURLConnection f5437z;

    public iw2() {
        yx2<Integer> yx2Var = dw2.f3429w;
        yx2<Integer> yx2Var2 = ew2.f3798w;
        this.f5434w = yx2Var;
        this.f5435x = yx2Var2;
        this.f5436y = null;
    }

    public final HttpURLConnection c(hw2 hw2Var, int i10, int i11) throws IOException {
        this.f5434w = new yx2(265) { // from class: ai.fw2
            @Override // ai.yx2
            public final Object zza() {
                return 265;
            }
        };
        this.f5435x = new yx2(-1) { // from class: ai.gw2
            @Override // ai.yx2
            public final Object zza() {
                return -1;
            }
        };
        this.f5436y = hw2Var;
        cw2.a(this.f5434w.zza().intValue(), this.f5435x.zza().intValue());
        hw2 hw2Var2 = this.f5436y;
        Objects.requireNonNull(hw2Var2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) hw2Var2.zza();
        this.f5437z = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f5437z;
        cw2.b();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}

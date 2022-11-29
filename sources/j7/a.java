package j7;

import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ep.b0;
import ep.d0;
import ep.e;
import ep.e0;
import ep.f;
import i8.c;
import i8.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import s7.g;

/* loaded from: classes.dex */
public class a implements d<InputStream>, f {
    public d.a<? super InputStream> A;
    public volatile e B;

    /* renamed from: w  reason: collision with root package name */
    public final e.a f37247w;

    /* renamed from: x  reason: collision with root package name */
    public final g f37248x;

    /* renamed from: y  reason: collision with root package name */
    public InputStream f37249y;

    /* renamed from: z  reason: collision with root package name */
    public e0 f37250z;

    public a(e.a aVar, g gVar) {
        this.f37247w = aVar;
        this.f37248x = gVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream = this.f37249y;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        e0 e0Var = this.f37250z;
        if (e0Var != null) {
            e0Var.close();
        }
        this.A = null;
    }

    @Override // ep.f
    public void c(e eVar, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.A.c(iOException);
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        e eVar = this.B;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public m7.a d() {
        return m7.a.REMOTE;
    }

    @Override // ep.f
    public void e(e eVar, d0 d0Var) {
        this.f37250z = d0Var.a();
        if (d0Var.u0()) {
            InputStream c10 = c.c(this.f37250z.a(), ((e0) j.d(this.f37250z)).h());
            this.f37249y = c10;
            this.A.e(c10);
            return;
        }
        this.A.c(new HttpException(d0Var.q(), d0Var.h()));
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(h hVar, d.a<? super InputStream> aVar) {
        b0.a j10 = new b0.a().j(this.f37248x.h());
        for (Map.Entry<String, String> entry : this.f37248x.e().entrySet()) {
            j10.a(entry.getKey(), entry.getValue());
        }
        b0 b10 = j10.b();
        this.A = aVar;
        this.B = this.f37247w.b(b10);
        FirebasePerfOkHttpClient.enqueue(this.B, this);
    }
}

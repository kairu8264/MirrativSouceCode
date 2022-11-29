package fr;

import com.google.android.exoplayer2.C;
import com.google.gson.stream.JsonWriter;
import ep.c0;
import ep.x;
import er.f;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import xm.e;
import xm.t;

/* loaded from: classes4.dex */
public final class b<T> implements f<T, c0> {

    /* renamed from: c  reason: collision with root package name */
    public static final x f32126c = x.e("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f32127d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a  reason: collision with root package name */
    public final e f32128a;

    /* renamed from: b  reason: collision with root package name */
    public final t<T> f32129b;

    public b(e eVar, t<T> tVar) {
        this.f32128a = eVar;
        this.f32129b = tVar;
    }

    @Override // er.f
    /* renamed from: b */
    public c0 a(T t10) throws IOException {
        rp.c cVar = new rp.c();
        JsonWriter r10 = this.f32128a.r(new OutputStreamWriter(cVar.C(), f32127d));
        this.f32129b.write(r10, t10);
        r10.close();
        return c0.c(f32126c, cVar.G());
    }
}

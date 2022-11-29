package fr;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import ep.e0;
import er.f;
import java.io.IOException;
import xm.e;
import xm.t;

/* loaded from: classes4.dex */
public final class c<T> implements f<e0, T> {

    /* renamed from: a  reason: collision with root package name */
    public final e f32130a;

    /* renamed from: b  reason: collision with root package name */
    public final t<T> f32131b;

    public c(e eVar, t<T> tVar) {
        this.f32130a = eVar;
        this.f32131b = tVar;
    }

    @Override // er.f
    /* renamed from: b */
    public T a(e0 e0Var) throws IOException {
        JsonReader q10 = this.f32130a.q(e0Var.d());
        try {
            T read = this.f32131b.read(q10);
            if (q10.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}

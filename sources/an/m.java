package an;

import an.k;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import xm.t;

/* loaded from: classes4.dex */
public final class m<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final xm.e f13988a;

    /* renamed from: b  reason: collision with root package name */
    public final t<T> f13989b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f13990c;

    public m(xm.e eVar, t<T> tVar, Type type) {
        this.f13988a = eVar;
        this.f13989b = tVar;
        this.f13990c = type;
    }

    public final Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // xm.t
    public T read(JsonReader jsonReader) throws IOException {
        return this.f13989b.read(jsonReader);
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        t<T> tVar = this.f13989b;
        Type a10 = a(this.f13990c, t10);
        if (a10 != this.f13990c) {
            tVar = this.f13988a.m(en.a.get(a10));
            if (tVar instanceof k.b) {
                t<T> tVar2 = this.f13989b;
                if (!(tVar2 instanceof k.b)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.write(jsonWriter, t10);
    }
}

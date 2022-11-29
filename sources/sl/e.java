package sl;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import ql.f;
import ql.g;

/* loaded from: classes4.dex */
public final class e implements ql.e, g {

    /* renamed from: a  reason: collision with root package name */
    public e f52743a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52744b = true;

    /* renamed from: c  reason: collision with root package name */
    public final JsonWriter f52745c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f52746d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f52747e;

    /* renamed from: f  reason: collision with root package name */
    public final ql.d<Object> f52748f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f52749g;

    public e(Writer writer, Map<Class<?>, ql.d<?>> map, Map<Class<?>, f<?>> map2, ql.d<Object> dVar, boolean z10) {
        this.f52745c = new JsonWriter(writer);
        this.f52746d = map;
        this.f52747e = map2;
        this.f52748f = dVar;
        this.f52749g = z10;
    }

    @Override // ql.e
    public ql.e b(ql.c cVar, Object obj) throws IOException {
        return m(cVar.b(), obj);
    }

    @Override // ql.e
    public ql.e c(ql.c cVar, boolean z10) throws IOException {
        return n(cVar.b(), z10);
    }

    @Override // ql.e
    public ql.e d(ql.c cVar, long j10) throws IOException {
        return l(cVar.b(), j10);
    }

    @Override // ql.e
    public ql.e e(ql.c cVar, int i10) throws IOException {
        return k(cVar.b(), i10);
    }

    public e g(int i10) throws IOException {
        v();
        this.f52745c.value(i10);
        return this;
    }

    public e h(long j10) throws IOException {
        v();
        this.f52745c.value(j10);
        return this;
    }

    public e i(Object obj, boolean z10) throws IOException {
        int[] iArr;
        int i10 = 0;
        if (z10 && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f52745c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f52745c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return p((byte[]) obj);
            }
            this.f52745c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f52745c.value(iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    h(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f52745c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f52745c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    i(obj2, false);
                }
            }
            this.f52745c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f52745c.beginArray();
            for (Object obj3 : (Collection) obj) {
                i(obj3, false);
            }
            this.f52745c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f52745c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            this.f52745c.endObject();
            return this;
        } else {
            ql.d<?> dVar = this.f52746d.get(obj.getClass());
            if (dVar != null) {
                return s(dVar, obj, z10);
            }
            f<?> fVar = this.f52747e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                a(((Enum) obj).name());
                return this;
            } else {
                return s(this.f52748f, obj, z10);
            }
        }
    }

    @Override // ql.g
    /* renamed from: j */
    public e a(String str) throws IOException {
        v();
        this.f52745c.value(str);
        return this;
    }

    public e k(String str, int i10) throws IOException {
        v();
        this.f52745c.name(str);
        return g(i10);
    }

    public e l(String str, long j10) throws IOException {
        v();
        this.f52745c.name(str);
        return h(j10);
    }

    public e m(String str, Object obj) throws IOException {
        if (this.f52749g) {
            return u(str, obj);
        }
        return t(str, obj);
    }

    public e n(String str, boolean z10) throws IOException {
        v();
        this.f52745c.name(str);
        return f(z10);
    }

    @Override // ql.g
    /* renamed from: o */
    public e f(boolean z10) throws IOException {
        v();
        this.f52745c.value(z10);
        return this;
    }

    public e p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.f52745c.nullValue();
        } else {
            this.f52745c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void r() throws IOException {
        v();
        this.f52745c.flush();
    }

    public e s(ql.d<Object> dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f52745c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f52745c.endObject();
        }
        return this;
    }

    public final e t(String str, Object obj) throws IOException, EncodingException {
        v();
        this.f52745c.name(str);
        if (obj == null) {
            this.f52745c.nullValue();
            return this;
        }
        return i(obj, false);
    }

    public final e u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        v();
        this.f52745c.name(str);
        return i(obj, false);
    }

    public final void v() throws IOException {
        if (this.f52744b) {
            e eVar = this.f52743a;
            if (eVar != null) {
                eVar.v();
                this.f52743a.f52744b = false;
                this.f52743a = null;
                this.f52745c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}

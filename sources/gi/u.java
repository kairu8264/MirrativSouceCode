package gi;

import com.google.android.exoplayer2.C;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import ql.c;

/* loaded from: classes3.dex */
public final class u implements ql.e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f33615f = Charset.forName(C.UTF8_NAME);

    /* renamed from: g  reason: collision with root package name */
    public static final ql.c f33616g;

    /* renamed from: h  reason: collision with root package name */
    public static final ql.c f33617h;

    /* renamed from: i  reason: collision with root package name */
    public static final ql.d<Map.Entry<Object, Object>> f33618i;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f33619a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f33620b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, ql.f<?>> f33621c;

    /* renamed from: d  reason: collision with root package name */
    public final ql.d<Object> f33622d;

    /* renamed from: e  reason: collision with root package name */
    public final y f33623e = new y(this);

    static {
        c.b a10 = ql.c.a("key");
        o oVar = new o();
        oVar.a(1);
        f33616g = a10.b(oVar.b()).a();
        c.b a11 = ql.c.a("value");
        o oVar2 = new o();
        oVar2.a(2);
        f33617h = a11.b(oVar2.b()).a();
        f33618i = t.f33614a;
    }

    public u(OutputStream outputStream, Map<Class<?>, ql.d<?>> map, Map<Class<?>, ql.f<?>> map2, ql.d<Object> dVar) {
        this.f33619a = outputStream;
        this.f33620b = map;
        this.f33621c = map2;
        this.f33622d = dVar;
    }

    public static /* synthetic */ void k(Map.Entry entry, ql.e eVar) throws IOException {
        eVar.b(f33616g, entry.getKey());
        eVar.b(f33617h, entry.getValue());
    }

    public static int l(ql.c cVar) {
        s sVar = (s) cVar.c(s.class);
        if (sVar != null) {
            return sVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static s n(ql.c cVar) {
        s sVar = (s) cVar.c(s.class);
        if (sVar != null) {
            return sVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static ByteBuffer q(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public final ql.e a(ql.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        r((l(cVar) << 3) | 1);
        this.f33619a.write(q(8).putDouble(d10).array());
        return this;
    }

    @Override // ql.e
    public final ql.e b(ql.c cVar, Object obj) throws IOException {
        g(cVar, obj, true);
        return this;
    }

    @Override // ql.e
    public final /* synthetic */ ql.e c(ql.c cVar, boolean z10) throws IOException {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // ql.e
    public final /* synthetic */ ql.e d(ql.c cVar, long j10) throws IOException {
        i(cVar, j10, true);
        return this;
    }

    @Override // ql.e
    public final /* synthetic */ ql.e e(ql.c cVar, int i10) throws IOException {
        h(cVar, i10, true);
        return this;
    }

    public final ql.e f(ql.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        r((l(cVar) << 3) | 5);
        this.f33619a.write(q(4).putFloat(f10).array());
        return this;
    }

    public final ql.e g(ql.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            r((l(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f33615f);
            r(bytes.length);
            this.f33619a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                g(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                o(f33618i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            a(cVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            f(cVar, ((Float) obj).floatValue(), z10);
            return this;
        } else if (obj instanceof Number) {
            i(cVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            r((l(cVar) << 3) | 2);
            r(bArr.length);
            this.f33619a.write(bArr);
            return this;
        } else {
            ql.d<?> dVar = this.f33620b.get(obj.getClass());
            if (dVar != null) {
                o(dVar, cVar, obj, z10);
                return this;
            }
            ql.f<?> fVar = this.f33621c.get(obj.getClass());
            if (fVar != null) {
                p(fVar, cVar, obj, z10);
                return this;
            } else if (obj instanceof q) {
                h(cVar, ((q) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                h(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                o(this.f33622d, cVar, obj, z10);
                return this;
            }
        }
    }

    public final u h(ql.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        s n10 = n(cVar);
        r rVar = r.DEFAULT;
        int ordinal = n10.zzb().ordinal();
        if (ordinal == 0) {
            r(n10.zza() << 3);
            r(i10);
        } else if (ordinal == 1) {
            r(n10.zza() << 3);
            r((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            r((n10.zza() << 3) | 5);
            this.f33619a.write(q(4).putInt(i10).array());
        }
        return this;
    }

    public final u i(ql.c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        s n10 = n(cVar);
        r rVar = r.DEFAULT;
        int ordinal = n10.zzb().ordinal();
        if (ordinal == 0) {
            r(n10.zza() << 3);
            s(j10);
        } else if (ordinal == 1) {
            r(n10.zza() << 3);
            s((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            r((n10.zza() << 3) | 1);
            this.f33619a.write(q(8).putLong(j10).array());
        }
        return this;
    }

    public final u j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ql.d<?> dVar = this.f33620b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    public final <T> long m(ql.d<T> dVar, T t10) throws IOException {
        p pVar = new p();
        try {
            OutputStream outputStream = this.f33619a;
            this.f33619a = pVar;
            dVar.a(t10, this);
            this.f33619a = outputStream;
            long a10 = pVar.a();
            pVar.close();
            return a10;
        } catch (Throwable th2) {
            try {
                pVar.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final <T> u o(ql.d<T> dVar, ql.c cVar, T t10, boolean z10) throws IOException {
        long m10 = m(dVar, t10);
        if (z10 && m10 == 0) {
            return this;
        }
        r((l(cVar) << 3) | 2);
        s(m10);
        dVar.a(t10, this);
        return this;
    }

    public final <T> u p(ql.f<T> fVar, ql.c cVar, T t10, boolean z10) throws IOException {
        this.f33623e.b(cVar, z10);
        fVar.a(t10, this.f33623e);
        return this;
    }

    public final void r(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f33619a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f33619a.write(i10 & 127);
    }

    public final void s(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f33619a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f33619a.write(((int) j10) & 127);
    }
}

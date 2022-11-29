package tl;

import com.google.android.exoplayer2.C;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import tl.d;

/* loaded from: classes4.dex */
public final class f implements ql.e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f53797f = Charset.forName(C.UTF8_NAME);

    /* renamed from: g  reason: collision with root package name */
    public static final ql.c f53798g = ql.c.a("key").b(tl.a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    public static final ql.c f53799h = ql.c.a("value").b(tl.a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    public static final ql.d<Map.Entry<Object, Object>> f53800i = e.f53796a;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f53801a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f53802b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, ql.f<?>> f53803c;

    /* renamed from: d  reason: collision with root package name */
    public final ql.d<Object> f53804d;

    /* renamed from: e  reason: collision with root package name */
    public final i f53805e = new i(this);

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53806a;

        static {
            int[] iArr = new int[d.a.values().length];
            f53806a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53806a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53806a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map<Class<?>, ql.d<?>> map, Map<Class<?>, ql.f<?>> map2, ql.d<Object> dVar) {
        this.f53801a = outputStream;
        this.f53802b = map;
        this.f53803c = map2;
        this.f53804d = dVar;
    }

    public static ByteBuffer o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d t(ql.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static int u(ql.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static /* synthetic */ void v(Map.Entry entry, ql.e eVar) throws IOException {
        eVar.b(f53798g, entry.getKey());
        eVar.b(f53799h, entry.getValue());
    }

    @Override // ql.e
    public ql.e b(ql.c cVar, Object obj) throws IOException {
        return h(cVar, obj, true);
    }

    public ql.e f(ql.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((u(cVar) << 3) | 1);
        this.f53801a.write(o(8).putDouble(d10).array());
        return this;
    }

    public ql.e g(ql.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((u(cVar) << 3) | 5);
        this.f53801a.write(o(4).putFloat(f10).array());
        return this;
    }

    public ql.e h(ql.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            w((u(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f53797f);
            w(bytes.length);
            this.f53801a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                q(f53800i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return f(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return g(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return l(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return n(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                w((u(cVar) << 3) | 2);
                w(bArr.length);
                this.f53801a.write(bArr);
                return this;
            }
            ql.d<?> dVar = this.f53802b.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, cVar, obj, z10);
            }
            ql.f<?> fVar = this.f53803c.get(obj.getClass());
            if (fVar != null) {
                return r(fVar, cVar, obj, z10);
            }
            if (obj instanceof c) {
                return e(cVar, ((c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return e(cVar, ((Enum) obj).ordinal());
            }
            return q(this.f53804d, cVar, obj, z10);
        }
    }

    @Override // ql.e
    /* renamed from: i */
    public f e(ql.c cVar, int i10) throws IOException {
        return j(cVar, i10, true);
    }

    public f j(ql.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d t10 = t(cVar);
        int i11 = a.f53806a[t10.intEncoding().ordinal()];
        if (i11 == 1) {
            w(t10.tag() << 3);
            w(i10);
        } else if (i11 == 2) {
            w(t10.tag() << 3);
            w((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            w((t10.tag() << 3) | 5);
            this.f53801a.write(o(4).putInt(i10).array());
        }
        return this;
    }

    @Override // ql.e
    /* renamed from: k */
    public f d(ql.c cVar, long j10) throws IOException {
        return l(cVar, j10, true);
    }

    public f l(ql.c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d t10 = t(cVar);
        int i10 = a.f53806a[t10.intEncoding().ordinal()];
        if (i10 == 1) {
            w(t10.tag() << 3);
            x(j10);
        } else if (i10 == 2) {
            w(t10.tag() << 3);
            x((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            w((t10.tag() << 3) | 1);
            this.f53801a.write(o(8).putLong(j10).array());
        }
        return this;
    }

    @Override // ql.e
    /* renamed from: m */
    public f c(ql.c cVar, boolean z10) throws IOException {
        return n(cVar, z10, true);
    }

    public f n(ql.c cVar, boolean z10, boolean z11) throws IOException {
        return j(cVar, z10 ? 1 : 0, z11);
    }

    public final <T> long p(ql.d<T> dVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f53801a;
            this.f53801a = bVar;
            dVar.a(t10, this);
            this.f53801a = outputStream;
            long a10 = bVar.a();
            bVar.close();
            return a10;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final <T> f q(ql.d<T> dVar, ql.c cVar, T t10, boolean z10) throws IOException {
        long p10 = p(dVar, t10);
        if (z10 && p10 == 0) {
            return this;
        }
        w((u(cVar) << 3) | 2);
        x(p10);
        dVar.a(t10, this);
        return this;
    }

    public final <T> f r(ql.f<T> fVar, ql.c cVar, T t10, boolean z10) throws IOException {
        this.f53805e.c(cVar, z10);
        fVar.a(t10, this.f53805e);
        return this;
    }

    public f s(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ql.d<?> dVar = this.f53802b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public final void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f53801a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f53801a.write(i10 & 127);
    }

    public final void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f53801a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f53801a.write(((int) j10) & 127);
    }
}

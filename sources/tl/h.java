package tl;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f53808a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ql.f<?>> f53809b;

    /* renamed from: c  reason: collision with root package name */
    public final ql.d<Object> f53810c;

    /* loaded from: classes4.dex */
    public static final class a implements rl.b<a> {

        /* renamed from: d  reason: collision with root package name */
        public static final ql.d<Object> f53811d = g.f53807a;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, ql.d<?>> f53812a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class<?>, ql.f<?>> f53813b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public ql.d<Object> f53814c = f53811d;

        public static /* synthetic */ void e(Object obj, ql.e eVar) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f53812a), new HashMap(this.f53813b), this.f53814c);
        }

        public a d(rl.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // rl.b
        /* renamed from: f */
        public <U> a a(Class<U> cls, ql.d<? super U> dVar) {
            this.f53812a.put(cls, dVar);
            this.f53813b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, ql.d<?>> map, Map<Class<?>, ql.f<?>> map2, ql.d<Object> dVar) {
        this.f53808a = map;
        this.f53809b = map2;
        this.f53810c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f53808a, this.f53809b, this.f53810c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}

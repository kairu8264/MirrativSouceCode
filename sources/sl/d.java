package sl;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import ql.f;
import ql.g;

/* loaded from: classes4.dex */
public final class d implements rl.b<d> {

    /* renamed from: e  reason: collision with root package name */
    public static final ql.d<Object> f52733e = sl.a.f52730a;

    /* renamed from: f  reason: collision with root package name */
    public static final f<String> f52734f = c.f52732a;

    /* renamed from: g  reason: collision with root package name */
    public static final f<Boolean> f52735g = sl.b.f52731a;

    /* renamed from: h  reason: collision with root package name */
    public static final b f52736h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ql.d<?>> f52737a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f52738b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public ql.d<Object> f52739c = f52733e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f52740d = false;

    /* loaded from: classes4.dex */
    public class a implements ql.a {
        public a() {
        }

        @Override // ql.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f52737a, d.this.f52738b, d.this.f52739c, d.this.f52740d);
            eVar.i(obj, false);
            eVar.r();
        }

        @Override // ql.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final DateFormat f52742a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f52742a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // ql.b
        /* renamed from: b */
        public void a(Date date, g gVar) throws IOException {
            gVar.a(f52742a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f52734f);
        p(Boolean.class, f52735g);
        p(Date.class, f52736h);
    }

    public static /* synthetic */ void l(Object obj, ql.e eVar) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void n(Boolean bool, g gVar) throws IOException {
        gVar.f(bool.booleanValue());
    }

    public ql.a i() {
        return new a();
    }

    public d j(rl.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f52740d = z10;
        return this;
    }

    @Override // rl.b
    /* renamed from: o */
    public <T> d a(Class<T> cls, ql.d<? super T> dVar) {
        this.f52737a.put(cls, dVar);
        this.f52738b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f52738b.put(cls, fVar);
        this.f52737a.remove(cls);
        return this;
    }
}

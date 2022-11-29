package ep;

import ep.u;
import java.util.LinkedHashMap;
import java.util.Map;
import xn.n0;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public d f30787a;

    /* renamed from: b  reason: collision with root package name */
    public final v f30788b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30789c;

    /* renamed from: d  reason: collision with root package name */
    public final u f30790d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f30791e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, Object> f30792f;

    public b0(v vVar, String str, u uVar, c0 c0Var, Map<Class<?>, ? extends Object> map) {
        jo.p.h(vVar, "url");
        jo.p.h(str, "method");
        jo.p.h(uVar, "headers");
        jo.p.h(map, "tags");
        this.f30788b = vVar;
        this.f30789c = str;
        this.f30790d = uVar;
        this.f30791e = c0Var;
        this.f30792f = map;
    }

    public final c0 a() {
        return this.f30791e;
    }

    public final d b() {
        d dVar = this.f30787a;
        if (dVar == null) {
            d b10 = d.f30809p.b(this.f30790d);
            this.f30787a = b10;
            return b10;
        }
        return dVar;
    }

    public final Map<Class<?>, Object> c() {
        return this.f30792f;
    }

    public final String d(String str) {
        jo.p.h(str, "name");
        return this.f30790d.d(str);
    }

    public final u e() {
        return this.f30790d;
    }

    public final boolean f() {
        return this.f30788b.j();
    }

    public final String g() {
        return this.f30789c;
    }

    public final a h() {
        return new a(this);
    }

    public final <T> T i(Class<? extends T> cls) {
        jo.p.h(cls, "type");
        return cls.cast(this.f30792f.get(cls));
    }

    public final v j() {
        return this.f30788b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f30789c);
        sb2.append(", url=");
        sb2.append(this.f30788b);
        if (this.f30790d.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (wn.k<? extends String, ? extends String> kVar : this.f30790d) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                wn.k<? extends String, ? extends String> kVar2 = kVar;
                String a10 = kVar2.a();
                String b10 = kVar2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10);
                sb2.append(':');
                sb2.append(b10);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f30792f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f30792f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public v f30793a;

        /* renamed from: b  reason: collision with root package name */
        public String f30794b;

        /* renamed from: c  reason: collision with root package name */
        public u.a f30795c;

        /* renamed from: d  reason: collision with root package name */
        public c0 f30796d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f30797e;

        public a() {
            this.f30797e = new LinkedHashMap();
            this.f30794b = "GET";
            this.f30795c = new u.a();
        }

        public a a(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            this.f30795c.b(str, str2);
            return this;
        }

        public b0 b() {
            v vVar = this.f30793a;
            if (vVar != null) {
                return new b0(vVar, this.f30794b, this.f30795c.g(), this.f30796d, fp.b.P(this.f30797e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(d dVar) {
            jo.p.h(dVar, "cacheControl");
            String dVar2 = dVar.toString();
            return dVar2.length() == 0 ? g("Cache-Control") : d("Cache-Control", dVar2);
        }

        public a d(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            this.f30795c.j(str, str2);
            return this;
        }

        public a e(u uVar) {
            jo.p.h(uVar, "headers");
            this.f30795c = uVar.j();
            return this;
        }

        public a f(String str, c0 c0Var) {
            jo.p.h(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ kp.f.d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!kp.f.a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f30794b = str;
                this.f30796d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a g(String str) {
            jo.p.h(str, "name");
            this.f30795c.i(str);
            return this;
        }

        public <T> a h(Class<? super T> cls, T t10) {
            jo.p.h(cls, "type");
            if (t10 == null) {
                this.f30797e.remove(cls);
            } else {
                if (this.f30797e.isEmpty()) {
                    this.f30797e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f30797e;
                T cast = cls.cast(t10);
                jo.p.e(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public a i(v vVar) {
            jo.p.h(vVar, "url");
            this.f30793a = vVar;
            return this;
        }

        public a j(String str) {
            jo.p.h(str, "url");
            if (so.n.A(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = str.substring(3);
                jo.p.g(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                str = sb2.toString();
            } else if (so.n.A(str, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = str.substring(4);
                jo.p.g(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                str = sb3.toString();
            }
            return i(v.f31014l.d(str));
        }

        public a(b0 b0Var) {
            Map<Class<?>, Object> p10;
            jo.p.h(b0Var, "request");
            this.f30797e = new LinkedHashMap();
            this.f30793a = b0Var.j();
            this.f30794b = b0Var.g();
            this.f30796d = b0Var.a();
            if (b0Var.c().isEmpty()) {
                p10 = new LinkedHashMap<>();
            } else {
                p10 = n0.p(b0Var.c());
            }
            this.f30797e = p10;
            this.f30795c = b0Var.e().j();
        }
    }
}

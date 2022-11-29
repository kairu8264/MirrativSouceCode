package er;

import com.google.android.exoplayer2.util.FileTypes;
import ep.b0;
import ep.u;
import ep.y;
import er.o;
import gr.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Method f31222a;

    /* renamed from: b  reason: collision with root package name */
    public final ep.v f31223b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31224c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31225d;

    /* renamed from: e  reason: collision with root package name */
    public final ep.u f31226e;

    /* renamed from: f  reason: collision with root package name */
    public final ep.x f31227f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f31228g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f31229h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f31230i;

    /* renamed from: j  reason: collision with root package name */
    public final o<?>[] f31231j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f31232k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f31233x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f31234y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final t f31235a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f31236b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f31237c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f31238d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f31239e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f31240f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f31241g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f31242h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f31243i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f31244j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f31245k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f31246l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f31247m;

        /* renamed from: n  reason: collision with root package name */
        public String f31248n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f31249o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f31250p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f31251q;

        /* renamed from: r  reason: collision with root package name */
        public String f31252r;

        /* renamed from: s  reason: collision with root package name */
        public ep.u f31253s;

        /* renamed from: t  reason: collision with root package name */
        public ep.x f31254t;

        /* renamed from: u  reason: collision with root package name */
        public Set<String> f31255u;

        /* renamed from: v  reason: collision with root package name */
        public o<?>[] f31256v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f31257w;

        public a(t tVar, Method method) {
            this.f31235a = tVar;
            this.f31236b = method;
            this.f31237c = method.getAnnotations();
            this.f31239e = method.getGenericParameterTypes();
            this.f31238d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = f31233x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public r b() {
            for (Annotation annotation : this.f31237c) {
                e(annotation);
            }
            if (this.f31248n != null) {
                if (!this.f31249o) {
                    if (!this.f31251q) {
                        if (this.f31250p) {
                            throw x.m(this.f31236b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw x.m(this.f31236b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f31238d.length;
                this.f31256v = new o[length];
                int i10 = length - 1;
                int i11 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i11 >= length) {
                        break;
                    }
                    o<?>[] oVarArr = this.f31256v;
                    Type type = this.f31239e[i11];
                    Annotation[] annotationArr = this.f31238d[i11];
                    if (i11 != i10) {
                        z10 = false;
                    }
                    oVarArr[i11] = f(i11, type, annotationArr, z10);
                    i11++;
                }
                if (this.f31252r != null || this.f31247m) {
                    boolean z11 = this.f31250p;
                    if (!z11 && !this.f31251q && !this.f31249o && this.f31242h) {
                        throw x.m(this.f31236b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                    if (z11 && !this.f31240f) {
                        throw x.m(this.f31236b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    if (this.f31251q && !this.f31241g) {
                        throw x.m(this.f31236b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    return new r(this);
                }
                throw x.m(this.f31236b, "Missing either @%s URL or @Url parameter.", this.f31248n);
            }
            throw x.m(this.f31236b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }

        public final ep.u c(String[] strArr) {
            u.a aVar = new u.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw x.m(this.f31236b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (FileTypes.HEADER_CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    try {
                        this.f31254t = ep.x.e(trim);
                    } catch (IllegalArgumentException e10) {
                        throw x.n(this.f31236b, e10, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.b(substring, trim);
                }
            }
            return aVar.g();
        }

        public final void d(String str, String str2, boolean z10) {
            String str3 = this.f31248n;
            if (str3 != null) {
                throw x.m(this.f31236b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f31248n = str;
            this.f31249o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f31233x.matcher(substring).find()) {
                    throw x.m(this.f31236b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f31252r = str2;
            this.f31255u = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof gr.b) {
                d("DELETE", ((gr.b) annotation).value(), false);
            } else if (annotation instanceof gr.f) {
                d("GET", ((gr.f) annotation).value(), false);
            } else if (annotation instanceof gr.g) {
                d("HEAD", ((gr.g) annotation).value(), false);
            } else if (annotation instanceof gr.n) {
                d("PATCH", ((gr.n) annotation).value(), true);
            } else if (annotation instanceof gr.o) {
                d("POST", ((gr.o) annotation).value(), true);
            } else if (annotation instanceof gr.p) {
                d("PUT", ((gr.p) annotation).value(), true);
            } else if (annotation instanceof gr.m) {
                d("OPTIONS", ((gr.m) annotation).value(), false);
            } else if (annotation instanceof gr.h) {
                gr.h hVar = (gr.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof gr.k) {
                String[] value = ((gr.k) annotation).value();
                if (value.length != 0) {
                    this.f31253s = c(value);
                    return;
                }
                throw x.m(this.f31236b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof gr.l) {
                if (!this.f31250p) {
                    this.f31251q = true;
                    return;
                }
                throw x.m(this.f31236b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof gr.e) {
                if (!this.f31251q) {
                    this.f31250p = true;
                    return;
                }
                throw x.m(this.f31236b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        public final o<?> f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation annotation : annotationArr) {
                    o<?> g10 = g(i10, type, annotationArr, annotation);
                    if (g10 != null) {
                        if (oVar != null) {
                            throw x.o(this.f31236b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        oVar = g10;
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar == null) {
                if (z10) {
                    try {
                        if (x.h(type) == ao.d.class) {
                            this.f31257w = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw x.o(this.f31236b, i10, "No Retrofit annotation found.", new Object[0]);
            }
            return oVar;
        }

        public final o<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof y) {
                j(i10, type);
                if (!this.f31247m) {
                    if (!this.f31243i) {
                        if (!this.f31244j) {
                            if (!this.f31245k) {
                                if (!this.f31246l) {
                                    if (this.f31252r == null) {
                                        this.f31247m = true;
                                        if (type != ep.v.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                            throw x.o(this.f31236b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new o.p(this.f31236b, i10);
                                    }
                                    throw x.o(this.f31236b, i10, "@Url cannot be used with @%s URL", this.f31248n);
                                }
                                throw x.o(this.f31236b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw x.o(this.f31236b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw x.o(this.f31236b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw x.o(this.f31236b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "Multiple @Url method annotations found.", new Object[0]);
            } else if (annotation instanceof gr.s) {
                j(i10, type);
                if (!this.f31244j) {
                    if (!this.f31245k) {
                        if (!this.f31246l) {
                            if (!this.f31247m) {
                                if (this.f31252r != null) {
                                    this.f31243i = true;
                                    gr.s sVar = (gr.s) annotation;
                                    String value = sVar.value();
                                    i(i10, value);
                                    return new o.k(this.f31236b, i10, value, this.f31235a.i(type, annotationArr), sVar.encoded());
                                }
                                throw x.o(this.f31236b, i10, "@Path can only be used with relative url on @%s", this.f31248n);
                            }
                            throw x.o(this.f31236b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw x.o(this.f31236b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw x.o(this.f31236b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (annotation instanceof gr.t) {
                j(i10, type);
                gr.t tVar = (gr.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h10 = x.h(type);
                this.f31244j = true;
                if (Iterable.class.isAssignableFrom(h10)) {
                    if (type instanceof ParameterizedType) {
                        return new o.l(value2, this.f31235a.i(x.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    throw x.o(this.f31236b, i10, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                } else if (h10.isArray()) {
                    return new o.l(value2, this.f31235a.i(a(h10.getComponentType()), annotationArr), encoded).b();
                } else {
                    return new o.l(value2, this.f31235a.i(type, annotationArr), encoded);
                }
            } else if (annotation instanceof gr.v) {
                j(i10, type);
                boolean encoded2 = ((gr.v) annotation).encoded();
                Class<?> h11 = x.h(type);
                this.f31245k = true;
                if (Iterable.class.isAssignableFrom(h11)) {
                    if (type instanceof ParameterizedType) {
                        return new o.n(this.f31235a.i(x.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    throw x.o(this.f31236b, i10, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                } else if (h11.isArray()) {
                    return new o.n(this.f31235a.i(a(h11.getComponentType()), annotationArr), encoded2).b();
                } else {
                    return new o.n(this.f31235a.i(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof gr.u) {
                j(i10, type);
                Class<?> h12 = x.h(type);
                this.f31246l = true;
                if (Map.class.isAssignableFrom(h12)) {
                    Type i11 = x.i(type, h12, Map.class);
                    if (i11 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i11;
                        Type g10 = x.g(0, parameterizedType);
                        if (String.class == g10) {
                            return new o.m(this.f31236b, i10, this.f31235a.i(x.g(1, parameterizedType), annotationArr), ((gr.u) annotation).encoded());
                        }
                        throw x.o(this.f31236b, i10, "@QueryMap keys must be of type String: " + g10, new Object[0]);
                    }
                    throw x.o(this.f31236b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof gr.i) {
                j(i10, type);
                String value3 = ((gr.i) annotation).value();
                Class<?> h13 = x.h(type);
                if (Iterable.class.isAssignableFrom(h13)) {
                    if (type instanceof ParameterizedType) {
                        return new o.f(value3, this.f31235a.i(x.g(0, (ParameterizedType) type), annotationArr)).c();
                    }
                    throw x.o(this.f31236b, i10, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
                } else if (h13.isArray()) {
                    return new o.f(value3, this.f31235a.i(a(h13.getComponentType()), annotationArr)).b();
                } else {
                    return new o.f(value3, this.f31235a.i(type, annotationArr));
                }
            } else if (annotation instanceof gr.j) {
                if (type == ep.u.class) {
                    return new o.h(this.f31236b, i10);
                }
                j(i10, type);
                Class<?> h14 = x.h(type);
                if (Map.class.isAssignableFrom(h14)) {
                    Type i12 = x.i(type, h14, Map.class);
                    if (i12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i12;
                        Type g11 = x.g(0, parameterizedType2);
                        if (String.class == g11) {
                            return new o.g(this.f31236b, i10, this.f31235a.i(x.g(1, parameterizedType2), annotationArr));
                        }
                        throw x.o(this.f31236b, i10, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
                    }
                    throw x.o(this.f31236b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof gr.c) {
                j(i10, type);
                if (this.f31250p) {
                    gr.c cVar = (gr.c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f31240f = true;
                    Class<?> h15 = x.h(type);
                    if (Iterable.class.isAssignableFrom(h15)) {
                        if (type instanceof ParameterizedType) {
                            return new o.d(value4, this.f31235a.i(x.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        throw x.o(this.f31236b, i10, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h15.isArray()) {
                        return new o.d(value4, this.f31235a.i(a(h15.getComponentType()), annotationArr), encoded3).b();
                    } else {
                        return new o.d(value4, this.f31235a.i(type, annotationArr), encoded3);
                    }
                }
                throw x.o(this.f31236b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof gr.d) {
                j(i10, type);
                if (this.f31250p) {
                    Class<?> h16 = x.h(type);
                    if (Map.class.isAssignableFrom(h16)) {
                        Type i13 = x.i(type, h16, Map.class);
                        if (i13 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i13;
                            Type g12 = x.g(0, parameterizedType3);
                            if (String.class == g12) {
                                f i14 = this.f31235a.i(x.g(1, parameterizedType3), annotationArr);
                                this.f31240f = true;
                                return new o.e(this.f31236b, i10, i14, ((gr.d) annotation).encoded());
                            }
                            throw x.o(this.f31236b, i10, "@FieldMap keys must be of type String: " + g12, new Object[0]);
                        }
                        throw x.o(this.f31236b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw x.o(this.f31236b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof gr.q) {
                j(i10, type);
                if (this.f31251q) {
                    gr.q qVar = (gr.q) annotation;
                    this.f31241g = true;
                    String value5 = qVar.value();
                    Class<?> h17 = x.h(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(h17)) {
                            if (type instanceof ParameterizedType) {
                                if (y.c.class.isAssignableFrom(x.h(x.g(0, (ParameterizedType) type)))) {
                                    return o.C0317o.f31199a.c();
                                }
                                throw x.o(this.f31236b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw x.o(this.f31236b, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h17.isArray()) {
                            if (y.c.class.isAssignableFrom(h17.getComponentType())) {
                                return o.C0317o.f31199a.b();
                            }
                            throw x.o(this.f31236b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else if (y.c.class.isAssignableFrom(h17)) {
                            return o.C0317o.f31199a;
                        } else {
                            throw x.o(this.f31236b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    }
                    ep.u k10 = ep.u.k("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                    if (Iterable.class.isAssignableFrom(h17)) {
                        if (type instanceof ParameterizedType) {
                            Type g13 = x.g(0, (ParameterizedType) type);
                            if (!y.c.class.isAssignableFrom(x.h(g13))) {
                                return new o.i(this.f31236b, i10, k10, this.f31235a.g(g13, annotationArr, this.f31237c)).c();
                            }
                            throw x.o(this.f31236b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw x.o(this.f31236b, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h17.isArray()) {
                        Class<?> a10 = a(h17.getComponentType());
                        if (!y.c.class.isAssignableFrom(a10)) {
                            return new o.i(this.f31236b, i10, k10, this.f31235a.g(a10, annotationArr, this.f31237c)).b();
                        }
                        throw x.o(this.f31236b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!y.c.class.isAssignableFrom(h17)) {
                        return new o.i(this.f31236b, i10, k10, this.f31235a.g(type, annotationArr, this.f31237c));
                    } else {
                        throw x.o(this.f31236b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
                throw x.o(this.f31236b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof gr.r) {
                j(i10, type);
                if (this.f31251q) {
                    this.f31241g = true;
                    Class<?> h18 = x.h(type);
                    if (Map.class.isAssignableFrom(h18)) {
                        Type i15 = x.i(type, h18, Map.class);
                        if (i15 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i15;
                            Type g14 = x.g(0, parameterizedType4);
                            if (String.class == g14) {
                                Type g15 = x.g(1, parameterizedType4);
                                if (!y.c.class.isAssignableFrom(x.h(g15))) {
                                    return new o.j(this.f31236b, i10, this.f31235a.g(g15, annotationArr, this.f31237c), ((gr.r) annotation).encoding());
                                }
                                throw x.o(this.f31236b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw x.o(this.f31236b, i10, "@PartMap keys must be of type String: " + g14, new Object[0]);
                        }
                        throw x.o(this.f31236b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw x.o(this.f31236b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof gr.a) {
                j(i10, type);
                if (!this.f31250p && !this.f31251q) {
                    if (!this.f31242h) {
                        try {
                            f g16 = this.f31235a.g(type, annotationArr, this.f31237c);
                            this.f31242h = true;
                            return new o.c(this.f31236b, i10, g16);
                        } catch (RuntimeException e10) {
                            throw x.p(this.f31236b, e10, i10, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw x.o(this.f31236b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw x.o(this.f31236b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else if (annotation instanceof gr.x) {
                j(i10, type);
                Class<?> h19 = x.h(type);
                for (int i16 = i10 - 1; i16 >= 0; i16--) {
                    o<?> oVar = this.f31256v[i16];
                    if ((oVar instanceof o.q) && ((o.q) oVar).f31202a.equals(h19)) {
                        throw x.o(this.f31236b, i10, "@Tag type " + h19.getName() + " is duplicate of parameter #" + (i16 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new o.q(h19);
            } else {
                return null;
            }
        }

        public final void i(int i10, String str) {
            if (f31234y.matcher(str).matches()) {
                if (!this.f31255u.contains(str)) {
                    throw x.o(this.f31236b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f31252r, str);
                }
                return;
            }
            throw x.o(this.f31236b, i10, "@Path parameter name must match %s. Found: %s", f31233x.pattern(), str);
        }

        public final void j(int i10, Type type) {
            if (x.j(type)) {
                throw x.o(this.f31236b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public r(a aVar) {
        this.f31222a = aVar.f31236b;
        this.f31223b = aVar.f31235a.f31263c;
        this.f31224c = aVar.f31248n;
        this.f31225d = aVar.f31252r;
        this.f31226e = aVar.f31253s;
        this.f31227f = aVar.f31254t;
        this.f31228g = aVar.f31249o;
        this.f31229h = aVar.f31250p;
        this.f31230i = aVar.f31251q;
        this.f31231j = aVar.f31256v;
        this.f31232k = aVar.f31257w;
    }

    public static r b(t tVar, Method method) {
        return new a(tVar, method).b();
    }

    public b0 a(Object[] objArr) throws IOException {
        o<?>[] oVarArr = this.f31231j;
        int length = objArr.length;
        if (length == oVarArr.length) {
            q qVar = new q(this.f31224c, this.f31223b, this.f31225d, this.f31226e, this.f31227f, this.f31228g, this.f31229h, this.f31230i);
            if (this.f31232k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                oVarArr[i10].a(qVar, objArr[i10]);
            }
            return qVar.k().h(k.class, new k(this.f31222a, arrayList)).b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + oVarArr.length + ")");
    }
}

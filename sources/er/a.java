package er;

import ep.c0;
import ep.e0;
import er.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f31096a = true;

    /* renamed from: er.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0315a implements er.f<e0, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0315a f31097a = new C0315a();

        @Override // er.f
        /* renamed from: b */
        public e0 a(e0 e0Var) throws IOException {
            try {
                return x.a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements er.f<c0, c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31098a = new b();

        @Override // er.f
        /* renamed from: b */
        public c0 a(c0 c0Var) {
            return c0Var;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements er.f<e0, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f31099a = new c();

        @Override // er.f
        /* renamed from: b */
        public e0 a(e0 e0Var) {
            return e0Var;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements er.f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f31100a = new d();

        @Override // er.f
        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements er.f<e0, wn.v> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f31101a = new e();

        @Override // er.f
        /* renamed from: b */
        public wn.v a(e0 e0Var) {
            e0Var.close();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements er.f<e0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f31102a = new f();

        @Override // er.f
        /* renamed from: b */
        public Void a(e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    @Override // er.f.a
    public er.f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        if (c0.class.isAssignableFrom(x.h(type))) {
            return b.f31098a;
        }
        return null;
    }

    @Override // er.f.a
    public er.f<e0, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        if (type == e0.class) {
            if (x.l(annotationArr, gr.w.class)) {
                return c.f31099a;
            }
            return C0315a.f31097a;
        } else if (type == Void.class) {
            return f.f31102a;
        } else {
            if (this.f31096a && type == wn.v.class) {
                try {
                    return e.f31101a;
                } catch (NoClassDefFoundError unused) {
                    this.f31096a = false;
                    return null;
                }
            }
            return null;
        }
    }
}

package gn;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import er.c;
import er.d;
import er.s;
import er.t;
import io.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import jo.h;
import jo.p;
import jo.q;
import retrofit2.HttpException;
import uo.a0;
import uo.y;
import uo.y0;
import wn.v;

/* loaded from: classes4.dex */
public final class a extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33681a = new b(null);

    /* renamed from: gn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0406a<T> implements er.c<T, y0<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f33682a;

        /* renamed from: gn.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0407a extends q implements l<Throwable, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ y f33683w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ er.b f33684x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0407a(y yVar, er.b bVar) {
                super(1);
                this.f33683w = yVar;
                this.f33684x = bVar;
            }

            public final void a(Throwable th2) {
                if (this.f33683w.isCancelled()) {
                    this.f33684x.cancel();
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f59242a;
            }
        }

        /* renamed from: gn.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ y f33685a;

            public b(y yVar) {
                this.f33685a = yVar;
            }

            @Override // er.d
            public void a(er.b<T> bVar, Throwable th2) {
                p.i(bVar, "call");
                p.i(th2, TopicConstant.PACKET_TYPE_TEXT);
                this.f33685a.a(th2);
            }

            @Override // er.d
            public void b(er.b<T> bVar, s<T> sVar) {
                p.i(bVar, "call");
                p.i(sVar, "response");
                if (sVar.f()) {
                    y yVar = this.f33685a;
                    T a10 = sVar.a();
                    if (a10 == null) {
                        p.r();
                    }
                    yVar.F(a10);
                    return;
                }
                this.f33685a.a(new HttpException(sVar));
            }
        }

        public C0406a(Type type) {
            p.i(type, "responseType");
            this.f33682a = type;
        }

        @Override // er.c
        public Type a() {
            return this.f33682a;
        }

        @Override // er.c
        /* renamed from: c */
        public y0<T> b(er.b<T> bVar) {
            p.i(bVar, "call");
            y b10 = a0.b(null, 1, null);
            b10.p(new C0407a(b10, bVar));
            bVar.D0(new b(b10));
            return b10;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final a a() {
            return new a(null);
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c<T> implements er.c<T, y0<? extends s<T>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f33686a;

        /* renamed from: gn.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0408a extends q implements l<Throwable, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ y f33687w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ er.b f33688x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408a(y yVar, er.b bVar) {
                super(1);
                this.f33687w = yVar;
                this.f33688x = bVar;
            }

            public final void a(Throwable th2) {
                if (this.f33687w.isCancelled()) {
                    this.f33688x.cancel();
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f59242a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ y f33689a;

            public b(y yVar) {
                this.f33689a = yVar;
            }

            @Override // er.d
            public void a(er.b<T> bVar, Throwable th2) {
                p.i(bVar, "call");
                p.i(th2, TopicConstant.PACKET_TYPE_TEXT);
                this.f33689a.a(th2);
            }

            @Override // er.d
            public void b(er.b<T> bVar, s<T> sVar) {
                p.i(bVar, "call");
                p.i(sVar, "response");
                this.f33689a.F(sVar);
            }
        }

        public c(Type type) {
            p.i(type, "responseType");
            this.f33686a = type;
        }

        @Override // er.c
        public Type a() {
            return this.f33686a;
        }

        @Override // er.c
        /* renamed from: c */
        public y0<s<T>> b(er.b<T> bVar) {
            p.i(bVar, "call");
            y b10 = a0.b(null, 1, null);
            b10.p(new C0408a(b10, bVar));
            bVar.D0(new b(b10));
            return b10;
        }
    }

    public a() {
    }

    @Override // er.c.a
    public er.c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        p.i(type, "returnType");
        p.i(annotationArr, "annotations");
        p.i(tVar, "retrofit");
        if (!p.c(y0.class, c.a.c(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b10 = c.a.b(0, (ParameterizedType) type);
            if (p.c(c.a.c(b10), s.class)) {
                if (b10 instanceof ParameterizedType) {
                    Type b11 = c.a.b(0, (ParameterizedType) b10);
                    p.d(b11, "getParameterUpperBound(0, responseType)");
                    return new c(b11);
                }
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<out Foo>");
            }
            p.d(b10, "responseType");
            return new C0406a(b10);
        }
        throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }

    public /* synthetic */ a(h hVar) {
        this();
    }
}

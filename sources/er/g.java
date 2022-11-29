package er;

import ep.b0;
import er.c;
import er.g;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f31111a;

    /* loaded from: classes4.dex */
    public class a implements c<Object, er.b<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f31112a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f31113b;

        public a(Type type, Executor executor) {
            this.f31112a = type;
            this.f31113b = executor;
        }

        @Override // er.c
        public Type a() {
            return this.f31112a;
        }

        @Override // er.c
        /* renamed from: c */
        public er.b<Object> b(er.b<Object> bVar) {
            Executor executor = this.f31113b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<T> implements er.b<T> {

        /* renamed from: w  reason: collision with root package name */
        public final Executor f31115w;

        /* renamed from: x  reason: collision with root package name */
        public final er.b<T> f31116x;

        /* loaded from: classes4.dex */
        public class a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f31117a;

            public a(d dVar) {
                this.f31117a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void e(d dVar, Throwable th2) {
                dVar.a(b.this, th2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(d dVar, s sVar) {
                if (b.this.f31116x.p()) {
                    dVar.a(b.this, new IOException("Canceled"));
                } else {
                    dVar.b(b.this, sVar);
                }
            }

            @Override // er.d
            public void a(er.b<T> bVar, final Throwable th2) {
                Executor executor = b.this.f31115w;
                final d dVar = this.f31117a;
                executor.execute(new Runnable() { // from class: er.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.e(dVar, th2);
                    }
                });
            }

            @Override // er.d
            public void b(er.b<T> bVar, final s<T> sVar) {
                Executor executor = b.this.f31115w;
                final d dVar = this.f31117a;
                executor.execute(new Runnable() { // from class: er.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.f(dVar, sVar);
                    }
                });
            }
        }

        public b(Executor executor, er.b<T> bVar) {
            this.f31115w = executor;
            this.f31116x = bVar;
        }

        @Override // er.b
        public void D0(d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f31116x.D0(new a(dVar));
        }

        @Override // er.b
        public void cancel() {
            this.f31116x.cancel();
        }

        @Override // er.b
        public s<T> d() throws IOException {
            return this.f31116x.d();
        }

        @Override // er.b
        public b0 j() {
            return this.f31116x.j();
        }

        @Override // er.b
        public boolean p() {
            return this.f31116x.p();
        }

        @Override // er.b
        public er.b<T> clone() {
            return new b(this.f31115w, this.f31116x.clone());
        }
    }

    public g(Executor executor) {
        this.f31111a = executor;
    }

    @Override // er.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.c(type) != er.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(x.g(0, (ParameterizedType) type), x.l(annotationArr, v.class) ? null : this.f31111a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}

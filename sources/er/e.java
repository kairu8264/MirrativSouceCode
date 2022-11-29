package er;

import er.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f31103a = new e();

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<R> implements er.c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f31104a;

        @IgnoreJRERequirement
        /* renamed from: er.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0316a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f31105a;

            public C0316a(CompletableFuture<R> completableFuture) {
                this.f31105a = completableFuture;
            }

            @Override // er.d
            public void a(er.b<R> bVar, Throwable th2) {
                this.f31105a.completeExceptionally(th2);
            }

            @Override // er.d
            public void b(er.b<R> bVar, s<R> sVar) {
                if (sVar.f()) {
                    this.f31105a.complete(sVar.a());
                } else {
                    this.f31105a.completeExceptionally(new HttpException(sVar));
                }
            }
        }

        public a(Type type) {
            this.f31104a = type;
        }

        @Override // er.c
        public Type a() {
            return this.f31104a;
        }

        @Override // er.c
        /* renamed from: c */
        public CompletableFuture<R> b(er.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.D0(new C0316a(bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: w  reason: collision with root package name */
        public final er.b<?> f31107w;

        public b(er.b<?> bVar) {
            this.f31107w = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f31107w.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class c<R> implements er.c<R, CompletableFuture<s<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f31108a;

        @IgnoreJRERequirement
        /* loaded from: classes4.dex */
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<s<R>> f31109a;

            public a(CompletableFuture<s<R>> completableFuture) {
                this.f31109a = completableFuture;
            }

            @Override // er.d
            public void a(er.b<R> bVar, Throwable th2) {
                this.f31109a.completeExceptionally(th2);
            }

            @Override // er.d
            public void b(er.b<R> bVar, s<R> sVar) {
                this.f31109a.complete(sVar);
            }
        }

        public c(Type type) {
            this.f31108a = type;
        }

        @Override // er.c
        public Type a() {
            return this.f31108a;
        }

        @Override // er.c
        /* renamed from: c */
        public CompletableFuture<s<R>> b(er.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.D0(new a(bVar2));
            return bVar2;
        }
    }

    @Override // er.c.a
    public er.c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b10 = c.a.b(0, (ParameterizedType) type);
            if (c.a.c(b10) != s.class) {
                return new a(b10);
            }
            if (b10 instanceof ParameterizedType) {
                return new c(c.a.b(0, (ParameterizedType) b10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}

package s7;

import com.bumptech.glide.load.data.d;
import s7.n;

/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final v<?> f52294a = new v<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f52295a = new a<>();

        public static <T> a<T> b() {
            return (a<T>) f52295a;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Model, Model> c(r rVar) {
            return v.c();
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: w  reason: collision with root package name */
        public final Model f52296w;

        public b(Model model) {
            this.f52296w = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f52296w.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public m7.a d() {
            return m7.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a<? super Model> aVar) {
            aVar.e((Model) this.f52296w);
        }
    }

    public static <T> v<T> c() {
        return (v<T>) f52294a;
    }

    @Override // s7.n
    public boolean a(Model model) {
        return true;
    }

    @Override // s7.n
    public n.a<Model> b(Model model, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(model), new b(model));
    }
}

package s7;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s7.n;

/* loaded from: classes.dex */
public class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f52271a;

    /* renamed from: b  reason: collision with root package name */
    public final n3.e<List<Throwable>> f52272b;

    /* loaded from: classes.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {
        public d.a<? super Data> A;
        public List<Throwable> B;
        public boolean C;

        /* renamed from: w  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f52273w;

        /* renamed from: x  reason: collision with root package name */
        public final n3.e<List<Throwable>> f52274x;

        /* renamed from: y  reason: collision with root package name */
        public int f52275y;

        /* renamed from: z  reason: collision with root package name */
        public com.bumptech.glide.h f52276z;

        public a(List<com.bumptech.glide.load.data.d<Data>> list, n3.e<List<Throwable>> eVar) {
            this.f52274x = eVar;
            i8.j.c(list);
            this.f52273w = list;
            this.f52275y = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f52273w.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.B;
            if (list != null) {
                this.f52274x.a(list);
            }
            this.B = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f52273w) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) i8.j.d(this.B)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.C = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f52273w) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public m7.a d() {
            return this.f52273w.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(Data data) {
            if (data != null) {
                this.A.e(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            this.f52276z = hVar;
            this.A = aVar;
            this.B = this.f52274x.acquire();
            this.f52273w.get(this.f52275y).f(hVar, this);
            if (this.C) {
                cancel();
            }
        }

        public final void g() {
            if (this.C) {
                return;
            }
            if (this.f52275y < this.f52273w.size() - 1) {
                this.f52275y++;
                f(this.f52276z, this.A);
                return;
            }
            i8.j.d(this.B);
            this.A.c(new GlideException("Fetch failed", new ArrayList(this.B)));
        }
    }

    public q(List<n<Model, Data>> list, n3.e<List<Throwable>> eVar) {
        this.f52271a = list;
        this.f52272b = eVar;
    }

    @Override // s7.n
    public boolean a(Model model) {
        for (n<Model, Data> nVar : this.f52271a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // s7.n
    public n.a<Data> b(Model model, int i10, int i11, m7.h hVar) {
        n.a<Data> b10;
        int size = this.f52271a.size();
        ArrayList arrayList = new ArrayList(size);
        m7.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n<Model, Data> nVar = this.f52271a.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, hVar)) != null) {
                eVar = b10.f52264a;
                arrayList.add(b10.f52266c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f52272b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f52271a.toArray()) + '}';
    }
}

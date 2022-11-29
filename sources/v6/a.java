package v6;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    public final d<K> f56770c;

    /* renamed from: e  reason: collision with root package name */
    public g7.c<A> f56772e;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f56768a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f56769b = false;

    /* renamed from: d  reason: collision with root package name */
    public float f56771d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public A f56773f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f56774g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f56775h = -1.0f;

    /* loaded from: classes.dex */
    public interface b {
        void b();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // v6.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // v6.a.d
        public g7.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // v6.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // v6.a.d
        public float d() {
            return 0.0f;
        }

        @Override // v6.a.d
        public float e() {
            return 1.0f;
        }

        @Override // v6.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f10);

        g7.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends g7.a<T>> f56776a;

        /* renamed from: c  reason: collision with root package name */
        public g7.a<T> f56778c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f56779d = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        public g7.a<T> f56777b = f(0.0f);

        public e(List<? extends g7.a<T>> list) {
            this.f56776a = list;
        }

        @Override // v6.a.d
        public boolean a(float f10) {
            g7.a<T> aVar = this.f56778c;
            g7.a<T> aVar2 = this.f56777b;
            if (aVar == aVar2 && this.f56779d == f10) {
                return true;
            }
            this.f56778c = aVar2;
            this.f56779d = f10;
            return false;
        }

        @Override // v6.a.d
        public g7.a<T> b() {
            return this.f56777b;
        }

        @Override // v6.a.d
        public boolean c(float f10) {
            if (this.f56777b.a(f10)) {
                return !this.f56777b.h();
            }
            this.f56777b = f(f10);
            return true;
        }

        @Override // v6.a.d
        public float d() {
            return this.f56776a.get(0).e();
        }

        @Override // v6.a.d
        public float e() {
            List<? extends g7.a<T>> list = this.f56776a;
            return list.get(list.size() - 1).b();
        }

        public final g7.a<T> f(float f10) {
            List<? extends g7.a<T>> list = this.f56776a;
            g7.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f56776a.size() - 2; size >= 1; size--) {
                g7.a<T> aVar2 = this.f56776a.get(size);
                if (this.f56777b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f56776a.get(0);
        }

        @Override // v6.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final g7.a<T> f56780a;

        /* renamed from: b  reason: collision with root package name */
        public float f56781b = -1.0f;

        public f(List<? extends g7.a<T>> list) {
            this.f56780a = list.get(0);
        }

        @Override // v6.a.d
        public boolean a(float f10) {
            if (this.f56781b == f10) {
                return true;
            }
            this.f56781b = f10;
            return false;
        }

        @Override // v6.a.d
        public g7.a<T> b() {
            return this.f56780a;
        }

        @Override // v6.a.d
        public boolean c(float f10) {
            return !this.f56780a.h();
        }

        @Override // v6.a.d
        public float d() {
            return this.f56780a.e();
        }

        @Override // v6.a.d
        public float e() {
            return this.f56780a.b();
        }

        @Override // v6.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends g7.a<K>> list) {
        this.f56770c = o(list);
    }

    public static <T> d<T> o(List<? extends g7.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f56768a.add(bVar);
    }

    public g7.a<K> b() {
        s6.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        g7.a<K> b10 = this.f56770c.b();
        s6.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b10;
    }

    public float c() {
        if (this.f56775h == -1.0f) {
            this.f56775h = this.f56770c.e();
        }
        return this.f56775h;
    }

    public float d() {
        g7.a<K> b10 = b();
        if (b10.h()) {
            return 0.0f;
        }
        return b10.f32799d.getInterpolation(e());
    }

    public float e() {
        if (this.f56769b) {
            return 0.0f;
        }
        g7.a<K> b10 = b();
        if (b10.h()) {
            return 0.0f;
        }
        return (this.f56771d - b10.e()) / (b10.b() - b10.e());
    }

    public float f() {
        return this.f56771d;
    }

    public final float g() {
        if (this.f56774g == -1.0f) {
            this.f56774g = this.f56770c.d();
        }
        return this.f56774g;
    }

    public A h() {
        A i10;
        float e10 = e();
        if (this.f56772e == null && this.f56770c.a(e10)) {
            return this.f56773f;
        }
        g7.a<K> b10 = b();
        Interpolator interpolator = b10.f32800e;
        if (interpolator != null && b10.f32801f != null) {
            i10 = j(b10, e10, interpolator.getInterpolation(e10), b10.f32801f.getInterpolation(e10));
        } else {
            i10 = i(b10, d());
        }
        this.f56773f = i10;
        return i10;
    }

    public abstract A i(g7.a<K> aVar, float f10);

    public A j(g7.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i10 = 0; i10 < this.f56768a.size(); i10++) {
            this.f56768a.get(i10).b();
        }
    }

    public void l() {
        this.f56769b = true;
    }

    public void m(float f10) {
        if (this.f56770c.isEmpty()) {
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f56771d) {
            return;
        }
        this.f56771d = f10;
        if (this.f56770c.c(f10)) {
            k();
        }
    }

    public void n(g7.c<A> cVar) {
        g7.c<A> cVar2 = this.f56772e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f56772e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}

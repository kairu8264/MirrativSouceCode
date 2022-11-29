package s7;

import java.util.Queue;

/* loaded from: classes.dex */
public class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final i8.g<b<A>, B> f52258a;

    /* loaded from: classes.dex */
    public class a extends i8.g<b<A>, B> {
        public a(long j10) {
            super(j10);
        }

        @Override // i8.g
        /* renamed from: n */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<b<?>> f52260d = i8.k.f(0);

        /* renamed from: a  reason: collision with root package name */
        public int f52261a;

        /* renamed from: b  reason: collision with root package name */
        public int f52262b;

        /* renamed from: c  reason: collision with root package name */
        public A f52263c;

        public static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f52260d;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        public final void b(A a10, int i10, int i11) {
            this.f52263c = a10;
            this.f52262b = i10;
            this.f52261a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f52260d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f52262b == bVar.f52262b && this.f52261a == bVar.f52261a && this.f52263c.equals(bVar.f52263c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f52261a * 31) + this.f52262b) * 31) + this.f52263c.hashCode();
        }
    }

    public m(long j10) {
        this.f52258a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b<A> a11 = b.a(a10, i10, i11);
        B g10 = this.f52258a.g(a11);
        a11.c();
        return g10;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f52258a.k(b.a(a10, i10, i11), b10);
    }
}

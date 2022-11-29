package n0;

import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public interface c<E> extends List<E>, b<E>, ko.a {

    /* loaded from: classes.dex */
    public static final class a<E> extends xn.c<E> implements c<E> {
        public int A;

        /* renamed from: x  reason: collision with root package name */
        public final c<E> f41402x;

        /* renamed from: y  reason: collision with root package name */
        public final int f41403y;

        /* renamed from: z  reason: collision with root package name */
        public final int f41404z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c<? extends E> cVar, int i10, int i11) {
            p.h(cVar, "source");
            this.f41402x = cVar;
            this.f41403y = i10;
            this.f41404z = i11;
            r0.d.c(i10, i11, cVar.size());
            this.A = i11 - i10;
        }

        @Override // xn.a
        public int d() {
            return this.A;
        }

        @Override // xn.c, java.util.List
        public E get(int i10) {
            r0.d.a(i10, this.A);
            return this.f41402x.get(this.f41403y + i10);
        }

        @Override // xn.c, java.util.List, n0.c
        public c<E> subList(int i10, int i11) {
            r0.d.c(i10, i11, this.A);
            c<E> cVar = this.f41402x;
            int i12 = this.f41403y;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default c<E> subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}

package b0;

import wn.v;

/* loaded from: classes.dex */
public interface c<T> {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f16665a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16666b;

        /* renamed from: c  reason: collision with root package name */
        public final T f16667c;

        public a(int i10, int i11, T t10) {
            this.f16665a = i10;
            this.f16666b = i11;
            this.f16667c = t10;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            }
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
        }

        public final int a() {
            return this.f16666b;
        }

        public final int b() {
            return this.f16665a;
        }

        public final T c() {
            return this.f16667c;
        }
    }

    int a();

    void b(int i10, int i11, io.l<? super a<T>, v> lVar);

    a<T> get(int i10);
}

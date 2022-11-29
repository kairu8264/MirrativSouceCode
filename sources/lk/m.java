package lk;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f40325a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final m f40326b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    public static final m f40327c = new b(1);

    /* loaded from: classes3.dex */
    public static class a extends m {
        public a() {
            super(null);
        }

        @Override // lk.m
        public m d(int i10, int i11) {
            return k(mk.c.d(i10, i11));
        }

        @Override // lk.m
        public m e(long j10, long j11) {
            return k(mk.d.a(j10, j11));
        }

        @Override // lk.m
        public <T> m f(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        @Override // lk.m
        public m g(boolean z10, boolean z11) {
            return k(mk.a.a(z10, z11));
        }

        @Override // lk.m
        public m h(boolean z10, boolean z11) {
            return k(mk.a.a(z11, z10));
        }

        @Override // lk.m
        public int i() {
            return 0;
        }

        public m k(int i10) {
            if (i10 < 0) {
                return m.f40326b;
            }
            return i10 > 0 ? m.f40327c : m.f40325a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends m {

        /* renamed from: d  reason: collision with root package name */
        public final int f40328d;

        public b(int i10) {
            super(null);
            this.f40328d = i10;
        }

        @Override // lk.m
        public m d(int i10, int i11) {
            return this;
        }

        @Override // lk.m
        public m e(long j10, long j11) {
            return this;
        }

        @Override // lk.m
        public <T> m f(@NullableDecl T t10, @NullableDecl T t11, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // lk.m
        public m g(boolean z10, boolean z11) {
            return this;
        }

        @Override // lk.m
        public m h(boolean z10, boolean z11) {
            return this;
        }

        @Override // lk.m
        public int i() {
            return this.f40328d;
        }
    }

    public /* synthetic */ m(a aVar) {
        this();
    }

    public static m j() {
        return f40325a;
    }

    public abstract m d(int i10, int i11);

    public abstract m e(long j10, long j11);

    public abstract <T> m f(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator);

    public abstract m g(boolean z10, boolean z11);

    public abstract m h(boolean z10, boolean z11);

    public abstract int i();

    public m() {
    }
}

package kk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class a<T> implements Iterator<T> {

    /* renamed from: w  reason: collision with root package name */
    public b f38831w = b.NOT_READY;
    @NullableDecl

    /* renamed from: x  reason: collision with root package name */
    public T f38832x;

    /* renamed from: kk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0547a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38833a;

        static {
            int[] iArr = new int[b.values().length];
            f38833a = iArr;
            try {
                iArr[b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38833a[b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    @CanIgnoreReturnValue
    @NullableDecl
    public final T b() {
        this.f38831w = b.DONE;
        return null;
    }

    public final boolean d() {
        this.f38831w = b.FAILED;
        this.f38832x = a();
        if (this.f38831w != b.DONE) {
            this.f38831w = b.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j.n(this.f38831w != b.FAILED);
        int i10 = C0547a.f38833a[this.f38831w.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d();
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f38831w = b.NOT_READY;
            T t10 = this.f38832x;
            this.f38832x = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

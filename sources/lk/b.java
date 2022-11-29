package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class b<T> extends v0<T> {

    /* renamed from: w  reason: collision with root package name */
    public EnumC0578b f40233w = EnumC0578b.NOT_READY;
    @NullableDecl

    /* renamed from: x  reason: collision with root package name */
    public T f40234x;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40235a;

        static {
            int[] iArr = new int[EnumC0578b.values().length];
            f40235a = iArr;
            try {
                iArr[EnumC0578b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40235a[EnumC0578b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: lk.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0578b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    @CanIgnoreReturnValue
    public final T b() {
        this.f40233w = EnumC0578b.DONE;
        return null;
    }

    public final boolean d() {
        this.f40233w = EnumC0578b.FAILED;
        this.f40234x = a();
        if (this.f40233w != EnumC0578b.DONE) {
            this.f40233w = EnumC0578b.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        kk.j.n(this.f40233w != EnumC0578b.FAILED);
        int i10 = a.f40235a[this.f40233w.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f40233w = EnumC0578b.NOT_READY;
            T t10 = this.f40234x;
            this.f40234x = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}

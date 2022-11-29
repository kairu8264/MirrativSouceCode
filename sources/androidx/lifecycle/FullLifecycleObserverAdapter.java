package androidx.lifecycle;

import androidx.lifecycle.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements r {

    /* renamed from: w  reason: collision with root package name */
    public final m f15438w;

    /* renamed from: x  reason: collision with root package name */
    public final r f15439x;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15440a;

        static {
            int[] iArr = new int[o.b.values().length];
            f15440a = iArr;
            try {
                iArr[o.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15440a[o.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15440a[o.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15440a[o.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15440a[o.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15440a[o.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15440a[o.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(m mVar, r rVar) {
        this.f15438w = mVar;
        this.f15439x = rVar;
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        switch (a.f15440a[bVar.ordinal()]) {
            case 1:
                this.f15438w.b(uVar);
                break;
            case 2:
                this.f15438w.h(uVar);
                break;
            case 3:
                this.f15438w.c(uVar);
                break;
            case 4:
                this.f15438w.d(uVar);
                break;
            case 5:
                this.f15438w.f(uVar);
                break;
            case 6:
                this.f15438w.g(uVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        r rVar = this.f15439x;
        if (rVar != null) {
            rVar.i(uVar, bVar);
        }
    }
}

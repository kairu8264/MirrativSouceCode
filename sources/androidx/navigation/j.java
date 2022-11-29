package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import java.util.UUID;

/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.u, v0, y4.e {
    public final y4.d A;
    public final UUID B;
    public o.c C;
    public o.c D;
    public l E;

    /* renamed from: w  reason: collision with root package name */
    public final Context f15746w;

    /* renamed from: x  reason: collision with root package name */
    public final o f15747x;

    /* renamed from: y  reason: collision with root package name */
    public Bundle f15748y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w f15749z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15750a;

        static {
            int[] iArr = new int[o.b.values().length];
            f15750a = iArr;
            try {
                iArr[o.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15750a[o.b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15750a[o.b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15750a[o.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15750a[o.b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15750a[o.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15750a[o.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public j(Context context, o oVar, Bundle bundle, androidx.lifecycle.u uVar, l lVar) {
        this(context, oVar, bundle, uVar, lVar, UUID.randomUUID(), null);
    }

    public static o.c d(o.b bVar) {
        switch (a.f15750a[bVar.ordinal()]) {
            case 1:
            case 2:
                return o.c.CREATED;
            case 3:
            case 4:
                return o.c.STARTED;
            case 5:
                return o.c.RESUMED;
            case 6:
                return o.c.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + bVar);
        }
    }

    @Override // androidx.lifecycle.v0
    public u0 U() {
        l lVar = this.E;
        if (lVar != null) {
            return lVar.h(this.B);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public Bundle a() {
        return this.f15748y;
    }

    @Override // y4.e
    public y4.c a0() {
        return this.A.b();
    }

    public o b() {
        return this.f15747x;
    }

    public o.c c() {
        return this.D;
    }

    public void e(o.b bVar) {
        this.C = d(bVar);
        j();
    }

    public void f(Bundle bundle) {
        this.f15748y = bundle;
    }

    @Override // androidx.lifecycle.u
    public androidx.lifecycle.o g() {
        return this.f15749z;
    }

    public void h(Bundle bundle) {
        this.A.e(bundle);
    }

    public void i(o.c cVar) {
        this.D = cVar;
        j();
    }

    public void j() {
        if (this.C.ordinal() < this.D.ordinal()) {
            this.f15749z.o(this.C);
        } else {
            this.f15749z.o(this.D);
        }
    }

    public j(Context context, o oVar, Bundle bundle, androidx.lifecycle.u uVar, l lVar, UUID uuid, Bundle bundle2) {
        this.f15749z = new androidx.lifecycle.w(this);
        y4.d a10 = y4.d.a(this);
        this.A = a10;
        this.C = o.c.CREATED;
        this.D = o.c.RESUMED;
        this.f15746w = context;
        this.B = uuid;
        this.f15747x = oVar;
        this.f15748y = bundle;
        this.E = lVar;
        a10.d(bundle2);
        if (uVar != null) {
            this.C = uVar.g().b();
        }
    }
}

package o6;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j6.b f44093a = new j6.b(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44094a;

        static {
            int[] iArr = new int[k6.d.values().length];
            iArr[k6.d.EXACT.ordinal()] = 1;
            iArr[k6.d.INEXACT.ordinal()] = 2;
            iArr[k6.d.AUTOMATIC.ordinal()] = 3;
            f44094a = iArr;
        }
    }

    public static final boolean a(j6.i iVar) {
        int i10 = a.f44094a[iVar.H().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if ((iVar.q().m() != null || !(iVar.K() instanceof k6.c)) && (!(iVar.M() instanceof l6.b) || !(iVar.K() instanceof k6.k) || !(((l6.b) iVar.M()).a() instanceof ImageView) || ((l6.b) iVar.M()).a() != ((k6.k) iVar.K()).a())) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }
        return false;
    }

    public static final j6.b b() {
        return f44093a;
    }

    public static final Drawable c(j6.i iVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                return null;
            }
            return d.a(iVar.l(), num.intValue());
        }
        return drawable2;
    }
}

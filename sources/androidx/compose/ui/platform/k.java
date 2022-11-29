package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14489b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityManager f14490a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public k(Context context) {
        jo.p.h(context, "context");
        Object systemService = context.getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f14490a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.i
    public long a(long j10, boolean z10, boolean z11, boolean z12) {
        int i10 = z10;
        if (j10 >= 2147483647L) {
            return j10;
        }
        if (z11) {
            i10 = (z10 ? 1 : 0) | true;
        }
        if (z12) {
            i10 = (i10 == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a10 = i0.f14471a.a(this.f14490a, (int) j10, i10);
            if (a10 != Integer.MAX_VALUE) {
                return a10;
            }
        } else if (!z12 || !this.f14490a.isTouchExplorationEnabled()) {
            return j10;
        }
        return Long.MAX_VALUE;
    }
}

package ze;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f63182a;

    public w(Context context) {
        jo.p.h(context, "context");
        this.f63182a = context;
    }

    public final DisplayMetrics a() {
        Object systemService = this.f63182a.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return new DisplayMetrics();
        }
        DisplayMetrics displayMetrics = this.f63182a.getResources().getDisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        jo.p.g(displayMetrics, "metrics");
        return displayMetrics;
    }

    public final Size b(String str, boolean z10) {
        DisplayMetrics a10;
        jo.p.h(str, "quality");
        if (!z10) {
            return a.RATIO9x16.h(str);
        }
        float b10 = a.Companion.b(a().widthPixels, a10.heightPixels);
        a aVar = a.RATIO9x21;
        if (!aVar.c().g(Float.valueOf(b10))) {
            aVar = a.RATIO9x19p5;
            if (!aVar.c().g(Float.valueOf(b10))) {
                aVar = a.RATIO9x19;
                if (!aVar.c().g(Float.valueOf(b10))) {
                    aVar = a.RATIO9x18p5;
                    if (!aVar.c().g(Float.valueOf(b10))) {
                        aVar = a.RATIO9x18;
                        if (!aVar.c().g(Float.valueOf(b10))) {
                            aVar = a.RATIO9x16;
                            if (!aVar.c().g(Float.valueOf(b10))) {
                                aVar = a.RATIO10x16;
                                if (!aVar.c().g(Float.valueOf(b10))) {
                                    aVar = a.RATIO3x4;
                                }
                            }
                        }
                    }
                }
            }
        }
        return aVar.h(str);
    }

    public final Size c(String str) {
        jo.p.h(str, "resolution");
        return a.Companion.a(str);
    }
}

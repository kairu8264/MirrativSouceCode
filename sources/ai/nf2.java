package ai;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class nf2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static final Callable f7321a = new nf2();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String[] split;
        HashMap hashMap = new HashMap();
        String str = (String) ft.c().c(ox.F);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) ft.c().c(ox.G)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, yg.m1.a(str2));
                }
            }
        }
        return new pf2(hashMap);
    }
}

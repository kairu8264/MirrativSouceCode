package ai;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class es {

    /* renamed from: a  reason: collision with root package name */
    public static final es f3758a = new es();

    public final as a(Context context, wv wvVar) {
        Context context2;
        List list;
        String str;
        Date a10 = wvVar.a();
        long time = a10 != null ? a10.getTime() : -1L;
        String b10 = wvVar.b();
        int d10 = wvVar.d();
        Set<String> e10 = wvVar.e();
        if (e10.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(e10));
            context2 = context;
        }
        boolean k10 = wvVar.k(context2);
        Location f10 = wvVar.f();
        Bundle g10 = wvVar.g(AdMobAdapter.class);
        wvVar.r();
        String h10 = wvVar.h();
        wvVar.j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            dt.a();
            str = nj0.j(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean q10 = wvVar.q();
        rg.s b11 = zv.a().b();
        return new as(8, time, g10, d10, list, k10, Math.max(wvVar.n(), b11.b()), false, h10, null, f10, b10, wvVar.m(), wvVar.o(), Collections.unmodifiableList(new ArrayList(wvVar.p())), wvVar.i(), str, q10, null, Math.max(-1, b11.c()), (String) Collections.max(Arrays.asList(null, b11.a()), ds.f3386w), wvVar.c(), wvVar.t(), wvVar.s());
    }
}

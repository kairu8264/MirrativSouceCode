package ai;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes3.dex */
public final class qo1 implements rn3<xo1> {
    public static qo1 a() {
        qo1 qo1Var;
        qo1Var = po1.f8488a;
        return qo1Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new xo1(AnalyticsListener.EVENT_LOAD_COMPLETED, AnalyticsListener.EVENT_LOAD_CANCELED, AnalyticsListener.EVENT_LOAD_ERROR);
    }
}

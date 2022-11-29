package ai;

import android.os.IInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class eg0 implements wj0 {

    /* renamed from: a  reason: collision with root package name */
    public static final wj0 f3658a = new eg0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.wj0
    public final Object a(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof wf0) {
            return (wf0) queryLocalInterface;
        }
        return new wf0(obj);
    }
}

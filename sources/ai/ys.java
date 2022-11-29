package ai;

import android.os.IInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements wj0 {

    /* renamed from: a  reason: collision with root package name */
    public static final wj0 f12718a = new ys();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.wj0
    public final Object a(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof xt) {
            return (xt) queryLocalInterface;
        }
        return new xt(obj);
    }
}
